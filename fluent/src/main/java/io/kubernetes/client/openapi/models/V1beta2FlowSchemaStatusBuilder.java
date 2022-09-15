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

public class V1beta2FlowSchemaStatusBuilder
    extends V1beta2FlowSchemaStatusFluentImpl<V1beta2FlowSchemaStatusBuilder>
    implements VisitableBuilder<V1beta2FlowSchemaStatus, V1beta2FlowSchemaStatusBuilder> {
  public V1beta2FlowSchemaStatusBuilder() {
    this(false);
  }

  public V1beta2FlowSchemaStatusBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchemaStatus(), validationEnabled);
  }

  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2FlowSchemaStatusBuilder(
      V1beta2FlowSchemaStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaStatus(), validationEnabled);
  }

  public V1beta2FlowSchemaStatusBuilder(
      V1beta2FlowSchemaStatusFluent<?> fluent, V1beta2FlowSchemaStatus instance) {
    this(fluent, instance, false);
  }

  public V1beta2FlowSchemaStatusBuilder(
      V1beta2FlowSchemaStatusFluent<?> fluent,
      V1beta2FlowSchemaStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatus instance) {
    this(instance, false);
  }

  public V1beta2FlowSchemaStatusBuilder(
      V1beta2FlowSchemaStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  V1beta2FlowSchemaStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta2FlowSchemaStatus build() {
    V1beta2FlowSchemaStatus buildable = new V1beta2FlowSchemaStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
}
