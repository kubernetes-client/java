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
public class V1WorkloadReferenceBuilder extends V1WorkloadReferenceFluent<V1WorkloadReferenceBuilder> implements VisitableBuilder<V1WorkloadReference,V1WorkloadReferenceBuilder>{

  V1WorkloadReferenceFluent<?> fluent;

  public V1WorkloadReferenceBuilder() {
    this(new V1WorkloadReference());
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReferenceFluent<?> fluent) {
    this(fluent, new V1WorkloadReference());
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReferenceFluent<?> fluent,V1WorkloadReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1WorkloadReference build() {
    V1WorkloadReference buildable = new V1WorkloadReference();
    buildable.setName(fluent.getName());
    buildable.setPodGroup(fluent.getPodGroup());
    buildable.setPodGroupReplicaKey(fluent.getPodGroupReplicaKey());
    return buildable;
  }
  
}