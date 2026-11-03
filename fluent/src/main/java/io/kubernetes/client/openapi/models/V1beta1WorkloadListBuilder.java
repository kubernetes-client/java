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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1beta1WorkloadListBuilder extends V1beta1WorkloadListFluent<V1beta1WorkloadListBuilder> implements VisitableBuilder<V1beta1WorkloadList,V1beta1WorkloadListBuilder>{

  V1beta1WorkloadListFluent<?> fluent;

  public V1beta1WorkloadListBuilder() {
    this(new V1beta1WorkloadList());
  }
  
  public V1beta1WorkloadListBuilder(V1beta1WorkloadListFluent<?> fluent) {
    this(fluent, new V1beta1WorkloadList());
  }
  
  public V1beta1WorkloadListBuilder(V1beta1WorkloadList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1WorkloadListBuilder(V1beta1WorkloadListFluent<?> fluent,V1beta1WorkloadList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1WorkloadList build() {
    V1beta1WorkloadList buildable = new V1beta1WorkloadList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}