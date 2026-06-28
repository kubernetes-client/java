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
public class V1VolumeStatusBuilder extends V1VolumeStatusFluent<V1VolumeStatusBuilder> implements VisitableBuilder<V1VolumeStatus,V1VolumeStatusBuilder>{

  V1VolumeStatusFluent<?> fluent;

  public V1VolumeStatusBuilder() {
    this(new V1VolumeStatus());
  }
  
  public V1VolumeStatusBuilder(V1VolumeStatusFluent<?> fluent) {
    this(fluent, new V1VolumeStatus());
  }
  
  public V1VolumeStatusBuilder(V1VolumeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeStatusBuilder(V1VolumeStatusFluent<?> fluent,V1VolumeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeStatus build() {
    V1VolumeStatus buildable = new V1VolumeStatus();
    buildable.setImage(fluent.buildImage());
    return buildable;
  }
  
}