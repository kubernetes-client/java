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
public class V1CustomResourceDefinitionNamesBuilder extends V1CustomResourceDefinitionNamesFluent<V1CustomResourceDefinitionNamesBuilder> implements VisitableBuilder<V1CustomResourceDefinitionNames,V1CustomResourceDefinitionNamesBuilder>{

  V1CustomResourceDefinitionNamesFluent<?> fluent;

  public V1CustomResourceDefinitionNamesBuilder() {
    this(new V1CustomResourceDefinitionNames());
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionNames());
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNames instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent,V1CustomResourceDefinitionNames instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceDefinitionNames build() {
    V1CustomResourceDefinitionNames buildable = new V1CustomResourceDefinitionNames();
    buildable.setCategories(fluent.getCategories());
    buildable.setKind(fluent.getKind());
    buildable.setListKind(fluent.getListKind());
    buildable.setPlural(fluent.getPlural());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setSingular(fluent.getSingular());
    return buildable;
  }
  
}