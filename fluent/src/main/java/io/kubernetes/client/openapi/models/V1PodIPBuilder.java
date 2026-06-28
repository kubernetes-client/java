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
public class V1PodIPBuilder extends V1PodIPFluent<V1PodIPBuilder> implements VisitableBuilder<V1PodIP,V1PodIPBuilder>{

  V1PodIPFluent<?> fluent;

  public V1PodIPBuilder() {
    this(new V1PodIP());
  }
  
  public V1PodIPBuilder(V1PodIPFluent<?> fluent) {
    this(fluent, new V1PodIP());
  }
  
  public V1PodIPBuilder(V1PodIP instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodIPBuilder(V1PodIPFluent<?> fluent,V1PodIP instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodIP build() {
    V1PodIP buildable = new V1PodIP();
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  
}