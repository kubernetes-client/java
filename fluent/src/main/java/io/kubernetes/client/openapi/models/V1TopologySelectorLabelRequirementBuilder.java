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
public class V1TopologySelectorLabelRequirementBuilder extends V1TopologySelectorLabelRequirementFluent<V1TopologySelectorLabelRequirementBuilder> implements VisitableBuilder<V1TopologySelectorLabelRequirement,V1TopologySelectorLabelRequirementBuilder>{

  V1TopologySelectorLabelRequirementFluent<?> fluent;

  public V1TopologySelectorLabelRequirementBuilder() {
    this(new V1TopologySelectorLabelRequirement());
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirementFluent<?> fluent) {
    this(fluent, new V1TopologySelectorLabelRequirement());
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirementFluent<?> fluent,V1TopologySelectorLabelRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TopologySelectorLabelRequirement build() {
    V1TopologySelectorLabelRequirement buildable = new V1TopologySelectorLabelRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}