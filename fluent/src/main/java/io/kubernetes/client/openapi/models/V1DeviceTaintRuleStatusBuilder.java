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
public class V1DeviceTaintRuleStatusBuilder extends V1DeviceTaintRuleStatusFluent<V1DeviceTaintRuleStatusBuilder> implements VisitableBuilder<V1DeviceTaintRuleStatus,V1DeviceTaintRuleStatusBuilder>{

  V1DeviceTaintRuleStatusFluent<?> fluent;

  public V1DeviceTaintRuleStatusBuilder() {
    this(new V1DeviceTaintRuleStatus());
  }
  
  public V1DeviceTaintRuleStatusBuilder(V1DeviceTaintRuleStatusFluent<?> fluent) {
    this(fluent, new V1DeviceTaintRuleStatus());
  }
  
  public V1DeviceTaintRuleStatusBuilder(V1DeviceTaintRuleStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceTaintRuleStatusBuilder(V1DeviceTaintRuleStatusFluent<?> fluent,V1DeviceTaintRuleStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceTaintRuleStatus build() {
    V1DeviceTaintRuleStatus buildable = new V1DeviceTaintRuleStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}