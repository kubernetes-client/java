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
public class V1RoleBindingBuilder extends V1RoleBindingFluent<V1RoleBindingBuilder> implements VisitableBuilder<V1RoleBinding,V1RoleBindingBuilder>{

  V1RoleBindingFluent<?> fluent;

  public V1RoleBindingBuilder() {
    this(new V1RoleBinding());
  }
  
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent) {
    this(fluent, new V1RoleBinding());
  }
  
  public V1RoleBindingBuilder(V1RoleBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent,V1RoleBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1RoleBinding build() {
    V1RoleBinding buildable = new V1RoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRoleRef(fluent.buildRoleRef());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  
}