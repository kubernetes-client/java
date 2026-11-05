/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.manifests;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.util.ReflectionTestUtils;

class KubernetesFromConfigMapPollingTest {

  private static final String CONFIG_MAP_PATH = "/api/v1/namespaces/default/configmaps/polling";

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance()
          .options(WireMockConfiguration.options().dynamicPort())
          .build();

  @Test
  void refreshesFromApiServerAtConfiguredInterval() {
    ApiClient apiClient = new ApiClient().setBasePath(apiServer.baseUrl());
    KubernetesManifestsProperties properties =
        new KubernetesManifestsProperties().setRefreshInterval(Duration.ofSeconds(1));
    KubernetesFromConfigMapProcessor processor = new KubernetesFromConfigMapProcessor();

    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
      context.registerBean(ApiClient.class, () -> apiClient);
      context.registerBean(KubernetesManifestsProperties.class, () -> properties);
      context.refresh();
      context.getAutowireCapableBeanFactory().autowireBean(processor);
      processor.setApplicationContext(context);

      stubConfigMap(
          apiClient,
          new V1ConfigMap().putDataItem("foo", "original").putDataItem("removed", "value"));
      MyBean bean = new MyBean();
      processor.postProcessAfterInitialization(bean, "myBean");
      assertThat(bean.data).containsEntry("foo", "original").containsKey("removed");
      apiServer.verify(getRequestedFor(urlPathEqualTo(CONFIG_MAP_PATH)));

      apiServer.resetRequests();
      stubConfigMap(
          apiClient, new V1ConfigMap().putDataItem("foo", "updated").putDataItem("added", "value"));
      await()
          .atMost(properties.getRefreshInterval().multipliedBy(5))
          .untilAsserted(
              () ->
                  assertThat(bean.data)
                      .containsExactlyInAnyOrderEntriesOf(
                          Map.of("foo", "updated", "added", "value")));
      apiServer.verify(getRequestedFor(urlPathEqualTo(CONFIG_MAP_PATH)));
    } finally {
      ((ScheduledExecutorService) ReflectionTestUtils.getField(processor, "configMapKeyRefresher"))
          .shutdownNow();
    }
  }

  private static void stubConfigMap(ApiClient apiClient, V1ConfigMap configMap) {
    apiServer.stubFor(
        get(urlPathEqualTo(CONFIG_MAP_PATH))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(apiClient.getJSON().serialize(configMap))));
  }

  static class MyBean {
    @FromConfigMap(namespace = "default", name = "polling")
    private Map<String, String> data;
  }
}
