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

public class V1NodeSelectorTermBuilder
    extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl<
        io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NodeSelectorTerm,
        io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> {
  public V1NodeSelectorTermBuilder() {
    this(false);
  }

  public V1NodeSelectorTermBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeSelectorTerm(), validationEnabled);
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeSelectorTerm(), validationEnabled);
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm instance) {
    this(fluent, instance, false);
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMatchExpressions(instance.getMatchExpressions());

    fluent.withMatchFields(instance.getMatchFields());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm instance) {
    this(instance, false);
  }

  public V1NodeSelectorTermBuilder(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMatchExpressions(instance.getMatchExpressions());

    this.withMatchFields(instance.getMatchFields());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm build() {
    V1NodeSelectorTerm buildable = new V1NodeSelectorTerm();
    buildable.setMatchExpressions(fluent.getMatchExpressions());
    buildable.setMatchFields(fluent.getMatchFields());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeSelectorTermBuilder that = (V1NodeSelectorTermBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
