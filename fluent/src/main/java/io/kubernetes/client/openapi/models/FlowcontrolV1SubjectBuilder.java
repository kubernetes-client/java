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
public class FlowcontrolV1SubjectBuilder extends FlowcontrolV1SubjectFluent<FlowcontrolV1SubjectBuilder> implements VisitableBuilder<FlowcontrolV1Subject,FlowcontrolV1SubjectBuilder>{

  FlowcontrolV1SubjectFluent<?> fluent;

  public FlowcontrolV1SubjectBuilder() {
    this(new FlowcontrolV1Subject());
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1SubjectFluent<?> fluent) {
    this(fluent, new FlowcontrolV1Subject());
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1Subject instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public FlowcontrolV1SubjectBuilder(FlowcontrolV1SubjectFluent<?> fluent,FlowcontrolV1Subject instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public FlowcontrolV1Subject build() {
    FlowcontrolV1Subject buildable = new FlowcontrolV1Subject();
    buildable.setGroup(fluent.buildGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.buildServiceAccount());
    buildable.setUser(fluent.buildUser());
    return buildable;
  }
  
}