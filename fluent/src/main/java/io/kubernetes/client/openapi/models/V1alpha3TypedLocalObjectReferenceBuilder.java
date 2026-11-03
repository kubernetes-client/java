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
public class V1alpha3TypedLocalObjectReferenceBuilder extends V1alpha3TypedLocalObjectReferenceFluent<V1alpha3TypedLocalObjectReferenceBuilder> implements VisitableBuilder<V1alpha3TypedLocalObjectReference,V1alpha3TypedLocalObjectReferenceBuilder>{

  V1alpha3TypedLocalObjectReferenceFluent<?> fluent;

  public V1alpha3TypedLocalObjectReferenceBuilder() {
    this(new V1alpha3TypedLocalObjectReference());
  }
  
  public V1alpha3TypedLocalObjectReferenceBuilder(V1alpha3TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1alpha3TypedLocalObjectReference());
  }
  
  public V1alpha3TypedLocalObjectReferenceBuilder(V1alpha3TypedLocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3TypedLocalObjectReferenceBuilder(V1alpha3TypedLocalObjectReferenceFluent<?> fluent,V1alpha3TypedLocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3TypedLocalObjectReference build() {
    V1alpha3TypedLocalObjectReference buildable = new V1alpha3TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}