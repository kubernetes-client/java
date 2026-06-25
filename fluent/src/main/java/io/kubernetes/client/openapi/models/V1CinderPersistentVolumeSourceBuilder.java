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
public class V1CinderPersistentVolumeSourceBuilder extends V1CinderPersistentVolumeSourceFluent<V1CinderPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CinderPersistentVolumeSource,V1CinderPersistentVolumeSourceBuilder>{

  V1CinderPersistentVolumeSourceFluent<?> fluent;

  public V1CinderPersistentVolumeSourceBuilder() {
    this(new V1CinderPersistentVolumeSource());
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CinderPersistentVolumeSource());
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent,V1CinderPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CinderPersistentVolumeSource build() {
    V1CinderPersistentVolumeSource buildable = new V1CinderPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}