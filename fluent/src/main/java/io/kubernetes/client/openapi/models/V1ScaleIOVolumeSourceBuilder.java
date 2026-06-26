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
public class V1ScaleIOVolumeSourceBuilder extends V1ScaleIOVolumeSourceFluent<V1ScaleIOVolumeSourceBuilder> implements VisitableBuilder<V1ScaleIOVolumeSource,V1ScaleIOVolumeSourceBuilder>{

  V1ScaleIOVolumeSourceFluent<?> fluent;

  public V1ScaleIOVolumeSourceBuilder() {
    this(new V1ScaleIOVolumeSource());
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ScaleIOVolumeSource());
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent,V1ScaleIOVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ScaleIOVolumeSource build() {
    V1ScaleIOVolumeSource buildable = new V1ScaleIOVolumeSource();
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