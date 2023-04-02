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

import com.coreos.monitoring.models.V1Prometheus;
import com.coreos.monitoring.models.V1PrometheusList;
import com.coreos.monitoring.models.V1PrometheusSpec;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.io.IOException;

public class PromOpExample {
  public static void main(String[] args) throws IOException, ApiException {
    GenericKubernetesApi<V1Prometheus, V1PrometheusList> prometheusApi =
        new GenericKubernetesApi<>(
            V1Prometheus.class,
            V1PrometheusList.class,
            "monitoring.coreos.com",
            "v1",
            "prometheuses",
            ClientBuilder.defaultClient());
    prometheusApi
        .create(
            new V1Prometheus()
                .metadata(new V1ObjectMeta().namespace("default").name("my-prometheus"))
                .kind("Prometheus")
                .apiVersion("monitoring.coreos.com/v1")
                .spec(new V1PrometheusSpec()))
        .throwsApiException();
  }
}
