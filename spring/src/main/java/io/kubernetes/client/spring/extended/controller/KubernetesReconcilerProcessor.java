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
import io.kubernetes.client.spring.extended.controller.factory.KubernetesControllerFactory;

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
      
      KubernetesControllerFactory controllerFactory = new KubernetesControllerFactory(sharedInformerFactory, reconciler);
      
      Controller controller = controllerFactory.getObject();
      beanFactory.registerSingleton(reconcilerName, controller);
    }
  }
}
