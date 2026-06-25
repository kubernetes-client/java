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
public class V1APIGroupBuilder extends V1APIGroupFluent<V1APIGroupBuilder> implements VisitableBuilder<V1APIGroup,V1APIGroupBuilder>{

  V1APIGroupFluent<?> fluent;

  public V1APIGroupBuilder() {
    this(new V1APIGroup());
  }
  
  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent) {
    this(fluent, new V1APIGroup());
  }
  
  public V1APIGroupBuilder(V1APIGroup instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent,V1APIGroup instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIGroup build() {
    V1APIGroup buildable = new V1APIGroup();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setPreferredVersion(fluent.buildPreferredVersion());
    buildable.setServerAddressByClientCIDRs(fluent.buildServerAddressByClientCIDRs());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  
}