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
public class V1IngressStatusBuilder extends V1IngressStatusFluent<V1IngressStatusBuilder> implements VisitableBuilder<V1IngressStatus,V1IngressStatusBuilder>{

  V1IngressStatusFluent<?> fluent;

  public V1IngressStatusBuilder() {
    this(new V1IngressStatus());
  }
  
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent) {
    this(fluent, new V1IngressStatus());
  }
  
  public V1IngressStatusBuilder(V1IngressStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent,V1IngressStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressStatus build() {
    V1IngressStatus buildable = new V1IngressStatus();
    buildable.setLoadBalancer(fluent.buildLoadBalancer());
    return buildable;
  }
  
}