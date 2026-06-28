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
public class V1alpha2PodGroupResourceClaimBuilder extends V1alpha2PodGroupResourceClaimFluent<V1alpha2PodGroupResourceClaimBuilder> implements VisitableBuilder<V1alpha2PodGroupResourceClaim,V1alpha2PodGroupResourceClaimBuilder>{

  V1alpha2PodGroupResourceClaimFluent<?> fluent;

  public V1alpha2PodGroupResourceClaimBuilder() {
    this(new V1alpha2PodGroupResourceClaim());
  }
  
  public V1alpha2PodGroupResourceClaimBuilder(V1alpha2PodGroupResourceClaimFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupResourceClaim());
  }
  
  public V1alpha2PodGroupResourceClaimBuilder(V1alpha2PodGroupResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupResourceClaimBuilder(V1alpha2PodGroupResourceClaimFluent<?> fluent,V1alpha2PodGroupResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupResourceClaim build() {
    V1alpha2PodGroupResourceClaim buildable = new V1alpha2PodGroupResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResourceClaimTemplateName(fluent.getResourceClaimTemplateName());
    return buildable;
  }
  
}