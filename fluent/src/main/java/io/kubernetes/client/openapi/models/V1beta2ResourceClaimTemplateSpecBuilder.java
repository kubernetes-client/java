/*
Copyright 2020 The Kubernetes Authors.
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
public class V1beta2ResourceClaimTemplateSpecBuilder extends V1beta2ResourceClaimTemplateSpecFluent<V1beta2ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1beta2ResourceClaimTemplateSpec,V1beta2ResourceClaimTemplateSpecBuilder>{

  V1beta2ResourceClaimTemplateSpecFluent<?> fluent;

  public V1beta2ResourceClaimTemplateSpecBuilder() {
    this(new V1beta2ResourceClaimTemplateSpec());
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimTemplateSpec());
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpecFluent<?> fluent,V1beta2ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimTemplateSpec build() {
    V1beta2ResourceClaimTemplateSpec buildable = new V1beta2ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}