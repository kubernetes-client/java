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
public class V1LocalObjectReferenceBuilder extends V1LocalObjectReferenceFluent<V1LocalObjectReferenceBuilder> implements VisitableBuilder<V1LocalObjectReference,V1LocalObjectReferenceBuilder>{

  V1LocalObjectReferenceFluent<?> fluent;

  public V1LocalObjectReferenceBuilder() {
    this(new V1LocalObjectReference());
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1LocalObjectReference());
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent,V1LocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LocalObjectReference build() {
    V1LocalObjectReference buildable = new V1LocalObjectReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}