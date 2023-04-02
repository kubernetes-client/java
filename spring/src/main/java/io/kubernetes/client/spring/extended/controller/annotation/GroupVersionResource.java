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
 * The standard Kubernetes group-version-resource.
 *
 * @deprecated use the {@link io.kubernetes.client.util.generic.GenericKubernetesApi} instead
 */
@Deprecated
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GroupVersionResource {

  /**
   * Api group string. e.g. "batch"
   *
   * @return the string
   */
  String apiGroup() default "";

  /**
   * Api version string. e.g. "v1"
   *
   * @return the string
   */
  String apiVersion() default "v1";

  /**
   * Resource plural string. e.g. "jobs"
   *
   * @return the string
   */
  String resourcePlural() default "namespaces";
}
