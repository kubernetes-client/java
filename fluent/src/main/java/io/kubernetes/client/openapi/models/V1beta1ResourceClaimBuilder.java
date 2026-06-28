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
public class V1beta1ResourceClaimBuilder extends V1beta1ResourceClaimFluent<V1beta1ResourceClaimBuilder> implements VisitableBuilder<V1beta1ResourceClaim,V1beta1ResourceClaimBuilder>{

  V1beta1ResourceClaimFluent<?> fluent;

  public V1beta1ResourceClaimBuilder() {
    this(new V1beta1ResourceClaim());
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaimFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaim());
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaimFluent<?> fluent,V1beta1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1ResourceClaim build() {
    V1beta1ResourceClaim buildable = new V1beta1ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}