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
public class V1IPAddressBuilder extends V1IPAddressFluent<V1IPAddressBuilder> implements VisitableBuilder<V1IPAddress,V1IPAddressBuilder>{

  V1IPAddressFluent<?> fluent;

  public V1IPAddressBuilder() {
    this(new V1IPAddress());
  }
  
  public V1IPAddressBuilder(V1IPAddressFluent<?> fluent) {
    this(fluent, new V1IPAddress());
  }
  
  public V1IPAddressBuilder(V1IPAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IPAddressBuilder(V1IPAddressFluent<?> fluent,V1IPAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IPAddress build() {
    V1IPAddress buildable = new V1IPAddress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}