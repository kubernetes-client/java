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
public class V1LimitRangeItemBuilder extends V1LimitRangeItemFluent<V1LimitRangeItemBuilder> implements VisitableBuilder<V1LimitRangeItem,V1LimitRangeItemBuilder>{

  V1LimitRangeItemFluent<?> fluent;

  public V1LimitRangeItemBuilder() {
    this(new V1LimitRangeItem());
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent) {
    this(fluent, new V1LimitRangeItem());
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItem instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent,V1LimitRangeItem instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LimitRangeItem build() {
    V1LimitRangeItem buildable = new V1LimitRangeItem();
    buildable.setDefault(fluent.getDefault());
    buildable.setDefaultRequest(fluent.getDefaultRequest());
    buildable.setMax(fluent.getMax());
    buildable.setMaxLimitRequestRatio(fluent.getMaxLimitRequestRatio());
    buildable.setMin(fluent.getMin());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}