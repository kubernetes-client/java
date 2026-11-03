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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1alpha3WorkloadPodGroupResourceClaimBuilder extends V1alpha3WorkloadPodGroupResourceClaimFluent<V1alpha3WorkloadPodGroupResourceClaimBuilder> implements VisitableBuilder<V1alpha3WorkloadPodGroupResourceClaim,V1alpha3WorkloadPodGroupResourceClaimBuilder>{

  V1alpha3WorkloadPodGroupResourceClaimFluent<?> fluent;

  public V1alpha3WorkloadPodGroupResourceClaimBuilder() {
    this(new V1alpha3WorkloadPodGroupResourceClaim());
  }
  
  public V1alpha3WorkloadPodGroupResourceClaimBuilder(V1alpha3WorkloadPodGroupResourceClaimFluent<?> fluent) {
    this(fluent, new V1alpha3WorkloadPodGroupResourceClaim());
  }
  
  public V1alpha3WorkloadPodGroupResourceClaimBuilder(V1alpha3WorkloadPodGroupResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3WorkloadPodGroupResourceClaimBuilder(V1alpha3WorkloadPodGroupResourceClaimFluent<?> fluent,V1alpha3WorkloadPodGroupResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3WorkloadPodGroupResourceClaim build() {
    V1alpha3WorkloadPodGroupResourceClaim buildable = new V1alpha3WorkloadPodGroupResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResourceClaimTemplateName(fluent.getResourceClaimTemplateName());
    return buildable;
  }
  
}