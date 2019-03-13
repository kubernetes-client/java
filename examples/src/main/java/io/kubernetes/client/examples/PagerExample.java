/*
Copyright 2019 The Kubernetes Authors.
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

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.pager.Pager;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.PagerParams;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);
    CoreV1Api api = new CoreV1Api();
    int i = 0;
    Pager pager =
        new Pager(
            (PagerParams param) -> {
              try {
                return api.listNamespaceCall(
                    null,
                    null,
                    param.getContinue(),
                    null,
                    null,
                    param.getLimit(),
                    null,
                    null,
                    null,
                    null,
                    null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            3,
            V1NamespaceList.class);
    while (pager.hasNext()) {
      V1NamespaceList list = pager.next();
      List<V1Namespace> items = list.getItems();
      System.out.println("count:" + items.size());
      for (V1Namespace namespace : items) {
        System.out.println(namespace.getMetadata().getName());
      }
      System.out.println("------------------" + (++i));
    }
  }
}
