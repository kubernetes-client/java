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

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
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

  @Mock private Reconciler mockReconciler;

  @Test
  public void testStartingStoppingController() throws InterruptedException {

    DefaultController testController = new DefaultController("", mockReconciler, workQueue);

    testController.setWorkerCount(1);
    testController.setWorkerThreadPool(Executors.newScheduledThreadPool(1));

    Request request1 = new Request("test1");
    when(mockReconciler.reconcile(request1)).thenReturn(new Result(false));

    // emit an event when the controller hasn't started
    workQueue.add(request1);
    cooldown();
    verify(mockReconciler, times(0)).reconcile(request1);

    controllerThead.submit(testController::run);

    cooldown();
    verify(mockReconciler, times(1)).reconcile(request1);

    testController.shutdown();
    Request request2 = new Request("test2");

    // emit an event after the controller has shutdown
    workQueue.add(request2);
    cooldown();
    verify(mockReconciler, times(0)).reconcile(request2);
  }

  @Test
  public void testControllerWontStartBeforeReady() throws InterruptedException {

    Request request1 = new Request("test1");
    when(mockReconciler.reconcile(request1)).thenReturn(new Result(false));

    AtomicBoolean ready = new AtomicBoolean(false);
    DefaultController testController =
        new DefaultController("", mockReconciler, workQueue, () -> ready.get());
    testController.setWorkerCount(1);
    testController.setWorkerThreadPool(Executors.newScheduledThreadPool(1));
    testController.setReadyCheckInternal(Duration.ofMillis(100));

    controllerThead.submit(testController::run);

    // emit an event when the controller hasn't been ready
    workQueue.add(request1);
    cooldown();

    verify(mockReconciler, times(0)).reconcile(request1);

    ready.set(true);
    cooldown();
    verify(mockReconciler, times(1)).reconcile(request1);
  }

  @Test
  public void testControllerKeepsWorkingWhenReconcilerAbortsWithRuntimeException()
      throws InterruptedException {
    AtomicBoolean aborts = new AtomicBoolean(true);
    AtomicBoolean resumed = new AtomicBoolean(false);
    List<Request> finishedRequests = new ArrayList<>();
    DefaultController testController =
        new DefaultController(
            "",
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
    cooldown();
    testController.shutdown();

    assertTrue(resumed.get());
    assertTrue(finishedRequests.size() >= 1);
  }
}
