/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1UncountedTerminatedPodsBuilder
    extends V1UncountedTerminatedPodsFluentImpl<V1UncountedTerminatedPodsBuilder>
    implements VisitableBuilder<V1UncountedTerminatedPods, V1UncountedTerminatedPodsBuilder> {
  public V1UncountedTerminatedPodsBuilder() {
    this(false);
  }

  public V1UncountedTerminatedPodsBuilder(Boolean validationEnabled) {
    this(new V1UncountedTerminatedPods(), validationEnabled);
  }

  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1UncountedTerminatedPodsBuilder(
      V1UncountedTerminatedPodsFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1UncountedTerminatedPods(), validationEnabled);
  }

  public V1UncountedTerminatedPodsBuilder(
      V1UncountedTerminatedPodsFluent<?> fluent, V1UncountedTerminatedPods instance) {
    this(fluent, instance, false);
  }

  public V1UncountedTerminatedPodsBuilder(
      V1UncountedTerminatedPodsFluent<?> fluent,
      V1UncountedTerminatedPods instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFailed(instance.getFailed());

    fluent.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled;
  }

  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPods instance) {
    this(instance, false);
  }

  public V1UncountedTerminatedPodsBuilder(
      V1UncountedTerminatedPods instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFailed(instance.getFailed());

    this.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled;
  }

  V1UncountedTerminatedPodsFluent<?> fluent;
  Boolean validationEnabled;

  public V1UncountedTerminatedPods build() {
    V1UncountedTerminatedPods buildable = new V1UncountedTerminatedPods();
    buildable.setFailed(fluent.getFailed());
    buildable.setSucceeded(fluent.getSucceeded());
    return buildable;
  }
}
