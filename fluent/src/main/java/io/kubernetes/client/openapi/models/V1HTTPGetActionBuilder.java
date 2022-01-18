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

public class V1HTTPGetActionBuilder
    extends io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl<
        io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1HTTPGetAction,
        io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder> {
  public V1HTTPGetActionBuilder() {
    this(false);
  }

  public V1HTTPGetActionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1HTTPGetAction(), validationEnabled);
  }

  public V1HTTPGetActionBuilder(
      io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HTTPGetActionBuilder(
      io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1HTTPGetAction(), validationEnabled);
  }

  public V1HTTPGetActionBuilder(
      io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPGetAction instance) {
    this(fluent, instance, false);
  }

  public V1HTTPGetActionBuilder(
      io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HTTPGetAction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHost(instance.getHost());

    fluent.withHttpHeaders(instance.getHttpHeaders());

    fluent.withPath(instance.getPath());

    fluent.withPort(instance.getPort());

    fluent.withScheme(instance.getScheme());

    this.validationEnabled = validationEnabled;
  }

  public V1HTTPGetActionBuilder(io.kubernetes.client.openapi.models.V1HTTPGetAction instance) {
    this(instance, false);
  }

  public V1HTTPGetActionBuilder(
      io.kubernetes.client.openapi.models.V1HTTPGetAction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withHost(instance.getHost());

    this.withHttpHeaders(instance.getHttpHeaders());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.withScheme(instance.getScheme());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1HTTPGetAction build() {
    V1HTTPGetAction buildable = new V1HTTPGetAction();
    buildable.setHost(fluent.getHost());
    buildable.setHttpHeaders(fluent.getHttpHeaders());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HTTPGetActionBuilder that = (V1HTTPGetActionBuilder) o;
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
