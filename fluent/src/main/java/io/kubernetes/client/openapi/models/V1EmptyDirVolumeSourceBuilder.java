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
public class V1EmptyDirVolumeSourceBuilder extends V1EmptyDirVolumeSourceFluent<V1EmptyDirVolumeSourceBuilder> implements VisitableBuilder<V1EmptyDirVolumeSource,V1EmptyDirVolumeSourceBuilder>{

  V1EmptyDirVolumeSourceFluent<?> fluent;

  public V1EmptyDirVolumeSourceBuilder() {
    this(new V1EmptyDirVolumeSource());
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent) {
    this(fluent, new V1EmptyDirVolumeSource());
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent,V1EmptyDirVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EmptyDirVolumeSource build() {
    V1EmptyDirVolumeSource buildable = new V1EmptyDirVolumeSource();
    buildable.setMedium(fluent.getMedium());
    buildable.setSizeLimit(fluent.getSizeLimit());
    return buildable;
  }
  
}