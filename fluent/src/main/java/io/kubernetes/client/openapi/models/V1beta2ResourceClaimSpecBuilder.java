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
public class V1beta2ResourceClaimSpecBuilder extends V1beta2ResourceClaimSpecFluent<V1beta2ResourceClaimSpecBuilder> implements VisitableBuilder<V1beta2ResourceClaimSpec,V1beta2ResourceClaimSpecBuilder>{

  V1beta2ResourceClaimSpecFluent<?> fluent;

  public V1beta2ResourceClaimSpecBuilder() {
    this(new V1beta2ResourceClaimSpec());
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimSpec());
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpecFluent<?> fluent,V1beta2ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimSpec build() {
    V1beta2ResourceClaimSpec buildable = new V1beta2ResourceClaimSpec();
    buildable.setDevices(fluent.buildDevices());
    return buildable;
  }
  
}