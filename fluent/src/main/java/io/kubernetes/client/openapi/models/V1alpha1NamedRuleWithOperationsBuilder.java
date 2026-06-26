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
public class V1alpha1NamedRuleWithOperationsBuilder extends V1alpha1NamedRuleWithOperationsFluent<V1alpha1NamedRuleWithOperationsBuilder> implements VisitableBuilder<V1alpha1NamedRuleWithOperations,V1alpha1NamedRuleWithOperationsBuilder>{

  V1alpha1NamedRuleWithOperationsFluent<?> fluent;

  public V1alpha1NamedRuleWithOperationsBuilder() {
    this(new V1alpha1NamedRuleWithOperations());
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent) {
    this(fluent, new V1alpha1NamedRuleWithOperations());
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1NamedRuleWithOperationsBuilder(V1alpha1NamedRuleWithOperationsFluent<?> fluent,V1alpha1NamedRuleWithOperations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1NamedRuleWithOperations build() {
    V1alpha1NamedRuleWithOperations buildable = new V1alpha1NamedRuleWithOperations();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setApiVersions(fluent.getApiVersions());
    buildable.setOperations(fluent.getOperations());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  
}