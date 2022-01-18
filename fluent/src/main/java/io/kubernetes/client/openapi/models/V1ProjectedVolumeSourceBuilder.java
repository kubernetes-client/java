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

public class V1ProjectedVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ProjectedVolumeSource,
        io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder> {
  public V1ProjectedVolumeSourceBuilder() {
    this(false);
  }

  public V1ProjectedVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ProjectedVolumeSource(), validationEnabled);
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ProjectedVolumeSource(), validationEnabled);
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withSources(instance.getSources());

    this.validationEnabled = validationEnabled;
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource instance) {
    this(instance, false);
  }

  public V1ProjectedVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDefaultMode(instance.getDefaultMode());

    this.withSources(instance.getSources());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSource build() {
    V1ProjectedVolumeSource buildable = new V1ProjectedVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setSources(fluent.getSources());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ProjectedVolumeSourceBuilder that = (V1ProjectedVolumeSourceBuilder) o;
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
