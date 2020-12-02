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
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ConfigMapList;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.spring.extended.controller.annotation.GroupVersionResource;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers;
import io.kubernetes.client.util.ClientBuilder;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KubernetesInformerCreatorTest.App.class})
public class KubernetesInformerCreatorTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8188);

  @SpringBootApplication
  @EnableAutoConfiguration
  static class App {

    @Bean
    public ApiClient testingApiClient() {
      ApiClient apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8188).build();
      return apiClient;
    }

    @Bean
    public SharedInformerFactory sharedInformerFactory() {
      return new TestSharedInformerFactory();
    }

    @KubernetesInformers({
      @KubernetesInformer(
          apiTypeClass = V1Pod.class,
          apiListTypeClass = V1PodList.class,
          groupVersionResource =
              @GroupVersionResource(apiGroup = "", apiVersion = "v1", resourcePlural = "pods")),
      @KubernetesInformer(
          apiTypeClass = V1ConfigMap.class,
          apiListTypeClass = V1ConfigMapList.class,
          namespace = "default",
          groupVersionResource =
              @GroupVersionResource(
                  apiGroup = "",
                  apiVersion = "v1",
                  resourcePlural = "configmaps")),
    })
    static class TestSharedInformerFactory extends SharedInformerFactory {}
  }

  @Autowired private SharedInformerFactory informerFactory;

  @Autowired private SharedInformer<V1Pod> podInformer;

  @Autowired private SharedInformer<V1ConfigMap> configMapInformer;

  @Autowired private Lister<V1Pod> podLister;

  @Autowired private Lister<V1ConfigMap> configMapLister;

  @Autowired private ApiClient apiClient;

  @Test
  public void testInformerInjection() throws InterruptedException {
    assertNotNull(podInformer);
    assertNotNull(configMapInformer);
    assertNotNull(podLister);
    assertNotNull(configMapLister);

    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    V1ConfigMap bar1 =
        new V1ConfigMap()
            .kind("ConfigMap")
            .metadata(new V1ObjectMeta().namespace("default").name("bar1"));

    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new Gson()
                            .toJson(
                                new V1PodList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Arrays.asList(foo1))))));
    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new Gson()
                            .toJson(
                                new V1ConfigMapList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Arrays.asList(bar1))))));
    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    informerFactory.startAllRegisteredInformers();

    Thread.sleep(200);

    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    verify(
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("false")));
    verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("true")));

    assertEquals(1, podLister.list().size());
    assertEquals(1, configMapLister.list().size());
  }
}
