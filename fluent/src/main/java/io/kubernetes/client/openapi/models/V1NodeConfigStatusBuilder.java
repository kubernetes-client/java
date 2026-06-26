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
public class V1NodeConfigStatusBuilder extends V1NodeConfigStatusFluent<V1NodeConfigStatusBuilder> implements VisitableBuilder<V1NodeConfigStatus,V1NodeConfigStatusBuilder>{

  V1NodeConfigStatusFluent<?> fluent;

  public V1NodeConfigStatusBuilder() {
    this(new V1NodeConfigStatus());
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent) {
    this(fluent, new V1NodeConfigStatus());
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent,V1NodeConfigStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeConfigStatus build() {
    V1NodeConfigStatus buildable = new V1NodeConfigStatus();
    buildable.setActive(fluent.buildActive());
    buildable.setAssigned(fluent.buildAssigned());
    buildable.setError(fluent.getError());
    buildable.setLastKnownGood(fluent.buildLastKnownGood());
    return buildable;
  }
  
}