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

public class V1CustomResourceDefinitionVersionBuilder
    extends V1CustomResourceDefinitionVersionFluentImpl<V1CustomResourceDefinitionVersionBuilder>
    implements VisitableBuilder<
        V1CustomResourceDefinitionVersion, V1CustomResourceDefinitionVersionBuilder> {
  public V1CustomResourceDefinitionVersionBuilder() {
    this(false);
  }

  public V1CustomResourceDefinitionVersionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionVersion(), validationEnabled);
  }

  public V1CustomResourceDefinitionVersionBuilder(
      V1CustomResourceDefinitionVersionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceDefinitionVersionBuilder(
      V1CustomResourceDefinitionVersionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionVersion(), validationEnabled);
  }

  public V1CustomResourceDefinitionVersionBuilder(
      V1CustomResourceDefinitionVersionFluent<?> fluent,
      V1CustomResourceDefinitionVersion instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceDefinitionVersionBuilder(
      V1CustomResourceDefinitionVersionFluent<?> fluent,
      V1CustomResourceDefinitionVersion instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());

    fluent.withDeprecated(instance.getDeprecated());

    fluent.withDeprecationWarning(instance.getDeprecationWarning());

    fluent.withName(instance.getName());

    fluent.withSchema(instance.getSchema());

    fluent.withServed(instance.getServed());

    fluent.withStorage(instance.getStorage());

    fluent.withSubresources(instance.getSubresources());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceDefinitionVersionBuilder(V1CustomResourceDefinitionVersion instance) {
    this(instance, false);
  }

  public V1CustomResourceDefinitionVersionBuilder(
      V1CustomResourceDefinitionVersion instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());

    this.withDeprecated(instance.getDeprecated());

    this.withDeprecationWarning(instance.getDeprecationWarning());

    this.withName(instance.getName());

    this.withSchema(instance.getSchema());

    this.withServed(instance.getServed());

    this.withStorage(instance.getStorage());

    this.withSubresources(instance.getSubresources());

    this.validationEnabled = validationEnabled;
  }

  V1CustomResourceDefinitionVersionFluent<?> fluent;
  Boolean validationEnabled;

  public V1CustomResourceDefinitionVersion build() {
    V1CustomResourceDefinitionVersion buildable = new V1CustomResourceDefinitionVersion();
    buildable.setAdditionalPrinterColumns(fluent.getAdditionalPrinterColumns());
    buildable.setDeprecated(fluent.getDeprecated());
    buildable.setDeprecationWarning(fluent.getDeprecationWarning());
    buildable.setName(fluent.getName());
    buildable.setSchema(fluent.getSchema());
    buildable.setServed(fluent.getServed());
    buildable.setStorage(fluent.getStorage());
    buildable.setSubresources(fluent.getSubresources());
    return buildable;
  }
}
