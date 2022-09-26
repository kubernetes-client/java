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

public class V1NonResourceAttributesBuilder
    extends V1NonResourceAttributesFluentImpl<V1NonResourceAttributesBuilder>
    implements VisitableBuilder<V1NonResourceAttributes, V1NonResourceAttributesBuilder> {
  public V1NonResourceAttributesBuilder() {
    this(false);
  }

  public V1NonResourceAttributesBuilder(Boolean validationEnabled) {
    this(new V1NonResourceAttributes(), validationEnabled);
  }

  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NonResourceAttributesBuilder(
      V1NonResourceAttributesFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NonResourceAttributes(), validationEnabled);
  }

  public V1NonResourceAttributesBuilder(
      V1NonResourceAttributesFluent<?> fluent, V1NonResourceAttributes instance) {
    this(fluent, instance, false);
  }

  public V1NonResourceAttributesBuilder(
      V1NonResourceAttributesFluent<?> fluent,
      V1NonResourceAttributes instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPath(instance.getPath());

    fluent.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled;
  }

  public V1NonResourceAttributesBuilder(V1NonResourceAttributes instance) {
    this(instance, false);
  }

  public V1NonResourceAttributesBuilder(
      V1NonResourceAttributes instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPath(instance.getPath());

    this.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled;
  }

  V1NonResourceAttributesFluent<?> fluent;
  Boolean validationEnabled;

  public V1NonResourceAttributes build() {
    V1NonResourceAttributes buildable = new V1NonResourceAttributes();
    buildable.setPath(fluent.getPath());
    buildable.setVerb(fluent.getVerb());
    return buildable;
  }
}
