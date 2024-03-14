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
package io.kubernetes.client.informer.impl;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.moreThan;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.core.Admin;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.PostServeAction;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.exception.ObjectTransformException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Watch;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class DefaultSharedIndexInformerWireMockTest {

  private String namespace;
  private String podName;
  private String container;

  private ApiClient client;

  public static class CountRequestAction extends PostServeAction {
        @Override
        public String getName() {
            return "semaphore";
        }

        @Override
        public void doAction(ServeEvent serveEvent, Admin admin, Parameters parameters) {
            Semaphore count = (Semaphore) parameters.get("semaphore");
            count.release();
        }
  }

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance()
          .options(options().dynamicPort().extensions(new CountRequestAction()))
          .build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();

    namespace = "default";
    podName = "apod";
    container = "container";
  }

  @Test
  void namespacedPodInformerNormalBehavior() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);
    Semaphore getCount = new Semaphore(1);
    Semaphore watchCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    Parameters watchParams = new Parameters();
    getParams.put("semaphore", getCount);
    watchParams.put("semaphore", watchCount);
    String startRV = "1000";
    String endRV = "1001";

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));
    Watch.Response<V1Pod> watchResponse =
        new Watch.Response<>(
            EventType.ADDED.name(),
            new V1Pod()
                .metadata(
                    new V1ObjectMeta().namespace(namespace).name(podName).resourceVersion(endRV)));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(watchResponse))));

    SharedInformerFactory factory = new SharedInformerFactory();
    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listNamespacedPod(namespace)
                        .resourceVersion(params.resourceVersion)
                        .watch(params.watch)
                        .timeoutSeconds(params.timeoutSeconds)
                        .buildCall(null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    AtomicBoolean foundExistingPod = new AtomicBoolean(false);
    CountDownLatch latch = new CountDownLatch(1);
    podInformer.addEventHandler(
        new ResourceEventHandler<V1Pod>() {
          @Override
          public void onAdd(V1Pod obj) {
            if (podName.equals(obj.getMetadata().getName())
                && namespace.equals(obj.getMetadata().getNamespace())) {
              foundExistingPod.set(true);
              latch.countDown();
            }
          }

          @Override
          public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

          @Override
          public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
        });

    getCount.acquire(1);
    watchCount.acquire(2);

    factory.startAllRegisteredInformers();

    latch.await();
    getCount.acquire(1);
    watchCount.acquire(2);

    assertThat(foundExistingPod).isTrue();
    assertThat(podInformer.lastSyncResourceVersion()).isEqualTo(endRV);

    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("true")));

    factory.stopAllRegisteredInformers();
  }

  @Test
  void allNamespacedPodInformerNormalBehavior() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);
    Semaphore getCount = new Semaphore(1);
    Semaphore watchCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    Parameters watchParams = new Parameters();
    getParams.put("semaphore", getCount);
    watchParams.put("semaphore", watchCount);
    String startRV = "1000";
    String endRV = "1001";

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));

    Watch.Response<V1Pod> watchResponse =
        new Watch.Response<>(
            EventType.ADDED.name(),
            new V1Pod()
                .metadata(
                    new V1ObjectMeta()
                        .namespace(namespace)
                        .name(podName)
                        .resourceVersion(endRV)
                        .labels(Collections.singletonMap("foo", "bar"))
                        .annotations(Collections.singletonMap("foo", "bar"))));

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(watchResponse))));

    SharedInformerFactory factory = new SharedInformerFactory();
    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listPodForAllNamespaces()
                        .resourceVersion(params.resourceVersion)
                        .timeoutSeconds(params.timeoutSeconds)
                        .watch(params.watch)
                        .buildCall(null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    podInformer.setTransform(
        (obj) -> {
          // deepcopy
          String json = new JSON().serialize(obj);
          V1Pod pod = new JSON().deserialize(json, V1Pod.class);
          // remove pod annotations
          pod.getMetadata().setAnnotations(null);
          return pod;
        });

    AtomicBoolean foundExistingPod = new AtomicBoolean(false);
    AtomicBoolean transformed = new AtomicBoolean(false);
    AtomicBoolean setTransformAfterStarted = new AtomicBoolean(false);
    CountDownLatch latch = new CountDownLatch(2);
    podInformer.addEventHandler(
        new ResourceEventHandler<V1Pod>() {
          @Override
          public void onAdd(V1Pod obj) {
            if (podName.equals(obj.getMetadata().getName())
                && namespace.equals(obj.getMetadata().getNamespace())) {
              foundExistingPod.set(true);
              latch.countDown();
            }
            V1ObjectMeta metadata = obj.getMetadata();
            // check if the object was transformed
            if (metadata.getLabels().get("foo").equals("bar")
                && metadata.getAnnotations() == null) {
              transformed.set(true);
              latch.countDown();
            }
          }

          @Override
          public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

          @Override
          public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
        });

    getCount.acquire(1);
    watchCount.acquire(2);

    factory.startAllRegisteredInformers();

    latch.await();
    getCount.acquire(1);
    watchCount.acquire(2);
    // can not set transform func if the informer has started
    try {
      podInformer.setTransform((obj) -> new V1Pod());
      setTransformAfterStarted.set(true);
    } catch (IllegalStateException e) {
    }

    assertThat(foundExistingPod).isTrue();
    assertThat(transformed).isTrue();
    assertThat(setTransformAfterStarted).isFalse();
    assertThat(podInformer.lastSyncResourceVersion()).isEqualTo(endRV);

    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    factory.stopAllRegisteredInformers();
  }

  @Test
  void allNamespacedPodInformerTransformFailure() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);
    Semaphore getCount = new Semaphore(1);
    Semaphore watchCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    Parameters watchParams = new Parameters();
    getParams.put("semaphore", getCount);
    watchParams.put("semaphore", watchCount);
    String startRV = "1000";
    String endRV = "1001";

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));

    Watch.Response<V1Pod> watchResponse =
        new Watch.Response<>(
            EventType.ADDED.name(),
            new V1Pod()
                .metadata(
                    new V1ObjectMeta().namespace(namespace).name(podName).resourceVersion(endRV)));

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(watchResponse))));

    SharedInformerFactory factory = new SharedInformerFactory();
    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listPodForAllNamespaces()
                        .resourceVersion(params.resourceVersion)
                        .timeoutSeconds(params.timeoutSeconds)
                        .watch(params.watch)
                        .buildCall(null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);
    CountDownLatch latch = new CountDownLatch(2);
    podInformer.setTransform(
        (obj) -> {
          latch.countDown();
          throw new ObjectTransformException("test transform failure");
        });
    AtomicBoolean foundExistingPod = new AtomicBoolean(false);

    podInformer.addEventHandler(
        new ResourceEventHandler<V1Pod>() {
          @Override
          public void onAdd(V1Pod obj) {
            if (podName.equals(obj.getMetadata().getName())
                && namespace.equals(obj.getMetadata().getNamespace())) {
              foundExistingPod.set(true);
              latch.countDown();
            }
          }

          @Override
          public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

          @Override
          public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
        });

    getCount.acquire(1);
    watchCount.acquire(2);

    factory.startAllRegisteredInformers();

    latch.await();
    getCount.acquire(1);
    watchCount.acquire(2);

    // cannot find the pod due to transform failure
    assertThat(foundExistingPod).isFalse();
    assertThat(podInformer.lastSyncResourceVersion()).isEqualTo(endRV);

    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    factory.stopAllRegisteredInformers();
  }

  @Test
  void informerReListWatchOnWatchConflict() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);

    String startRV = "1000";
    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());
    Semaphore getCount = new Semaphore(2);
    Semaphore watchCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    Parameters watchParams = new Parameters();
    getParams.put("semaphore", getCount);
    watchParams.put("semaphore", watchCount);


      apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));

    Watch.Response<V1Pod> watchResponse =
        new Watch.Response<>(
            EventType.ERROR.name(), new V1Status().apiVersion("v1").kind("Status").code(409));
      apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .withQueryParam("resourceVersion", equalTo(startRV))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(watchResponse))));

    SharedInformerFactory factory = new SharedInformerFactory();
    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listNamespacedPod(namespace)
                        .resourceVersion(params.resourceVersion)
                        .timeoutSeconds(params.timeoutSeconds)
                        .watch(params.watch)
                        .buildCall(null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    getCount.acquire(2);
    watchCount.acquire(2);

    factory.startAllRegisteredInformers();

    getCount.acquire(2);
    watchCount.acquire(2);

    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("true")));
    factory.stopAllRegisteredInformers();
  }

  @Test
  void informerReListingOnListForbidden() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);
    Semaphore getCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    getParams.put("semaphore", getCount);

      apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(403)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        new JSON()
                            .serialize(
                                new V1Status()
                                    .apiVersion("v1")
                                    .kind("Status")
                                    .code(403)
                                    .reason("RBAC forbidden")))));

    SharedInformerFactory factory = new SharedInformerFactory();
    SharedIndexInformer<V1Pod> podInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listNamespacedPod(namespace)
                        .resourceVersion(params.resourceVersion)
                        .timeoutSeconds(params.timeoutSeconds)
                        .watch(params.watch)
                        .buildCall(null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    getCount.acquire(2);
    factory.startAllRegisteredInformers();
    getCount.acquire(2);

    apiServer.verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    factory.stopAllRegisteredInformers();
  }
}
