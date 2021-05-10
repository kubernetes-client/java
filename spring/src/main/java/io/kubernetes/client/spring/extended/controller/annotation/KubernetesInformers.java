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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be applied to a bean method which returns a SharedInformerFactory bean
 * instance. It indicates injecting the list of informers to the SharedInformerFactory automatically
 * by {@link io.kubernetes.client.spring.extended.controller.KubernetesInformerFactoryProcessor}.
 *
 * <p>This annotation is specifically used for joining a list of {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer} onto one bean
 * method.
 *
 * @deprecated create a {@link io.kubernetes.client.informer.SharedIndexInformer} beans instead
 */
@Deprecated
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesInformers {

  /**
   * Value kubernetes informer [ ].
   *
   * @return the kubernetes informer [ ]
   */
  KubernetesInformer[] value() default {};
}
