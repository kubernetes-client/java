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
public class V1APIServiceConditionBuilder extends V1APIServiceConditionFluent<V1APIServiceConditionBuilder> implements VisitableBuilder<V1APIServiceCondition,V1APIServiceConditionBuilder>{

  V1APIServiceConditionFluent<?> fluent;

  public V1APIServiceConditionBuilder() {
    this(new V1APIServiceCondition());
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent) {
    this(fluent, new V1APIServiceCondition());
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent,V1APIServiceCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIServiceCondition build() {
    V1APIServiceCondition buildable = new V1APIServiceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}