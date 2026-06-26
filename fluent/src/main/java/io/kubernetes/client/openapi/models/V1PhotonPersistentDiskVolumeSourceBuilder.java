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
public class V1PhotonPersistentDiskVolumeSourceBuilder extends V1PhotonPersistentDiskVolumeSourceFluent<V1PhotonPersistentDiskVolumeSourceBuilder> implements VisitableBuilder<V1PhotonPersistentDiskVolumeSource,V1PhotonPersistentDiskVolumeSourceBuilder>{

  V1PhotonPersistentDiskVolumeSourceFluent<?> fluent;

  public V1PhotonPersistentDiskVolumeSourceBuilder() {
    this(new V1PhotonPersistentDiskVolumeSource());
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1PhotonPersistentDiskVolumeSource());
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,V1PhotonPersistentDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PhotonPersistentDiskVolumeSource build() {
    V1PhotonPersistentDiskVolumeSource buildable = new V1PhotonPersistentDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPdID(fluent.getPdID());
    return buildable;
  }
  
}