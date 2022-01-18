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

public class V1GitRepoVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1GitRepoVolumeSource,
        io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder> {
  public V1GitRepoVolumeSourceBuilder() {
    this(false);
  }

  public V1GitRepoVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1GitRepoVolumeSource(), validationEnabled);
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1GitRepoVolumeSource(), validationEnabled);
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDirectory(instance.getDirectory());

    fluent.withRepository(instance.getRepository());

    fluent.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled;
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance) {
    this(instance, false);
  }

  public V1GitRepoVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDirectory(instance.getDirectory());

    this.withRepository(instance.getRepository());

    this.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1GitRepoVolumeSource build() {
    V1GitRepoVolumeSource buildable = new V1GitRepoVolumeSource();
    buildable.setDirectory(fluent.getDirectory());
    buildable.setRepository(fluent.getRepository());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GitRepoVolumeSourceBuilder that = (V1GitRepoVolumeSourceBuilder) o;
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
