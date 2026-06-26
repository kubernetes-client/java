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
public class V1PolicyRulesWithSubjectsBuilder extends V1PolicyRulesWithSubjectsFluent<V1PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1PolicyRulesWithSubjects,V1PolicyRulesWithSubjectsBuilder>{

  V1PolicyRulesWithSubjectsFluent<?> fluent;

  public V1PolicyRulesWithSubjectsBuilder() {
    this(new V1PolicyRulesWithSubjects());
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, new V1PolicyRulesWithSubjects());
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjects instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjectsFluent<?> fluent,V1PolicyRulesWithSubjects instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PolicyRulesWithSubjects build() {
    V1PolicyRulesWithSubjects buildable = new V1PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  
}