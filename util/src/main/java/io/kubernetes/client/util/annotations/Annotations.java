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
package io.kubernetes.client.util.annotations;

import io.kubernetes.client.common.KubernetesObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Annotations {

  /**
   * Adds one annotation to the object.
   *
   * @param kubernetesObject the kubernetes object
   * @param annotation the annotation key
   * @param value the annotations value
   */
  public static void addAnnotations(
      KubernetesObject kubernetesObject, String annotation, String value) {
    addAnnotations(kubernetesObject, Collections.singletonMap(annotation, value));
  }

  /**
   * Adds a set of annotations to the object.
   *
   * @param kubernetesObject the kubernetes object
   * @param mergingAnnotations the merging annotations
   */
  public static void addAnnotations(
      KubernetesObject kubernetesObject, Map<String, String> mergingAnnotations) {
    if (null == mergingAnnotations) {
      return;
    }
    final Map<String, String> currentAnnotations =
        null != kubernetesObject.getMetadata().getAnnotations()
            ? kubernetesObject.getMetadata().getAnnotations()
            : new HashMap<>();
    mergingAnnotations.entrySet().stream()
        .forEach(e -> currentAnnotations.put(e.getKey(), e.getValue()));
    kubernetesObject.getMetadata().setAnnotations(currentAnnotations);
  }
}
