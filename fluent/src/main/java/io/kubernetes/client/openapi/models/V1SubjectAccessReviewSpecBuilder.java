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
public class V1SubjectAccessReviewSpecBuilder extends V1SubjectAccessReviewSpecFluent<V1SubjectAccessReviewSpecBuilder> implements VisitableBuilder<V1SubjectAccessReviewSpec,V1SubjectAccessReviewSpecBuilder>{

  V1SubjectAccessReviewSpecFluent<?> fluent;

  public V1SubjectAccessReviewSpecBuilder() {
    this(new V1SubjectAccessReviewSpec());
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, new V1SubjectAccessReviewSpec());
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent,V1SubjectAccessReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SubjectAccessReviewSpec build() {
    V1SubjectAccessReviewSpec buildable = new V1SubjectAccessReviewSpec();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setNonResourceAttributes(fluent.buildNonResourceAttributes());
    buildable.setResourceAttributes(fluent.buildResourceAttributes());
    buildable.setUid(fluent.getUid());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}