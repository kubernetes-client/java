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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1VolumeHealthStatusBuilder extends V1VolumeHealthStatusFluent<V1VolumeHealthStatusBuilder> implements VisitableBuilder<V1VolumeHealthStatus,V1VolumeHealthStatusBuilder>{

  V1VolumeHealthStatusFluent<?> fluent;

  public V1VolumeHealthStatusBuilder() {
    this(new V1VolumeHealthStatus());
  }
  
  public V1VolumeHealthStatusBuilder(V1VolumeHealthStatusFluent<?> fluent) {
    this(fluent, new V1VolumeHealthStatus());
  }
  
  public V1VolumeHealthStatusBuilder(V1VolumeHealthStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeHealthStatusBuilder(V1VolumeHealthStatusFluent<?> fluent,V1VolumeHealthStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeHealthStatus build() {
    V1VolumeHealthStatus buildable = new V1VolumeHealthStatus();
    buildable.setHealthConditions(fluent.buildHealthConditions());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    return buildable;
  }
  
}