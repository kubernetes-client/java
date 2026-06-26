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
public class V1StatusCauseBuilder extends V1StatusCauseFluent<V1StatusCauseBuilder> implements VisitableBuilder<V1StatusCause,V1StatusCauseBuilder>{

  V1StatusCauseFluent<?> fluent;

  public V1StatusCauseBuilder() {
    this(new V1StatusCause());
  }
  
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent) {
    this(fluent, new V1StatusCause());
  }
  
  public V1StatusCauseBuilder(V1StatusCause instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StatusCauseBuilder(V1StatusCauseFluent<?> fluent,V1StatusCause instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StatusCause build() {
    V1StatusCause buildable = new V1StatusCause();
    buildable.setField(fluent.getField());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}