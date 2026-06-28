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
public class V1alpha3ResourcePoolStatusRequestSpecBuilder extends V1alpha3ResourcePoolStatusRequestSpecFluent<V1alpha3ResourcePoolStatusRequestSpecBuilder> implements VisitableBuilder<V1alpha3ResourcePoolStatusRequestSpec,V1alpha3ResourcePoolStatusRequestSpecBuilder>{

  V1alpha3ResourcePoolStatusRequestSpecFluent<?> fluent;

  public V1alpha3ResourcePoolStatusRequestSpecBuilder() {
    this(new V1alpha3ResourcePoolStatusRequestSpec());
  }
  
  public V1alpha3ResourcePoolStatusRequestSpecBuilder(V1alpha3ResourcePoolStatusRequestSpecFluent<?> fluent) {
    this(fluent, new V1alpha3ResourcePoolStatusRequestSpec());
  }
  
  public V1alpha3ResourcePoolStatusRequestSpecBuilder(V1alpha3ResourcePoolStatusRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3ResourcePoolStatusRequestSpecBuilder(V1alpha3ResourcePoolStatusRequestSpecFluent<?> fluent,V1alpha3ResourcePoolStatusRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3ResourcePoolStatusRequestSpec build() {
    V1alpha3ResourcePoolStatusRequestSpec buildable = new V1alpha3ResourcePoolStatusRequestSpec();
    buildable.setDriver(fluent.getDriver());
    buildable.setLimit(fluent.getLimit());
    buildable.setPoolName(fluent.getPoolName());
    return buildable;
  }
  
}