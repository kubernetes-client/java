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
public class V1StorageOSVolumeSourceBuilder extends V1StorageOSVolumeSourceFluent<V1StorageOSVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSVolumeSource,V1StorageOSVolumeSourceBuilder>{

  V1StorageOSVolumeSourceFluent<?> fluent;

  public V1StorageOSVolumeSourceBuilder() {
    this(new V1StorageOSVolumeSource());
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent) {
    this(fluent, new V1StorageOSVolumeSource());
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent,V1StorageOSVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageOSVolumeSource build() {
    V1StorageOSVolumeSource buildable = new V1StorageOSVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  
}