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
public class V1DaemonSetUpdateStrategyBuilder extends V1DaemonSetUpdateStrategyFluent<V1DaemonSetUpdateStrategyBuilder> implements VisitableBuilder<V1DaemonSetUpdateStrategy,V1DaemonSetUpdateStrategyBuilder>{

  V1DaemonSetUpdateStrategyFluent<?> fluent;

  public V1DaemonSetUpdateStrategyBuilder() {
    this(new V1DaemonSetUpdateStrategy());
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent) {
    this(fluent, new V1DaemonSetUpdateStrategy());
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent,V1DaemonSetUpdateStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DaemonSetUpdateStrategy build() {
    V1DaemonSetUpdateStrategy buildable = new V1DaemonSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}