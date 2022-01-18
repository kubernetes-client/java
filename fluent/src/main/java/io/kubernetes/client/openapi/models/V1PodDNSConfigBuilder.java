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

public class V1PodDNSConfigBuilder
    extends io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl<
        io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodDNSConfig,
        io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder> {
  public V1PodDNSConfigBuilder() {
    this(false);
  }

  public V1PodDNSConfigBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodDNSConfig(), validationEnabled);
  }

  public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodDNSConfigBuilder(
      io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodDNSConfig(), validationEnabled);
  }

  public V1PodDNSConfigBuilder(
      io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDNSConfig instance) {
    this(fluent, instance, false);
  }

  public V1PodDNSConfigBuilder(
      io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDNSConfig instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNameservers(instance.getNameservers());

    fluent.withOptions(instance.getOptions());

    fluent.withSearches(instance.getSearches());

    this.validationEnabled = validationEnabled;
  }

  public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfig instance) {
    this(instance, false);
  }

  public V1PodDNSConfigBuilder(
      io.kubernetes.client.openapi.models.V1PodDNSConfig instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNameservers(instance.getNameservers());

    this.withOptions(instance.getOptions());

    this.withSearches(instance.getSearches());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodDNSConfig build() {
    V1PodDNSConfig buildable = new V1PodDNSConfig();
    buildable.setNameservers(fluent.getNameservers());
    buildable.setOptions(fluent.getOptions());
    buildable.setSearches(fluent.getSearches());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDNSConfigBuilder that = (V1PodDNSConfigBuilder) o;
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
