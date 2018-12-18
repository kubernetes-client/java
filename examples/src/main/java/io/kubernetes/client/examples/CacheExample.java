/*
Copyright 2018 The Kubernetes Authors.
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

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.util.Cache;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Watch;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.CacheExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class CacheExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    CoreV1Api api = new CoreV1Api();

    Function<CallGeneratorParams, Call> listFn =
        (CallGeneratorParams params) -> {
          try {
            return api.listNamespaceCall(
                null, null, null, null, null, 5, params.resourceVersion, params.timeout, params.watch, null, null);
          } catch (ApiException ex) {
            return null;
          }
        };

    Cache<V1Namespace, V1NamespaceList> cache = new Cache(client, listFn, V1NamespaceList.class, new TypeToken<Watch.Response<V1Namespace>>() {}.getType());

    while (true) {
      V1NamespaceList list = cache.list();
      for (V1Namespace ns : list.getItems()) {
        System.out.print(ns.getMetadata().getName());
        System.out.print(", ");
      }
      System.out.println();
      try {
        Thread.sleep(2 * 1000);
      } catch (InterruptedException ex) {
      }
    }
  }
}
