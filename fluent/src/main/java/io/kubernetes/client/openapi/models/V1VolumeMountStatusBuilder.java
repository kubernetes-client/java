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
public class V1VolumeMountStatusBuilder extends V1VolumeMountStatusFluent<V1VolumeMountStatusBuilder> implements VisitableBuilder<V1VolumeMountStatus,V1VolumeMountStatusBuilder>{

  V1VolumeMountStatusFluent<?> fluent;

  public V1VolumeMountStatusBuilder() {
    this(new V1VolumeMountStatus());
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatusFluent<?> fluent) {
    this(fluent, new V1VolumeMountStatus());
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeMountStatusBuilder(V1VolumeMountStatusFluent<?> fluent,V1VolumeMountStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeMountStatus build() {
    V1VolumeMountStatus buildable = new V1VolumeMountStatus();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRecursiveReadOnly(fluent.getRecursiveReadOnly());
    buildable.setVolumeStatus(fluent.buildVolumeStatus());
    return buildable;
  }
  
}