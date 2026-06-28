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
public class V1UserSubjectBuilder extends V1UserSubjectFluent<V1UserSubjectBuilder> implements VisitableBuilder<V1UserSubject,V1UserSubjectBuilder>{

  V1UserSubjectFluent<?> fluent;

  public V1UserSubjectBuilder() {
    this(new V1UserSubject());
  }
  
  public V1UserSubjectBuilder(V1UserSubjectFluent<?> fluent) {
    this(fluent, new V1UserSubject());
  }
  
  public V1UserSubjectBuilder(V1UserSubject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1UserSubjectBuilder(V1UserSubjectFluent<?> fluent,V1UserSubject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1UserSubject build() {
    V1UserSubject buildable = new V1UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}