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
public class V1ContainerUserBuilder extends V1ContainerUserFluent<V1ContainerUserBuilder> implements VisitableBuilder<V1ContainerUser,V1ContainerUserBuilder>{

  V1ContainerUserFluent<?> fluent;

  public V1ContainerUserBuilder() {
    this(new V1ContainerUser());
  }
  
  public V1ContainerUserBuilder(V1ContainerUserFluent<?> fluent) {
    this(fluent, new V1ContainerUser());
  }
  
  public V1ContainerUserBuilder(V1ContainerUser instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerUserBuilder(V1ContainerUserFluent<?> fluent,V1ContainerUser instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerUser build() {
    V1ContainerUser buildable = new V1ContainerUser();
    buildable.setLinux(fluent.buildLinux());
    return buildable;
  }
  
}