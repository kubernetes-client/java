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
public class V1FCVolumeSourceBuilder extends V1FCVolumeSourceFluent<V1FCVolumeSourceBuilder> implements VisitableBuilder<V1FCVolumeSource,V1FCVolumeSourceBuilder>{

  V1FCVolumeSourceFluent<?> fluent;

  public V1FCVolumeSourceBuilder() {
    this(new V1FCVolumeSource());
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FCVolumeSource());
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent,V1FCVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FCVolumeSource build() {
    V1FCVolumeSource buildable = new V1FCVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setLun(fluent.getLun());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setTargetWWNs(fluent.getTargetWWNs());
    buildable.setWwids(fluent.getWwids());
    return buildable;
  }
  
}