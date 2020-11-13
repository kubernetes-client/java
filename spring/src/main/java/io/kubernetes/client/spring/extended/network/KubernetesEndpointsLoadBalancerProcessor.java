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
package io.kubernetes.client.spring.extended.network;

import io.kubernetes.client.extended.network.EndpointsLoadBalancer;
import io.kubernetes.client.extended.network.LoadBalanceStrategy;
import io.kubernetes.client.spring.extended.network.annotation.KubernetesEndpointsLoadBalanced;
import io.kubernetes.client.spring.extended.network.endpoints.EndpointsGetter;
import java.lang.reflect.Field;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ReflectionUtils;

public class KubernetesEndpointsLoadBalancerProcessor
    implements InstantiationAwareBeanPostProcessor, ApplicationContextAware {

  private ApplicationContext applicationContext;

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    Class beanClass = bean.getClass();
    for (Field field : beanClass.getDeclaredFields()) {
      if (!field.isAnnotationPresent(KubernetesEndpointsLoadBalanced.class)) {
        continue;
      }

      KubernetesEndpointsLoadBalanced loadBalanced =
          field.getAnnotation(KubernetesEndpointsLoadBalanced.class);

      EndpointsGetter epGetter;
      try {
        epGetter =
            applicationContext
                .getAutowireCapableBeanFactory()
                .getBean(loadBalanced.endpointsGetter());
      } catch (NoSuchBeanDefinitionException ne) {
        try {
          epGetter = loadBalanced.endpointsGetter().newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
          throw new BeanCreationException("failed creating endpoint getter instance", e);
        }
        applicationContext.getAutowireCapableBeanFactory().autowireBean(epGetter);
        applicationContext
            .getAutowireCapableBeanFactory()
            .initializeBean(
                epGetter, "endpoints-getter-" + loadBalanced.endpointsGetter().getSimpleName());
      }

      LoadBalanceStrategy strategy;
      try {
        strategy = loadBalanced.strategy().newInstance();
      } catch (IllegalAccessException | InstantiationException e) {
        throw new BeanCreationException(
            "failed creating endpoint load-balance strategy instance", e);
      }

      EndpointsGetter finalEpGetter = epGetter;
      EndpointsLoadBalancer loadBalancer =
          new EndpointsLoadBalancer(
              () -> {
                return finalEpGetter.get(loadBalanced.namespace(), loadBalanced.name());
              },
              strategy);
      ReflectionUtils.makeAccessible(field);
      ReflectionUtils.setField(field, bean, loadBalancer);
    }
    return bean;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
