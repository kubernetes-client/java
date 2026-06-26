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
public class V1EndpointHintsBuilder extends V1EndpointHintsFluent<V1EndpointHintsBuilder> implements VisitableBuilder<V1EndpointHints,V1EndpointHintsBuilder>{

  V1EndpointHintsFluent<?> fluent;

  public V1EndpointHintsBuilder() {
    this(new V1EndpointHints());
  }
  
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent) {
    this(fluent, new V1EndpointHints());
  }
  
  public V1EndpointHintsBuilder(V1EndpointHints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent,V1EndpointHints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EndpointHints build() {
    V1EndpointHints buildable = new V1EndpointHints();
    buildable.setForNodes(fluent.buildForNodes());
    buildable.setForZones(fluent.buildForZones());
    return buildable;
  }
  
}