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

public class V1DeleteOptionsBuilder
    extends io.kubernetes.client.openapi.models.V1DeleteOptionsFluentImpl<
        io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DeleteOptions,
        io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder> {
  public V1DeleteOptionsBuilder() {
    this(false);
  }

  public V1DeleteOptionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DeleteOptions(), validationEnabled);
  }

  public V1DeleteOptionsBuilder(
      io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DeleteOptionsBuilder(
      io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DeleteOptions(), validationEnabled);
  }

  public V1DeleteOptionsBuilder(
      io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeleteOptions instance) {
    this(fluent, instance, false);
  }

  public V1DeleteOptionsBuilder(
      io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeleteOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDryRun(instance.getDryRun());

    fluent.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    fluent.withKind(instance.getKind());

    fluent.withOrphanDependents(instance.getOrphanDependents());

    fluent.withPreconditions(instance.getPreconditions());

    fluent.withPropagationPolicy(instance.getPropagationPolicy());

    this.validationEnabled = validationEnabled;
  }

  public V1DeleteOptionsBuilder(io.kubernetes.client.openapi.models.V1DeleteOptions instance) {
    this(instance, false);
  }

  public V1DeleteOptionsBuilder(
      io.kubernetes.client.openapi.models.V1DeleteOptions instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withDryRun(instance.getDryRun());

    this.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    this.withKind(instance.getKind());

    this.withOrphanDependents(instance.getOrphanDependents());

    this.withPreconditions(instance.getPreconditions());

    this.withPropagationPolicy(instance.getPropagationPolicy());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DeleteOptions build() {
    V1DeleteOptions buildable = new V1DeleteOptions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDryRun(fluent.getDryRun());
    buildable.setGracePeriodSeconds(fluent.getGracePeriodSeconds());
    buildable.setKind(fluent.getKind());
    buildable.setOrphanDependents(fluent.getOrphanDependents());
    buildable.setPreconditions(fluent.getPreconditions());
    buildable.setPropagationPolicy(fluent.getPropagationPolicy());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeleteOptionsBuilder that = (V1DeleteOptionsBuilder) o;
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
