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

public class V1StatusDetailsBuilder
    extends io.kubernetes.client.openapi.models.V1StatusDetailsFluentImpl<
        io.kubernetes.client.openapi.models.V1StatusDetailsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StatusDetails,
        io.kubernetes.client.openapi.models.V1StatusDetailsBuilder> {
  public V1StatusDetailsBuilder() {
    this(false);
  }

  public V1StatusDetailsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1StatusDetails(), validationEnabled);
  }

  public V1StatusDetailsBuilder(
      io.kubernetes.client.openapi.models.V1StatusDetailsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatusDetailsBuilder(
      io.kubernetes.client.openapi.models.V1StatusDetailsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StatusDetails(), validationEnabled);
  }

  public V1StatusDetailsBuilder(
      io.kubernetes.client.openapi.models.V1StatusDetailsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatusDetails instance) {
    this(fluent, instance, false);
  }

  public V1StatusDetailsBuilder(
      io.kubernetes.client.openapi.models.V1StatusDetailsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatusDetails instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCauses(instance.getCauses());

    fluent.withGroup(instance.getGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1StatusDetailsBuilder(io.kubernetes.client.openapi.models.V1StatusDetails instance) {
    this(instance, false);
  }

  public V1StatusDetailsBuilder(
      io.kubernetes.client.openapi.models.V1StatusDetails instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCauses(instance.getCauses());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatusDetailsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StatusDetails build() {
    V1StatusDetails buildable = new V1StatusDetails();
    buildable.setCauses(fluent.getCauses());
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setRetryAfterSeconds(fluent.getRetryAfterSeconds());
    buildable.setUid(fluent.getUid());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatusDetailsBuilder that = (V1StatusDetailsBuilder) o;
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
