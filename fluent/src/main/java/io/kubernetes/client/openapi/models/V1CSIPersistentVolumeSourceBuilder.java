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
public class V1CSIPersistentVolumeSourceBuilder extends V1CSIPersistentVolumeSourceFluent<V1CSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CSIPersistentVolumeSource,V1CSIPersistentVolumeSourceBuilder>{

  V1CSIPersistentVolumeSourceFluent<?> fluent;

  public V1CSIPersistentVolumeSourceBuilder() {
    this(new V1CSIPersistentVolumeSource());
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CSIPersistentVolumeSource());
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent,V1CSIPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSIPersistentVolumeSource build() {
    V1CSIPersistentVolumeSource buildable = new V1CSIPersistentVolumeSource();
    buildable.setControllerExpandSecretRef(fluent.buildControllerExpandSecretRef());
    buildable.setControllerPublishSecretRef(fluent.buildControllerPublishSecretRef());
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodeExpandSecretRef(fluent.buildNodeExpandSecretRef());
    buildable.setNodePublishSecretRef(fluent.buildNodePublishSecretRef());
    buildable.setNodeStageSecretRef(fluent.buildNodeStageSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    buildable.setVolumeHandle(fluent.getVolumeHandle());
    return buildable;
  }
  
}