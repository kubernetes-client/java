package io.kubernetes.client.spring.extended.controller.config.aot;


import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import io.kubernetes.client.informer.cache.ProcessorListener;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.swagger.annotations.ApiModel;
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

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Registers hints to support Spring Framework 6 and Spring Boot 3 AOT
 */
public class KubernetesBeanFactoryInitializationAotProcessor implements BeanFactoryInitializationAotProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(KubernetesBeanFactoryInitializationAotProcessor.class);

    private final MemberCategory[] allMemberCategories = MemberCategory.values();

    @Override
    public BeanFactoryInitializationAotContribution processAheadOfTime(
            @NotNull ConfigurableListableBeanFactory beanFactory) {
        return (generationContext, beanFactoryInitializationCode) -> {
            RuntimeHints hints = generationContext.getRuntimeHints();
            Class<?>[] classes = new Class<?>[]{JsonElement.class, ProcessorListener.class,
                    io.kubernetes.client.extended.controller.Controller.class,
                    GenericKubernetesApi.StatusPatch.class, Watch.Response.class
            };
            for (Class<?> clazz : classes) {
                logClassReflectionRegistration(clazz);
                hints.reflection().registerType(TypeReference.of(clazz), allMemberCategories);
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
        Set<Class<?>> jsonAdapters = findJsonAdapters(reflections);
        Set<Class<?>> all = new HashSet<>();
        all.addAll(jsonAdapters);
        all.addAll(apiModels);
        for (Class<?> clazz : all) {
            logClassReflectionRegistration(clazz);
            hints.reflection().registerType(clazz, allMemberCategories);
        }
    }

    private static void logClassReflectionRegistration(Class<?> clazz) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("registering " + clazz.getName() + " for Spring AOT reflection");
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