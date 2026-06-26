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
public class V1OwnerReferenceBuilder extends V1OwnerReferenceFluent<V1OwnerReferenceBuilder> implements VisitableBuilder<V1OwnerReference,V1OwnerReferenceBuilder>{

  V1OwnerReferenceFluent<?> fluent;

  public V1OwnerReferenceBuilder() {
    this(new V1OwnerReference());
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent) {
    this(fluent, new V1OwnerReference());
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent,V1OwnerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1OwnerReference build() {
    V1OwnerReference buildable = new V1OwnerReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBlockOwnerDeletion(fluent.getBlockOwnerDeletion());
    buildable.setController(fluent.getController());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}