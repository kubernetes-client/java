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
public class V1ServiceCIDRBuilder extends V1ServiceCIDRFluent<V1ServiceCIDRBuilder> implements VisitableBuilder<V1ServiceCIDR,V1ServiceCIDRBuilder>{

  V1ServiceCIDRFluent<?> fluent;

  public V1ServiceCIDRBuilder() {
    this(new V1ServiceCIDR());
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDRFluent<?> fluent) {
    this(fluent, new V1ServiceCIDR());
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDR instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceCIDRBuilder(V1ServiceCIDRFluent<?> fluent,V1ServiceCIDR instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceCIDR build() {
    V1ServiceCIDR buildable = new V1ServiceCIDR();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}