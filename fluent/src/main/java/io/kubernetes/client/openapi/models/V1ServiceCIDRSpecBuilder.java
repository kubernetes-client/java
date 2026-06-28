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
public class V1ServiceCIDRSpecBuilder extends V1ServiceCIDRSpecFluent<V1ServiceCIDRSpecBuilder> implements VisitableBuilder<V1ServiceCIDRSpec,V1ServiceCIDRSpecBuilder>{

  V1ServiceCIDRSpecFluent<?> fluent;

  public V1ServiceCIDRSpecBuilder() {
    this(new V1ServiceCIDRSpec());
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpecFluent<?> fluent) {
    this(fluent, new V1ServiceCIDRSpec());
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpecFluent<?> fluent,V1ServiceCIDRSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ServiceCIDRSpec build() {
    V1ServiceCIDRSpec buildable = new V1ServiceCIDRSpec();
    buildable.setCidrs(fluent.getCidrs());
    return buildable;
  }
  
}