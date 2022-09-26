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

public class V1WeightedPodAffinityTermBuilder
    extends V1WeightedPodAffinityTermFluentImpl<V1WeightedPodAffinityTermBuilder>
    implements VisitableBuilder<V1WeightedPodAffinityTerm, V1WeightedPodAffinityTermBuilder> {
  public V1WeightedPodAffinityTermBuilder() {
    this(false);
  }

  public V1WeightedPodAffinityTermBuilder(Boolean validationEnabled) {
    this(new V1WeightedPodAffinityTerm(), validationEnabled);
  }

  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      V1WeightedPodAffinityTermFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1WeightedPodAffinityTerm(), validationEnabled);
  }

  public V1WeightedPodAffinityTermBuilder(
      V1WeightedPodAffinityTermFluent<?> fluent, V1WeightedPodAffinityTerm instance) {
    this(fluent, instance, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      V1WeightedPodAffinityTermFluent<?> fluent,
      V1WeightedPodAffinityTerm instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPodAffinityTerm(instance.getPodAffinityTerm());

    fluent.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTerm instance) {
    this(instance, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      V1WeightedPodAffinityTerm instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPodAffinityTerm(instance.getPodAffinityTerm());

    this.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  V1WeightedPodAffinityTermFluent<?> fluent;
  Boolean validationEnabled;

  public V1WeightedPodAffinityTerm build() {
    V1WeightedPodAffinityTerm buildable = new V1WeightedPodAffinityTerm();
    buildable.setPodAffinityTerm(fluent.getPodAffinityTerm());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
}
