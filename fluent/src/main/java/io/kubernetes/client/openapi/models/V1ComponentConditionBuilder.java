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

public class V1ComponentConditionBuilder
    extends io.kubernetes.client.openapi.models.V1ComponentConditionFluentImpl<
        io.kubernetes.client.openapi.models.V1ComponentConditionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ComponentCondition,
        io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> {
  public V1ComponentConditionBuilder() {
    this(false);
  }

  public V1ComponentConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ComponentCondition(), validationEnabled);
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentConditionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ComponentCondition(), validationEnabled);
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ComponentCondition instance) {
    this(fluent, instance, false);
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ComponentCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withError(instance.getError());

    fluent.withMessage(instance.getMessage());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentCondition instance) {
    this(instance, false);
  }

  public V1ComponentConditionBuilder(
      io.kubernetes.client.openapi.models.V1ComponentCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withError(instance.getError());

    this.withMessage(instance.getMessage());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ComponentConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ComponentCondition build() {
    V1ComponentCondition buildable = new V1ComponentCondition();
    buildable.setError(fluent.getError());
    buildable.setMessage(fluent.getMessage());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ComponentConditionBuilder that = (V1ComponentConditionBuilder) o;
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
