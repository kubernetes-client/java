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
package io.kubernetes.client.spring.extended.manifests;

import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ReflectionUtils;

public class KubernetesFromConfigMapProcessor
    implements InstantiationAwareBeanPostProcessor, BeanPostProcessor, ApplicationContextAware {

  private static final Logger log = LoggerFactory.getLogger(KubernetesFromConfigMapProcessor.class);

  private ApplicationContext applicationContext;

  private final ScheduledExecutorService configMapKeyRefresher =
      Executors.newSingleThreadScheduledExecutor();

  @Autowired private KubernetesManifestsProperties manifestsProperties;

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

    for (Field field : bean.getClass().getDeclaredFields()) {
      // skip if the field if the FromYaml annotation is missing
      FromConfigMap fromConfigMapAnnotation = field.getAnnotation(FromConfigMap.class);
      if (fromConfigMapAnnotation == null) {
        continue;
      }
      // injecting
      ReflectionUtils.makeAccessible(field);
      try {
        if (field.get(bean) != null) {
          continue; // field already set, skip processing
        }
      } catch (IllegalAccessException e) {
        log.warn("Failed inject resource for @FromConfigMap annotated field {}", field, e);
        continue;
      }

      if (!Map.class.isAssignableFrom(field.getType())) {
        log.warn(
            "Failed inject resource for @FromConfigMap annotated field {}, the declaring type should be Map<String, String>",
            field);
        continue;
      }

      ConfigMapGetter configMapGetter =
          getOrCreateConfigMapGetter(fromConfigMapAnnotation, applicationContext);

      ConfigMapData configMapDataCache = new ConfigMapData();
      fullyRefreshCache(configMapGetter, fromConfigMapAnnotation, configMapDataCache);
      configMapKeyRefresher.scheduleAtFixedRate(
          () -> {
            fullyRefreshCache(configMapGetter, fromConfigMapAnnotation, configMapDataCache);
          },
          manifestsProperties.getRefreshInterval().getSeconds(),
          manifestsProperties.getRefreshInterval().getSeconds(),
          TimeUnit.SECONDS);
      ReflectionUtils.setField(field, bean, Collections.unmodifiableMap(configMapDataCache));
    }

    return bean;
  }

  private static void fullyRefreshCache(
      ConfigMapGetter configMapGetter,
      FromConfigMap fromConfigMapAnnotation,
      ConfigMapData configMapDataCache) {
    V1ConfigMap configMap =
        configMapGetter.get(fromConfigMapAnnotation.namespace(), fromConfigMapAnnotation.name());
    configMapDataCache.snapshot =
        configMap == null || configMap.getData() == null
            ? Map.of()
            : Map.copyOf(configMap.getData());
  }

  private static final class ConfigMapData extends AbstractMap<String, String> {
    private volatile Map<String, String> snapshot = Map.of();

    @Override
    public String get(Object key) {
      return snapshot.get(key);
    }

    @Override
    public String getOrDefault(Object key, String defaultValue) {
      return snapshot.getOrDefault(key, defaultValue);
    }

    @Override
    public boolean containsKey(Object key) {
      return snapshot.containsKey(key);
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
      // Keep the unmodifiable wrapper's cached views live; each iterator captures a snapshot.
      return new AbstractSet<>() {
        @Override
        public Iterator<Entry<String, String>> iterator() {
          return snapshot.entrySet().iterator();
        }

        @Override
        public int size() {
          return snapshot.size();
        }
      };
    }
  }

  private ConfigMapGetter getOrCreateConfigMapGetter(
      FromConfigMap fromConfigMapAnnotation, ApplicationContext applicationContext) {
    ConfigMapGetter configMapGetter;
    try {
      configMapGetter =
          applicationContext
              .getAutowireCapableBeanFactory()
              .getBean(fromConfigMapAnnotation.configMapGetter());
    } catch (NoSuchBeanDefinitionException ne) {
      try {
        configMapGetter = fromConfigMapAnnotation.configMapGetter().newInstance();
      } catch (IllegalAccessException | InstantiationException e) {
        throw new BeanCreationException("failed creating configmap getter instance", e);
      }
      applicationContext.getAutowireCapableBeanFactory().autowireBean(configMapGetter);
      applicationContext
          .getAutowireCapableBeanFactory()
          .initializeBean(
              configMapGetter,
              "configmap-getter-" + fromConfigMapAnnotation.configMapGetter().getSimpleName());
    }
    return configMapGetter;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
