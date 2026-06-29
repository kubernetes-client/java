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
public class V1CustomResourceDefinitionVersionBuilder extends V1CustomResourceDefinitionVersionFluent<V1CustomResourceDefinitionVersionBuilder> implements VisitableBuilder<V1CustomResourceDefinitionVersion,V1CustomResourceDefinitionVersionBuilder>{

  V1CustomResourceDefinitionVersionFluent<?> fluent;

  public V1CustomResourceDefinitionVersionBuilder() {
    this(new V1CustomResourceDefinitionVersion());
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersionFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionVersion());
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersionFluent<?> fluent,V1CustomResourceDefinitionVersion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceDefinitionVersion build() {
    V1CustomResourceDefinitionVersion buildable = new V1CustomResourceDefinitionVersion();
    buildable.setAdditionalPrinterColumns(fluent.buildAdditionalPrinterColumns());
    buildable.setDeprecated(fluent.getDeprecated());
    buildable.setDeprecationWarning(fluent.getDeprecationWarning());
    buildable.setName(fluent.getName());
    buildable.setSchema(fluent.buildSchema());
    buildable.setSelectableFields(fluent.buildSelectableFields());
    buildable.setServed(fluent.getServed());
    buildable.setStorage(fluent.getStorage());
    buildable.setSubresources(fluent.buildSubresources());
    return buildable;
  }
  
}