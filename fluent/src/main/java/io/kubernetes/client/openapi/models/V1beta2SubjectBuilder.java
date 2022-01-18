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

public class V1beta2SubjectBuilder
    extends io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl<
        io.kubernetes.client.openapi.models.V1beta2SubjectBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2Subject,
        io.kubernetes.client.openapi.models.V1beta2SubjectBuilder> {
  public V1beta2SubjectBuilder() {
    this(false);
  }

  public V1beta2SubjectBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2Subject(), validationEnabled);
  }

  public V1beta2SubjectBuilder(io.kubernetes.client.openapi.models.V1beta2SubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2SubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2SubjectFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2Subject(), validationEnabled);
  }

  public V1beta2SubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2SubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2Subject instance) {
    this(fluent, instance, false);
  }

  public V1beta2SubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2SubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2Subject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withGroup(instance.getGroup());

    fluent.withKind(instance.getKind());

    fluent.withServiceAccount(instance.getServiceAccount());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2SubjectBuilder(io.kubernetes.client.openapi.models.V1beta2Subject instance) {
    this(instance, false);
  }

  public V1beta2SubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2Subject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withServiceAccount(instance.getServiceAccount());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2SubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2Subject build() {
    V1beta2Subject buildable = new V1beta2Subject();
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setServiceAccount(fluent.getServiceAccount());
    buildable.setUser(fluent.getUser());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2SubjectBuilder that = (V1beta2SubjectBuilder) o;
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
