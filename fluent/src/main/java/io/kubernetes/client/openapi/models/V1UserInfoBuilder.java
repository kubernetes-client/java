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
public class V1UserInfoBuilder extends V1UserInfoFluent<V1UserInfoBuilder> implements VisitableBuilder<V1UserInfo,V1UserInfoBuilder>{

  V1UserInfoFluent<?> fluent;

  public V1UserInfoBuilder() {
    this(new V1UserInfo());
  }
  
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent) {
    this(fluent, new V1UserInfo());
  }
  
  public V1UserInfoBuilder(V1UserInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1UserInfoBuilder(V1UserInfoFluent<?> fluent,V1UserInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1UserInfo build() {
    V1UserInfo buildable = new V1UserInfo();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setUid(fluent.getUid());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  
}