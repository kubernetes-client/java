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
public class V1NodeRuntimeHandlerBuilder extends V1NodeRuntimeHandlerFluent<V1NodeRuntimeHandlerBuilder> implements VisitableBuilder<V1NodeRuntimeHandler,V1NodeRuntimeHandlerBuilder>{

  V1NodeRuntimeHandlerFluent<?> fluent;

  public V1NodeRuntimeHandlerBuilder() {
    this(new V1NodeRuntimeHandler());
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandlerFluent<?> fluent) {
    this(fluent, new V1NodeRuntimeHandler());
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandlerFluent<?> fluent,V1NodeRuntimeHandler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeRuntimeHandler build() {
    V1NodeRuntimeHandler buildable = new V1NodeRuntimeHandler();
    buildable.setFeatures(fluent.buildFeatures());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}