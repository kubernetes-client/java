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
public class V1TypedLocalObjectReferenceBuilder extends V1TypedLocalObjectReferenceFluent<V1TypedLocalObjectReferenceBuilder> implements VisitableBuilder<V1TypedLocalObjectReference,V1TypedLocalObjectReferenceBuilder>{

  V1TypedLocalObjectReferenceFluent<?> fluent;

  public V1TypedLocalObjectReferenceBuilder() {
    this(new V1TypedLocalObjectReference());
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1TypedLocalObjectReference());
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent,V1TypedLocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TypedLocalObjectReference build() {
    V1TypedLocalObjectReference buildable = new V1TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}