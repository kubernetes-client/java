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

public class V1beta1EndpointConditionsBuilder
    extends io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1EndpointConditions,
        io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder> {
  public V1beta1EndpointConditionsBuilder() {
    this(false);
  }

  public V1beta1EndpointConditionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1EndpointConditions(), validationEnabled);
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointConditions(), validationEnabled);
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withReady(instance.getReady());

    fluent.withServing(instance.getServing());

    fluent.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance) {
    this(instance, false);
  }

  public V1beta1EndpointConditionsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointConditions build() {
    V1beta1EndpointConditions buildable = new V1beta1EndpointConditions();
    buildable.setReady(fluent.getReady());
    buildable.setServing(fluent.getServing());
    buildable.setTerminating(fluent.getTerminating());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1EndpointConditionsBuilder that = (V1beta1EndpointConditionsBuilder) o;
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
