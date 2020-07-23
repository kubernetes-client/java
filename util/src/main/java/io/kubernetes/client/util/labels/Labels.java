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
package io.kubernetes.client.util.labels;

import io.kubernetes.client.common.KubernetesObject;
import java.util.HashMap;
import java.util.Map;

/** Helper utilities for manipulating kubernetes labels. */
public class Labels {

  /**
   * Adds one label to the object.
   *
   * @param kubernetesObject the kubernetes object
   * @param label the label key
   * @param value the label value
   */
  public static void addLabels(KubernetesObject kubernetesObject, String label, String value) {
    Map<String, String> mergingLabels = new HashMap<>();
    mergingLabels.put(label, value);
    addLabels(kubernetesObject, mergingLabels);
  }

  /**
   * Adds a set of labels to the object.
   *
   * @param kubernetesObject the kubernetes object
   * @param mergingLabels the merging labels
   */
  public static void addLabels(
      KubernetesObject kubernetesObject, Map<String, String> mergingLabels) {
    if (null == mergingLabels) {
      return;
    }
    final Map<String, String> currentLabels =
        null != kubernetesObject.getMetadata().getLabels()
            ? kubernetesObject.getMetadata().getLabels()
            : new HashMap<>();
    mergingLabels.entrySet().stream().forEach(e -> currentLabels.put(e.getKey(), e.getValue()));
    kubernetesObject.getMetadata().setLabels(currentLabels);
  }
}
