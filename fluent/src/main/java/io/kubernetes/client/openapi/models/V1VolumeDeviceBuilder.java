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

public class V1VolumeDeviceBuilder extends V1VolumeDeviceFluentImpl<V1VolumeDeviceBuilder>
    implements VisitableBuilder<V1VolumeDevice, V1VolumeDeviceBuilder> {
  public V1VolumeDeviceBuilder() {
    this(false);
  }

  public V1VolumeDeviceBuilder(Boolean validationEnabled) {
    this(new V1VolumeDevice(), validationEnabled);
  }

  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1VolumeDevice(), validationEnabled);
  }

  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent, V1VolumeDevice instance) {
    this(fluent, instance, false);
  }

  public V1VolumeDeviceBuilder(
      V1VolumeDeviceFluent<?> fluent, V1VolumeDevice instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDevicePath(instance.getDevicePath());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeDeviceBuilder(V1VolumeDevice instance) {
    this(instance, false);
  }

  public V1VolumeDeviceBuilder(V1VolumeDevice instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1VolumeDeviceFluent<?> fluent;
  Boolean validationEnabled;

  public V1VolumeDevice build() {
    V1VolumeDevice buildable = new V1VolumeDevice();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
