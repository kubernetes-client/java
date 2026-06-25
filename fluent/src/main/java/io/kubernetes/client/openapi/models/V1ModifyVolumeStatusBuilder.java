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
public class V1ModifyVolumeStatusBuilder extends V1ModifyVolumeStatusFluent<V1ModifyVolumeStatusBuilder> implements VisitableBuilder<V1ModifyVolumeStatus,V1ModifyVolumeStatusBuilder>{

  V1ModifyVolumeStatusFluent<?> fluent;

  public V1ModifyVolumeStatusBuilder() {
    this(new V1ModifyVolumeStatus());
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatusFluent<?> fluent) {
    this(fluent, new V1ModifyVolumeStatus());
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ModifyVolumeStatusBuilder(V1ModifyVolumeStatusFluent<?> fluent,V1ModifyVolumeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ModifyVolumeStatus build() {
    V1ModifyVolumeStatus buildable = new V1ModifyVolumeStatus();
    buildable.setStatus(fluent.getStatus());
    buildable.setTargetVolumeAttributesClassName(fluent.getTargetVolumeAttributesClassName());
    return buildable;
  }
  
}