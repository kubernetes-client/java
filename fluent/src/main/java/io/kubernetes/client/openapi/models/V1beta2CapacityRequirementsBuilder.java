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
public class V1beta2CapacityRequirementsBuilder extends V1beta2CapacityRequirementsFluent<V1beta2CapacityRequirementsBuilder> implements VisitableBuilder<V1beta2CapacityRequirements,V1beta2CapacityRequirementsBuilder>{

  V1beta2CapacityRequirementsFluent<?> fluent;

  public V1beta2CapacityRequirementsBuilder() {
    this(new V1beta2CapacityRequirements());
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirementsFluent<?> fluent) {
    this(fluent, new V1beta2CapacityRequirements());
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirementsFluent<?> fluent,V1beta2CapacityRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2CapacityRequirements build() {
    V1beta2CapacityRequirements buildable = new V1beta2CapacityRequirements();
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}