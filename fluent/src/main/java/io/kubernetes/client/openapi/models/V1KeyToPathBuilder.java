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
public class V1KeyToPathBuilder extends V1KeyToPathFluent<V1KeyToPathBuilder> implements VisitableBuilder<V1KeyToPath,V1KeyToPathBuilder>{

  V1KeyToPathFluent<?> fluent;

  public V1KeyToPathBuilder() {
    this(new V1KeyToPath());
  }
  
  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent) {
    this(fluent, new V1KeyToPath());
  }
  
  public V1KeyToPathBuilder(V1KeyToPath instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent,V1KeyToPath instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1KeyToPath build() {
    V1KeyToPath buildable = new V1KeyToPath();
    buildable.setKey(fluent.getKey());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  
}