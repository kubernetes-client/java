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
public class V1CounterSetBuilder extends V1CounterSetFluent<V1CounterSetBuilder> implements VisitableBuilder<V1CounterSet,V1CounterSetBuilder>{

  V1CounterSetFluent<?> fluent;

  public V1CounterSetBuilder() {
    this(new V1CounterSet());
  }
  
  public V1CounterSetBuilder(V1CounterSetFluent<?> fluent) {
    this(fluent, new V1CounterSet());
  }
  
  public V1CounterSetBuilder(V1CounterSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CounterSetBuilder(V1CounterSetFluent<?> fluent,V1CounterSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CounterSet build() {
    V1CounterSet buildable = new V1CounterSet();
    buildable.setCounters(fluent.getCounters());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}