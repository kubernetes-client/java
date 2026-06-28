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
public class V1NodeSelectorRequirementBuilder extends V1NodeSelectorRequirementFluent<V1NodeSelectorRequirementBuilder> implements VisitableBuilder<V1NodeSelectorRequirement,V1NodeSelectorRequirementBuilder>{

  V1NodeSelectorRequirementFluent<?> fluent;

  public V1NodeSelectorRequirementBuilder() {
    this(new V1NodeSelectorRequirement());
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent) {
    this(fluent, new V1NodeSelectorRequirement());
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent,V1NodeSelectorRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSelectorRequirement build() {
    V1NodeSelectorRequirement buildable = new V1NodeSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}