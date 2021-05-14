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
package io.kubernetes.client.spring.extended.controller.factory;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.spring.extended.controller.annotation.AddWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.DeleteWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerReadyFunc;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatch;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatches;
import io.kubernetes.client.spring.extended.controller.annotation.UpdateWatchEventFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.FactoryBean;

/**
 * Scans and processes {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler}.
 *
 * <p>It will create a {@link io.kubernetes.client.extended.controller.Controller} for every
 * reconciler instances registered in the spring bean-factory.
 *
 * @deprecated create a {@link org.springframework.context.annotation.Bean @Bean} using {@link
 *     ControllerBuilder} instead
 */
@Deprecated
public class KubernetesControllerFactory implements FactoryBean<Controller> {

  private static final Logger log = LoggerFactory.getLogger(KubernetesControllerFactory.class);

  private SharedInformerFactory sharedInformerFactory;

  private Reconciler reconciler;

  public KubernetesControllerFactory(
      SharedInformerFactory sharedInformerFactory, Reconciler reconciler) {
    this.sharedInformerFactory = sharedInformerFactory;
    this.reconciler = reconciler;
  }

  @Override
  public Controller getObject() throws BeansException {
    return buildController(this.sharedInformerFactory, reconciler);
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
        if (annotation == null) {
          continue;
        }
        if (watch.apiTypeClass().equals(annotation.apiTypeClass())) {
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
        if (annotation == null) {
          continue;
        }
        if (watch.apiTypeClass().equals(annotation.apiTypeClass())) {
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
        if (annotation == null) {
          continue;
        }
        if (watch.apiTypeClass().equals(annotation.apiTypeClass())) {
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

  private static boolean invokePredicate(
      String name, Object target, Method method, Object... args) {
    try {
      return (boolean) method.invoke(target, args);
    } catch (IllegalAccessException e) {
      log.error("ignoring invalid {} method signature {} ", name, method, e);
      return true;
    } catch (InvocationTargetException e) {
      log.error("{} {} failed", name, method, e);
      return false;
    }
  }

  private static class AddFilterAdaptor implements Predicate {
    private final Method method;
    private final Object target;

    private AddFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object addedObj) {
      return invokePredicate("ADD-EventFilter", target, method, addedObj);
    }
  }

  private static class UpdateFilterAdaptor implements BiPredicate {
    private final Method method;
    private final Object target;

    private UpdateFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object oldObj, Object newObj) {
      return invokePredicate("UPDATE-EventFilter", target, method, oldObj, newObj);
    }
  }

  private static class DeleteFilterAdaptor implements BiPredicate {
    private final Method method;
    private final Object target;

    private DeleteFilterAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public boolean test(Object deleteObj, Object cacheStatusUnknown) {
      return invokePredicate("DELETE-EventFilter", target, method, deleteObj, cacheStatusUnknown);
    }
  }

  private static class ReadyFuncAdaptor implements Supplier<Boolean> {
    private final Method method;
    private final Object target;

    private ReadyFuncAdaptor(Object target, Method method) {
      this.method = method;
      this.target = target;
    }

    @Override
    public Boolean get() {
      return invokePredicate("READY-Func", target, method);
    }
  }

  @Override
  public Class<?> getObjectType() {
    return Controller.class;
  }
}
