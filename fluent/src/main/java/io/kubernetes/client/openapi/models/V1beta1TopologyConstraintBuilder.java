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
public class V1beta1TopologyConstraintBuilder extends V1beta1TopologyConstraintFluent<V1beta1TopologyConstraintBuilder> implements VisitableBuilder<V1beta1TopologyConstraint,V1beta1TopologyConstraintBuilder>{

  V1beta1TopologyConstraintFluent<?> fluent;

  public V1beta1TopologyConstraintBuilder() {
    this(new V1beta1TopologyConstraint());
  }
  
  public V1beta1TopologyConstraintBuilder(V1beta1TopologyConstraintFluent<?> fluent) {
    this(fluent, new V1beta1TopologyConstraint());
  }
  
  public V1beta1TopologyConstraintBuilder(V1beta1TopologyConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1TopologyConstraintBuilder(V1beta1TopologyConstraintFluent<?> fluent,V1beta1TopologyConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1TopologyConstraint build() {
    V1beta1TopologyConstraint buildable = new V1beta1TopologyConstraint();
    buildable.setKey(fluent.getKey());
    return buildable;
  }
  
}