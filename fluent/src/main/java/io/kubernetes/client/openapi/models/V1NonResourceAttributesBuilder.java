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

public class V1NonResourceAttributesBuilder
    extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluentImpl<
        io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NonResourceAttributes,
        io.kubernetes.client.openapi.models.V1NonResourceAttributesBuilder> {
  public V1NonResourceAttributesBuilder() {
    this(false);
  }

  public V1NonResourceAttributesBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NonResourceAttributes(), validationEnabled);
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NonResourceAttributes(), validationEnabled);
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NonResourceAttributes instance) {
    this(fluent, instance, false);
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NonResourceAttributes instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPath(instance.getPath());

    fluent.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled;
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes instance) {
    this(instance, false);
  }

  public V1NonResourceAttributesBuilder(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPath(instance.getPath());

    this.withVerb(instance.getVerb());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NonResourceAttributes build() {
    V1NonResourceAttributes buildable = new V1NonResourceAttributes();
    buildable.setPath(fluent.getPath());
    buildable.setVerb(fluent.getVerb());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NonResourceAttributesBuilder that = (V1NonResourceAttributesBuilder) o;
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
