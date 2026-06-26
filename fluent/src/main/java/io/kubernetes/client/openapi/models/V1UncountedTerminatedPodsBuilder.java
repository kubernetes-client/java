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
public class V1UncountedTerminatedPodsBuilder extends V1UncountedTerminatedPodsFluent<V1UncountedTerminatedPodsBuilder> implements VisitableBuilder<V1UncountedTerminatedPods,V1UncountedTerminatedPodsBuilder>{

  V1UncountedTerminatedPodsFluent<?> fluent;

  public V1UncountedTerminatedPodsBuilder() {
    this(new V1UncountedTerminatedPods());
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent) {
    this(fluent, new V1UncountedTerminatedPods());
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPods instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent,V1UncountedTerminatedPods instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1UncountedTerminatedPods build() {
    V1UncountedTerminatedPods buildable = new V1UncountedTerminatedPods();
    buildable.setFailed(fluent.getFailed());
    buildable.setSucceeded(fluent.getSucceeded());
    return buildable;
  }
  
}