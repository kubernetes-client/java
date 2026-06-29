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
public class V1NFSVolumeSourceBuilder extends V1NFSVolumeSourceFluent<V1NFSVolumeSourceBuilder> implements VisitableBuilder<V1NFSVolumeSource,V1NFSVolumeSourceBuilder>{

  V1NFSVolumeSourceFluent<?> fluent;

  public V1NFSVolumeSourceBuilder() {
    this(new V1NFSVolumeSource());
  }
  
  public V1NFSVolumeSourceBuilder(V1NFSVolumeSourceFluent<?> fluent) {
    this(fluent, new V1NFSVolumeSource());
  }
  
  public V1NFSVolumeSourceBuilder(V1NFSVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NFSVolumeSourceBuilder(V1NFSVolumeSourceFluent<?> fluent,V1NFSVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NFSVolumeSource build() {
    V1NFSVolumeSource buildable = new V1NFSVolumeSource();
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setServer(fluent.getServer());
    return buildable;
  }
  
}