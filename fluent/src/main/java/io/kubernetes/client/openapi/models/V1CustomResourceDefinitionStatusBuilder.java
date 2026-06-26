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
public class V1CustomResourceDefinitionStatusBuilder extends V1CustomResourceDefinitionStatusFluent<V1CustomResourceDefinitionStatusBuilder> implements VisitableBuilder<V1CustomResourceDefinitionStatus,V1CustomResourceDefinitionStatusBuilder>{

  V1CustomResourceDefinitionStatusFluent<?> fluent;

  public V1CustomResourceDefinitionStatusBuilder() {
    this(new V1CustomResourceDefinitionStatus());
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionStatus());
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent,V1CustomResourceDefinitionStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceDefinitionStatus build() {
    V1CustomResourceDefinitionStatus buildable = new V1CustomResourceDefinitionStatus();
    buildable.setAcceptedNames(fluent.buildAcceptedNames());
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setStoredVersions(fluent.getStoredVersions());
    return buildable;
  }
  
}