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
public class V1beta1ResourceSliceListBuilder extends V1beta1ResourceSliceListFluent<V1beta1ResourceSliceListBuilder> implements VisitableBuilder<V1beta1ResourceSliceList,V1beta1ResourceSliceListBuilder>{

  V1beta1ResourceSliceListFluent<?> fluent;

  public V1beta1ResourceSliceListBuilder() {
    this(new V1beta1ResourceSliceList());
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceListFluent<?> fluent) {
    this(fluent, new V1beta1ResourceSliceList());
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1ResourceSliceListBuilder(V1beta1ResourceSliceListFluent<?> fluent,V1beta1ResourceSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1ResourceSliceList build() {
    V1beta1ResourceSliceList buildable = new V1beta1ResourceSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}