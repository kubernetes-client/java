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
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.spring.extended.controller.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Scans and processes {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler}.
 *
 * <p>It will create a {@link io.kubernetes.client.extended.controller.Controller} for every
 * reconciler instances registered in the spring bean-factory.
 */
@Component
public class KubernetesReconcilerProcessor implements BeanFactoryPostProcessor, Ordered {

  private static final Logger log = LoggerFactory.getLogger(KubernetesReconcilerProcessor.class);

  private ControllerManager controllerManager;

  private ExecutorService controllerManagerDaemon = Executors.newSingleThreadExecutor();

  private SharedInformerFactory sharedInformerFactory;

  public KubernetesReconcilerProcessor(SharedInformerFactory sharedInformerFactory) {
    this.sharedInformerFactory = sharedInformerFactory;
  }

  @Override
  public int getOrder() {
    return KubernetesInformerFactoryProcessor.ORDER + 1;
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    if (this.sharedInformerFactory == null) {
      this.sharedInformerFactory = beanFactory.getBean(SharedInformerFactory.class);
    }
    String[] names = beanFactory.getBeanNamesForType(Reconciler.class);
    for (String name : names) {
      Reconciler reconciler = (Reconciler) beanFactory.getBean(name);
      KubernetesReconciler kubernetesReconciler =
          reconciler.getClass().getAnnotation(KubernetesReconciler.class);
      String reconcilerName = kubernetesReconciler.value();
      Controller controller = buildController(this.sharedInformerFactory, reconciler);
      beanFactory.registerSingleton(reconcilerName, controller);
    }
  }

  private Controller buildController(SharedInformerFactory sharedInformerFactory, Reconciler r)
      throws BeansException {
    KubernetesReconciler kubernetesReconciler =
        r.getClass().getAnnotation(KubernetesReconciler.class);
    String reconcilerName = kubernetesReconciler.value();

    KubernetesReconcilerWatches watches = kubernetesReconciler.watches();
    DefaultControllerBuilder builder = ControllerBuilder.defaultBuilder(sharedInformerFactory);
    RateLimitingQueue<Request> workQueue = new DefaultRateLimitingQueue<>();
    builder = builder.withWorkQueue(workQueue);
    Map<Class, AddFilterAdaptor> addFilters = getAddFilters(watches, r);
    Map<Class, UpdateFilterAdaptor> updateFilters = getUpdateFilters(watches, r);
    Map<Class, DeleteFilterAdaptor> deleteFilters = getDeleteFilters(watches, r);
    List<ReadyFuncAdaptor> readyFuncs = getReadyFuncs(r);
    for (KubernetesReconcilerWatch watch : watches.value()) {
      try {

        Function<? extends KubernetesObject, Request> workQueueKeyFunc;
        try {
          workQueueKeyFunc =
              watch.workQueueKeyFunc().getConstructor(WorkQueue.class).newInstance(workQueue);
        } catch (NoSuchMethodException e) {
          workQueueKeyFunc = watch.workQueueKeyFunc().newInstance();
        } catch (InvocationTargetException e) {
          throw new BeanCreationException(
              "Failed instantiating controller watch: " + e.getMessage());
        }

        final Function<? extends KubernetesObject, Request> finalWorkQueueKeyFunc =
            workQueueKeyFunc;
        builder =
            builder.watch(
                (q) -> {
                  return ControllerBuilder.controllerWatchBuilder(watch.apiTypeClass(), q)
                      .withOnAddFilter(addFilters.get(watch.apiTypeClass()))
                      .withOnUpdateFilter(updateFilters.get(watch.apiTypeClass()))
                      .withOnDeleteFilter(deleteFilters.get(watch.apiTypeClass()))
                      .withWorkQueueKeyFunc(finalWorkQueueKeyFunc)
                      .withResyncPeriod(Duration.ofMillis(watch.resyncPeriodMillis()))
                      .build();
                });
        for (Supplier<Boolean> readyFunc : readyFuncs) {
          builder = builder.withReadyFunc(readyFunc);
        }
      } catch (IllegalAccessException | InstantiationException e) {
        throw new BeanCreationException("Failed instantiating controller: " + e.getMessage());
      }
    }

    builder = builder.withWorkerCount(kubernetesReconciler.workerCount());

    return builder.withReconciler(r).withName(reconcilerName).build();
  }

  private Map<Class, AddFilterAdaptor> getAddFilters(
      KubernetesReconcilerWatches watches, Reconciler reconciler) {
    Map<Class, AddFilterAdaptor> filters = new HashMap<>();
    Set<Method> allAnnotatedMethods = new HashSet<>();
    Set<Method> adoptedMethods = new HashSet<>();
    for (KubernetesReconcilerWatch watch : watches.value()) {
      for (Method method : reconciler.getClass().getMethods()) {
        AddWatchEventFilter annotation = method.getAnnotation(AddWatchEventFilter.class);
        if (annotation != null && watch.apiTypeClass().equals(annotation.apiTypeClass())) {
          if (filters.containsKey(watch.apiTypeClass())) {
            log.warn(
                "Duplicated watch ADD event filter upon apiType {}", annotation.apiTypeClass());
          }
          filters.put(watch.apiTypeClass(), new AddFilterAdaptor(reconciler, method));
          adoptedMethods.add(method);
        }
        allAnnotatedMethods.add(method);
      }
    }
    allAnnotatedMethods.removeAll(adoptedMethods);
    if (allAnnotatedMethods.size() > 0) {
      log.warn("Dangling watch ADD event filters {}", StringUtils.join(allAnnotatedMethods, ","));
    }
    return filters;
  }

  private Map<Class, UpdateFilterAdaptor> getUpdateFilters(
      KubernetesReconcilerWatches watches, Reconciler reconciler) {
    Map<Class, UpdateFilterAdaptor> filters = new HashMap<>();
    Set<Method> allAnnotatedMethods = new HashSet<>();
    Set<Method> adoptedMethods = new HashSet<>();
    for (KubernetesReconcilerWatch watch : watches.value()) {
      for (Method method : reconciler.getClass().getMethods()) {
        UpdateWatchEventFilter annotation = method.getAnnotation(UpdateWatchEventFilter.class);
        if (annotation != null && watch.apiTypeClass().equals(annotation.apiTypeClass())) {
          if (filters.containsKey(watch.apiTypeClass())) {
            log.warn(
                "Duplicated watch UPDATE event filter upon apiType {}", annotation.apiTypeClass());
          }
          filters.put(watch.apiTypeClass(), new UpdateFilterAdaptor(reconciler, method));
          adoptedMethods.add(method);
        }
        allAnnotatedMethods.add(method);
      }
    }
    allAnnotatedMethods.removeAll(adoptedMethods);
    if (allAnnotatedMethods.size() > 0) {
      log.warn(
          "Dangling watch UPDATE event filters {}", StringUtils.join(allAnnotatedMethods, ","));
    }
    return filters;
  }

  private Map<Class, DeleteFilterAdaptor> getDeleteFilters(
      KubernetesReconcilerWatches watches, Reconciler reconciler) {
    Map<Class, DeleteFilterAdaptor> filters = new HashMap<>();
    Set<Method> allAnnotatedMethods = new HashSet<>();
    Set<Method> adoptedMethods = new HashSet<>();
    for (KubernetesReconcilerWatch watch : watches.value()) {
      for (Method method : reconciler.getClass().getMethods()) {
        DeleteWatchEventFilter annotation = method.getAnnotation(DeleteWatchEventFilter.class);
        if (annotation != null && watch.apiTypeClass().equals(annotation.apiTypeClass())) {
          if (filters.containsKey(watch.apiTypeClass())) {
            log.warn(
                "Duplicated watch DELETE event filter upon apiType {}", annotation.apiTypeClass());
          }
          filters.put(watch.apiTypeClass(), new DeleteFilterAdaptor(reconciler, method));
          adoptedMethods.add(method);
        }
        allAnnotatedMethods.add(method);
      }
    }
    allAnnotatedMethods.removeAll(adoptedMethods);
    if (allAnnotatedMethods.size() > 0) {
      log.warn(
          "Dangling watch DELETE event filters {}", StringUtils.join(allAnnotatedMethods, ","));
    }
    return filters;
  }

  private List<ReadyFuncAdaptor> getReadyFuncs(Reconciler reconciler) {
    List<ReadyFuncAdaptor> readyFuncs = new ArrayList<>();
    for (Method method : reconciler.getClass().getMethods()) {
      if (method.isAnnotationPresent(KubernetesReconcilerReadyFunc.class)) {
        readyFuncs.add(new ReadyFuncAdaptor(reconciler, method));
      }
    }
    return readyFuncs;
  }

  private static class AddFilterAdaptor implements Predicate {
    private Method method;
    private Object target;

    private AddFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object addedObj) {
      try {
        return (boolean) method.invoke(target, addedObj);
      } catch (IllegalAccessException | InvocationTargetException e) {
        log.error("invalid EventAddFilter method signature", e);
        return true;
      }
    }
  }

  private static class UpdateFilterAdaptor implements BiPredicate {
    private Method method;
    private Object target;

    private UpdateFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object oldObj, Object newObj) {
      try {
        return (boolean) method.invoke(target, oldObj, newObj);
      } catch (IllegalAccessException | InvocationTargetException e) {
        log.error("invalid EventUpdateFilter method signature", e);
        return true;
      }
    }
  }

  private static class DeleteFilterAdaptor implements BiPredicate {
    private Method method;
    private Object target;

    private DeleteFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object deleteObj, Object cacheStatusUnknown) {
      try {
        return (boolean) method.invoke(target, deleteObj, cacheStatusUnknown);
      } catch (IllegalAccessException | InvocationTargetException e) {
        log.error("invalid EventDeleteFilter method signature", e);
        return true;
      }
    }
  }

  private static class ReadyFuncAdaptor implements Supplier<Boolean> {
    private Method method;
    private Object target;

    private ReadyFuncAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public Boolean get() {
      try {
        return (boolean) method.invoke(target);
      } catch (IllegalAccessException | InvocationTargetException e) {
        log.error("invalid ReadyFunc method signature", e);
        return false;
      }
    }
  }
}
