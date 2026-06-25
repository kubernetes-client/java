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
public class V1IngressServiceBackendBuilder extends V1IngressServiceBackendFluent<V1IngressServiceBackendBuilder> implements VisitableBuilder<V1IngressServiceBackend,V1IngressServiceBackendBuilder>{

  V1IngressServiceBackendFluent<?> fluent;

  public V1IngressServiceBackendBuilder() {
    this(new V1IngressServiceBackend());
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent) {
    this(fluent, new V1IngressServiceBackend());
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackend instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent,V1IngressServiceBackend instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IngressServiceBackend build() {
    V1IngressServiceBackend buildable = new V1IngressServiceBackend();
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.buildPort());
    return buildable;
  }
  
}