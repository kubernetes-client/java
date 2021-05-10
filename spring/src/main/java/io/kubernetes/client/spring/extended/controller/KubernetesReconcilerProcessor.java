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

import static org.springframework.util.Assert.notNull;

import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.spring.extended.controller.factory.KubernetesControllerFactory;
import java.util.function.Supplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

/**
 * Scans and processes {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler}.
 *
 * <p>It will create a {@link io.kubernetes.client.extended.controller.Controller} for every
 * reconciler instances registered in the spring bean-factory.
 *
 * @deprecated instead of declaring via the annotation create the controller manually as a {@link
 *     org.springframework.context.annotation.Bean @Bean}
 */
@Deprecated
public class KubernetesReconcilerProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {

  public static final String DEFAULT_SHARED_INFORMER_FACTORY_BEAN_NAME = "sharedInformerFactory";

  private final String sharedInformerFactoryBeanName;

  private BeanDefinitionRegistry beanDefinitionRegistry;

  public KubernetesReconcilerProcessor() {
    this(DEFAULT_SHARED_INFORMER_FACTORY_BEAN_NAME);
  }

  public KubernetesReconcilerProcessor(String sharedInformerFactoryBeanName) {
    notNull(sharedInformerFactoryBeanName, "SharedInformerFactory bean name is required");
    this.sharedInformerFactoryBeanName = sharedInformerFactoryBeanName;
  }

  @Override
  public int getOrder() {
    return KubernetesInformerFactoryProcessor.ORDER + 1;
  }

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) {
    this.beanDefinitionRegistry = registry;
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
    for (String reconcilerName : beanFactory.getBeanNamesForType(Reconciler.class)) {

      Supplier<KubernetesControllerFactory> kubernetesControllerFactorySupplier =
          () ->
              new KubernetesControllerFactory(
                  beanFactory.getBean(sharedInformerFactoryBeanName, SharedInformerFactory.class),
                  beanFactory.getBean(reconcilerName, Reconciler.class));

      BeanDefinition controllerFactoryBeanDefinition =
          BeanDefinitionBuilder.genericBeanDefinition(
                  KubernetesControllerFactory.class, kubernetesControllerFactorySupplier)
              .getBeanDefinition();

      beanDefinitionRegistry.registerBeanDefinition(
          reconcilerName + "Controller", controllerFactoryBeanDefinition);
    }
  }
}
