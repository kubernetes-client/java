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

public class V1beta1PriorityLevelConfigurationReferenceBuilder
    extends V1beta1PriorityLevelConfigurationReferenceFluentImpl<
        V1beta1PriorityLevelConfigurationReferenceBuilder>
    implements VisitableBuilder<
        V1beta1PriorityLevelConfigurationReference,
        V1beta1PriorityLevelConfigurationReferenceBuilder> {
  public V1beta1PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,
      V1beta1PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,
      V1beta1PriorityLevelConfigurationReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReference instance) {
    this(instance, false);
  }

  public V1beta1PriorityLevelConfigurationReferenceBuilder(
      V1beta1PriorityLevelConfigurationReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta1PriorityLevelConfigurationReference build() {
    V1beta1PriorityLevelConfigurationReference buildable =
        new V1beta1PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
