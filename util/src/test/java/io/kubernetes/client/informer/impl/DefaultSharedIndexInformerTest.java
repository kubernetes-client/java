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

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
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
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DefaultSharedIndexInformerTest {

  private String namespace;
  private String podName;
  private String container;

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();

    namespace = "default";
    podName = "apod";
    container = "container";
  }

  @Test
  public void testNamespacedPodInformerNormalBehavior() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);

    String startRV = "1000";
    String endRV = "1001";

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
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
    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
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
                return coreV1Api.listNamespacedPodCall(
                    namespace,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    params.resourceVersion,
                    null,
                    params.timeoutSeconds,
                    params.watch,
                    null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    AtomicBoolean foundExistingPod = new AtomicBoolean(false);
    podInformer.addEventHandler(
        new ResourceEventHandler<V1Pod>() {
          @Override
          public void onAdd(V1Pod obj) {
            if (podName.equals(obj.getMetadata().getName())
                && namespace.equals(obj.getMetadata().getNamespace())) {
              foundExistingPod.set(true);
            }
          }

          @Override
          public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

          @Override
          public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
        });
    factory.startAllRegisteredInformers();

    Thread.sleep(1000);

    assertEquals(true, foundExistingPod.get());
    assertEquals(endRV, podInformer.lastSyncResourceVersion());

    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("true")));

    factory.stopAllRegisteredInformers();
  }

  @Test
  public void testAllNamespacedPodInformerNormalBehavior() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);

    String startRV = "1000";
    String endRV = "1001";

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
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

    stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
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
                return coreV1Api.listPodForAllNamespacesCall(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    params.resourceVersion,
                    null,
                    params.timeoutSeconds,
                    params.watch,
                    null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);
    AtomicBoolean foundExistingPod = new AtomicBoolean(false);
    podInformer.addEventHandler(
        new ResourceEventHandler<V1Pod>() {
          @Override
          public void onAdd(V1Pod obj) {
            if (podName.equals(obj.getMetadata().getName())
                && namespace.equals(obj.getMetadata().getNamespace())) {
              foundExistingPod.set(true);
            }
          }

          @Override
          public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

          @Override
          public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
        });
    factory.startAllRegisteredInformers();
    Thread.sleep(1000);

    assertEquals(true, foundExistingPod.get());
    assertEquals(endRV, podInformer.lastSyncResourceVersion());

    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    factory.stopAllRegisteredInformers();
  }

  @Test
  public void testInformerReListWatchOnWatchConflict() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);

    String startRV = "1000";
    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta().resourceVersion(startRV)).items(Arrays.asList());

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(new JSON().serialize(podList))));

    Watch.Response<V1Pod> watchResponse =
        new Watch.Response<>(
            EventType.ERROR.name(), new V1Status().apiVersion("v1").kind("Status").code(409));
    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
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
                return coreV1Api.listNamespacedPodCall(
                    namespace,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    params.resourceVersion,
                    null,
                    params.timeoutSeconds,
                    params.watch,
                    null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    factory.startAllRegisteredInformers();

    // Sleep mroe than 1s so that informer can perform multiple rounds of list-watch
    Thread.sleep(3000);

    verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("true")));
    factory.stopAllRegisteredInformers();
  }

  @Test
  public void testInformerReListingOnListForbidden() throws InterruptedException {

    CoreV1Api coreV1Api = new CoreV1Api(client);

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
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
                return coreV1Api.listNamespacedPodCall(
                    namespace,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    params.resourceVersion,
                    null,
                    params.timeoutSeconds,
                    params.watch,
                    null);
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
            },
            V1Pod.class,
            V1PodList.class);

    factory.startAllRegisteredInformers();

    // Sleep mroe than 1s so that informer can perform multiple rounds of list-watch
    Thread.sleep(3000);

    verify(
        moreThan(1),
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods"))
            .withQueryParam("watch", equalTo("false")));
    factory.stopAllRegisteredInformers();
  }
}
