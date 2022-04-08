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

public class V1beta1EndpointBuilder extends V1beta1EndpointFluentImpl<V1beta1EndpointBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1Endpoint, V1beta1EndpointBuilder> {
  public V1beta1EndpointBuilder() {
    this(false);
  }

  public V1beta1EndpointBuilder(Boolean validationEnabled) {
    this(new V1beta1Endpoint(), validationEnabled);
  }

  public V1beta1EndpointBuilder(V1beta1EndpointFluent<?> fluent) {
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
}
