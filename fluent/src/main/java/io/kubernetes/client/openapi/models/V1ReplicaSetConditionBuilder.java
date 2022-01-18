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

public class V1ReplicaSetConditionBuilder
    extends io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluentImpl<
        io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicaSetCondition,
        io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> {
  public V1ReplicaSetConditionBuilder() {
    this(false);
  }

  public V1ReplicaSetConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ReplicaSetCondition(), validationEnabled);
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetCondition(), validationEnabled);
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetCondition instance) {
    this(fluent, instance, false);
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetCondition instance) {
    this(instance, false);
  }

  public V1ReplicaSetConditionBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicaSetCondition build() {
    V1ReplicaSetCondition buildable = new V1ReplicaSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicaSetConditionBuilder that = (V1ReplicaSetConditionBuilder) o;
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
