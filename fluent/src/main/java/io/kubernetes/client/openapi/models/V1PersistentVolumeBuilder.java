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
public class V1PersistentVolumeBuilder extends V1PersistentVolumeFluent<V1PersistentVolumeBuilder> implements VisitableBuilder<V1PersistentVolume,V1PersistentVolumeBuilder>{

  V1PersistentVolumeFluent<?> fluent;

  public V1PersistentVolumeBuilder() {
    this(new V1PersistentVolume());
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent) {
    this(fluent, new V1PersistentVolume());
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent,V1PersistentVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PersistentVolume build() {
    V1PersistentVolume buildable = new V1PersistentVolume();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}