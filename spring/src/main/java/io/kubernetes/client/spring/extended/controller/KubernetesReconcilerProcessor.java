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
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatch;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatches;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWorkerCount;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
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
        Predicate addFilter = watch.addFilter().newInstance();
        BiPredicate updateFilter = watch.updateFilter().newInstance();
        BiPredicate deleteFilter = watch.deleteFilter().newInstance();
        Function<?, Request> workQueueKeyFunc = watch.workQueueKeyFunc().newInstance();

        builder =
            builder.watch(
                (workQueue) -> {
                  return ControllerBuilder.controllerWatchBuilder(watch.apiTypeClass(), workQueue)
                      .withOnAddFilter(addFilter)
                      .withOnUpdateFilter(updateFilter)
                      .withOnDeleteFilter(deleteFilter)
                      .withWorkQueueKeyFunc(workQueueKeyFunc)
                      .build();
                });
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
}
