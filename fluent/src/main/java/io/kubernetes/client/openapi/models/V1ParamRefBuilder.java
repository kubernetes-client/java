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
public class V1ParamRefBuilder extends V1ParamRefFluent<V1ParamRefBuilder> implements VisitableBuilder<V1ParamRef,V1ParamRefBuilder>{

  V1ParamRefFluent<?> fluent;

  public V1ParamRefBuilder() {
    this(new V1ParamRef());
  }
  
  public V1ParamRefBuilder(V1ParamRefFluent<?> fluent) {
    this(fluent, new V1ParamRef());
  }
  
  public V1ParamRefBuilder(V1ParamRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ParamRefBuilder(V1ParamRefFluent<?> fluent,V1ParamRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ParamRef build() {
    V1ParamRef buildable = new V1ParamRef();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setParameterNotFoundAction(fluent.getParameterNotFoundAction());
    buildable.setSelector(fluent.buildSelector());
    return buildable;
  }
  
}