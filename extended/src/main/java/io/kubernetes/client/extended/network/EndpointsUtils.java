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
package io.kubernetes.client.extended.network;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndpointsUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(EndpointsUtils.class);

  public static Supplier<V1Endpoints> newPollingEndpointsReader(
      String namespace, String name, Duration pollingInterval, ApiClient apiClient)
      throws ApiException {
    return newPollingEndpointsReader(
        namespace,
        name,
        pollingInterval,
        Executors.newSingleThreadScheduledExecutor(
            new ThreadFactoryBuilder()
                .setDaemon(true)
                .setNameFormat("EndpointPoller[" + namespace + "/" + name + "]")
                .build()),
        apiClient);
  }

  public static Supplier<V1Endpoints> newPollingEndpointsReader(
      String namespace,
      String name,
      Duration pollingInterval,
      ScheduledExecutorService pollerDaemon,
      ApiClient apiClient)
      throws ApiException {
    if (pollingInterval.isZero() || pollingInterval.isNegative()) {
      throw new IllegalArgumentException(
          "polling interval must be positive: " + pollingInterval.toString());
    }
    CoreV1Api coreV1Api = new CoreV1Api(apiClient);
    V1Endpoints endpoints = coreV1Api.readNamespacedEndpoints(name, namespace, null, null, null);
    AtomicReference<V1Endpoints> ref = new AtomicReference<>(endpoints);
    pollerDaemon.scheduleAtFixedRate(
        () -> {
          try {
            V1Endpoints refreshingEndpoint =
                coreV1Api.readNamespacedEndpoints(name, namespace, null, null, null);
            ref.set(refreshingEndpoint);
          } catch (ApiException e) {
            LOGGER.error("failed polling endpoint {}/{}", namespace, name, e);
          }
        },
        0,
        pollingInterval.toMillis(),
        TimeUnit.MILLISECONDS);
    return ref::get;
  }

  public static Supplier<V1Endpoints> newCachedEndpointsReader(
      String namespace, String name, Lister<V1Endpoints> endpointsLister) {
    return () -> endpointsLister.namespace(namespace).get(name);
  }
}
