/*
Copyright 2026 The Kubernetes Authors.
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
public class V1LocalVolumeSourceBuilder extends V1LocalVolumeSourceFluent<V1LocalVolumeSourceBuilder> implements VisitableBuilder<V1LocalVolumeSource,V1LocalVolumeSourceBuilder>{

  V1LocalVolumeSourceFluent<?> fluent;

  public V1LocalVolumeSourceBuilder() {
    this(new V1LocalVolumeSource());
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent) {
    this(fluent, new V1LocalVolumeSource());
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent,V1LocalVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LocalVolumeSource build() {
    V1LocalVolumeSource buildable = new V1LocalVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  
}