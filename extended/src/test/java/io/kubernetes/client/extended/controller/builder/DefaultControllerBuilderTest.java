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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class DefaultControllerBuilderTest {

  private SharedInformerFactory informerFactory = new SharedInformerFactory();
  private ExecutorService controllerThead = Executors.newSingleThreadExecutor();

  private ApiClient client;

  private static final int PORT = 8089;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(WireMockConfiguration.options().port(PORT)).build();

  @BeforeEach
  void setUp() {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();
  }

  @AfterEach
  void tearDown() {}

  @Test
  void withLeaderElectorProxiesDefaultController() {}

  @Test
  void dummyBuildShouldFail() {
    assertThatThrownBy(() -> ControllerBuilder.defaultBuilder(informerFactory).build())
        .isInstanceOf(IllegalStateException.class);
  }

  @Test
  void buildWatchShouldWorkIfInformerPresent() {
    CoreV1Api api = new CoreV1Api();
    informerFactory.sharedIndexInformerFor(
        (CallGeneratorParams params) -> {
          return api.listPodForAllNamespaces()
                  .resourceVersion(params.resourceVersion)
                  .timeoutSeconds(params.timeoutSeconds)
                  .watch(params.watch)
                  .buildCall(null);
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
  void controllerBuilderCustomizationShouldWork() {
    String testName = "test-controller";
    int testWorkerCount = 1024;

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
  void buildWatchEventNotificationShouldWork() throws InterruptedException {
    V1PodList podList =
        new V1PodList()
            .metadata(new V1ListMeta().resourceVersion("0"))
            .items(
                Arrays.asList(
                    new V1Pod()
                        .metadata(new V1ObjectMeta().name("test-pod1"))
                        .spec(new V1PodSpec().hostname("hostname1"))));

    apiServer.stubFor(
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
              return api.listPodForAllNamespaces()
                      .resourceVersion(params.resourceVersion)
                      .timeoutSeconds(params.timeoutSeconds)
                      .watch(params.watch)
                      .buildCall(null);
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
    assertThat(keyFuncReceivingRequests).containsExactly(expectedRequest);
    assertThat(controllerReceivingRequests).containsExactly(expectedRequest);
  }
}
