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

public class V1StatefulSetSpecBuilder
    extends io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1StatefulSetSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StatefulSetSpec,
        io.kubernetes.client.openapi.models.V1StatefulSetSpecBuilder> {
  public V1StatefulSetSpecBuilder() {
    this(false);
  }

  public V1StatefulSetSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1StatefulSetSpec(), validationEnabled);
  }

  public V1StatefulSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StatefulSetSpec(), validationEnabled);
  }

  public V1StatefulSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetSpec instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withPersistentVolumeClaimRetentionPolicy(
        instance.getPersistentVolumeClaimRetentionPolicy());

    fluent.withPodManagementPolicy(instance.getPodManagementPolicy());

    fluent.withReplicas(instance.getReplicas());

    fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    fluent.withSelector(instance.getSelector());

    fluent.withServiceName(instance.getServiceName());

    fluent.withTemplate(instance.getTemplate());

    fluent.withUpdateStrategy(instance.getUpdateStrategy());

    fluent.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());

    this.validationEnabled = validationEnabled;
  }

  public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpec instance) {
    this(instance, false);
  }

  public V1StatefulSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPersistentVolumeClaimRetentionPolicy(
        instance.getPersistentVolumeClaimRetentionPolicy());

    this.withPodManagementPolicy(instance.getPodManagementPolicy());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withServiceName(instance.getServiceName());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

    this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StatefulSetSpec build() {
    V1StatefulSetSpec buildable = new V1StatefulSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setPersistentVolumeClaimRetentionPolicy(
        fluent.getPersistentVolumeClaimRetentionPolicy());
    buildable.setPodManagementPolicy(fluent.getPodManagementPolicy());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.getSelector());
    buildable.setServiceName(fluent.getServiceName());
    buildable.setTemplate(fluent.getTemplate());
    buildable.setUpdateStrategy(fluent.getUpdateStrategy());
    buildable.setVolumeClaimTemplates(fluent.getVolumeClaimTemplates());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatefulSetSpecBuilder that = (V1StatefulSetSpecBuilder) o;
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
