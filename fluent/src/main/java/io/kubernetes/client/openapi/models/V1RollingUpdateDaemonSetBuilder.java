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
public class V1RollingUpdateDaemonSetBuilder extends V1RollingUpdateDaemonSetFluent<V1RollingUpdateDaemonSetBuilder> implements VisitableBuilder<V1RollingUpdateDaemonSet,V1RollingUpdateDaemonSetBuilder>{

  V1RollingUpdateDaemonSetFluent<?> fluent;

  public V1RollingUpdateDaemonSetBuilder() {
    this(new V1RollingUpdateDaemonSet());
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent) {
    this(fluent, new V1RollingUpdateDaemonSet());
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent,V1RollingUpdateDaemonSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1RollingUpdateDaemonSet build() {
    V1RollingUpdateDaemonSet buildable = new V1RollingUpdateDaemonSet();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
  
}