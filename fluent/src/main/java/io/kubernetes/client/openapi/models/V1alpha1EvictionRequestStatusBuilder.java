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
public class V1alpha1EvictionRequestStatusBuilder extends V1alpha1EvictionRequestStatusFluent<V1alpha1EvictionRequestStatusBuilder> implements VisitableBuilder<V1alpha1EvictionRequestStatus,V1alpha1EvictionRequestStatusBuilder>{

  V1alpha1EvictionRequestStatusFluent<?> fluent;

  public V1alpha1EvictionRequestStatusBuilder() {
    this(new V1alpha1EvictionRequestStatus());
  }
  
  public V1alpha1EvictionRequestStatusBuilder(V1alpha1EvictionRequestStatusFluent<?> fluent) {
    this(fluent, new V1alpha1EvictionRequestStatus());
  }
  
  public V1alpha1EvictionRequestStatusBuilder(V1alpha1EvictionRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1EvictionRequestStatusBuilder(V1alpha1EvictionRequestStatusFluent<?> fluent,V1alpha1EvictionRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1EvictionRequestStatus build() {
    V1alpha1EvictionRequestStatus buildable = new V1alpha1EvictionRequestStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}