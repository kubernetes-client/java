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
package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerWatch;
import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.DefaultController;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

/** The type DefaultControllerBuilder is a fluent builder class for constructing a controller. */
public class DefaultControllerBuilder {

  private int workerCount;
  private String controllerName;
  private RateLimitingQueue<Request> workQueue;
  private Duration readyTimeout;

  private SharedInformerFactory informerFactory;
  private List<Supplier<Boolean>> readyFuncs;
  private Reconciler reconciler;

  DefaultControllerBuilder() {
    this.workerCount = Constants.DEFAULT_WORKER_COUNT;
    this.controllerName = "default-controller";
    this.workQueue = new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor());
    this.readyFuncs = new ArrayList<>();
  }

  /**
   * Starts building controller by given informer factory.
   *
   * @param informerFactory the informer factory
   * @return the controller builder
   */
  DefaultControllerBuilder(SharedInformerFactory informerFactory) {
    this();
    this.informerFactory = informerFactory;
  }

  /**
   * Starts building watches over resource.
   *
   * @param <ApiType> the type parameter for the singular response
   * @param controllerWatchGetter the controller watch getter
   * @return the controller builder . controller watch builder
   */
  public <ApiType extends KubernetesObject> DefaultControllerBuilder watch(
      Function<WorkQueue<Request>, ControllerWatch<ApiType>> controllerWatchGetter) {
    ControllerWatch<ApiType> watch = controllerWatchGetter.apply(this.workQueue);
    Class<ApiType> apiTypeClass = watch.getResourceClass();
    SharedIndexInformer<ApiType> informer =
        informerFactory.getExistingSharedIndexInformer(apiTypeClass);
    if (informer == null) {
      throw new IllegalStateException(
          String.format(
              "Missing informer for resource %s, "
                  + "check if informer already constructed in the informerFactory",
              apiTypeClass));
    }
    informer.addEventHandlerWithResyncPeriod(
        watch.getResourceEventHandler(), watch.getResyncPeriod().toMillis());
    return this;
  }

  /**
   * Overrides name for the controller.
   *
   * @param controllerName the controller name
   * @return the controller builder
   */
  public DefaultControllerBuilder withName(String controllerName) {
    this.controllerName = controllerName;
    return this;
  }

  /**
   * Overrides workQueue for the controller.
   *
   * @param workQueue the work queue
   * @return the controller builder
   */
  public DefaultControllerBuilder withWorkQueue(RateLimitingQueue<Request> workQueue) {
    this.workQueue = workQueue;
    return this;
  }

  /**
   * Add a ready-function to the pre-flight check of the controller.
   *
   * @param readyFunc the ready func
   * @return the controller builder
   */
  public DefaultControllerBuilder withReadyFunc(Supplier<Boolean> readyFunc) {
    this.readyFuncs.add(readyFunc);
    return this;
  }

  public DefaultControllerBuilder withReadyTimeout(Duration readyTimeout) {
    this.readyTimeout = readyTimeout;
    return this;
  }

  /**
   * Overrides worker thread counts of the controller.
   *
   * @param workerCount the worker count
   * @return the controller builder
   */
  public DefaultControllerBuilder withWorkerCount(int workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  /**
   * Sets reconciler of the controller.
   *
   * @param reconciler the reconciler
   * @return the controller builder
   */
  public DefaultControllerBuilder withReconciler(Reconciler reconciler) {
    this.reconciler = reconciler;
    return this;
  }

  /**
   * Build the controller.
   *
   * @return the controller
   * @throws IllegalStateException the illegal state exception
   */
  public Controller build() throws IllegalStateException {
    if (this.reconciler == null) {
      throw new IllegalStateException("Missing reconciler when building controller.");
    }

    DefaultController controller =
        new DefaultController(
            this.controllerName,
            this.reconciler,
            this.workQueue,
            this.readyFuncs.stream().toArray(Supplier[]::new));

    if (this.readyTimeout != null) {
      controller.setReadyTimeout(this.readyTimeout);
    }
    controller.setWorkerCount(this.workerCount);
    controller.setWorkerThreadPool(
        Executors.newScheduledThreadPool(
            this.workerCount, Controllers.namedControllerThreadFactory(this.controllerName)));

    return controller;
  }
}
