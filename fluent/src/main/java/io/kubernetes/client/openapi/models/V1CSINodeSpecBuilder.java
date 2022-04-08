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

public class V1CSINodeSpecBuilder extends V1CSINodeSpecFluentImpl<V1CSINodeSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSINodeSpec,
        io.kubernetes.client.openapi.models.V1CSINodeSpecBuilder> {
  public V1CSINodeSpecBuilder() {
    this(false);
  }

  public V1CSINodeSpecBuilder(Boolean validationEnabled) {
    this(new V1CSINodeSpec(), validationEnabled);
  }

  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSINodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSINodeSpec(), validationEnabled);
  }

  public V1CSINodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINodeSpec instance) {
    this(fluent, instance, false);
  }

  public V1CSINodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINodeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDrivers(instance.getDrivers());

    this.validationEnabled = validationEnabled;
  }

  public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpec instance) {
    this(instance, false);
  }

  public V1CSINodeSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDrivers(instance.getDrivers());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSINodeSpec build() {
    V1CSINodeSpec buildable = new V1CSINodeSpec();
    buildable.setDrivers(fluent.getDrivers());
    return buildable;
  }
}
