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
public class V1LinuxContainerUserBuilder extends V1LinuxContainerUserFluent<V1LinuxContainerUserBuilder> implements VisitableBuilder<V1LinuxContainerUser,V1LinuxContainerUserBuilder>{

  V1LinuxContainerUserFluent<?> fluent;

  public V1LinuxContainerUserBuilder() {
    this(new V1LinuxContainerUser());
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUserFluent<?> fluent) {
    this(fluent, new V1LinuxContainerUser());
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUser instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUserFluent<?> fluent,V1LinuxContainerUser instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LinuxContainerUser build() {
    V1LinuxContainerUser buildable = new V1LinuxContainerUser();
    buildable.setGid(fluent.getGid());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}