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

public class CoreV1EventListBuilder
    extends io.kubernetes.client.openapi.models.CoreV1EventListFluentImpl<
        io.kubernetes.client.openapi.models.CoreV1EventListBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.CoreV1EventList,
        io.kubernetes.client.openapi.models.CoreV1EventListBuilder> {
  public CoreV1EventListBuilder() {
    this(false);
  }

  public CoreV1EventListBuilder(java.lang.Boolean validationEnabled) {
    this(new CoreV1EventList(), validationEnabled);
  }

  public CoreV1EventListBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventListFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EventListBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new CoreV1EventList(), validationEnabled);
  }

  public CoreV1EventListBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventListFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1EventList instance) {
    this(fluent, instance, false);
  }

  public CoreV1EventListBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventListFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1EventList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EventListBuilder(io.kubernetes.client.openapi.models.CoreV1EventList instance) {
    this(instance, false);
  }

  public CoreV1EventListBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.CoreV1EventListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.CoreV1EventList build() {
    CoreV1EventList buildable = new CoreV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CoreV1EventListBuilder that = (CoreV1EventListBuilder) o;
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
