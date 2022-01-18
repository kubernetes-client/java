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

public class V1SELinuxOptionsBuilder
    extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluentImpl<
        io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SELinuxOptions,
        io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder> {
  public V1SELinuxOptionsBuilder() {
    this(false);
  }

  public V1SELinuxOptionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SELinuxOptions(), validationEnabled);
  }

  public V1SELinuxOptionsBuilder(
      io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SELinuxOptionsBuilder(
      io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SELinuxOptions(), validationEnabled);
  }

  public V1SELinuxOptionsBuilder(
      io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SELinuxOptions instance) {
    this(fluent, instance, false);
  }

  public V1SELinuxOptionsBuilder(
      io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SELinuxOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLevel(instance.getLevel());

    fluent.withRole(instance.getRole());

    fluent.withType(instance.getType());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  public V1SELinuxOptionsBuilder(io.kubernetes.client.openapi.models.V1SELinuxOptions instance) {
    this(instance, false);
  }

  public V1SELinuxOptionsBuilder(
      io.kubernetes.client.openapi.models.V1SELinuxOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLevel(instance.getLevel());

    this.withRole(instance.getRole());

    this.withType(instance.getType());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SELinuxOptions build() {
    V1SELinuxOptions buildable = new V1SELinuxOptions();
    buildable.setLevel(fluent.getLevel());
    buildable.setRole(fluent.getRole());
    buildable.setType(fluent.getType());
    buildable.setUser(fluent.getUser());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SELinuxOptionsBuilder that = (V1SELinuxOptionsBuilder) o;
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
