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

public class V1beta1PriorityLevelConfigurationConditionBuilder
    extends V1beta1PriorityLevelConfigurationConditionFluentImpl<
        V1beta1PriorityLevelConfigurationConditionBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition,
        V1beta1PriorityLevelConfigurationConditionBuilder> {
  public V1beta1PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationCondition(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      V1beta1PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluent<?>
          fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationCondition(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition instance) {
    this(instance, false);
  }

  public V1beta1PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition build() {
    V1beta1PriorityLevelConfigurationCondition buildable =
        new V1beta1PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
