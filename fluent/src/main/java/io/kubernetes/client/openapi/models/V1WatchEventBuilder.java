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

public class V1WatchEventBuilder
    extends io.kubernetes.client.openapi.models.V1WatchEventFluentImpl<
        io.kubernetes.client.openapi.models.V1WatchEventBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1WatchEvent,
        io.kubernetes.client.openapi.models.V1WatchEventBuilder> {
  public V1WatchEventBuilder() {
    this(false);
  }

  public V1WatchEventBuilder(java.lang.Boolean validationEnabled) {
    this(new V1WatchEvent(), validationEnabled);
  }

  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent) {
    this(fluent, false);
  }

  public V1WatchEventBuilder(
      io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1WatchEvent(), validationEnabled);
  }

  public V1WatchEventBuilder(
      io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1WatchEvent instance) {
    this(fluent, instance, false);
  }

  public V1WatchEventBuilder(
      io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1WatchEvent instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withObject(instance.getObject());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1WatchEventBuilder(io.kubernetes.client.openapi.models.V1WatchEvent instance) {
    this(instance, false);
  }

  public V1WatchEventBuilder(
      io.kubernetes.client.openapi.models.V1WatchEvent instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withObject(instance.getObject());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1WatchEventFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1WatchEvent build() {
    V1WatchEvent buildable = new V1WatchEvent();
    buildable.setObject(fluent.getObject());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WatchEventBuilder that = (V1WatchEventBuilder) o;
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
