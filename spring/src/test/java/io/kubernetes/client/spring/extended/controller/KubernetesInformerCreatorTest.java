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
package io.kubernetes.client.spring.extended.controller;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.core.Admin;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.PostServeAction;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ConfigMapList;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.util.Collections;
import java.util.concurrent.Semaphore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class KubernetesInformerCreatorTest {

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

  @SpringBootApplication
  static class App {

    @Bean
    public ApiClient testingApiClient() {
      return new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
    }

    @Bean
    public SharedIndexInformer<V1Pod> podInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1Pod, V1PodList> genericApi =
          new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(genericApi, V1Pod.class, 0);
    }

    @Bean
    public SharedIndexInformer<V1ConfigMap> configMapInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1ConfigMap, V1ConfigMapList> genericApi =
          new GenericKubernetesApi<>(
              V1ConfigMap.class, V1ConfigMapList.class, "", "v1", "configmaps", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(
          genericApi, V1ConfigMap.class, 0, "default");
    }
  }

  @Autowired private SharedInformerFactory informerFactory;

  @Autowired private SharedIndexInformer<V1Pod> podInformer;

  @Autowired private SharedIndexInformer<V1ConfigMap> configMapInformer;

  @Test
  void informerInjection() throws InterruptedException {
    assertThat(podInformer).isNotNull();
    assertThat(configMapInformer).isNotNull();

    Semaphore getCount = new Semaphore(2);
    Semaphore watchCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    Parameters watchParams = new Parameters();
    getParams.put("semaphore", getCount);
    watchParams.put("semaphore", watchCount);

    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    V1ConfigMap bar1 =
        new V1ConfigMap()
            .kind("ConfigMap")
            .metadata(new V1ObjectMeta().namespace("default").name("bar1"));

    apiServer.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        JSON.serialize(
                                new V1PodList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Collections.singletonList(foo1))))));
    apiServer.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    apiServer.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withPostServeAction("semaphore", getParams)
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        JSON.serialize(
                                new V1ConfigMapList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Collections.singletonList(bar1))))));
    apiServer.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withPostServeAction("semaphore", watchParams)
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    // These will be released for each web call above.
    getCount.acquire(2);
    watchCount.acquire(2);

    informerFactory.startAllRegisteredInformers();

    // Wait for the GETs to complete and the watches to start.
    getCount.acquire(2);
    watchCount.acquire(2);

    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("false")));
    apiServer.verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("true")));

    assertThat(new Lister<>(podInformer.getIndexer()).list()).hasSize(1);
    assertThat(new Lister<>(configMapInformer.getIndexer()).list()).hasSize(1);
  }
}
