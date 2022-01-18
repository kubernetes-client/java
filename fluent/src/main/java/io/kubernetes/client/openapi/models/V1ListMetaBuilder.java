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

public class V1ListMetaBuilder
    extends io.kubernetes.client.openapi.models.V1ListMetaFluentImpl<
        io.kubernetes.client.openapi.models.V1ListMetaBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ListMeta,
        io.kubernetes.client.openapi.models.V1ListMetaBuilder> {
  public V1ListMetaBuilder() {
    this(false);
  }

  public V1ListMetaBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ListMeta(), validationEnabled);
  }

  public V1ListMetaBuilder(io.kubernetes.client.openapi.models.V1ListMetaFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ListMetaBuilder(
      io.kubernetes.client.openapi.models.V1ListMetaFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ListMeta(), validationEnabled);
  }

  public V1ListMetaBuilder(
      io.kubernetes.client.openapi.models.V1ListMetaFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ListMeta instance) {
    this(fluent, instance, false);
  }

  public V1ListMetaBuilder(
      io.kubernetes.client.openapi.models.V1ListMetaFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ListMeta instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContinue(instance.getContinue());

    fluent.withRemainingItemCount(instance.getRemainingItemCount());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withSelfLink(instance.getSelfLink());

    this.validationEnabled = validationEnabled;
  }

  public V1ListMetaBuilder(io.kubernetes.client.openapi.models.V1ListMeta instance) {
    this(instance, false);
  }

  public V1ListMetaBuilder(
      io.kubernetes.client.openapi.models.V1ListMeta instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContinue(instance.getContinue());

    this.withRemainingItemCount(instance.getRemainingItemCount());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ListMetaFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ListMeta build() {
    V1ListMeta buildable = new V1ListMeta();
    buildable.setContinue(fluent.getContinue());
    buildable.setRemainingItemCount(fluent.getRemainingItemCount());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ListMetaBuilder that = (V1ListMetaBuilder) o;
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
