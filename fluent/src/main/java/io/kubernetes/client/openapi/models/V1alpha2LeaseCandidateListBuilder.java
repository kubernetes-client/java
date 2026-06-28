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
public class V1alpha2LeaseCandidateListBuilder extends V1alpha2LeaseCandidateListFluent<V1alpha2LeaseCandidateListBuilder> implements VisitableBuilder<V1alpha2LeaseCandidateList,V1alpha2LeaseCandidateListBuilder>{

  V1alpha2LeaseCandidateListFluent<?> fluent;

  public V1alpha2LeaseCandidateListBuilder() {
    this(new V1alpha2LeaseCandidateList());
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateListFluent<?> fluent) {
    this(fluent, new V1alpha2LeaseCandidateList());
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateListFluent<?> fluent,V1alpha2LeaseCandidateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2LeaseCandidateList build() {
    V1alpha2LeaseCandidateList buildable = new V1alpha2LeaseCandidateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}