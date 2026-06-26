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
public class V1VsphereVirtualDiskVolumeSourceBuilder extends V1VsphereVirtualDiskVolumeSourceFluent<V1VsphereVirtualDiskVolumeSourceBuilder> implements VisitableBuilder<V1VsphereVirtualDiskVolumeSource,V1VsphereVirtualDiskVolumeSourceBuilder>{

  V1VsphereVirtualDiskVolumeSourceFluent<?> fluent;

  public V1VsphereVirtualDiskVolumeSourceBuilder() {
    this(new V1VsphereVirtualDiskVolumeSource());
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1VsphereVirtualDiskVolumeSource());
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,V1VsphereVirtualDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VsphereVirtualDiskVolumeSource build() {
    V1VsphereVirtualDiskVolumeSource buildable = new V1VsphereVirtualDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setStoragePolicyID(fluent.getStoragePolicyID());
    buildable.setStoragePolicyName(fluent.getStoragePolicyName());
    buildable.setVolumePath(fluent.getVolumePath());
    return buildable;
  }
  
}