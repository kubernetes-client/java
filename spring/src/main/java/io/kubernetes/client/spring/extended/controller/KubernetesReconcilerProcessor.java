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

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import io.kubernetes.client.spring.extended.controller.factory.KubernetesControllerFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * Scans and processes {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler}.
 *
 * <p>It will create a {@link io.kubernetes.client.extended.controller.Controller} for every
 * reconciler instances registered in the spring bean-factory.
 */
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
    String[] names = beanFactory.getBeanNamesForType(Reconciler.class);
    for (String name : names) {
      Reconciler reconciler = (Reconciler) beanFactory.getBean(name);
      KubernetesReconciler kubernetesReconciler =
          reconciler.getClass().getAnnotation(KubernetesReconciler.class);
      String reconcilerName = kubernetesReconciler.value();

      KubernetesControllerFactory controllerFactory =
          new KubernetesControllerFactory(sharedInformerFactory, reconciler);

      Controller controller = controllerFactory.getObject();
      beanFactory.registerSingleton(reconcilerName, controller);
    }
  }
}
