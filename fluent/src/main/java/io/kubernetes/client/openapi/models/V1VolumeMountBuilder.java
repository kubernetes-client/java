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

public class V1VolumeMountBuilder extends V1VolumeMountFluentImpl<V1VolumeMountBuilder>
    implements VisitableBuilder<
        V1VolumeMount, io.kubernetes.client.openapi.models.V1VolumeMountBuilder> {
  public V1VolumeMountBuilder() {
    this(false);
  }

  public V1VolumeMountBuilder(Boolean validationEnabled) {
    this(new V1VolumeMount(), validationEnabled);
  }

  public V1VolumeMountBuilder(V1VolumeMountFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeMountBuilder(
      io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeMount(), validationEnabled);
  }

  public V1VolumeMountBuilder(
      io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeMount instance) {
    this(fluent, instance, false);
  }

  public V1VolumeMountBuilder(
      io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeMount instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMountPath(instance.getMountPath());

    fluent.withMountPropagation(instance.getMountPropagation());

    fluent.withName(instance.getName());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSubPath(instance.getSubPath());

    fluent.withSubPathExpr(instance.getSubPathExpr());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeMountBuilder(io.kubernetes.client.openapi.models.V1VolumeMount instance) {
    this(instance, false);
  }

  public V1VolumeMountBuilder(
      io.kubernetes.client.openapi.models.V1VolumeMount instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMountPath(instance.getMountPath());

    this.withMountPropagation(instance.getMountPropagation());

    this.withName(instance.getName());

    this.withReadOnly(instance.getReadOnly());

    this.withSubPath(instance.getSubPath());

    this.withSubPathExpr(instance.getSubPathExpr());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeMountFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VolumeMount build() {
    V1VolumeMount buildable = new V1VolumeMount();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setMountPropagation(fluent.getMountPropagation());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSubPath(fluent.getSubPath());
    buildable.setSubPathExpr(fluent.getSubPathExpr());
    return buildable;
  }
}
