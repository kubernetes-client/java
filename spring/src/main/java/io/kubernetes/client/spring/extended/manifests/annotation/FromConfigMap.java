/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.manifests.annotation;

import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import io.kubernetes.client.spring.extended.manifests.configmaps.PollingConfigMapGetter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Injecting resources by reading from ConfigMap.
 *
 * <p>The annotations has to be be applied to member field of type Map<String, String>.
 *
 * <p>The content of the map will be automatically updated at the interval specified by the property
 * "kubernetes.manifests.refreshInterval".
 *
 * <p>If the given configmap, is not present in the cluster, the content of the map will stay empty.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FromConfigMap {

  /**
   * Namespace of the configmap.
   *
   * @return the string
   */
  String namespace();

  /**
   * Name of the configmap
   *
   * @return the string
   */
  String name();

  /**
   * Config map getter class.
   *
   * @return the class
   */
  Class<? extends ConfigMapGetter> configMapGetter() default PollingConfigMapGetter.class;
}
