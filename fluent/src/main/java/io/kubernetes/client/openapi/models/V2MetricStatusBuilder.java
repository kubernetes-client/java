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

public class V2MetricStatusBuilder
    extends io.kubernetes.client.openapi.models.V2MetricStatusFluentImpl<
        io.kubernetes.client.openapi.models.V2MetricStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2MetricStatus,
        io.kubernetes.client.openapi.models.V2MetricStatusBuilder> {
  public V2MetricStatusBuilder() {
    this(false);
  }

  public V2MetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2MetricStatus(), validationEnabled);
  }

  public V2MetricStatusBuilder(io.kubernetes.client.openapi.models.V2MetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2MetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2MetricStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2MetricStatus(), validationEnabled);
  }

  public V2MetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2MetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2MetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2MetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2MetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2MetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerResource(instance.getContainerResource());

    fluent.withExternal(instance.getExternal());

    fluent.withObject(instance.getObject());

    fluent.withPods(instance.getPods());

    fluent.withResource(instance.getResource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V2MetricStatusBuilder(io.kubernetes.client.openapi.models.V2MetricStatus instance) {
    this(instance, false);
  }

  public V2MetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2MetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2MetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2MetricStatus build() {
    V2MetricStatus buildable = new V2MetricStatus();
    buildable.setContainerResource(fluent.getContainerResource());
    buildable.setExternal(fluent.getExternal());
    buildable.setObject(fluent.getObject());
    buildable.setPods(fluent.getPods());
    buildable.setResource(fluent.getResource());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricStatusBuilder that = (V2MetricStatusBuilder) o;
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
