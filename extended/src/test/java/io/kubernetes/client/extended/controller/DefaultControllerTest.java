package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultControllerTest {

  private ExecutorService controllerThead = Executors.newSingleThreadExecutor();
  private RateLimitingQueue<Request> workQueue =
      new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor());

  private final int stepCooldownIntervalInMillis = 500;

  private void cooldown() {
    try {
      Thread.sleep(stepCooldownIntervalInMillis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testStartingStoppingController() throws InterruptedException {
    MockReconciler testReconciler = new MockReconciler(new Result(false));

    DefaultController testController = new DefaultController(testReconciler, workQueue);

    testController.setWorkerCount(1);
    testController.setWorkerThreadPool(Executors.newScheduledThreadPool(1));

    Request request1 = new Request("test1");

    // emit an event when the controller hasn't started
    workQueue.add(request1);
    cooldown();
    assertNull(testReconciler.receivingRequest);

    controllerThead.submit(testController::run);

    cooldown();
    assertEquals(request1, testReconciler.receivingRequest);

    testController.shutdown();
    Request request2 = new Request("test2");

    // emit an event after the controller has shutdown
    workQueue.add(request2);
    cooldown();
    assertEquals(request1, testReconciler.receivingRequest);
  }

  @Test
  public void testControllerWontStartBeforeReady() throws InterruptedException {
    MockReconciler testReconciler = new MockReconciler(new Result(false));

    AtomicBoolean ready = new AtomicBoolean(false);
    DefaultController testController =
        new DefaultController(testReconciler, workQueue, () -> ready.get());
    testController.setWorkerCount(1);
    testController.setWorkerThreadPool(Executors.newScheduledThreadPool(1));
    testController.setReadyCheckInternal(Duration.ofMillis(100));

    controllerThead.submit(testController::run);

    // emit an event when the controller hasn't been ready
    Request request1 = new Request("test1");
    workQueue.add(request1);
    cooldown();
    assertNull(testReconciler.receivingRequest);

    ready.set(true);
    cooldown();
    assertEquals(request1, testReconciler.receivingRequest);
  }

  @Test
  public void testControllerStopsWorkingWhenReconcilerAbortsWithRuntimeException()
      throws InterruptedException {
    AtomicBoolean aborts = new AtomicBoolean(true);
    AtomicBoolean resumed = new AtomicBoolean(false);
    List<Request> finishedRequests = new ArrayList<>();
    DefaultController testController =
        new DefaultController(
            new Reconciler() {
              @Override
              public Result reconcile(Request request) {
                if (aborts.get()) {
                  throw new RuntimeException("Oops!!");
                }
                resumed.set(true);
                finishedRequests.add(request);
                return new Result(false);
              }
            },
            workQueue);
    testController.setWorkerCount(1);
    testController.setWorkerThreadPool(Executors.newScheduledThreadPool(1));

    controllerThead.submit(testController::run);

    Request request1 = new Request("test1");
    workQueue.add(request1);
    cooldown();

    aborts.set(false);
    // emit another event, the previous one has been backoff'd
    Request request2 = new Request("test2");
    workQueue.add(request2);
    testController.shutdown();

    assertFalse(resumed.get());
    assertEquals(0, finishedRequests.size());
  }

  private class MockReconciler implements Reconciler {

    public MockReconciler(Result result) {
      this.returningResult = result;
    }

    private Request receivingRequest;
    private Result returningResult;

    @Override
    public Result reconcile(Request request) {
      this.receivingRequest = request;
      return this.returningResult;
    }
  }
}
