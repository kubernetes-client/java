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

public class V1ResourceQuotaStatusBuilder
    extends V1ResourceQuotaStatusFluentImpl<V1ResourceQuotaStatusBuilder>
    implements VisitableBuilder<V1ResourceQuotaStatus, V1ResourceQuotaStatusBuilder> {
  public V1ResourceQuotaStatusBuilder() {
    this(false);
  }

  public V1ResourceQuotaStatusBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuotaStatus(), validationEnabled);
  }

  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ResourceQuotaStatusBuilder(
      V1ResourceQuotaStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaStatus(), validationEnabled);
  }

  public V1ResourceQuotaStatusBuilder(
      V1ResourceQuotaStatusFluent<?> fluent, V1ResourceQuotaStatus instance) {
    this(fluent, instance, false);
  }

  public V1ResourceQuotaStatusBuilder(
      V1ResourceQuotaStatusFluent<?> fluent,
      V1ResourceQuotaStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHard(instance.getHard());

    fluent.withUsed(instance.getUsed());

    this.validationEnabled = validationEnabled;
  }

  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatus instance) {
    this(instance, false);
  }

  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHard(instance.getHard());

    this.withUsed(instance.getUsed());

    this.validationEnabled = validationEnabled;
  }

  V1ResourceQuotaStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1ResourceQuotaStatus build() {
    V1ResourceQuotaStatus buildable = new V1ResourceQuotaStatus();
    buildable.setHard(fluent.getHard());
    buildable.setUsed(fluent.getUsed());
    return buildable;
  }
}
