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

public class V1CSIDriverBuilder extends V1CSIDriverFluentImpl<V1CSIDriverBuilder>
    implements VisitableBuilder<V1CSIDriver, V1CSIDriverBuilder> {
  public V1CSIDriverBuilder() {
    this(false);
  }

  public V1CSIDriverBuilder(Boolean validationEnabled) {
    this(new V1CSIDriver(), validationEnabled);
  }

  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CSIDriver(), validationEnabled);
  }

  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent, V1CSIDriver instance) {
    this(fluent, instance, false);
  }

  public V1CSIDriverBuilder(
      V1CSIDriverFluent<?> fluent, V1CSIDriver instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1CSIDriverBuilder(V1CSIDriver instance) {
    this(instance, false);
  }

  public V1CSIDriverBuilder(V1CSIDriver instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  V1CSIDriverFluent<?> fluent;
  Boolean validationEnabled;

  public V1CSIDriver build() {
    V1CSIDriver buildable = new V1CSIDriver();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}
