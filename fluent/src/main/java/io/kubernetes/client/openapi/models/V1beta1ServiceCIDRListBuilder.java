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
public class V1beta1ServiceCIDRListBuilder extends V1beta1ServiceCIDRListFluent<V1beta1ServiceCIDRListBuilder> implements VisitableBuilder<V1beta1ServiceCIDRList,V1beta1ServiceCIDRListBuilder>{

  V1beta1ServiceCIDRListFluent<?> fluent;

  public V1beta1ServiceCIDRListBuilder() {
    this(new V1beta1ServiceCIDRList());
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRListFluent<?> fluent) {
    this(fluent, new V1beta1ServiceCIDRList());
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1ServiceCIDRListBuilder(V1beta1ServiceCIDRListFluent<?> fluent,V1beta1ServiceCIDRList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1ServiceCIDRList build() {
    V1beta1ServiceCIDRList buildable = new V1beta1ServiceCIDRList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}