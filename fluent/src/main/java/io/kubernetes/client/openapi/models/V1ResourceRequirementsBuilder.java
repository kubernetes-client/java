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
public class V1ResourceRequirementsBuilder extends V1ResourceRequirementsFluent<V1ResourceRequirementsBuilder> implements VisitableBuilder<V1ResourceRequirements,V1ResourceRequirementsBuilder>{

  V1ResourceRequirementsFluent<?> fluent;

  public V1ResourceRequirementsBuilder() {
    this(new V1ResourceRequirements());
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent) {
    this(fluent, new V1ResourceRequirements());
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent,V1ResourceRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceRequirements build() {
    V1ResourceRequirements buildable = new V1ResourceRequirements();
    buildable.setClaims(fluent.buildClaims());
    buildable.setLimits(fluent.getLimits());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}