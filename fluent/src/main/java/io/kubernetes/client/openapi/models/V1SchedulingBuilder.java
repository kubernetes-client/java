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
public class V1SchedulingBuilder extends V1SchedulingFluent<V1SchedulingBuilder> implements VisitableBuilder<V1Scheduling,V1SchedulingBuilder>{

  V1SchedulingFluent<?> fluent;

  public V1SchedulingBuilder() {
    this(new V1Scheduling());
  }
  
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent) {
    this(fluent, new V1Scheduling());
  }
  
  public V1SchedulingBuilder(V1Scheduling instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent,V1Scheduling instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Scheduling build() {
    V1Scheduling buildable = new V1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  
}