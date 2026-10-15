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
public class V1alpha1EvictionRequestBuilder extends V1alpha1EvictionRequestFluent<V1alpha1EvictionRequestBuilder> implements VisitableBuilder<V1alpha1EvictionRequest,V1alpha1EvictionRequestBuilder>{

  V1alpha1EvictionRequestFluent<?> fluent;

  public V1alpha1EvictionRequestBuilder() {
    this(new V1alpha1EvictionRequest());
  }
  
  public V1alpha1EvictionRequestBuilder(V1alpha1EvictionRequestFluent<?> fluent) {
    this(fluent, new V1alpha1EvictionRequest());
  }
  
  public V1alpha1EvictionRequestBuilder(V1alpha1EvictionRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1EvictionRequestBuilder(V1alpha1EvictionRequestFluent<?> fluent,V1alpha1EvictionRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1EvictionRequest build() {
    V1alpha1EvictionRequest buildable = new V1alpha1EvictionRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}