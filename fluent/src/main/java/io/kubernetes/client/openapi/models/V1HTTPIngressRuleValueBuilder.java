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
public class V1HTTPIngressRuleValueBuilder extends V1HTTPIngressRuleValueFluent<V1HTTPIngressRuleValueBuilder> implements VisitableBuilder<V1HTTPIngressRuleValue,V1HTTPIngressRuleValueBuilder>{

  V1HTTPIngressRuleValueFluent<?> fluent;

  public V1HTTPIngressRuleValueBuilder() {
    this(new V1HTTPIngressRuleValue());
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent) {
    this(fluent, new V1HTTPIngressRuleValue());
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValue instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HTTPIngressRuleValueBuilder(V1HTTPIngressRuleValueFluent<?> fluent,V1HTTPIngressRuleValue instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HTTPIngressRuleValue build() {
    V1HTTPIngressRuleValue buildable = new V1HTTPIngressRuleValue();
    buildable.setPaths(fluent.buildPaths());
    return buildable;
  }
  
}