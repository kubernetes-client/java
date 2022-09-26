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

public class V1ComponentConditionBuilder
    extends V1ComponentConditionFluentImpl<V1ComponentConditionBuilder>
    implements VisitableBuilder<V1ComponentCondition, V1ComponentConditionBuilder> {
  public V1ComponentConditionBuilder() {
    this(false);
  }

  public V1ComponentConditionBuilder(Boolean validationEnabled) {
    this(new V1ComponentCondition(), validationEnabled);
  }

  public V1ComponentConditionBuilder(V1ComponentConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ComponentConditionBuilder(
      V1ComponentConditionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ComponentCondition(), validationEnabled);
  }

  public V1ComponentConditionBuilder(
      V1ComponentConditionFluent<?> fluent, V1ComponentCondition instance) {
    this(fluent, instance, false);
  }

  public V1ComponentConditionBuilder(
      V1ComponentConditionFluent<?> fluent,
      V1ComponentCondition instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withError(instance.getError());

    fluent.withMessage(instance.getMessage());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1ComponentConditionBuilder(V1ComponentCondition instance) {
    this(instance, false);
  }

  public V1ComponentConditionBuilder(V1ComponentCondition instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withError(instance.getError());

    this.withMessage(instance.getMessage());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1ComponentConditionFluent<?> fluent;
  Boolean validationEnabled;

  public V1ComponentCondition build() {
    V1ComponentCondition buildable = new V1ComponentCondition();
    buildable.setError(fluent.getError());
    buildable.setMessage(fluent.getMessage());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
