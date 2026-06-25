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
public class V1HostAliasBuilder extends V1HostAliasFluent<V1HostAliasBuilder> implements VisitableBuilder<V1HostAlias,V1HostAliasBuilder>{

  V1HostAliasFluent<?> fluent;

  public V1HostAliasBuilder() {
    this(new V1HostAlias());
  }
  
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent) {
    this(fluent, new V1HostAlias());
  }
  
  public V1HostAliasBuilder(V1HostAlias instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent,V1HostAlias instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HostAlias build() {
    V1HostAlias buildable = new V1HostAlias();
    buildable.setHostnames(fluent.getHostnames());
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  
}