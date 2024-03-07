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
package io.kubernetes.client.spring.extended.controller.config;

import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.spring.extended.controller.KubernetesInformerFactoryProcessor;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnKubernetesInformerEnabled
@EnableConfigurationProperties({
  KubernetesInformerProperties.class,
})
public class KubernetesInformerAutoConfiguration {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(KubernetesInformerAutoConfiguration.class);

  @Bean
  @ConditionalOnMissingBean
  public ApiClient defaultApiClient() throws IOException {
    try {
      ApiClient apiClient = ClientBuilder.defaultClient();
      return apiClient;
    } catch (Exception e) {
      LOGGER.warn("Could not create a Kubernetes ApiClient from either a cluster or standard environment. " + "Will return one that always connects to localhost:8080", e);
      return new ClientBuilder().build();
    }
  }

  @Bean
  @ConditionalOnMissingBean
  public SharedInformerFactory sharedInformerFactory() {
    return new SharedInformerFactory();
  }

  @Bean
  @ConditionalOnMissingBean
  public static KubernetesInformerFactoryProcessor kubernetesInformerConfigurer() {
    return new KubernetesInformerFactoryProcessor();
  }
}
