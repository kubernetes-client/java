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
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

/**
 * The type Kubernetes informer factory processor which basically does the following things:
 *
 * <p>1. By-pass further processing if there's no SharedInformerFactory registered. 2. Instansiate a
 * new ApiClient if there's no user-specified one for override. 3. By reading from {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers}, instantiates and
 * injects informers to spring context with the underlying constructing process hidden from users.
 */
@Component
public class KubernetesInformerFactoryProcessor
    implements BeanDefinitionRegistryPostProcessor, Ordered {

  private static final Logger log =
      LoggerFactory.getLogger(KubernetesInformerFactoryProcessor.class);

  public static final int ORDER = 0;

  private BeanDefinitionRegistry beanDefinitionRegistry;

  private ApiClient apiClient = null;

  public KubernetesInformerFactoryProcessor(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    Optional<String> sharedInformerFactoryBeanName;
    try {
      Map<String, SharedInformerFactory> sharedInformerFactories =
          beanFactory.getBeansOfType(SharedInformerFactory.class);
      if (sharedInformerFactories.size() > 1) {
        log.warn("More than sharedInformerFactory registered..");
        return;
      }
      sharedInformerFactoryBeanName = sharedInformerFactories.keySet().stream().findFirst();
    } catch (NoSuchBeanDefinitionException e) {
      // should never happen..
      log.error("No sharedInformerFactory bean registered..");
      return;
    }

    if (!sharedInformerFactoryBeanName.isPresent()) {
      log.info("No sharedInformerFactory selected, skipping informers constructing..");
      return;
    }

    if (this.apiClient == null) {
      try {
        this.apiClient = beanFactory.getBean(ApiClient.class);
      } catch (NoSuchBeanDefinitionException e) {
        log.info("No ApiClient bean found, falling-back to default initialization..");
        try {
          this.apiClient = ClientBuilder.standard().build();
        } catch (IOException ex) {
          log.error("failed initializing ApiClient", ex);
          return;
        }
      }
    }

    this.apiClient.setHttpClient(
        this.apiClient.getHttpClient().newBuilder().readTimeout(Duration.ZERO).build());

    SharedInformerFactory sharedInformerFactory = beanFactory.getBean(SharedInformerFactory.class);
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
              api, kubernetesInformer.apiTypeClass(), kubernetesInformer.resyncPeriodMillis());
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
