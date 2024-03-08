/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.spring.aot;

import com.google.gson.annotations.JsonAdapter;
import io.kubernetes.client.extended.controller.Controller;
import io.swagger.annotations.ApiModel;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.TypeReference;
import org.springframework.beans.factory.aot.BeanFactoryInitializationAotContribution;
import org.springframework.beans.factory.aot.BeanFactoryInitializationAotProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;

/**
 * GraalVM native images need to know about when you might reflectively work with types at runtime.
 * The Kubernetes Java client works with several types reflectively at runtime. This code uses the
 * third-party Reflections library to reflect upon all the code in your Spring Boot application or
 * in the official Kubernetes Java client that has {@link ApiModel}, {@link JsonAdapter}, and
 * registers them. It also registers a few other specific handful of classes that should be
 * accounted for, in specific cases.
 *
 * @author Josh Long
 */
@SuppressWarnings("unused")
public class KubernetesBeanFactoryInitializationAotProcessor
    implements BeanFactoryInitializationAotProcessor {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(KubernetesBeanFactoryInitializationAotProcessor.class);

  private final MemberCategory[] allMemberCategories = MemberCategory.values();

  @Override
  public BeanFactoryInitializationAotContribution processAheadOfTime(
      @NotNull ConfigurableListableBeanFactory beanFactory) {
    return (generationContext, beanFactoryInitializationCode) -> {
      RuntimeHints hints = generationContext.getRuntimeHints();
      String[] classNames =
          new String[] {
            "com.google.gson.JsonElement", //
            "io.kubernetes.client.informer.cache.ProcessorListener", //
            "io.kubernetes.client.extended.controller.Controller", //
            "io.kubernetes.client.util.generic.GenericKubernetesApi$StatusPatch", //
            "io.kubernetes.client.util.Watch$Response" //
          };
      for (String className : classNames) {
        LOGGER.info("registering {} for reflection", className);
        hints.reflection().registerType(TypeReference.of(className), allMemberCategories);
      }
      registerForPackage("io.kubernetes", hints);
      Collection<String> packages = AutoConfigurationPackages.get(beanFactory);
      for (String packageName : packages) {
        registerForPackage(packageName, hints);
      }
    };
  }

  private void registerForPackage(String packageName, RuntimeHints hints) {
    Reflections reflections = new Reflections(packageName);
    Set<Class<?>> apiModels = reflections.getTypesAnnotatedWith(ApiModel.class);
    Set<Class<? extends Controller>> controllers = reflections.getSubTypesOf(Controller.class);
    Set<Class<?>> jsonAdapters = findJsonAdapters(reflections);
    Set<Class<?>> all = new HashSet<>();
    all.addAll(jsonAdapters);
    all.addAll(controllers);
    all.addAll(apiModels);
    for (Class<?> clazz : all) {
      LOGGER.info("registering {} for reflection", clazz.getName());
      hints.reflection().registerType(clazz, allMemberCategories);
    }
  }

  private <R extends Annotation> Set<Class<?>> findJsonAdapters(Reflections reflections) {
    Class<JsonAdapter> jsonAdapterClass = JsonAdapter.class;
    Set<Class<?>> classes = new HashSet<>();
    for (Class<?> clazz : reflections.getTypesAnnotatedWith(jsonAdapterClass)) {
      JsonAdapter annotation = clazz.getAnnotation(jsonAdapterClass);
      if (null != annotation) {
        classes.add(annotation.value());
      }
      classes.add(clazz);
    }
    return classes;
  }
}
