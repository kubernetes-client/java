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
package io.kubernetes.client.monitoring;

import io.kubernetes.client.apimachinery.KubernetesRequestDigest;
import io.kubernetes.client.util.Strings;
import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import io.prometheus.client.SimpleTimer;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class PrometheusInterceptor implements Interceptor {

  static final String PREFIX = "k8s_java";

  static final Counter requests =
      Counter.build().name(PREFIX + "_requests_total").help("Total requests").register();

  static final Counter codes =
      Counter.build()
          .name(PREFIX + "_response_code_total")
          .help("Response code total")
          .labelNames("code")
          .register();

  static final Histogram resourceRequestLatencyHistogram =
      Histogram.build()
          .name(PREFIX + "_resource_request_latency_seconds")
          .help("Kubernetes resource request latency (seconds)")
          .labelNames(
              "http_response_code",
              "group",
              "version",
              "resource",
              "subresource",
              "api_verb",
              "namespace")
          .register();

  static final Histogram nonResourceRequestLatencyHistogram =
      Histogram.build()
          .name(PREFIX + "_non_resource_request_latency_seconds")
          .help("Kubernetes non-resource request latency (seconds)")
          .labelNames("http_response_code", "non_resource_url_path")
          .register();

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    requests.inc();
    Request request = chain.request();
    KubernetesRequestDigest requestDigest = KubernetesRequestDigest.parse(request);
    SimpleTimer timer = new SimpleTimer();

    final double timecost;
    final Response response;
    try {
      response = chain.proceed(chain.request());
    } finally {
      timecost = timer.elapsedSeconds();
    }

    codes.labels(Integer.toString(response.code())).inc();

    if (requestDigest.isNonResourceRequest()) {
      nonResourceRequestLatencyHistogram
          .labels(Integer.toString(response.code()), requestDigest.getUrlPath())
          .observe(timecost);
    } else {
      resourceRequestLatencyHistogram
          .labels(
              Integer.toString(response.code()),
              Strings.nullToEmpty(
                  requestDigest.getResourceMeta().getGroupVersionResource().getGroup()),
              Strings.nullToEmpty(
                  requestDigest.getResourceMeta().getGroupVersionResource().getVersion()),
              Strings.nullToEmpty(
                  requestDigest.getResourceMeta().getGroupVersionResource().getResource()),
              Strings.nullToEmpty(requestDigest.getResourceMeta().getSubResource()),
              requestDigest.getVerb().value(),
              Strings.nullToEmpty(requestDigest.getResourceMeta().getNamespace()))
          .observe(timecost);
    }
    return response;
  }
}
