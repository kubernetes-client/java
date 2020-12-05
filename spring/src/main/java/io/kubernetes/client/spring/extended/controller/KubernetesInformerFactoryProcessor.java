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

import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.ResolvableType;

/**
 * The type Kubernetes informer factory processor which basically does the following things:
 *
 * <p>1. By-pass further processing if there's no SharedInformerFactory registered. 2. Instansiate a
 * new ApiClient if there's no user-specified one for override. 3. By reading from {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers}, instantiates and
 * injects informers to spring context with the underlying constructing process hidden from users.
 */
public class KubernetesInformerFactoryProcessor
    implements BeanDefinitionRegistryPostProcessor, Ordered {

  private static final Logger log =
      LoggerFactory.getLogger(KubernetesInformerFactoryProcessor.class);

  public static final int ORDER = 0;

  private BeanDefinitionRegistry beanDefinitionRegistry;

  private final ApiClient apiClient;
  private final SharedInformerFactory sharedInformerFactory;

  @Autowired
  public KubernetesInformerFactoryProcessor(
      ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
    this.apiClient = apiClient;
    this.sharedInformerFactory = sharedInformerFactory;
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {

    this.apiClient.setHttpClient(
        this.apiClient.getHttpClient().newBuilder().readTimeout(Duration.ZERO).build());

    KubernetesInformers kubernetesInformers =
        sharedInformerFactory.getClass().getAnnotation(KubernetesInformers.class);
    if (kubernetesInformers == null || kubernetesInformers.value().length == 0) {
      log.info("No informers registered in the sharedInformerFactory..");
      return;
    }
    for (KubernetesInformer kubernetesInformer : kubernetesInformers.value()) {
      final GenericKubernetesApi api =
          new GenericKubernetesApi(
              kubernetesInformer.apiTypeClass(),
              kubernetesInformer.apiListTypeClass(),
              kubernetesInformer.groupVersionResource().apiGroup(),
              kubernetesInformer.groupVersionResource().apiVersion(),
              kubernetesInformer.groupVersionResource().resourcePlural(),
              apiClient);
      SharedIndexInformer sharedIndexInformer =
          sharedInformerFactory.sharedIndexInformerFor(
              api,
              kubernetesInformer.apiTypeClass(),
              kubernetesInformer.resyncPeriodMillis(),
              kubernetesInformer.namespace());
      ResolvableType informerType =
          ResolvableType.forClassWithGenerics(
              SharedInformer.class, kubernetesInformer.apiTypeClass());
      RootBeanDefinition informerBean = new RootBeanDefinition();
      informerBean.setTargetType(informerType);
      informerBean.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
      informerBean.setAutowireCandidate(true);
      String informerBeanName = informerType.toString();
      this.beanDefinitionRegistry.registerBeanDefinition(informerBeanName, informerBean);
      beanFactory.registerSingleton(informerBeanName, sharedIndexInformer);

      Lister lister = new Lister(sharedIndexInformer.getIndexer());
      ResolvableType listerType =
          ResolvableType.forClassWithGenerics(Lister.class, kubernetesInformer.apiTypeClass());
      RootBeanDefinition listerBean = new RootBeanDefinition();
      listerBean.setTargetType(listerType);
      listerBean.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
      listerBean.setAutowireCandidate(true);
      String listerBeanName = listerType.toString();
      this.beanDefinitionRegistry.registerBeanDefinition(listerBeanName, listerBean);
      beanFactory.registerSingleton(listerBeanName, lister);
    }
  }

  @Override
  public int getOrder() {
    return 0;
  }

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
      throws BeansException {
    this.beanDefinitionRegistry = registry;
  }
}
