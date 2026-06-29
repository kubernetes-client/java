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
public class V1IngressClassParametersReferenceBuilder extends V1IngressClassParametersReferenceFluent<V1IngressClassParametersReferenceBuilder> implements VisitableBuilder<V1IngressClassParametersReference,V1IngressClassParametersReferenceBuilder>{

  V1IngressClassParametersReferenceFluent<?> fluent;

  public V1IngressClassParametersReferenceBuilder() {
    this(new V1IngressClassParametersReference());
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent) {
    this(fluent, new V1IngressClassParametersReference());
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent,V1IngressClassParametersReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressClassParametersReference build() {
    V1IngressClassParametersReference buildable = new V1IngressClassParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  
}