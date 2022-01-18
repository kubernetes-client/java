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

public class V1StorageClassBuilder
    extends io.kubernetes.client.openapi.models.V1StorageClassFluentImpl<
        io.kubernetes.client.openapi.models.V1StorageClassBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StorageClass,
        io.kubernetes.client.openapi.models.V1StorageClassBuilder> {
  public V1StorageClassBuilder() {
    this(false);
  }

  public V1StorageClassBuilder(java.lang.Boolean validationEnabled) {
    this(new V1StorageClass(), validationEnabled);
  }

  public V1StorageClassBuilder(io.kubernetes.client.openapi.models.V1StorageClassFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StorageClassBuilder(
      io.kubernetes.client.openapi.models.V1StorageClassFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StorageClass(), validationEnabled);
  }

  public V1StorageClassBuilder(
      io.kubernetes.client.openapi.models.V1StorageClassFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StorageClass instance) {
    this(fluent, instance, false);
  }

  public V1StorageClassBuilder(
      io.kubernetes.client.openapi.models.V1StorageClassFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StorageClass instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    fluent.withAllowedTopologies(instance.getAllowedTopologies());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withMountOptions(instance.getMountOptions());

    fluent.withParameters(instance.getParameters());

    fluent.withProvisioner(instance.getProvisioner());

    fluent.withReclaimPolicy(instance.getReclaimPolicy());

    fluent.withVolumeBindingMode(instance.getVolumeBindingMode());

    this.validationEnabled = validationEnabled;
  }

  public V1StorageClassBuilder(io.kubernetes.client.openapi.models.V1StorageClass instance) {
    this(instance, false);
  }

  public V1StorageClassBuilder(
      io.kubernetes.client.openapi.models.V1StorageClass instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    this.withAllowedTopologies(instance.getAllowedTopologies());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withMountOptions(instance.getMountOptions());

    this.withParameters(instance.getParameters());

    this.withProvisioner(instance.getProvisioner());

    this.withReclaimPolicy(instance.getReclaimPolicy());

    this.withVolumeBindingMode(instance.getVolumeBindingMode());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StorageClassFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StorageClass build() {
    V1StorageClass buildable = new V1StorageClass();
    buildable.setAllowVolumeExpansion(fluent.getAllowVolumeExpansion());
    buildable.setAllowedTopologies(fluent.getAllowedTopologies());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setParameters(fluent.getParameters());
    buildable.setProvisioner(fluent.getProvisioner());
    buildable.setReclaimPolicy(fluent.getReclaimPolicy());
    buildable.setVolumeBindingMode(fluent.getVolumeBindingMode());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StorageClassBuilder that = (V1StorageClassBuilder) o;
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
