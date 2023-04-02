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
package io.kubernetes.client.spring.extended.manifests.config;

import io.kubernetes.client.spring.extended.manifests.KubernetesFromConfigMapProcessor;
import io.kubernetes.client.spring.extended.manifests.KubernetesFromYamlProcessor;
import io.kubernetes.client.spring.extended.manifests.KubernetesKubectlApplyProcessor;
import io.kubernetes.client.spring.extended.manifests.KubernetesKubectlCreateProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnKubernetesManifestsEnabled
@EnableConfigurationProperties({
  KubernetesManifestsProperties.class,
})
public class KubernetesManifestsAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public KubernetesFromYamlProcessor kubernetesFromYamlProcessor() {
    return new KubernetesFromYamlProcessor();
  }

  @Bean
  @ConditionalOnMissingBean
  public KubernetesFromConfigMapProcessor kubernetesFromConfigMapProcessor() {
    return new KubernetesFromConfigMapProcessor();
  }

  @Bean
  @ConditionalOnMissingBean
  public KubernetesKubectlCreateProcessor kubernetesKubectlCreateProcessor() {
    return new KubernetesKubectlCreateProcessor();
  }

  @Bean
  @ConditionalOnMissingBean
  public KubernetesKubectlApplyProcessor kubernetesKubectlApplyProcessor() {
    return new KubernetesKubectlApplyProcessor();
  }
}
