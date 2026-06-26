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
public class V1EventSourceBuilder extends V1EventSourceFluent<V1EventSourceBuilder> implements VisitableBuilder<V1EventSource,V1EventSourceBuilder>{

  V1EventSourceFluent<?> fluent;

  public V1EventSourceBuilder() {
    this(new V1EventSource());
  }
  
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent) {
    this(fluent, new V1EventSource());
  }
  
  public V1EventSourceBuilder(V1EventSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EventSourceBuilder(V1EventSourceFluent<?> fluent,V1EventSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }
  
}