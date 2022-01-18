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

public class CoreV1EndpointPortBuilder
    extends io.kubernetes.client.openapi.models.CoreV1EndpointPortFluentImpl<
        io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.CoreV1EndpointPort,
        io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder> {
  public CoreV1EndpointPortBuilder() {
    this(false);
  }

  public CoreV1EndpointPortBuilder(java.lang.Boolean validationEnabled) {
    this(new CoreV1EndpointPort(), validationEnabled);
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new CoreV1EndpointPort(), validationEnabled);
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1EndpointPort instance) {
    this(fluent, instance, false);
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1EndpointPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPort instance) {
    this(instance, false);
  }

  public CoreV1EndpointPortBuilder(
      io.kubernetes.client.openapi.models.CoreV1EndpointPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort build() {
    CoreV1EndpointPort buildable = new CoreV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CoreV1EndpointPortBuilder that = (CoreV1EndpointPortBuilder) o;
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
