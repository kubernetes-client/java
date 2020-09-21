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
import org.springframework.beans.factory.FactoryBean;

/**
 * KubernetesReconcilerConfigurer will register a {@link KubernetesReconcilerProcessor} into the
 * context.
 */
public class KubernetesReconcilerConfigurer implements FactoryBean<KubernetesReconcilerProcessor> {

  private final SharedInformerFactory sharedInformerFactory;

  public KubernetesReconcilerConfigurer(SharedInformerFactory sharedInformerFactory) {
    this.sharedInformerFactory = sharedInformerFactory;
  }

  @Override
  public KubernetesReconcilerProcessor getObject() throws Exception {
    return new KubernetesReconcilerProcessor(sharedInformerFactory);
  }

  @Override
  public Class<?> getObjectType() {
    return KubernetesReconcilerProcessor.class;
  }
}
