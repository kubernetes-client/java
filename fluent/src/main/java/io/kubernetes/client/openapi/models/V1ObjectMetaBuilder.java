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

public class V1ObjectMetaBuilder
    extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
        io.kubernetes.client.openapi.models.V1ObjectMetaBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ObjectMeta,
        io.kubernetes.client.openapi.models.V1ObjectMetaBuilder> {
  public V1ObjectMetaBuilder() {
    this(false);
  }

  public V1ObjectMetaBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ObjectMeta(), validationEnabled);
  }

  public V1ObjectMetaBuilder(io.kubernetes.client.openapi.models.V1ObjectMetaFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ObjectMetaBuilder(
      io.kubernetes.client.openapi.models.V1ObjectMetaFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ObjectMeta(), validationEnabled);
  }

  public V1ObjectMetaBuilder(
      io.kubernetes.client.openapi.models.V1ObjectMetaFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ObjectMeta instance) {
    this(fluent, instance, false);
  }

  public V1ObjectMetaBuilder(
      io.kubernetes.client.openapi.models.V1ObjectMetaFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ObjectMeta instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAnnotations(instance.getAnnotations());

    fluent.withClusterName(instance.getClusterName());

    fluent.withCreationTimestamp(instance.getCreationTimestamp());

    fluent.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds());

    fluent.withDeletionTimestamp(instance.getDeletionTimestamp());

    fluent.withFinalizers(instance.getFinalizers());

    fluent.withGenerateName(instance.getGenerateName());

    fluent.withGeneration(instance.getGeneration());

    fluent.withLabels(instance.getLabels());

    fluent.withManagedFields(instance.getManagedFields());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withOwnerReferences(instance.getOwnerReferences());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withSelfLink(instance.getSelfLink());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1ObjectMetaBuilder(io.kubernetes.client.openapi.models.V1ObjectMeta instance) {
    this(instance, false);
  }

  public V1ObjectMetaBuilder(
      io.kubernetes.client.openapi.models.V1ObjectMeta instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAnnotations(instance.getAnnotations());

    this.withClusterName(instance.getClusterName());

    this.withCreationTimestamp(instance.getCreationTimestamp());

    this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds());

    this.withDeletionTimestamp(instance.getDeletionTimestamp());

    this.withFinalizers(instance.getFinalizers());

    this.withGenerateName(instance.getGenerateName());

    this.withGeneration(instance.getGeneration());

    this.withLabels(instance.getLabels());

    this.withManagedFields(instance.getManagedFields());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withOwnerReferences(instance.getOwnerReferences());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ObjectMetaFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ObjectMeta build() {
    V1ObjectMeta buildable = new V1ObjectMeta();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setClusterName(fluent.getClusterName());
    buildable.setCreationTimestamp(fluent.getCreationTimestamp());
    buildable.setDeletionGracePeriodSeconds(fluent.getDeletionGracePeriodSeconds());
    buildable.setDeletionTimestamp(fluent.getDeletionTimestamp());
    buildable.setFinalizers(fluent.getFinalizers());
    buildable.setGenerateName(fluent.getGenerateName());
    buildable.setGeneration(fluent.getGeneration());
    buildable.setLabels(fluent.getLabels());
    buildable.setManagedFields(fluent.getManagedFields());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setOwnerReferences(fluent.getOwnerReferences());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    buildable.setUid(fluent.getUid());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ObjectMetaBuilder that = (V1ObjectMetaBuilder) o;
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
