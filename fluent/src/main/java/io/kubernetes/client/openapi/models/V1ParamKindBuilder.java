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
public class V1ParamKindBuilder extends V1ParamKindFluent<V1ParamKindBuilder> implements VisitableBuilder<V1ParamKind,V1ParamKindBuilder>{

  V1ParamKindFluent<?> fluent;

  public V1ParamKindBuilder() {
    this(new V1ParamKind());
  }
  
  public V1ParamKindBuilder(V1ParamKindFluent<?> fluent) {
    this(fluent, new V1ParamKind());
  }
  
  public V1ParamKindBuilder(V1ParamKind instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ParamKindBuilder(V1ParamKindFluent<?> fluent,V1ParamKind instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ParamKind build() {
    V1ParamKind buildable = new V1ParamKind();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  
}