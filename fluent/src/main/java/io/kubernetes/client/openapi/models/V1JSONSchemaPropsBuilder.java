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
public class V1JSONSchemaPropsBuilder extends V1JSONSchemaPropsFluent<V1JSONSchemaPropsBuilder> implements VisitableBuilder<V1JSONSchemaProps,V1JSONSchemaPropsBuilder>{

  V1JSONSchemaPropsFluent<?> fluent;

  public V1JSONSchemaPropsBuilder() {
    this(new V1JSONSchemaProps());
  }
  
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent) {
    this(fluent, new V1JSONSchemaProps());
  }
  
  public V1JSONSchemaPropsBuilder(V1JSONSchemaProps instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JSONSchemaPropsBuilder(V1JSONSchemaPropsFluent<?> fluent,V1JSONSchemaProps instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JSONSchemaProps build() {
    V1JSONSchemaProps buildable = new V1JSONSchemaProps();
    buildable.set$Ref(fluent.getRef());
    buildable.set$Schema(fluent.getSchema());
    buildable.setAdditionalItems(fluent.getAdditionalItems());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    buildable.setAllOf(fluent.buildAllOf());
    buildable.setAnyOf(fluent.buildAnyOf());
    buildable.setDefault(fluent.getDefault());
    buildable.setDefinitions(fluent.getDefinitions());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setDescription(fluent.getDescription());
    buildable.setEnum(fluent.getEnum());
    buildable.setExample(fluent.getExample());
    buildable.setExclusiveMaximum(fluent.getExclusiveMaximum());
    buildable.setExclusiveMinimum(fluent.getExclusiveMinimum());
    buildable.setExternalDocs(fluent.buildExternalDocs());
    buildable.setFormat(fluent.getFormat());
    buildable.setId(fluent.getId());
    buildable.setItems(fluent.getItems());
    buildable.setMaxItems(fluent.getMaxItems());
    buildable.setMaxLength(fluent.getMaxLength());
    buildable.setMaxProperties(fluent.getMaxProperties());
    buildable.setMaximum(fluent.getMaximum());
    buildable.setMinItems(fluent.getMinItems());
    buildable.setMinLength(fluent.getMinLength());
    buildable.setMinProperties(fluent.getMinProperties());
    buildable.setMinimum(fluent.getMinimum());
    buildable.setMultipleOf(fluent.getMultipleOf());
    buildable.setNot(fluent.buildNot());
    buildable.setNullable(fluent.getNullable());
    buildable.setOneOf(fluent.buildOneOf());
    buildable.setPattern(fluent.getPattern());
    buildable.setPatternProperties(fluent.getPatternProperties());
    buildable.setProperties(fluent.getProperties());
    buildable.setRequired(fluent.getRequired());
    buildable.setTitle(fluent.getTitle());
    buildable.setType(fluent.getType());
    buildable.setUniqueItems(fluent.getUniqueItems());
    return buildable;
  }
  
}