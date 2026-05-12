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
package io.kubernetes.client.spring.extended.manifests;

import io.kubernetes.client.spring.extended.manifests.annotation.FromYaml;
import io.kubernetes.client.util.Yaml;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.util.ReflectionUtils;
import org.yaml.snakeyaml.error.YAMLException;

public class KubernetesFromYamlProcessor
    implements InstantiationAwareBeanPostProcessor, BeanPostProcessor, BeanFactoryAware {

  private static final Logger log = LoggerFactory.getLogger(KubernetesFromYamlProcessor.class);

  private ListableBeanFactory beanFactory;

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

    FromYaml fromYamlAnnotation;
    try {
      fromYamlAnnotation = beanFactory.findAnnotationOnBean(beanName, FromYaml.class);
      if (fromYamlAnnotation != null) {
        Object loadedObj = loadFromYaml(fromYamlAnnotation.filePath());
        if (!bean.getClass().isAssignableFrom(loadedObj.getClass())) {
          log.warn(
              "Incompatible types for @FromYaml, {} cannot apply to {}",
              fromYamlAnnotation.filePath(),
              bean.getClass());
          return bean;
        }
        return loadedObj;
      }
    } catch (NoSuchBeanDefinitionException e) {
      return bean;
    }

    for (Field field : bean.getClass().getDeclaredFields()) {
      // skip if the field if the FromYaml annotation is missing
      fromYamlAnnotation = field.getAnnotation(FromYaml.class);
      if (fromYamlAnnotation == null) {
        continue; // skip if the field doesn't have the annotation
      }
      // injecting
      ReflectionUtils.makeAccessible(field);
      try {
        if (field.get(bean) != null) {
          continue; // field already set, skip processing
        }
      } catch (IllegalAccessException e) {
        log.warn("Failed inject resource for @FromYaml annotated field {}", field, e);
        continue;
      }

      Object loadedObj = loadFromYaml(fromYamlAnnotation.filePath());
      ReflectionUtils.setField(field, bean, loadedObj);
    }
    return bean;
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    this.beanFactory = (ListableBeanFactory) beanFactory;
  }

  private Object loadFromYaml(String targetFilePath) {
    // First check if the file exists on the local filesystem (absolute or relative path).
    if (Files.exists(Paths.get(targetFilePath))) {
      try {
        String yamlContent = new String(Files.readAllBytes(Paths.get(targetFilePath)), StandardCharsets.UTF_8);
        return Yaml.load(yamlContent);
      } catch (IOException e) {
        log.error("Failed reading resource for @FromYaml annotated from {}", targetFilePath, e);
        throw new BeanCreationException("Failed reading Yaml resource from file", e);
      }
    }

    // Fall back to classpath resource (works both on plain files and inside JARs).
    try (InputStream is = getClass().getClassLoader().getResourceAsStream(targetFilePath)) {
      if (is == null) {
        throw new BeanCreationException(
            "No such file " + targetFilePath + " either on the machine or classpaths");
      }
      String yamlContent = new String(is.readAllBytes(), StandardCharsets.UTF_8);
      return Yaml.load(yamlContent);
    } catch (IOException e) {
      log.error("Failed reading resource for @FromYaml annotated from {}", targetFilePath, e);
      throw new BeanCreationException("Failed reading Yaml resource from file", e);
    } catch (YAMLException e) {
      log.error("Failed parsing yaml file {}", targetFilePath, e);
      throw new BeanCreationException("Failed parsing Yaml", e);
    }
  }
}
