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
public class V1HTTPHeaderBuilder extends V1HTTPHeaderFluent<V1HTTPHeaderBuilder> implements VisitableBuilder<V1HTTPHeader,V1HTTPHeaderBuilder>{

  V1HTTPHeaderFluent<?> fluent;

  public V1HTTPHeaderBuilder() {
    this(new V1HTTPHeader());
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeaderFluent<?> fluent) {
    this(fluent, new V1HTTPHeader());
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeader instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HTTPHeaderBuilder(V1HTTPHeaderFluent<?> fluent,V1HTTPHeader instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HTTPHeader build() {
    V1HTTPHeader buildable = new V1HTTPHeader();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}