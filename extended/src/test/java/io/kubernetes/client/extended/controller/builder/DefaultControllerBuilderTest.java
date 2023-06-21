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

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.function.Function;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DefaultControllerBuilderTest {

  private SharedInformerFactory informerFactory = new SharedInformerFactory();
  private ExecutorService controllerThead = Executors.newSingleThreadExecutor();

  private ApiClient client;

  private static final int PORT = 8089;

  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setUp() throws Exception {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();
  }

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testWithLeaderElectorProxiesDefaultController() {}

  @Test(expected = IllegalStateException.class)
  public void testDummyBuildShouldFail() {
    ControllerBuilder.defaultBuilder(informerFactory).build();
  }

  @Test
  public void testBuildWatchShouldWorkIfInformerPresent() {
    CoreV1Api api = new CoreV1Api();
    informerFactory.sharedIndexInformerFor(
        (CallGeneratorParams params) -> {
          return api.listPodForAllNamespacesCall(
              null,
              null,
              null,
              null,
              null,
              null,
              params.resourceVersion,
              null,
              null,
              params.timeoutSeconds,
              params.watch,
              null);
        },
        V1Pod.class,
        V1PodList.class);
    ControllerBuilder.defaultBuilder(informerFactory)
        .watch(
            (workQueue) -> ControllerBuilder.controllerWatchBuilder(V1Pod.class, workQueue).build())
        .withReconciler(
            new Reconciler() {
              @Override
              public Result reconcile(Request request) {
                return new Result(false);
              }
            })
        .build();
  }

  @Test
  public void testControllerBuilderCustomizationShouldWork() {
    String testName = "test-controller";
    int testWorkerCount = 1024;
    ExecutorService threadPool = Executors.newCachedThreadPool();

    ControllerBuilder.defaultBuilder(informerFactory)
        .withName(testName)
        .withWorkerCount(testWorkerCount)
        .withWorkQueue(null)
        .withReconciler(
            new Reconciler() {
              @Override
              public Result reconcile(Request request) {
                return new Result(false);
              }
            })
        .build();
  }

  @Test
  public void testBuildWatchEventNotificationShouldWork() throws InterruptedException {
    V1PodList podList =
        new V1PodList()
            .metadata(new V1ListMeta().resourceVersion("0"))
            .items(
                Arrays.asList(
                    new V1Pod()
                        .metadata(new V1ObjectMeta().name("test-pod1"))
                        .spec(new V1PodSpec().hostname("hostname1"))));

    stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));

    CoreV1Api api = new CoreV1Api(client);
    SharedIndexInformer<V1Pod> podInformer =
        informerFactory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              return api.listPodForAllNamespacesCall(
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  params.resourceVersion,
                  null,
                  null,
                  params.timeoutSeconds,
                  params.watch,
                  null);
            },
            V1Pod.class,
            V1PodList.class);

    List<Request> keyFuncReceivingRequests = new ArrayList<>();
    Function<V1Pod, Request> podKeyFunc =
        (V1Pod pod) -> {
          // twisting pod name key
          Request request =
              new Request(pod.getSpec().getHostname() + "/" + pod.getMetadata().getName());
          keyFuncReceivingRequests.add(request);
          return request;
        };

    List<Request> controllerReceivingRequests = new ArrayList<>();
    final Semaphore latch = new Semaphore(1);
    latch.acquire();

    final Controller testController =
        ControllerBuilder.defaultBuilder(informerFactory)
            .withReconciler(
                new Reconciler() {
                  @Override
                  public Result reconcile(Request request) {
                    controllerReceivingRequests.add(request);
                    latch.release();
                    return new Result(false);
                  }
                })
            .watch(
                (workQueue) ->
                    ControllerBuilder.controllerWatchBuilder(V1Pod.class, workQueue)
                        .withWorkQueueKeyFunc(podKeyFunc)
                        .build())
            .build();

    controllerThead.submit(testController::run);
    informerFactory.startAllRegisteredInformers();

    // Wait for the request to be processed.
    latch.acquire(1);

    Request expectedRequest = new Request("hostname1/test-pod1");
    assertEquals(1, keyFuncReceivingRequests.size());
    assertEquals(expectedRequest, keyFuncReceivingRequests.get(0));

    assertEquals(1, controllerReceivingRequests.size());
    assertEquals(expectedRequest, controllerReceivingRequests.get(0));
  }
}
