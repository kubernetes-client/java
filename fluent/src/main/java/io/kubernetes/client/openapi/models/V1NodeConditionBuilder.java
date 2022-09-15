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

public class V1NodeConditionBuilder extends V1NodeConditionFluentImpl<V1NodeConditionBuilder>
    implements VisitableBuilder<V1NodeCondition, V1NodeConditionBuilder> {
  public V1NodeConditionBuilder() {
    this(false);
  }

  public V1NodeConditionBuilder(Boolean validationEnabled) {
    this(new V1NodeCondition(), validationEnabled);
  }

  public V1NodeConditionBuilder(V1NodeConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeConditionBuilder(V1NodeConditionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeCondition(), validationEnabled);
  }

  public V1NodeConditionBuilder(V1NodeConditionFluent<?> fluent, V1NodeCondition instance) {
    this(fluent, instance, false);
  }

  public V1NodeConditionBuilder(
      V1NodeConditionFluent<?> fluent, V1NodeCondition instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastHeartbeatTime(instance.getLastHeartbeatTime());

    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeConditionBuilder(V1NodeCondition instance) {
    this(instance, false);
  }

  public V1NodeConditionBuilder(V1NodeCondition instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLastHeartbeatTime(instance.getLastHeartbeatTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1NodeConditionFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeCondition build() {
    V1NodeCondition buildable = new V1NodeCondition();
    buildable.setLastHeartbeatTime(fluent.getLastHeartbeatTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
