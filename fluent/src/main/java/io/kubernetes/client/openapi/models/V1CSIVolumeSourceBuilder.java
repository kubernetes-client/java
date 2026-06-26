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
public class V1CSIVolumeSourceBuilder extends V1CSIVolumeSourceFluent<V1CSIVolumeSourceBuilder> implements VisitableBuilder<V1CSIVolumeSource,V1CSIVolumeSourceBuilder>{

  V1CSIVolumeSourceFluent<?> fluent;

  public V1CSIVolumeSourceBuilder() {
    this(new V1CSIVolumeSource());
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CSIVolumeSource());
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent,V1CSIVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSIVolumeSource build() {
    V1CSIVolumeSource buildable = new V1CSIVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.buildNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }
  
}