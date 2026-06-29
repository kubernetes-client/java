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
public class V1SELinuxOptionsBuilder extends V1SELinuxOptionsFluent<V1SELinuxOptionsBuilder> implements VisitableBuilder<V1SELinuxOptions,V1SELinuxOptionsBuilder>{

  V1SELinuxOptionsFluent<?> fluent;

  public V1SELinuxOptionsBuilder() {
    this(new V1SELinuxOptions());
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent) {
    this(fluent, new V1SELinuxOptions());
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent,V1SELinuxOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SELinuxOptions build() {
    V1SELinuxOptions buildable = new V1SELinuxOptions();
    buildable.setLevel(fluent.getLevel());
    buildable.setRole(fluent.getRole());
    buildable.setType(fluent.getType());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}