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

public class V1FlexVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1FlexVolumeSource,
        io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder> {
  public V1FlexVolumeSourceBuilder() {
    this(false);
  }

  public V1FlexVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1FlexVolumeSource(), validationEnabled);
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1FlexVolumeSource(), validationEnabled);
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1FlexVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1FlexVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withOptions(instance.getOptions());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSource instance) {
    this(instance, false);
  }

  public V1FlexVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FlexVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1FlexVolumeSource build() {
    V1FlexVolumeSource buildable = new V1FlexVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1FlexVolumeSourceBuilder that = (V1FlexVolumeSourceBuilder) o;
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
