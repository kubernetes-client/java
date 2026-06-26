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
public class V1PolicyRuleBuilder extends V1PolicyRuleFluent<V1PolicyRuleBuilder> implements VisitableBuilder<V1PolicyRule,V1PolicyRuleBuilder>{

  V1PolicyRuleFluent<?> fluent;

  public V1PolicyRuleBuilder() {
    this(new V1PolicyRule());
  }
  
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent) {
    this(fluent, new V1PolicyRule());
  }
  
  public V1PolicyRuleBuilder(V1PolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PolicyRuleBuilder(V1PolicyRuleFluent<?> fluent,V1PolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PolicyRule build() {
    V1PolicyRule buildable = new V1PolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  
}