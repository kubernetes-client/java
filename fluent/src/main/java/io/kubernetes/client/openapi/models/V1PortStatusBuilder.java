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
public class V1PortStatusBuilder extends V1PortStatusFluent<V1PortStatusBuilder> implements VisitableBuilder<V1PortStatus,V1PortStatusBuilder>{

  V1PortStatusFluent<?> fluent;

  public V1PortStatusBuilder() {
    this(new V1PortStatus());
  }
  
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent) {
    this(fluent, new V1PortStatus());
  }
  
  public V1PortStatusBuilder(V1PortStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PortStatusBuilder(V1PortStatusFluent<?> fluent,V1PortStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}