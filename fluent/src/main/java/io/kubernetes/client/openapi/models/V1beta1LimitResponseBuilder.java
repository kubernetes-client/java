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

public class V1beta1LimitResponseBuilder
    extends io.kubernetes.client.openapi.models.V1beta1LimitResponseFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1LimitResponse,
        io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder> {
  public V1beta1LimitResponseBuilder() {
    this(false);
  }

  public V1beta1LimitResponseBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1LimitResponse(), validationEnabled);
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1LimitResponse(), validationEnabled);
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1LimitResponse instance) {
    this(fluent, instance, false);
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1LimitResponse instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withQueuing(instance.getQueuing());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponse instance) {
    this(instance, false);
  }

  public V1beta1LimitResponseBuilder(
      io.kubernetes.client.openapi.models.V1beta1LimitResponse instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1LimitResponse build() {
    V1beta1LimitResponse buildable = new V1beta1LimitResponse();
    buildable.setQueuing(fluent.getQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1LimitResponseBuilder that = (V1beta1LimitResponseBuilder) o;
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
