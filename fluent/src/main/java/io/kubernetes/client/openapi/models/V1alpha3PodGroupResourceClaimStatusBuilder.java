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
public class V1alpha3PodGroupResourceClaimStatusBuilder extends V1alpha3PodGroupResourceClaimStatusFluent<V1alpha3PodGroupResourceClaimStatusBuilder> implements VisitableBuilder<V1alpha3PodGroupResourceClaimStatus,V1alpha3PodGroupResourceClaimStatusBuilder>{

  V1alpha3PodGroupResourceClaimStatusFluent<?> fluent;

  public V1alpha3PodGroupResourceClaimStatusBuilder() {
    this(new V1alpha3PodGroupResourceClaimStatus());
  }
  
  public V1alpha3PodGroupResourceClaimStatusBuilder(V1alpha3PodGroupResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1alpha3PodGroupResourceClaimStatus());
  }
  
  public V1alpha3PodGroupResourceClaimStatusBuilder(V1alpha3PodGroupResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3PodGroupResourceClaimStatusBuilder(V1alpha3PodGroupResourceClaimStatusFluent<?> fluent,V1alpha3PodGroupResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3PodGroupResourceClaimStatus build() {
    V1alpha3PodGroupResourceClaimStatus buildable = new V1alpha3PodGroupResourceClaimStatus();
    buildable.setName(fluent.getName());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    return buildable;
  }
  
}