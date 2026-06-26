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
public class V1alpha1MutationBuilder extends V1alpha1MutationFluent<V1alpha1MutationBuilder> implements VisitableBuilder<V1alpha1Mutation,V1alpha1MutationBuilder>{

  V1alpha1MutationFluent<?> fluent;

  public V1alpha1MutationBuilder() {
    this(new V1alpha1Mutation());
  }
  
  public V1alpha1MutationBuilder(V1alpha1MutationFluent<?> fluent) {
    this(fluent, new V1alpha1Mutation());
  }
  
  public V1alpha1MutationBuilder(V1alpha1Mutation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MutationBuilder(V1alpha1MutationFluent<?> fluent,V1alpha1Mutation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1Mutation build() {
    V1alpha1Mutation buildable = new V1alpha1Mutation();
    buildable.setApplyConfiguration(fluent.buildApplyConfiguration());
    buildable.setJsonPatch(fluent.buildJsonPatch());
    buildable.setPatchType(fluent.getPatchType());
    return buildable;
  }
  
}