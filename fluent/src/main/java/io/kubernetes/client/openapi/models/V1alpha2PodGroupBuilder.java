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
public class V1alpha2PodGroupBuilder extends V1alpha2PodGroupFluent<V1alpha2PodGroupBuilder> implements VisitableBuilder<V1alpha2PodGroup,V1alpha2PodGroupBuilder>{

  V1alpha2PodGroupFluent<?> fluent;

  public V1alpha2PodGroupBuilder() {
    this(new V1alpha2PodGroup());
  }
  
  public V1alpha2PodGroupBuilder(V1alpha2PodGroupFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroup());
  }
  
  public V1alpha2PodGroupBuilder(V1alpha2PodGroup instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupBuilder(V1alpha2PodGroupFluent<?> fluent,V1alpha2PodGroup instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroup build() {
    V1alpha2PodGroup buildable = new V1alpha2PodGroup();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}