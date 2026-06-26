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
public class RbacV1SubjectBuilder extends RbacV1SubjectFluent<RbacV1SubjectBuilder> implements VisitableBuilder<RbacV1Subject,RbacV1SubjectBuilder>{

  RbacV1SubjectFluent<?> fluent;

  public RbacV1SubjectBuilder() {
    this(new RbacV1Subject());
  }
  
  public RbacV1SubjectBuilder(RbacV1SubjectFluent<?> fluent) {
    this(fluent, new RbacV1Subject());
  }
  
  public RbacV1SubjectBuilder(RbacV1Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public RbacV1SubjectBuilder(RbacV1SubjectFluent<?> fluent,RbacV1Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public RbacV1Subject build() {
    RbacV1Subject buildable = new RbacV1Subject();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}