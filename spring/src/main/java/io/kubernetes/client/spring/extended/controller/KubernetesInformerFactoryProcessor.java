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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers;
import io.kubernetes.client.spring.extended.controller.config.KubernetesInformerProperties;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.ResolvableType;
import org.springframework.core.annotation.AnnotatedElementUtils;

/**
 * The type Kubernetes informer factory processor which basically does the following things:
 *
 * <p>1. By-pass further processing if there's no SharedInformerFactory registered. 2. Instansiate a
 * new ApiClient if there's no user-specified one for override. 3. By reading from {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers}, instantiates and
 * injects informers to spring context with the underlying constructing process hidden from users.
 *
 * @deprecated instead of declaring via the annotation create the informers manually as {@link
 *     org.springframework.context.annotation.Bean @Beans}
 */
@Deprecated
public class KubernetesInformerFactoryProcessor
    implements BeanDefinitionRegistryPostProcessor, BeanFactoryAware, Ordered {

  private static final Logger log =
      LoggerFactory.getLogger(KubernetesInformerFactoryProcessor.class);

  public static final int ORDER = 0;

  @Autowired private KubernetesInformerProperties informerProperties;

  private ConfigurableListableBeanFactory beanFactory;

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {}

  @Override
  public int getOrder() {
    return 0;
  }

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
      throws BeansException {
    if (!(registry instanceof BeanFactory)) {
      return;
    }
    for (String name : registry.getBeanDefinitionNames()) {
      KubernetesInformers kubernetesInformers = null;
      Class<?> cls = ((BeanFactory) registry).getType(name);
      if (cls != null) {
        kubernetesInformers =
            AnnotatedElementUtils.getMergedAnnotation(cls, KubernetesInformers.class);
      }
      if (kubernetesInformers == null) {
        kubernetesInformers = beanFactory.findAnnotationOnBean(name, KubernetesInformers.class);
      }
      if (kubernetesInformers == null) {
        continue;
      }
      if (kubernetesInformers.value().length > 0) {
        for (KubernetesInformer kubernetesInformer : kubernetesInformers.value()) {
          registerInformer(registry, kubernetesInformer);
          registerLister(registry, kubernetesInformer);
        }
      }
    }
  }

  private void registerInformer(
      BeanDefinitionRegistry registry, KubernetesInformer kubernetesInformer) {
    RootBeanDefinition informerBean =
        (RootBeanDefinition)
            BeanDefinitionBuilder.rootBeanDefinition(SharedInformer.class).getBeanDefinition();
    informerBean.setInstanceSupplier(
        () -> informer(kubernetesInformer.apiTypeClass(), kubernetesInformer));
    ResolvableType informerType =
        ResolvableType.forClassWithGenerics(
            SharedIndexInformer.class, kubernetesInformer.apiTypeClass());
    informerBean.setTargetType(informerType);
    registry.registerBeanDefinition(
        getInformerBeanName(kubernetesInformer.apiTypeClass()), informerBean);
  }

  private String getInformerBeanName(Class<?> type) {
    return type.getName() + "Informer";
  }

  private void registerLister(
      BeanDefinitionRegistry registry, KubernetesInformer kubernetesInformer) {
    RootBeanDefinition listerBean =
        (RootBeanDefinition)
            BeanDefinitionBuilder.rootBeanDefinition(Lister.class).getBeanDefinition();
    listerBean.setInstanceSupplier(() -> lister(kubernetesInformer.apiTypeClass()));
    ResolvableType listerType =
        ResolvableType.forClassWithGenerics(Lister.class, kubernetesInformer.apiTypeClass());
    listerBean.setTargetType(listerType);
    registry.registerBeanDefinition(listerType.toString(), listerBean);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private <T extends KubernetesObject> Lister<T> lister(Class<T> type) {
    SharedIndexInformer sharedInformer =
        this.beanFactory.getBean(getInformerBeanName(type), SharedIndexInformer.class);
    Lister<T> lister = new Lister<>(sharedInformer.getIndexer());
    return lister;
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private <T extends KubernetesObject> SharedInformer<T> informer(
      Class<T> type, KubernetesInformer kubernetesInformer) {
    ApiClient apiClient = this.beanFactory.getBean(ApiClient.class);

    if (apiClient.getHttpClient().readTimeoutMillis() > 0) {
      log.warn(
          "Enforcing read-timeout of the ApiClient {} to {} so that the watch connection won't abort from client-side",
          apiClient,
          informerProperties.getClientReadTimeout());
      apiClient.setHttpClient(
          apiClient
              .getHttpClient()
              .newBuilder()
              .readTimeout(informerProperties.getClientReadTimeout())
              .build());
    }

    SharedInformerFactory sharedInformerFactory =
        this.beanFactory.getBean(SharedInformerFactory.class);
    final GenericKubernetesApi api =
        new GenericKubernetesApi(
            kubernetesInformer.apiTypeClass(),
            kubernetesInformer.apiListTypeClass(),
            kubernetesInformer.groupVersionResource().apiGroup(),
            kubernetesInformer.groupVersionResource().apiVersion(),
            kubernetesInformer.groupVersionResource().resourcePlural(),
            apiClient);
    SharedIndexInformer<T> sharedIndexInformer =
        sharedInformerFactory.sharedIndexInformerFor(
            api, type, kubernetesInformer.resyncPeriodMillis(), kubernetesInformer.namespace());
    return sharedIndexInformer;
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory = (ConfigurableListableBeanFactory) beanFactory;
  }
}
