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
package io.kubernetes.client.extended.pager;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.ClientBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class PagerTest {

  private ApiClient client;
  private static final String LIST_PAGE0_FILE_PATH =
      new File(PagerTest.class.getClassLoader().getResource("namespace-list-pager0.json").getPath())
          .toString();
  private static final String LIST_PAGE1_FILE_PATH =
      new File(PagerTest.class.getClassLoader().getResource("namespace-list-pager1.json").getPath())
          .toString();
  private static final String LIST_PAGE2_FILE_PATH =
      new File(PagerTest.class.getClassLoader().getResource("namespace-list-pager2.json").getPath())
          .toString();
  private static final String LIST_STATUS_FILE_PATH =
      new File(PagerTest.class.getClassLoader().getResource("status-400.json").getPath())
          .toString();
  private static final String STATUS_BAD_TOKEN_FILE_PATH =
      new File(PagerTest.class.getClassLoader().getResource("bad-token-status.json").getPath())
          .toString();

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void iteratorForEmptyList() throws IOException {
    String namespaceListPage0Str = new String(Files.readAllBytes(Paths.get(LIST_PAGE0_FILE_PATH)));
    CoreV1Api api = new CoreV1Api(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(namespaceListPage0Str)));

    Pager<V1Namespace, V1NamespaceList> pager =
        new Pager<V1Namespace, V1NamespaceList>(
            (Pager.PagerParams param) -> {
              try {
                return api.listNamespace().buildCall(null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            1,
            V1NamespaceList.class);
    Iterator<V1Namespace> it = pager.iterator();
    assertThat(it).isExhausted();
  }

  @Test
  void paginationForNamespaceListWithSuccessThreadSafely() throws Exception {
    String namespaceListPage1Str = new String(Files.readAllBytes(Paths.get(LIST_PAGE1_FILE_PATH)));
    String namespaceListPage2Str = new String(Files.readAllBytes(Paths.get(LIST_PAGE2_FILE_PATH)));
    CoreV1Api api = new CoreV1Api(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(namespaceListPage1Str)));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1"))
            .withQueryParam("continue", equalTo("c1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(namespaceListPage2Str)));

    int threads = 10;
    CountDownLatch latch = new CountDownLatch(threads);
    ExecutorService service = Executors.newFixedThreadPool(threads);

    Pager<V1Namespace, V1NamespaceList> pager =
        new Pager<V1Namespace, V1NamespaceList>(
            (Pager.PagerParams param) -> {
              try {
                return api.listNamespace()
                        ._continue(param.getContinueToken())
                        .limit(param.getLimit())
                        .buildCall(null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            1,
            V1NamespaceList.class);

    for (int i = 0; i < threads; i++) {
      service.submit(
          () -> {
            int size = 0;
            for (V1Namespace namespace : pager) {
              assertThat(namespace.getMetadata().getName()).isEqualTo("default");
              size++;
            }
            assertThat(size).isEqualTo(2);
            latch.countDown();
          });
    }

    latch.await(5, TimeUnit.SECONDS);

    apiServer.verify(
        2 * threads,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1")));
  }

  @Test
  void paginationForNamespaceListWithBadTokenFailure() throws IOException {
    String status400Str = new String(Files.readAllBytes(Paths.get(STATUS_BAD_TOKEN_FILE_PATH)));
    CoreV1Api api = new CoreV1Api(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1"))
            .willReturn(
                aResponse()
                    .withStatus(400)
                    .withHeader("Content-Type", "application/json")
                    .withBody(status400Str)));
    Pager<V1Namespace, V1NamespaceList> pager =
        new Pager<V1Namespace, V1NamespaceList>(
            (Pager.PagerParams param) -> {
              try {
                return api.listNamespace()
                        ._continue(param.getContinueToken())
                        .limit(param.getLimit())
                        .buildCall(null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            1,
            V1NamespaceList.class);

    try {
      for (V1Namespace namespace : pager) {
        assertThat(namespace.getMetadata().getName()).isEqualTo("default");
      }
      failBecauseExceptionWasNotThrown(Exception.class);
    } catch (Exception e) {
      assertThat(e.getMessage()).isEqualTo(status400Str);
    }

    apiServer.verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1")));
  }

  @Test
  void paginationForNamespaceListWithFieldSelectorFailure() throws IOException {
    String status400Str = new String(Files.readAllBytes(Paths.get(LIST_STATUS_FILE_PATH)));
    CoreV1Api api = new CoreV1Api(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("fieldSelector", equalTo("metadata.name=default"))
            .withQueryParam("limit", equalTo("1"))
            .willReturn(
                aResponse()
                    .withStatus(400)
                    .withHeader("Content-Type", "application/json")
                    .withBody(status400Str)));
    Pager<V1Namespace, V1NamespaceList> pager =
        new Pager<V1Namespace, V1NamespaceList>(
            (Pager.PagerParams param) -> {
              try {
                return api.listNamespace()
                        ._continue(param.getContinueToken())
                        .limit(param.getLimit())
                        .fieldSelector("metadata.name=default")
                        .buildCall(null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            1,
            V1NamespaceList.class);
    int count = 0;
    try {
      for (V1Namespace namespace : pager) {
        count++;
        assertThat(namespace.getMetadata().getName()).isEqualTo("default");
      }
    } catch (Exception e) {
      assertThat(e.getMessage()).isEqualTo(status400Str);
    }

    apiServer.verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("fieldSelector", equalTo("metadata.name=default"))
            .withQueryParam("limit", equalTo("1")));
  }
}
