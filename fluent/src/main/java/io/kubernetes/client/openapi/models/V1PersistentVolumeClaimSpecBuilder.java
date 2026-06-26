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
public class V1PersistentVolumeClaimSpecBuilder extends V1PersistentVolumeClaimSpecFluent<V1PersistentVolumeClaimSpecBuilder> implements VisitableBuilder<V1PersistentVolumeClaimSpec,V1PersistentVolumeClaimSpecBuilder>{

  V1PersistentVolumeClaimSpecFluent<?> fluent;

  public V1PersistentVolumeClaimSpecBuilder() {
    this(new V1PersistentVolumeClaimSpec());
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpecFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimSpec());
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpecFluent<?> fluent,V1PersistentVolumeClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PersistentVolumeClaimSpec build() {
    V1PersistentVolumeClaimSpec buildable = new V1PersistentVolumeClaimSpec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setDataSource(fluent.buildDataSource());
    buildable.setDataSourceRef(fluent.buildDataSourceRef());
    buildable.setResources(fluent.buildResources());
    buildable.setSelector(fluent.buildSelector());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setVolumeAttributesClassName(fluent.getVolumeAttributesClassName());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  
}