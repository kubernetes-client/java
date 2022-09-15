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

public class V1ClientIPConfigBuilder extends V1ClientIPConfigFluentImpl<V1ClientIPConfigBuilder>
    implements VisitableBuilder<V1ClientIPConfig, V1ClientIPConfigBuilder> {
  public V1ClientIPConfigBuilder() {
    this(false);
  }

  public V1ClientIPConfigBuilder(Boolean validationEnabled) {
    this(new V1ClientIPConfig(), validationEnabled);
  }

  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ClientIPConfig(), validationEnabled);
  }

  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent, V1ClientIPConfig instance) {
    this(fluent, instance, false);
  }

  public V1ClientIPConfigBuilder(
      V1ClientIPConfigFluent<?> fluent, V1ClientIPConfig instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V1ClientIPConfigBuilder(V1ClientIPConfig instance) {
    this(instance, false);
  }

  public V1ClientIPConfigBuilder(V1ClientIPConfig instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  V1ClientIPConfigFluent<?> fluent;
  Boolean validationEnabled;

  public V1ClientIPConfig build() {
    V1ClientIPConfig buildable = new V1ClientIPConfig();
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
}
