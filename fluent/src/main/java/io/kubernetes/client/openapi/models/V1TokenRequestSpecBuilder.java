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
public class V1TokenRequestSpecBuilder extends V1TokenRequestSpecFluent<V1TokenRequestSpecBuilder> implements VisitableBuilder<V1TokenRequestSpec,V1TokenRequestSpecBuilder>{

  V1TokenRequestSpecFluent<?> fluent;

  public V1TokenRequestSpecBuilder() {
    this(new V1TokenRequestSpec());
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent) {
    this(fluent, new V1TokenRequestSpec());
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent,V1TokenRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TokenRequestSpec build() {
    V1TokenRequestSpec buildable = new V1TokenRequestSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setBoundObjectRef(fluent.buildBoundObjectRef());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  
}