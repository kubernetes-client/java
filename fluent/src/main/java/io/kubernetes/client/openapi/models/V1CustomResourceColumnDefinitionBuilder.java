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
public class V1CustomResourceColumnDefinitionBuilder extends V1CustomResourceColumnDefinitionFluent<V1CustomResourceColumnDefinitionBuilder> implements VisitableBuilder<V1CustomResourceColumnDefinition,V1CustomResourceColumnDefinitionBuilder>{

  V1CustomResourceColumnDefinitionFluent<?> fluent;

  public V1CustomResourceColumnDefinitionBuilder() {
    this(new V1CustomResourceColumnDefinition());
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent) {
    this(fluent, new V1CustomResourceColumnDefinition());
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent,V1CustomResourceColumnDefinition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceColumnDefinition build() {
    V1CustomResourceColumnDefinition buildable = new V1CustomResourceColumnDefinition();
    buildable.setDescription(fluent.getDescription());
    buildable.setFormat(fluent.getFormat());
    buildable.setJsonPath(fluent.getJsonPath());
    buildable.setName(fluent.getName());
    buildable.setPriority(fluent.getPriority());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}