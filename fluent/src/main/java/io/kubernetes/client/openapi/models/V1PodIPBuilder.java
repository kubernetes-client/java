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

public class V1PodIPBuilder
    extends io.kubernetes.client.openapi.models.V1PodIPFluentImpl<
        io.kubernetes.client.openapi.models.V1PodIPBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodIP,
        io.kubernetes.client.openapi.models.V1PodIPBuilder> {
  public V1PodIPBuilder() {
    this(false);
  }

  public V1PodIPBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodIP(), validationEnabled);
  }

  public V1PodIPBuilder(io.kubernetes.client.openapi.models.V1PodIPFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodIPBuilder(
      io.kubernetes.client.openapi.models.V1PodIPFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodIP(), validationEnabled);
  }

  public V1PodIPBuilder(
      io.kubernetes.client.openapi.models.V1PodIPFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodIP instance) {
    this(fluent, instance, false);
  }

  public V1PodIPBuilder(
      io.kubernetes.client.openapi.models.V1PodIPFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodIP instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withIp(instance.getIp());

    this.validationEnabled = validationEnabled;
  }

  public V1PodIPBuilder(io.kubernetes.client.openapi.models.V1PodIP instance) {
    this(instance, false);
  }

  public V1PodIPBuilder(
      io.kubernetes.client.openapi.models.V1PodIP instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withIp(instance.getIp());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodIPFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodIP build() {
    V1PodIP buildable = new V1PodIP();
    buildable.setIp(fluent.getIp());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodIPBuilder that = (V1PodIPBuilder) o;
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
