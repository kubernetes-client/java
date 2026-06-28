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
public class V1CapabilitiesBuilder extends V1CapabilitiesFluent<V1CapabilitiesBuilder> implements VisitableBuilder<V1Capabilities,V1CapabilitiesBuilder>{

  V1CapabilitiesFluent<?> fluent;

  public V1CapabilitiesBuilder() {
    this(new V1Capabilities());
  }
  
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent) {
    this(fluent, new V1Capabilities());
  }
  
  public V1CapabilitiesBuilder(V1Capabilities instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent,V1Capabilities instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Capabilities build() {
    V1Capabilities buildable = new V1Capabilities();
    buildable.setAdd(fluent.getAdd());
    buildable.setDrop(fluent.getDrop());
    return buildable;
  }
  
}