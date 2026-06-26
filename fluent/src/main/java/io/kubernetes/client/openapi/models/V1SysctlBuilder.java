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
public class V1SysctlBuilder extends V1SysctlFluent<V1SysctlBuilder> implements VisitableBuilder<V1Sysctl,V1SysctlBuilder>{

  V1SysctlFluent<?> fluent;

  public V1SysctlBuilder() {
    this(new V1Sysctl());
  }
  
  public V1SysctlBuilder(V1SysctlFluent<?> fluent) {
    this(fluent, new V1Sysctl());
  }
  
  public V1SysctlBuilder(V1Sysctl instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SysctlBuilder(V1SysctlFluent<?> fluent,V1Sysctl instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Sysctl build() {
    V1Sysctl buildable = new V1Sysctl();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}