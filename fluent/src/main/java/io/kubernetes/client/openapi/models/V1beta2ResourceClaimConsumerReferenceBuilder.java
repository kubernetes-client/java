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
public class V1beta2ResourceClaimConsumerReferenceBuilder extends V1beta2ResourceClaimConsumerReferenceFluent<V1beta2ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1beta2ResourceClaimConsumerReference,V1beta2ResourceClaimConsumerReferenceBuilder>{

  V1beta2ResourceClaimConsumerReferenceFluent<?> fluent;

  public V1beta2ResourceClaimConsumerReferenceBuilder() {
    this(new V1beta2ResourceClaimConsumerReference());
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimConsumerReference());
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReferenceFluent<?> fluent,V1beta2ResourceClaimConsumerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimConsumerReference build() {
    V1beta2ResourceClaimConsumerReference buildable = new V1beta2ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}