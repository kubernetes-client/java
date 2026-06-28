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
public class V1alpha2PodGroupSchedulingConstraintsBuilder extends V1alpha2PodGroupSchedulingConstraintsFluent<V1alpha2PodGroupSchedulingConstraintsBuilder> implements VisitableBuilder<V1alpha2PodGroupSchedulingConstraints,V1alpha2PodGroupSchedulingConstraintsBuilder>{

  V1alpha2PodGroupSchedulingConstraintsFluent<?> fluent;

  public V1alpha2PodGroupSchedulingConstraintsBuilder() {
    this(new V1alpha2PodGroupSchedulingConstraints());
  }
  
  public V1alpha2PodGroupSchedulingConstraintsBuilder(V1alpha2PodGroupSchedulingConstraintsFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupSchedulingConstraints());
  }
  
  public V1alpha2PodGroupSchedulingConstraintsBuilder(V1alpha2PodGroupSchedulingConstraints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupSchedulingConstraintsBuilder(V1alpha2PodGroupSchedulingConstraintsFluent<?> fluent,V1alpha2PodGroupSchedulingConstraints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupSchedulingConstraints build() {
    V1alpha2PodGroupSchedulingConstraints buildable = new V1alpha2PodGroupSchedulingConstraints();
    buildable.setTopology(fluent.buildTopology());
    return buildable;
  }
  
}