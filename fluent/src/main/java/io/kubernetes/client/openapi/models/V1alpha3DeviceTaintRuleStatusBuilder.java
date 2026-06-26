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
public class V1alpha3DeviceTaintRuleStatusBuilder extends V1alpha3DeviceTaintRuleStatusFluent<V1alpha3DeviceTaintRuleStatusBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRuleStatus,V1alpha3DeviceTaintRuleStatusBuilder>{

  V1alpha3DeviceTaintRuleStatusFluent<?> fluent;

  public V1alpha3DeviceTaintRuleStatusBuilder() {
    this(new V1alpha3DeviceTaintRuleStatus());
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatusFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRuleStatus());
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleStatusBuilder(V1alpha3DeviceTaintRuleStatusFluent<?> fluent,V1alpha3DeviceTaintRuleStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaintRuleStatus build() {
    V1alpha3DeviceTaintRuleStatus buildable = new V1alpha3DeviceTaintRuleStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}