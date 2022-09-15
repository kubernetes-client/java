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

public class V1CustomResourceConversionBuilder
    extends V1CustomResourceConversionFluentImpl<V1CustomResourceConversionBuilder>
    implements VisitableBuilder<V1CustomResourceConversion, V1CustomResourceConversionBuilder> {
  public V1CustomResourceConversionBuilder() {
    this(false);
  }

  public V1CustomResourceConversionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceConversion(), validationEnabled);
  }

  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceConversionBuilder(
      V1CustomResourceConversionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CustomResourceConversion(), validationEnabled);
  }

  public V1CustomResourceConversionBuilder(
      V1CustomResourceConversionFluent<?> fluent, V1CustomResourceConversion instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceConversionBuilder(
      V1CustomResourceConversionFluent<?> fluent,
      V1CustomResourceConversion instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withStrategy(instance.getStrategy());

    fluent.withWebhook(instance.getWebhook());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceConversionBuilder(V1CustomResourceConversion instance) {
    this(instance, false);
  }

  public V1CustomResourceConversionBuilder(
      V1CustomResourceConversion instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withStrategy(instance.getStrategy());

    this.withWebhook(instance.getWebhook());

    this.validationEnabled = validationEnabled;
  }

  V1CustomResourceConversionFluent<?> fluent;
  Boolean validationEnabled;

  public V1CustomResourceConversion build() {
    V1CustomResourceConversion buildable = new V1CustomResourceConversion();
    buildable.setStrategy(fluent.getStrategy());
    buildable.setWebhook(fluent.getWebhook());
    return buildable;
  }
}
