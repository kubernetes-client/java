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

public class V1beta1EndpointBuilder
    extends io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1EndpointBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1Endpoint,
        io.kubernetes.client.openapi.models.V1beta1EndpointBuilder> {
  public V1beta1EndpointBuilder() {
    this(false);
  }

  public V1beta1EndpointBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1Endpoint(), validationEnabled);
  }

  public V1beta1EndpointBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1Endpoint(), validationEnabled);
  }

  public V1beta1EndpointBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Endpoint instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Endpoint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddresses(instance.getAddresses());

    fluent.withConditions(instance.getConditions());

    fluent.withHints(instance.getHints());

    fluent.withHostname(instance.getHostname());

    fluent.withNodeName(instance.getNodeName());

    fluent.withTargetRef(instance.getTargetRef());

    fluent.withTopology(instance.getTopology());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointBuilder(io.kubernetes.client.openapi.models.V1beta1Endpoint instance) {
    this(instance, false);
  }

  public V1beta1EndpointBuilder(
      io.kubernetes.client.openapi.models.V1beta1Endpoint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddresses(instance.getAddresses());

    this.withConditions(instance.getConditions());

    this.withHints(instance.getHints());

    this.withHostname(instance.getHostname());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

    this.withTopology(instance.getTopology());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1Endpoint build() {
    V1beta1Endpoint buildable = new V1beta1Endpoint();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setConditions(fluent.getConditions());
    buildable.setHints(fluent.getHints());
    buildable.setHostname(fluent.getHostname());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.getTargetRef());
    buildable.setTopology(fluent.getTopology());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1EndpointBuilder that = (V1beta1EndpointBuilder) o;
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
