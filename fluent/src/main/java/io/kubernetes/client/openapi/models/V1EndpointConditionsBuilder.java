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

public class V1EndpointConditionsBuilder
    extends V1EndpointConditionsFluentImpl<V1EndpointConditionsBuilder>
    implements VisitableBuilder<
        V1EndpointConditions, io.kubernetes.client.openapi.models.V1EndpointConditionsBuilder> {
  public V1EndpointConditionsBuilder() {
    this(false);
  }

  public V1EndpointConditionsBuilder(Boolean validationEnabled) {
    this(new V1EndpointConditions(), validationEnabled);
  }

  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EndpointConditions(), validationEnabled);
  }

  public V1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointConditions instance) {
    this(fluent, instance, false);
  }

  public V1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointConditions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withReady(instance.getReady());

    fluent.withServing(instance.getServing());

    fluent.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointConditions instance) {
    this(instance, false);
  }

  public V1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1EndpointConditions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EndpointConditionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EndpointConditions build() {
    V1EndpointConditions buildable = new V1EndpointConditions();
    buildable.setReady(fluent.getReady());
    buildable.setServing(fluent.getServing());
    buildable.setTerminating(fluent.getTerminating());
    return buildable;
  }
}
