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

public class V1NodeSelectorTermBuilder
    extends V1NodeSelectorTermFluentImpl<V1NodeSelectorTermBuilder>
    implements VisitableBuilder<V1NodeSelectorTerm, V1NodeSelectorTermBuilder> {
  public V1NodeSelectorTermBuilder() {
    this(false);
  }

  public V1NodeSelectorTermBuilder(Boolean validationEnabled) {
    this(new V1NodeSelectorTerm(), validationEnabled);
  }

  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeSelectorTermBuilder(V1NodeSelectorTermFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeSelectorTerm(), validationEnabled);
  }

  public V1NodeSelectorTermBuilder(
      V1NodeSelectorTermFluent<?> fluent, V1NodeSelectorTerm instance) {
    this(fluent, instance, false);
  }

  public V1NodeSelectorTermBuilder(
      V1NodeSelectorTermFluent<?> fluent, V1NodeSelectorTerm instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMatchExpressions(instance.getMatchExpressions());

    fluent.withMatchFields(instance.getMatchFields());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeSelectorTermBuilder(V1NodeSelectorTerm instance) {
    this(instance, false);
  }

  public V1NodeSelectorTermBuilder(V1NodeSelectorTerm instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMatchExpressions(instance.getMatchExpressions());

    this.withMatchFields(instance.getMatchFields());

    this.validationEnabled = validationEnabled;
  }

  V1NodeSelectorTermFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeSelectorTerm build() {
    V1NodeSelectorTerm buildable = new V1NodeSelectorTerm();
    buildable.setMatchExpressions(fluent.getMatchExpressions());
    buildable.setMatchFields(fluent.getMatchFields());
    return buildable;
  }
}
