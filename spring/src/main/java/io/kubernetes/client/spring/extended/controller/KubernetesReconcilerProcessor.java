package io.kubernetes.client.spring.extended.controller;

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.spring.extended.controller.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
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

  @Override
  public int getOrder() {
    return KubernetesInformerFactoryProcessor.ORDER + 1;
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
      throws BeansException {
    SharedInformerFactory sharedInformerFactory = beanFactory.getBean(SharedInformerFactory.class);
    String[] names = beanFactory.getBeanNamesForType(Reconciler.class);
    for (String name : names) {
      Reconciler reconciler = (Reconciler) beanFactory.getBean(name);
      KubernetesReconciler kubernetesReconciler =
          reconciler.getClass().getAnnotation(KubernetesReconciler.class);
      String reconcilerName = kubernetesReconciler.value();
      Controller controller = buildController(sharedInformerFactory, reconciler);
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
    for (KubernetesReconcilerWatch watch : watches.value()) {
      try {
        Predicate addFilter = null;
        BiPredicate updateFilter = null;
        BiPredicate deleteFilter = null;
        final List<Supplier<Boolean>> readyFuncs = new ArrayList<>();
        Function<?, Request> workQueueKeyFunc = watch.workQueueKeyFunc().newInstance();
        for (Method method : r.getClass().getMethods()) {
          if (method.isAnnotationPresent(AddWatchEventFilter.class)) {
            addFilter = new AddFilterAdaptor(r, method);
          }
          if (method.isAnnotationPresent(UpdateWatchEventFilter.class)) {
            updateFilter = new UpdateFilterAdaptor(r, method);
          }
          if (method.isAnnotationPresent(DeleteWatchEventFilter.class)) {
            deleteFilter = new DeleteFilterAdaptor(r, method);
          }
          if (method.isAnnotationPresent(KubernetesReconcilerReadyFunc.class)) {
            readyFuncs.add(new ReadyFuncAdaptor(r, method));
          }
        }

        final Predicate finalAddFilter = addFilter;
        final BiPredicate finalUpdateFilter = updateFilter;
        final BiPredicate finalDeleteFilter = deleteFilter;
        builder =
            builder.watch(
                (workQueue) -> {
                  return ControllerBuilder.controllerWatchBuilder(watch.apiTypeClass(), workQueue)
                      .withOnAddFilter(finalAddFilter)
                      .withOnUpdateFilter(finalUpdateFilter)
                      .withOnDeleteFilter(finalDeleteFilter)
                      .withWorkQueueKeyFunc(workQueueKeyFunc)
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

    if (r.getClass().isAnnotationPresent(KubernetesReconcilerWorkerCount.class)) {
      KubernetesReconcilerWorkerCount workerCount =
          r.getClass().getAnnotation(KubernetesReconcilerWorkerCount.class);
      builder = builder.withWorkerCount(workerCount.value());
    }

    RateLimitingQueue<Request> workQueue = new DefaultRateLimitingQueue<>();
    return builder.withReconciler(r).withName(reconcilerName).withWorkQueue(workQueue).build();
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
