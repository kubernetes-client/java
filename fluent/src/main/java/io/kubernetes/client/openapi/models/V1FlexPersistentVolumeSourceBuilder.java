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
public class V1FlexPersistentVolumeSourceBuilder extends V1FlexPersistentVolumeSourceFluent<V1FlexPersistentVolumeSourceBuilder> implements VisitableBuilder<V1FlexPersistentVolumeSource,V1FlexPersistentVolumeSourceBuilder>{

  V1FlexPersistentVolumeSourceFluent<?> fluent;

  public V1FlexPersistentVolumeSourceBuilder() {
    this(new V1FlexPersistentVolumeSource());
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FlexPersistentVolumeSource());
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent,V1FlexPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FlexPersistentVolumeSource build() {
    V1FlexPersistentVolumeSource buildable = new V1FlexPersistentVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  
}