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
package io.kubernetes.client.examples;

import io.kubernetes.client.extended.pager.Pager;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.PagerExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PagerExample {
  public static void main(String[] args) throws IOException {

    ApiClient client = Config.defaultClient();
    OkHttpClient httpClient =
        client.getHttpClient().newBuilder().readTimeout(60, TimeUnit.SECONDS).build();
    client.setHttpClient(httpClient);
    Configuration.setDefaultApiClient(client);
    CoreV1Api api = new CoreV1Api();
    int i = 0;
    Pager<V1Namespace, V1NamespaceList> pager =
        new Pager<V1Namespace, V1NamespaceList>(
            (Pager.PagerParams param) -> {
              try {
                return api.listNamespaceCall(
                    null,
                    null,
                    param.getContinueToken(),
                    null,
                    null,
                    param.getLimit(),
                    null,
                    null,
                    null,
                    1,
                    null,
                    null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            10,
            V1NamespaceList.class);
    for (V1Namespace namespace : pager) {
      System.out.println(namespace.getMetadata().getName());
    }
    System.out.println("------------------");
  }
}
