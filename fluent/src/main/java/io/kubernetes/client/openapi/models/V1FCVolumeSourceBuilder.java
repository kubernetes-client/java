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

public class V1FCVolumeSourceBuilder extends V1FCVolumeSourceFluentImpl<V1FCVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1FCVolumeSource, V1FCVolumeSourceBuilder> {
  public V1FCVolumeSourceBuilder() {
    this(false);
  }

  public V1FCVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FCVolumeSource(), validationEnabled);
  }

  public V1FCVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1FCVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1FCVolumeSource(), validationEnabled);
  }

  public V1FCVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1FCVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1FCVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1FCVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withLun(instance.getLun());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withTargetWWNs(instance.getTargetWWNs());

    fluent.withWwids(instance.getWwids());

    this.validationEnabled = validationEnabled;
  }

  public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSource instance) {
    this(instance, false);
  }

  public V1FCVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1FCVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withLun(instance.getLun());

    this.withReadOnly(instance.getReadOnly());

    this.withTargetWWNs(instance.getTargetWWNs());

    this.withWwids(instance.getWwids());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1FCVolumeSource build() {
    V1FCVolumeSource buildable = new V1FCVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setLun(fluent.getLun());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setTargetWWNs(fluent.getTargetWWNs());
    buildable.setWwids(fluent.getWwids());
    return buildable;
  }
}
