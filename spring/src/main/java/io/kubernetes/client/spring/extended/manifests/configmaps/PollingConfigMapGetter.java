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
package io.kubernetes.client.spring.extended.manifests.configmaps;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import io.kubernetes.client.apimachinery.NamespaceName;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import java.time.Duration;
import org.springframework.beans.factory.annotation.Autowired;

public class PollingConfigMapGetter implements ConfigMapGetter {

  private static final Cache<NamespaceName, V1ConfigMap> lastObservedConfigMap =
      Caffeine.newBuilder().expireAfterWrite(Duration.ofMinutes(5)).build();

  @Autowired private ApiClient apiClient;

  @Override
  public V1ConfigMap get(String namespace, String name) {
    CoreV1Api coreV1Api = new CoreV1Api(apiClient);
    return lastObservedConfigMap.get(
        new NamespaceName(namespace, name),
        k -> {
          try {
            return coreV1Api.readNamespacedConfigMap(name, namespace).execute();
          } catch (ApiException e) {
            throw new IllegalStateException(e);
          }
        });
  }
}
