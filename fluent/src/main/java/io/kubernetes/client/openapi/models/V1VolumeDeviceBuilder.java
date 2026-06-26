/*
Copyright 2026 The Kubernetes Authors.
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
import java.lang.Object;
public class V1VolumeDeviceBuilder extends V1VolumeDeviceFluent<V1VolumeDeviceBuilder> implements VisitableBuilder<V1VolumeDevice,V1VolumeDeviceBuilder>{

  V1VolumeDeviceFluent<?> fluent;

  public V1VolumeDeviceBuilder() {
    this(new V1VolumeDevice());
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent) {
    this(fluent, new V1VolumeDevice());
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDevice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent,V1VolumeDevice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeDevice build() {
    V1VolumeDevice buildable = new V1VolumeDevice();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}