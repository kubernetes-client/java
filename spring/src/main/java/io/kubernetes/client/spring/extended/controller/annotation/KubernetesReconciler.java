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

import io.kubernetes.client.extended.controller.builder.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The declaring class is a kubernetes reconciler which implements {@link
 * io.kubernetes.client.extended.controller.reconciler.Reconciler}.
 *
 * <p>Indicates that we're creating a Controller into the spring context with the name as the {@link
 * KubernetesReconciler#value()} specifies.
 *
 * <p>Note that the automatically created controller is not started by default.
 *
 * @deprecated create a controller as a bean instead using {@link
 *     io.kubernetes.client.extended.controller.builder.ControllerBuilder}
 */
@Deprecated
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconciler {

  /**
   * The name of the Kubernetes Reconciler.
   *
   * <p>NOTE: No longer in use for version >= 11.0.0
   *
   * @return the string
   */
  @Deprecated
  String value() default "";

  /**
   * Watches kubernetes resources.
   *
   * @return the kubernetes reconciler watches
   */
  KubernetesReconcilerWatches watches();

  /**
   * The number of workers.
   *
   * @return the int
   */
  int workerCount() default Constants.DEFAULT_WORKER_COUNT;
}
