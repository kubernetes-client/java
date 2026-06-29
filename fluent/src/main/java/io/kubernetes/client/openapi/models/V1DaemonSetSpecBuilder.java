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
public class V1DaemonSetSpecBuilder extends V1DaemonSetSpecFluent<V1DaemonSetSpecBuilder> implements VisitableBuilder<V1DaemonSetSpec,V1DaemonSetSpecBuilder>{

  V1DaemonSetSpecFluent<?> fluent;

  public V1DaemonSetSpecBuilder() {
    this(new V1DaemonSetSpec());
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent) {
    this(fluent, new V1DaemonSetSpec());
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent,V1DaemonSetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DaemonSetSpec build() {
    V1DaemonSetSpec buildable = new V1DaemonSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.buildSelector());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setUpdateStrategy(fluent.buildUpdateStrategy());
    return buildable;
  }
  
}