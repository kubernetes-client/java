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
package io.kubernetes.client.spring.extended.controller;

import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.openapi.ApiClient;
import org.springframework.beans.factory.FactoryBean;

/**
 * KubernetesInformerConfigurer will register a {@link KubernetesInformerFactoryProcessor} into the
 * context.
 */
public class KubernetesInformerConfigurer
    implements FactoryBean<KubernetesInformerFactoryProcessor> {

  private final ApiClient apiClient;
  private final SharedInformerFactory sharedInformerFactory;

  public KubernetesInformerConfigurer(
      ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
    this.apiClient = apiClient;
    this.sharedInformerFactory = sharedInformerFactory;
  }

  @Override
  public KubernetesInformerFactoryProcessor getObject() throws Exception {
    return new KubernetesInformerFactoryProcessor(apiClient, sharedInformerFactory);
  }

  @Override
  public Class<?> getObjectType() {
    return KubernetesInformerFactoryProcessor.class;
  }
}
