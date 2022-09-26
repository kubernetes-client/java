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

public class V1EndpointSubsetBuilder extends V1EndpointSubsetFluentImpl<V1EndpointSubsetBuilder>
    implements VisitableBuilder<V1EndpointSubset, V1EndpointSubsetBuilder> {
  public V1EndpointSubsetBuilder() {
    this(false);
  }

  public V1EndpointSubsetBuilder(Boolean validationEnabled) {
    this(new V1EndpointSubset(), validationEnabled);
  }

  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1EndpointSubset(), validationEnabled);
  }

  public V1EndpointSubsetBuilder(V1EndpointSubsetFluent<?> fluent, V1EndpointSubset instance) {
    this(fluent, instance, false);
  }

  public V1EndpointSubsetBuilder(
      V1EndpointSubsetFluent<?> fluent, V1EndpointSubset instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddresses(instance.getAddresses());

    fluent.withNotReadyAddresses(instance.getNotReadyAddresses());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointSubsetBuilder(V1EndpointSubset instance) {
    this(instance, false);
  }

  public V1EndpointSubsetBuilder(V1EndpointSubset instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAddresses(instance.getAddresses());

    this.withNotReadyAddresses(instance.getNotReadyAddresses());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  V1EndpointSubsetFluent<?> fluent;
  Boolean validationEnabled;

  public V1EndpointSubset build() {
    V1EndpointSubset buildable = new V1EndpointSubset();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setNotReadyAddresses(fluent.getNotReadyAddresses());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
}
