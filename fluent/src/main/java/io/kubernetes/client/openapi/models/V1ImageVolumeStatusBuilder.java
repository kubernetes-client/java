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
public class V1ImageVolumeStatusBuilder extends V1ImageVolumeStatusFluent<V1ImageVolumeStatusBuilder> implements VisitableBuilder<V1ImageVolumeStatus,V1ImageVolumeStatusBuilder>{

  V1ImageVolumeStatusFluent<?> fluent;

  public V1ImageVolumeStatusBuilder() {
    this(new V1ImageVolumeStatus());
  }
  
  public V1ImageVolumeStatusBuilder(V1ImageVolumeStatusFluent<?> fluent) {
    this(fluent, new V1ImageVolumeStatus());
  }
  
  public V1ImageVolumeStatusBuilder(V1ImageVolumeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ImageVolumeStatusBuilder(V1ImageVolumeStatusFluent<?> fluent,V1ImageVolumeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ImageVolumeStatus build() {
    V1ImageVolumeStatus buildable = new V1ImageVolumeStatus();
    buildable.setImageRef(fluent.getImageRef());
    return buildable;
  }
  
}