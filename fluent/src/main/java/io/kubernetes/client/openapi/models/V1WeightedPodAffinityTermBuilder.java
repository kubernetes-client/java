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

public class V1WeightedPodAffinityTermBuilder
    extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluentImpl<
        io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm,
        io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> {
  public V1WeightedPodAffinityTermBuilder() {
    this(false);
  }

  public V1WeightedPodAffinityTermBuilder(java.lang.Boolean validationEnabled) {
    this(new V1WeightedPodAffinityTerm(), validationEnabled);
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1WeightedPodAffinityTerm(), validationEnabled);
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance) {
    this(fluent, instance, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPodAffinityTerm(instance.getPodAffinityTerm());

    fluent.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance) {
    this(instance, false);
  }

  public V1WeightedPodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPodAffinityTerm(instance.getPodAffinityTerm());

    this.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm build() {
    V1WeightedPodAffinityTerm buildable = new V1WeightedPodAffinityTerm();
    buildable.setPodAffinityTerm(fluent.getPodAffinityTerm());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WeightedPodAffinityTermBuilder that = (V1WeightedPodAffinityTermBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
