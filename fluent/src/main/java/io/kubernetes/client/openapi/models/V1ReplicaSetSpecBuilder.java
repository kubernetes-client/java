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
public class V1ReplicaSetSpecBuilder extends V1ReplicaSetSpecFluent<V1ReplicaSetSpecBuilder> implements VisitableBuilder<V1ReplicaSetSpec,V1ReplicaSetSpecBuilder>{

  V1ReplicaSetSpecFluent<?> fluent;

  public V1ReplicaSetSpecBuilder() {
    this(new V1ReplicaSetSpec());
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent) {
    this(fluent, new V1ReplicaSetSpec());
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent,V1ReplicaSetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ReplicaSetSpec build() {
    V1ReplicaSetSpec buildable = new V1ReplicaSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.buildSelector());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  
}