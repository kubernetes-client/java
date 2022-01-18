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

public class V1beta1FlowSchemaConditionBuilder
    extends io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition,
        io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder> {
  public V1beta1FlowSchemaConditionBuilder() {
    this(false);
  }

  public V1beta1FlowSchemaConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1FlowSchemaCondition(), validationEnabled);
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1FlowSchemaCondition(), validationEnabled);
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition instance) {
    this(fluent, instance, false);
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition instance) {
    this(instance, false);
  }

  public V1beta1FlowSchemaConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition build() {
    V1beta1FlowSchemaCondition buildable = new V1beta1FlowSchemaCondition();
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
    V1beta1FlowSchemaConditionBuilder that = (V1beta1FlowSchemaConditionBuilder) o;
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
