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
public class V1EndpointBuilder extends V1EndpointFluent<V1EndpointBuilder> implements VisitableBuilder<V1Endpoint,V1EndpointBuilder>{

  V1EndpointFluent<?> fluent;

  public V1EndpointBuilder() {
    this(new V1Endpoint());
  }
  
  public V1EndpointBuilder(V1EndpointFluent<?> fluent) {
    this(fluent, new V1Endpoint());
  }
  
  public V1EndpointBuilder(V1Endpoint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointBuilder(V1EndpointFluent<?> fluent,V1Endpoint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Endpoint build() {
    V1Endpoint buildable = new V1Endpoint();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setConditions(fluent.buildConditions());
    buildable.setDeprecatedTopology(fluent.getDeprecatedTopology());
    buildable.setHints(fluent.buildHints());
    buildable.setHostname(fluent.getHostname());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.buildTargetRef());
    buildable.setZone(fluent.getZone());
    return buildable;
  }
  
}