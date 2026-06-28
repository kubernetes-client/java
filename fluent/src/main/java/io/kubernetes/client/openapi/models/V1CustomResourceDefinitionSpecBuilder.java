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
public class V1CustomResourceDefinitionSpecBuilder extends V1CustomResourceDefinitionSpecFluent<V1CustomResourceDefinitionSpecBuilder> implements VisitableBuilder<V1CustomResourceDefinitionSpec,V1CustomResourceDefinitionSpecBuilder>{

  V1CustomResourceDefinitionSpecFluent<?> fluent;

  public V1CustomResourceDefinitionSpecBuilder() {
    this(new V1CustomResourceDefinitionSpec());
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionSpec());
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent,V1CustomResourceDefinitionSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceDefinitionSpec build() {
    V1CustomResourceDefinitionSpec buildable = new V1CustomResourceDefinitionSpec();
    buildable.setConversion(fluent.buildConversion());
    buildable.setGroup(fluent.getGroup());
    buildable.setNames(fluent.buildNames());
    buildable.setPreserveUnknownFields(fluent.getPreserveUnknownFields());
    buildable.setScope(fluent.getScope());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  
}