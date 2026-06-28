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
public class V1SecretReferenceBuilder extends V1SecretReferenceFluent<V1SecretReferenceBuilder> implements VisitableBuilder<V1SecretReference,V1SecretReferenceBuilder>{

  V1SecretReferenceFluent<?> fluent;

  public V1SecretReferenceBuilder() {
    this(new V1SecretReference());
  }
  
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent) {
    this(fluent, new V1SecretReference());
  }
  
  public V1SecretReferenceBuilder(V1SecretReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SecretReferenceBuilder(V1SecretReferenceFluent<?> fluent,V1SecretReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SecretReference build() {
    V1SecretReference buildable = new V1SecretReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}