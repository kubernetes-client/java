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

import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import java.io.IOException;
import okhttp3.Interceptor;
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
  static final Histogram latency =
      Histogram.build()
          .name(PREFIX + "_request_latency_seconds")
          .help("Request latency (seconds)")
          .register();

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    requests.inc();
    Histogram.Timer timer = latency.startTimer();

    try {
      Response response = chain.proceed(chain.request());
      codes.labels(Integer.toString(response.code())).inc();
      return response;
    } finally {
      timer.observeDuration();
    }
  }
}
