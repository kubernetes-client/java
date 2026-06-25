/*
Copyright 2020 The Kubernetes Authors.
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
public class V1StorageOSPersistentVolumeSourceBuilder extends V1StorageOSPersistentVolumeSourceFluent<V1StorageOSPersistentVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSPersistentVolumeSource,V1StorageOSPersistentVolumeSourceBuilder>{

  V1StorageOSPersistentVolumeSourceFluent<?> fluent;

  public V1StorageOSPersistentVolumeSourceBuilder() {
    this(new V1StorageOSPersistentVolumeSource());
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1StorageOSPersistentVolumeSource());
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent,V1StorageOSPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageOSPersistentVolumeSource build() {
    V1StorageOSPersistentVolumeSource buildable = new V1StorageOSPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  
}