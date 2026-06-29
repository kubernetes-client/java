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
public class V1IngressSpecBuilder extends V1IngressSpecFluent<V1IngressSpecBuilder> implements VisitableBuilder<V1IngressSpec,V1IngressSpecBuilder>{

  V1IngressSpecFluent<?> fluent;

  public V1IngressSpecBuilder() {
    this(new V1IngressSpec());
  }
  
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent) {
    this(fluent, new V1IngressSpec());
  }
  
  public V1IngressSpecBuilder(V1IngressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent,V1IngressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressSpec build() {
    V1IngressSpec buildable = new V1IngressSpec();
    buildable.setDefaultBackend(fluent.buildDefaultBackend());
    buildable.setIngressClassName(fluent.getIngressClassName());
    buildable.setRules(fluent.buildRules());
    buildable.setTls(fluent.buildTls());
    return buildable;
  }
  
}