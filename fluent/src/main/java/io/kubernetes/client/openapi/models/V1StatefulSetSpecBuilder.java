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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1StatefulSetSpecBuilder extends V1StatefulSetSpecFluentImpl<V1StatefulSetSpecBuilder>
    implements VisitableBuilder<V1StatefulSetSpec, V1StatefulSetSpecBuilder> {
  public V1StatefulSetSpecBuilder() {
    this(false);
  }

  public V1StatefulSetSpecBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetSpec(), validationEnabled);
  }

  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1StatefulSetSpec(), validationEnabled);
  }

  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent, V1StatefulSetSpec instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetSpecBuilder(
      V1StatefulSetSpecFluent<?> fluent, V1StatefulSetSpec instance, Boolean validationEnabled) {
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

  public V1StatefulSetSpecBuilder(V1StatefulSetSpec instance) {
    this(instance, false);
  }

  public V1StatefulSetSpecBuilder(V1StatefulSetSpec instance, Boolean validationEnabled) {
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

  V1StatefulSetSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1StatefulSetSpec build() {
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
}
