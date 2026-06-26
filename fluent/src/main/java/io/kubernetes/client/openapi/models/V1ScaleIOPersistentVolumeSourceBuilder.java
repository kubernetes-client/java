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
public class V1ScaleIOPersistentVolumeSourceBuilder extends V1ScaleIOPersistentVolumeSourceFluent<V1ScaleIOPersistentVolumeSourceBuilder> implements VisitableBuilder<V1ScaleIOPersistentVolumeSource,V1ScaleIOPersistentVolumeSourceBuilder>{

  V1ScaleIOPersistentVolumeSourceFluent<?> fluent;

  public V1ScaleIOPersistentVolumeSourceBuilder() {
    this(new V1ScaleIOPersistentVolumeSource());
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ScaleIOPersistentVolumeSource());
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSourceFluent<?> fluent,V1ScaleIOPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ScaleIOPersistentVolumeSource build() {
    V1ScaleIOPersistentVolumeSource buildable = new V1ScaleIOPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setGateway(fluent.getGateway());
    buildable.setProtectionDomain(fluent.getProtectionDomain());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setSslEnabled(fluent.getSslEnabled());
    buildable.setStorageMode(fluent.getStorageMode());
    buildable.setStoragePool(fluent.getStoragePool());
    buildable.setSystem(fluent.getSystem());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  
}