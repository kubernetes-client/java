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

import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
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

      LoadingCache<String, String> configMapDataCache =
          Caffeine.newBuilder()
              .expireAfterWrite(manifestsProperties.getRefreshInterval())
              .build(
                  new ConfigMapGetterCacheLoader(
                      () -> {
                        return configMapGetter.get(
                            fromConfigMapAnnotation.namespace(), fromConfigMapAnnotation.name());
                      }));
      fullyRefreshCache(configMapGetter, fromConfigMapAnnotation, configMapDataCache);
      configMapKeyRefresher.scheduleAtFixedRate(
          () -> {
            fullyRefreshCache(configMapGetter, fromConfigMapAnnotation, configMapDataCache);
          },
          manifestsProperties.getRefreshInterval().getSeconds(),
          manifestsProperties.getRefreshInterval().getSeconds(),
          TimeUnit.SECONDS);
      ReflectionUtils.setField(field, bean, configMapDataCache.asMap());
    }

    return bean;
  }

  private static void fullyRefreshCache(
      ConfigMapGetter configMapGetter,
      FromConfigMap fromConfigMapAnnotation,
      LoadingCache<String, String> configMapDataCache) {
    V1ConfigMap configMap =
        configMapGetter.get(fromConfigMapAnnotation.namespace(), fromConfigMapAnnotation.name());
    if (configMap == null || configMap.getData() == null) {
      return;
    }
    // TODO: make the cache data refreshment atomic
    configMap.getData().keySet().stream().forEach(key -> configMapDataCache.refresh(key));
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

  static class ConfigMapGetterCacheLoader implements CacheLoader<String, String> {

    ConfigMapGetterCacheLoader(Supplier<V1ConfigMap> configMapSupplier) {
      this.configMapSupplier = configMapSupplier;
    }

    private final Supplier<V1ConfigMap> configMapSupplier;

    @Override
    public @Nullable String load(@NonNull String key) throws Exception {
      V1ConfigMap configMap = this.configMapSupplier.get();
      if (configMap == null || configMap.getData() == null) {
        return null;
      }
      return configMap.getData().get(key);
    }
  }
}
