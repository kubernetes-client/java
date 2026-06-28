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
public class V1CounterBuilder extends V1CounterFluent<V1CounterBuilder> implements VisitableBuilder<V1Counter,V1CounterBuilder>{

  V1CounterFluent<?> fluent;

  public V1CounterBuilder() {
    this(new V1Counter());
  }
  
  public V1CounterBuilder(V1CounterFluent<?> fluent) {
    this(fluent, new V1Counter());
  }
  
  public V1CounterBuilder(V1Counter instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CounterBuilder(V1CounterFluent<?> fluent,V1Counter instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Counter build() {
    V1Counter buildable = new V1Counter();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}