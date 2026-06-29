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
public class V1NonResourceRuleBuilder extends V1NonResourceRuleFluent<V1NonResourceRuleBuilder> implements VisitableBuilder<V1NonResourceRule,V1NonResourceRuleBuilder>{

  V1NonResourceRuleFluent<?> fluent;

  public V1NonResourceRuleBuilder() {
    this(new V1NonResourceRule());
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent) {
    this(fluent, new V1NonResourceRule());
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NonResourceRuleBuilder(V1NonResourceRuleFluent<?> fluent,V1NonResourceRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NonResourceRule build() {
    V1NonResourceRule buildable = new V1NonResourceRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}