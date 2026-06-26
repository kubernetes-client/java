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
public class V1IngressRuleBuilder extends V1IngressRuleFluent<V1IngressRuleBuilder> implements VisitableBuilder<V1IngressRule,V1IngressRuleBuilder>{

  V1IngressRuleFluent<?> fluent;

  public V1IngressRuleBuilder() {
    this(new V1IngressRule());
  }
  
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent) {
    this(fluent, new V1IngressRule());
  }
  
  public V1IngressRuleBuilder(V1IngressRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressRuleBuilder(V1IngressRuleFluent<?> fluent,V1IngressRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressRule build() {
    V1IngressRule buildable = new V1IngressRule();
    buildable.setHost(fluent.getHost());
    buildable.setHttp(fluent.buildHttp());
    return buildable;
  }
  
}