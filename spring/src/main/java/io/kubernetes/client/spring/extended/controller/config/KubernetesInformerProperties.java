/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.controller.config;

import io.kubernetes.client.informer.cache.ReflectorRunnable;
import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kubernetes.informer")
public class KubernetesInformerProperties {

  private Duration clientReadTimeout = ReflectorRunnable.REFLECTOR_WATCH_CLIENTSIDE_MAX_TIMEOUT;

  public Duration getClientReadTimeout() {
    return clientReadTimeout;
  }

  public KubernetesInformerProperties setClientReadTimeout(Duration clientReadTimeout) {
    this.clientReadTimeout = clientReadTimeout;
    return this;
  }
}
