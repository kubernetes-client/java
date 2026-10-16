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
public class V1alpha1EvictionRequestSpecBuilder extends V1alpha1EvictionRequestSpecFluent<V1alpha1EvictionRequestSpecBuilder> implements VisitableBuilder<V1alpha1EvictionRequestSpec,V1alpha1EvictionRequestSpecBuilder>{

  V1alpha1EvictionRequestSpecFluent<?> fluent;

  public V1alpha1EvictionRequestSpecBuilder() {
    this(new V1alpha1EvictionRequestSpec());
  }
  
  public V1alpha1EvictionRequestSpecBuilder(V1alpha1EvictionRequestSpecFluent<?> fluent) {
    this(fluent, new V1alpha1EvictionRequestSpec());
  }
  
  public V1alpha1EvictionRequestSpecBuilder(V1alpha1EvictionRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1EvictionRequestSpecBuilder(V1alpha1EvictionRequestSpecFluent<?> fluent,V1alpha1EvictionRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1EvictionRequestSpec build() {
    V1alpha1EvictionRequestSpec buildable = new V1alpha1EvictionRequestSpec();
    buildable.setIntent(fluent.getIntent());
    buildable.setRequester(fluent.getRequester());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  
}