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
public class V1alpha3DeviceTaintRuleSpecBuilder extends V1alpha3DeviceTaintRuleSpecFluent<V1alpha3DeviceTaintRuleSpecBuilder> implements VisitableBuilder<V1alpha3DeviceTaintRuleSpec,V1alpha3DeviceTaintRuleSpecBuilder>{

  V1alpha3DeviceTaintRuleSpecFluent<?> fluent;

  public V1alpha3DeviceTaintRuleSpecBuilder() {
    this(new V1alpha3DeviceTaintRuleSpec());
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpecFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintRuleSpec());
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintRuleSpecBuilder(V1alpha3DeviceTaintRuleSpecFluent<?> fluent,V1alpha3DeviceTaintRuleSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaintRuleSpec build() {
    V1alpha3DeviceTaintRuleSpec buildable = new V1alpha3DeviceTaintRuleSpec();
    buildable.setDeviceSelector(fluent.buildDeviceSelector());
    buildable.setTaint(fluent.buildTaint());
    return buildable;
  }
  
}