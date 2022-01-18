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

public class V1DaemonSetStatusBuilder
    extends io.kubernetes.client.openapi.models.V1DaemonSetStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1DaemonSetStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DaemonSetStatus,
        io.kubernetes.client.openapi.models.V1DaemonSetStatusBuilder> {
  public V1DaemonSetStatusBuilder() {
    this(false);
  }

  public V1DaemonSetStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DaemonSetStatus(), validationEnabled);
  }

  public V1DaemonSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DaemonSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DaemonSetStatus(), validationEnabled);
  }

  public V1DaemonSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonSetStatus instance) {
    this(fluent, instance, false);
  }

  public V1DaemonSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCollisionCount(instance.getCollisionCount());

    fluent.withConditions(instance.getConditions());

    fluent.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());

    fluent.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());

    fluent.withNumberAvailable(instance.getNumberAvailable());

    fluent.withNumberMisscheduled(instance.getNumberMisscheduled());

    fluent.withNumberReady(instance.getNumberReady());

    fluent.withNumberUnavailable(instance.getNumberUnavailable());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());

    this.validationEnabled = validationEnabled;
  }

  public V1DaemonSetStatusBuilder(io.kubernetes.client.openapi.models.V1DaemonSetStatus instance) {
    this(instance, false);
  }

  public V1DaemonSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());

    this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());

    this.withNumberAvailable(instance.getNumberAvailable());

    this.withNumberMisscheduled(instance.getNumberMisscheduled());

    this.withNumberReady(instance.getNumberReady());

    this.withNumberUnavailable(instance.getNumberUnavailable());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DaemonSetStatus build() {
    V1DaemonSetStatus buildable = new V1DaemonSetStatus();
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentNumberScheduled(fluent.getCurrentNumberScheduled());
    buildable.setDesiredNumberScheduled(fluent.getDesiredNumberScheduled());
    buildable.setNumberAvailable(fluent.getNumberAvailable());
    buildable.setNumberMisscheduled(fluent.getNumberMisscheduled());
    buildable.setNumberReady(fluent.getNumberReady());
    buildable.setNumberUnavailable(fluent.getNumberUnavailable());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setUpdatedNumberScheduled(fluent.getUpdatedNumberScheduled());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DaemonSetStatusBuilder that = (V1DaemonSetStatusBuilder) o;
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
