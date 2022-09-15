/*
Copyright 2022 The Kubernetes Authors.
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

public class V1TopologySelectorTermBuilder
    extends V1TopologySelectorTermFluentImpl<V1TopologySelectorTermBuilder>
    implements VisitableBuilder<V1TopologySelectorTerm, V1TopologySelectorTermBuilder> {
  public V1TopologySelectorTermBuilder() {
    this(false);
  }

  public V1TopologySelectorTermBuilder(Boolean validationEnabled) {
    this(new V1TopologySelectorTerm(), validationEnabled);
  }

  public V1TopologySelectorTermBuilder(V1TopologySelectorTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TopologySelectorTermBuilder(
      V1TopologySelectorTermFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1TopologySelectorTerm(), validationEnabled);
  }

  public V1TopologySelectorTermBuilder(
      V1TopologySelectorTermFluent<?> fluent, V1TopologySelectorTerm instance) {
    this(fluent, instance, false);
  }

  public V1TopologySelectorTermBuilder(
      V1TopologySelectorTermFluent<?> fluent,
      V1TopologySelectorTerm instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMatchLabelExpressions(instance.getMatchLabelExpressions());

    this.validationEnabled = validationEnabled;
  }

  public V1TopologySelectorTermBuilder(V1TopologySelectorTerm instance) {
    this(instance, false);
  }

  public V1TopologySelectorTermBuilder(V1TopologySelectorTerm instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMatchLabelExpressions(instance.getMatchLabelExpressions());

    this.validationEnabled = validationEnabled;
  }

  V1TopologySelectorTermFluent<?> fluent;
  Boolean validationEnabled;

  public V1TopologySelectorTerm build() {
    V1TopologySelectorTerm buildable = new V1TopologySelectorTerm();
    buildable.setMatchLabelExpressions(fluent.getMatchLabelExpressions());
    return buildable;
  }
}
