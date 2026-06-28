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
public class V1ResourceStatusBuilder extends V1ResourceStatusFluent<V1ResourceStatusBuilder> implements VisitableBuilder<V1ResourceStatus,V1ResourceStatusBuilder>{

  V1ResourceStatusFluent<?> fluent;

  public V1ResourceStatusBuilder() {
    this(new V1ResourceStatus());
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatusFluent<?> fluent) {
    this(fluent, new V1ResourceStatus());
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatusFluent<?> fluent,V1ResourceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceStatus build() {
    V1ResourceStatus buildable = new V1ResourceStatus();
    buildable.setName(fluent.getName());
    buildable.setResources(fluent.buildResources());
    return buildable;
  }
  
}