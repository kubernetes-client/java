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
package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.openapi.models.V1Namespace;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Function;

/**
 * The interface Kubernetes reconciler watch.
 *
 * @deprecated register the watcher via the {@link
 *     io.kubernetes.client.extended.controller.builder.ControllerBuilder} API
 */
@Deprecated
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerWatch {

  /**
   * Kubernetes Api type class class. e.g.
   *
   * @return the class
   */
  Class<? extends KubernetesObject> apiTypeClass() default V1Namespace.class;

  /**
   * Work queue key func class maps the source resource of the watch event to a standard reconciler
   * request.
   *
   * <p>Optionally you can declare the constructor of the class to receive a {@link
   * io.kubernetes.client.extended.workqueue.WorkQueue} in the parameter in order to customize the
   * work-queue key-func.
   *
   * @return the class
   */
  Class<? extends Function<? extends KubernetesObject, Request>> workQueueKeyFunc() default
      DefaultReflectiveKeyFunc.class;

  /**
   * Resync period in milliseconds .
   *
   * @return the long
   */
  long resyncPeriodMillis() default 0;

  /** The type Default reflective key func which adapts default implementation. */
  class DefaultReflectiveKeyFunc implements Function<KubernetesObject, Request> {
    @Override
    public Request apply(KubernetesObject o) {
      return Controllers.defaultReflectiveKeyFunc().apply(o);
    }
  }
}
