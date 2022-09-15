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

public class V1CephFSVolumeSourceBuilder
    extends V1CephFSVolumeSourceFluentImpl<V1CephFSVolumeSourceBuilder>
    implements VisitableBuilder<V1CephFSVolumeSource, V1CephFSVolumeSourceBuilder> {
  public V1CephFSVolumeSourceBuilder() {
    this(false);
  }

  public V1CephFSVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CephFSVolumeSource(), validationEnabled);
  }

  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CephFSVolumeSourceBuilder(
      V1CephFSVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CephFSVolumeSource(), validationEnabled);
  }

  public V1CephFSVolumeSourceBuilder(
      V1CephFSVolumeSourceFluent<?> fluent, V1CephFSVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1CephFSVolumeSourceBuilder(
      V1CephFSVolumeSourceFluent<?> fluent,
      V1CephFSVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMonitors(instance.getMonitors());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretFile(instance.getSecretFile());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSource instance) {
    this(instance, false);
  }

  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMonitors(instance.getMonitors());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretFile(instance.getSecretFile());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  V1CephFSVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1CephFSVolumeSource build() {
    V1CephFSVolumeSource buildable = new V1CephFSVolumeSource();
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretFile(fluent.getSecretFile());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
}
