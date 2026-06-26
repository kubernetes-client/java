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
public class V1IngressBackendBuilder extends V1IngressBackendFluent<V1IngressBackendBuilder> implements VisitableBuilder<V1IngressBackend,V1IngressBackendBuilder>{

  V1IngressBackendFluent<?> fluent;

  public V1IngressBackendBuilder() {
    this(new V1IngressBackend());
  }
  
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent) {
    this(fluent, new V1IngressBackend());
  }
  
  public V1IngressBackendBuilder(V1IngressBackend instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent,V1IngressBackend instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressBackend build() {
    V1IngressBackend buildable = new V1IngressBackend();
    buildable.setResource(fluent.buildResource());
    buildable.setService(fluent.buildService());
    return buildable;
  }
  
}