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
package io.kubernetes.client.spring.extended.manifests.config;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kubernetes.manifests")
public class KubernetesManifestsProperties {
  private Duration refreshInterval = Duration.ofSeconds(5);

  public Duration getRefreshInterval() {
    return refreshInterval;
  }

  public KubernetesManifestsProperties setRefreshInterval(Duration refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }
}
