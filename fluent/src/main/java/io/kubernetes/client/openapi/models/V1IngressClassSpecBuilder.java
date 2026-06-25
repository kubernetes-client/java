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
public class V1IngressClassSpecBuilder extends V1IngressClassSpecFluent<V1IngressClassSpecBuilder> implements VisitableBuilder<V1IngressClassSpec,V1IngressClassSpecBuilder>{

  V1IngressClassSpecFluent<?> fluent;

  public V1IngressClassSpecBuilder() {
    this(new V1IngressClassSpec());
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent) {
    this(fluent, new V1IngressClassSpec());
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent,V1IngressClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressClassSpec build() {
    V1IngressClassSpec buildable = new V1IngressClassSpec();
    buildable.setController(fluent.getController());
    buildable.setParameters(fluent.buildParameters());
    return buildable;
  }
  
}