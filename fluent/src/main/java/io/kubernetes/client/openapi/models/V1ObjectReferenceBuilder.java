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
public class V1ObjectReferenceBuilder extends V1ObjectReferenceFluent<V1ObjectReferenceBuilder> implements VisitableBuilder<V1ObjectReference,V1ObjectReferenceBuilder>{

  V1ObjectReferenceFluent<?> fluent;

  public V1ObjectReferenceBuilder() {
    this(new V1ObjectReference());
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent) {
    this(fluent, new V1ObjectReference());
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent,V1ObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ObjectReference build() {
    V1ObjectReference buildable = new V1ObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}