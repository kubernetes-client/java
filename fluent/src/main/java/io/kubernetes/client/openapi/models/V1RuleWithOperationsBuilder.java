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
public class V1RuleWithOperationsBuilder extends V1RuleWithOperationsFluent<V1RuleWithOperationsBuilder> implements VisitableBuilder<V1RuleWithOperations,V1RuleWithOperationsBuilder>{

  V1RuleWithOperationsFluent<?> fluent;

  public V1RuleWithOperationsBuilder() {
    this(new V1RuleWithOperations());
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1RuleWithOperations());
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1RuleWithOperationsBuilder(V1RuleWithOperationsFluent<?> fluent,V1RuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1RuleWithOperations build() {
    V1RuleWithOperations buildable = new V1RuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  
}