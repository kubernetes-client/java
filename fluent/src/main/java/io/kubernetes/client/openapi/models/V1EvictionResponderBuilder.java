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
public class V1EvictionResponderBuilder extends V1EvictionResponderFluent<V1EvictionResponderBuilder> implements VisitableBuilder<V1EvictionResponder,V1EvictionResponderBuilder>{

  V1EvictionResponderFluent<?> fluent;

  public V1EvictionResponderBuilder() {
    this(new V1EvictionResponder());
  }
  
  public V1EvictionResponderBuilder(V1EvictionResponderFluent<?> fluent) {
    this(fluent, new V1EvictionResponder());
  }
  
  public V1EvictionResponderBuilder(V1EvictionResponder instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EvictionResponderBuilder(V1EvictionResponderFluent<?> fluent,V1EvictionResponder instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EvictionResponder build() {
    V1EvictionResponder buildable = new V1EvictionResponder();
    buildable.setName(fluent.getName());
    buildable.setPriority(fluent.getPriority());
    return buildable;
  }
  
}