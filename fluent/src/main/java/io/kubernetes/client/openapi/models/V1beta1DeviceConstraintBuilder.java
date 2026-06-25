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
public class V1beta1DeviceConstraintBuilder extends V1beta1DeviceConstraintFluent<V1beta1DeviceConstraintBuilder> implements VisitableBuilder<V1beta1DeviceConstraint,V1beta1DeviceConstraintBuilder>{

  V1beta1DeviceConstraintFluent<?> fluent;

  public V1beta1DeviceConstraintBuilder() {
    this(new V1beta1DeviceConstraint());
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraintFluent<?> fluent) {
    this(fluent, new V1beta1DeviceConstraint());
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraintFluent<?> fluent,V1beta1DeviceConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceConstraint build() {
    V1beta1DeviceConstraint buildable = new V1beta1DeviceConstraint();
    buildable.setDistinctAttribute(fluent.getDistinctAttribute());
    buildable.setMatchAttribute(fluent.getMatchAttribute());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}