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
public class V1ReplicationControllerSpecBuilder extends V1ReplicationControllerSpecFluent<V1ReplicationControllerSpecBuilder> implements VisitableBuilder<V1ReplicationControllerSpec,V1ReplicationControllerSpecBuilder>{

  V1ReplicationControllerSpecFluent<?> fluent;

  public V1ReplicationControllerSpecBuilder() {
    this(new V1ReplicationControllerSpec());
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerSpec());
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent,V1ReplicationControllerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ReplicationControllerSpec build() {
    V1ReplicationControllerSpec buildable = new V1ReplicationControllerSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  
}