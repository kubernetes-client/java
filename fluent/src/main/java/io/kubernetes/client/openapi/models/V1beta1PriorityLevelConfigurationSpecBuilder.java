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

public class V1beta1PriorityLevelConfigurationSpecBuilder
    extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec,
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecBuilder> {
  public V1beta1PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationSpec(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationSpec(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLimited(instance.getLimited());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec instance) {
    this(instance, false);
  }

  public V1beta1PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpec build() {
    V1beta1PriorityLevelConfigurationSpec buildable = new V1beta1PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1PriorityLevelConfigurationSpecBuilder that =
        (V1beta1PriorityLevelConfigurationSpecBuilder) o;
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
