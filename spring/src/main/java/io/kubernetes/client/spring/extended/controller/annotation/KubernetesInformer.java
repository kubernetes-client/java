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

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.Namespaces;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Kubernetes informer specifies the arguments for injecting an informer into the
 * informer-factory. The default argument list works for instantiating an informer list-watching
 * namespace resources.
 *
 * @deprecated create a {@link io.kubernetes.client.informer.SharedIndexInformer} as a bean instead
 */
@Deprecated
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesInformer {

  /**
   * Kubernetes api type class class e.g. V1Namespace.
   *
   * @return the class
   */
  Class<? extends KubernetesObject> apiTypeClass() default V1Namespace.class;

  /**
   * Kubernetes api list type class class. e.g. V1NamespaceList.
   *
   * @return the class
   */
  Class<? extends KubernetesListObject> apiListTypeClass() default V1NamespaceList.class;

  /**
   * Group-version-resource is a tuple for constructing legal Kubernetes api path. e.g. {"batch",
   * "v1", "jobs"}
   *
   * @return the group version resource
   */
  GroupVersionResource groupVersionResource();

  /**
   * Resync period millis long.
   *
   * @return the long
   */
  long resyncPeriodMillis() default 0;

  /**
   * Target namespace to list-watch, by default it will be cluster-scoped.
   *
   * @return the string
   */
  String namespace() default Namespaces.NAMESPACE_ALL;
}
