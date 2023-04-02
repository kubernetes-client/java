/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.extended.controller;

import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.extended.wait.Wait;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The default implementation of a controller. A typical controller contains:
 *
 * <p>- a reconciler implemented by developers specifying what to do in reaction of notifications.
 * see more documentation on the Reconciler interface - a work-queue continuously filled with task
 * items managed by Informer framework - a set of worker threads acutally running reconciler.
 */
public class DefaultController implements Controller {
  private static final Logger log = LoggerFactory.getLogger(DefaultController.class);

  private static Gauge gaugeWorkQueueLength =
      Gauge.build("controller_work_queue_length", "Current length of the controller's work-queue")
          .labelNames("name")
          .register();
  private static Counter counterControllerReconcile =
      Counter.build("controller_reconcile_count_total", "Total count of controller reconciliation")
          .labelNames("name", "requeue")
          .register();

  private final Reconciler reconciler;
  private final String name;
  private final RateLimitingQueue<Request> workQueue;
  private final Supplier<Boolean>[] readyFuncs;

  private int workerCount;
  private ScheduledExecutorService workerThreadPool;

  private Duration readyTimeout;
  private Duration readyCheckInternal;

  /**
   * Instantiates a new Default controller.
   *
   * @param name the name
   * @param reconciler the reconciler
   * @param workQueue the work queue
   * @param readyFuncs the ready funcs
   */
  public DefaultController(
      String name,
      Reconciler reconciler,
      RateLimitingQueue<Request> workQueue,
      Supplier<Boolean>... readyFuncs) {
    this(name, reconciler, workQueue, null, readyFuncs);
  }

  /**
   * Instantiates a new Default controller.
   *
   * @param name the name
   * @param reconciler the reconciler
   * @param workQueue the work queue
   * @param collectorRegistry the collector registry
   * @param readyFuncs the ready funcs
   */
  public DefaultController(
      String name,
      Reconciler reconciler,
      RateLimitingQueue<Request> workQueue,
      CollectorRegistry collectorRegistry,
      Supplier<Boolean>... readyFuncs) {
    this.name = name;
    this.reconciler = reconciler;
    this.workQueue = workQueue;
    this.readyFuncs = readyFuncs;
    this.readyTimeout = Duration.ofSeconds(30);
    this.readyCheckInternal = Duration.ofSeconds(1);
  }

  // preFlightCheck checks if the controller is ready for working.
  private boolean preFlightCheck() {
    if (workerCount <= 0) {
      log.error("Fail to start controller {}: worker count must be positive.", this.name);
      return false;
    }
    if (workerThreadPool == null) {
      log.error("Fail to start controller {}: missing worker thread-pool.", this.name);
      return false;
    }
    if (!isReady()) {
      log.error(
          "Fail to start controller {}: Timed out waiting for cache to be synced.", this.name);
      return false;
    }
    return true;
  }

  // isReady checks if any ready functions complaining before working.
  private boolean isReady() {
    boolean synced = true;
    if (this.readyFuncs.length > 0) {
      synced =
          Wait.poll(
              Duration.ZERO,
              readyCheckInternal,
              readyTimeout,
              () -> {
                boolean ready = true;
                for (Supplier<Boolean> cacheHasSyncedFunc : this.readyFuncs) {
                  ready = ready && cacheHasSyncedFunc.get();
                }
                return ready;
              });
    }
    return synced;
  }

  @Override
  public void run() {
    if (!preFlightCheck()) {
      log.error("Controller {} failed pre-run check, exiting..", this.name);
      return;
    }

    // spawns worker threads for the controller.
    CountDownLatch latch = new CountDownLatch(workerCount);
    for (int i = 0; i < this.workerCount; i++) {
      final int workerIndex = i;
      workerThreadPool.scheduleWithFixedDelay(
          () -> {
            log.debug("Starting controller {} worker {}..", this.name, workerIndex);
            try {
              this.worker();
            } catch (Throwable t) {
              log.error("Unexpected controller loop abortion", t);
            } finally {
              latch.countDown();
              log.debug("Exiting controller {} worker {}..", this.name, workerIndex);
            }
          },
          0,
          1,
          TimeUnit.SECONDS);
    }
    try {
      log.debug("Controller {} bootstrapping..", this.name);
      latch.await();
    } catch (InterruptedException e) {
      log.error("Aborting controller.", e);
    } finally {
      log.info("Controller {} exited", this.name);
    }
  }

  @Override
  public void shutdown() {
    // shutdown work-queue before the thread-pool
    workQueue.shutDown();
    workerThreadPool.shutdown();
  }

  private void worker() {
    // taking tasks from work-queue in a loop
    while (!workQueue.isShuttingDown()) {
      gaugeWorkQueueLength.labels(name).set(workQueue.length());
      Request request = null;
      try {
        request = workQueue.get();
      } catch (InterruptedException e) {
        // we're reaching here mostly because of forcibly shutting down the controller.
        log.error("Controller worker interrupted.. keeps working until work-queue shutdown", e);
        if (request != null) {
          workQueue.addRateLimited(request);
        }
      }
      // request is expected to be null, when the work-queue is shutting-down.
      if (request == null) {
        log.info("Controller {} worker exiting because work-queue has shutdown..", this.name);
        return;
      }
      log.debug("Controller {} start reconciling {}..", this.name, request);

      // do reconciliation, invoke user customized logic.
      Result result = null;
      try {
        result = this.reconciler.reconcile(request);
      } catch (Throwable t) {
        log.error("Reconciler aborted unexpectedly", t);
        result = new Result(true);
      } finally {
        counterControllerReconcile.labels(this.name, Boolean.toString(result.isRequeue())).inc();
      }

      try {
        // checks whether do a re-queue (on failure)
        if (result.isRequeue()) {
          if (result.getRequeueAfter() == null) {
            log.debug("Controller {} reconciling {} failed, requeuing {}..", this.name, request);
            workQueue.addRateLimited(request);
          } else {
            log.debug(
                "Controller {} reconciling {} failed, requeuing after {}..",
                this.name,
                request,
                result.getRequeueAfter());
            workQueue.addAfter(request, result.getRequeueAfter());
          }
        } else {
          workQueue.forget(request);
        }
      } finally {
        workQueue.done(request);
        gaugeWorkQueueLength.labels(name).set(workQueue.length());
        log.debug("Controller {} finished reconciling {}..", this.name, request);
      }
    }
  }

  public RateLimitingQueue<Request> getWorkQueue() {
    return workQueue;
  }

  public String getName() {
    return name;
  }

  public int getWorkerCount() {
    return workerCount;
  }

  public void setWorkerCount(int workerCount) {
    this.workerCount = workerCount;
  }

  public ExecutorService getWorkerThreadPool() {
    return workerThreadPool;
  }

  public void setWorkerThreadPool(ScheduledExecutorService workerThreadPool) {
    this.workerThreadPool = workerThreadPool;
  }

  public Reconciler getReconciler() {
    return reconciler;
  }

  public Duration getReadyTimeout() {
    return readyTimeout;
  }

  public void setReadyTimeout(Duration readyTimeout) {
    this.readyTimeout = readyTimeout;
  }

  public Duration getReadyCheckInternal() {
    return readyCheckInternal;
  }

  public void setReadyCheckInternal(Duration readyCheckInternal) {
    this.readyCheckInternal = readyCheckInternal;
  }
}
