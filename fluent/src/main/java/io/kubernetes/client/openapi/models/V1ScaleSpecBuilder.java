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

public class V1ScaleSpecBuilder extends V1ScaleSpecFluentImpl<V1ScaleSpecBuilder>
    implements VisitableBuilder<V1ScaleSpec, V1ScaleSpecBuilder> {
  public V1ScaleSpecBuilder() {
    this(false);
  }

  public V1ScaleSpecBuilder(Boolean validationEnabled) {
    this(new V1ScaleSpec(), validationEnabled);
  }

  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ScaleSpec(), validationEnabled);
  }

  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent, V1ScaleSpec instance) {
    this(fluent, instance, false);
  }

  public V1ScaleSpecBuilder(
      V1ScaleSpecFluent<?> fluent, V1ScaleSpec instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1ScaleSpecBuilder(V1ScaleSpec instance) {
    this(instance, false);
  }

  public V1ScaleSpecBuilder(V1ScaleSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  V1ScaleSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1ScaleSpec build() {
    V1ScaleSpec buildable = new V1ScaleSpec();
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
}
