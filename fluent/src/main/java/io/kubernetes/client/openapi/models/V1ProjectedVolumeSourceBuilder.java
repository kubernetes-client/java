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
public class V1ProjectedVolumeSourceBuilder extends V1ProjectedVolumeSourceFluent<V1ProjectedVolumeSourceBuilder> implements VisitableBuilder<V1ProjectedVolumeSource,V1ProjectedVolumeSourceBuilder>{

  V1ProjectedVolumeSourceFluent<?> fluent;

  public V1ProjectedVolumeSourceBuilder() {
    this(new V1ProjectedVolumeSource());
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ProjectedVolumeSource());
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent,V1ProjectedVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ProjectedVolumeSource build() {
    V1ProjectedVolumeSource buildable = new V1ProjectedVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setSources(fluent.buildSources());
    return buildable;
  }
  
}