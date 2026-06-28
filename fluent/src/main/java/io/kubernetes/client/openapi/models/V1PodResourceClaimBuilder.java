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
public class V1PodResourceClaimBuilder extends V1PodResourceClaimFluent<V1PodResourceClaimBuilder> implements VisitableBuilder<V1PodResourceClaim,V1PodResourceClaimBuilder>{

  V1PodResourceClaimFluent<?> fluent;

  public V1PodResourceClaimBuilder() {
    this(new V1PodResourceClaim());
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent) {
    this(fluent, new V1PodResourceClaim());
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent,V1PodResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodResourceClaim build() {
    V1PodResourceClaim buildable = new V1PodResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResourceClaimTemplateName(fluent.getResourceClaimTemplateName());
    return buildable;
  }
  
}