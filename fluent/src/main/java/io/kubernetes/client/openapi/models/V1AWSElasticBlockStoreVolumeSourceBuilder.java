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

public class V1AWSElasticBlockStoreVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource,
        io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder> {
  public V1AWSElasticBlockStoreVolumeSourceBuilder() {
    this(false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withPartition(instance.getPartition());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance) {
    this(instance, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource build() {
    V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AWSElasticBlockStoreVolumeSourceBuilder that = (V1AWSElasticBlockStoreVolumeSourceBuilder) o;
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
