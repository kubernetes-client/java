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

public class V1VolumeNodeResourcesBuilder
    extends V1VolumeNodeResourcesFluentImpl<V1VolumeNodeResourcesBuilder>
    implements VisitableBuilder<V1VolumeNodeResources, V1VolumeNodeResourcesBuilder> {
  public V1VolumeNodeResourcesBuilder() {
    this(false);
  }

  public V1VolumeNodeResourcesBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeResources(), validationEnabled);
  }

  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeNodeResourcesBuilder(
      V1VolumeNodeResourcesFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeResources(), validationEnabled);
  }

  public V1VolumeNodeResourcesBuilder(
      V1VolumeNodeResourcesFluent<?> fluent, V1VolumeNodeResources instance) {
    this(fluent, instance, false);
  }

  public V1VolumeNodeResourcesBuilder(
      V1VolumeNodeResourcesFluent<?> fluent,
      V1VolumeNodeResources instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCount(instance.getCount());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance) {
    this(instance, false);
  }

  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCount(instance.getCount());

    this.validationEnabled = validationEnabled;
  }

  V1VolumeNodeResourcesFluent<?> fluent;
  Boolean validationEnabled;

  public V1VolumeNodeResources build() {
    V1VolumeNodeResources buildable = new V1VolumeNodeResources();
    buildable.setCount(fluent.getCount());
    return buildable;
  }
}
