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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1HostAliasBuilder extends V1HostAliasFluentImpl<V1HostAliasBuilder>
    implements VisitableBuilder<V1HostAlias, V1HostAliasBuilder> {
  public V1HostAliasBuilder() {
    this(false);
  }

  public V1HostAliasBuilder(Boolean validationEnabled) {
    this(new V1HostAlias(), validationEnabled);
  }

  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1HostAlias(), validationEnabled);
  }

  public V1HostAliasBuilder(V1HostAliasFluent<?> fluent, V1HostAlias instance) {
    this(fluent, instance, false);
  }

  public V1HostAliasBuilder(
      V1HostAliasFluent<?> fluent, V1HostAlias instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHostnames(instance.getHostnames());

    fluent.withIp(instance.getIp());

    this.validationEnabled = validationEnabled;
  }

  public V1HostAliasBuilder(V1HostAlias instance) {
    this(instance, false);
  }

  public V1HostAliasBuilder(V1HostAlias instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHostnames(instance.getHostnames());

    this.withIp(instance.getIp());

    this.validationEnabled = validationEnabled;
  }

  V1HostAliasFluent<?> fluent;
  Boolean validationEnabled;

  public V1HostAlias build() {
    V1HostAlias buildable = new V1HostAlias();
    buildable.setHostnames(fluent.getHostnames());
    buildable.setIp(fluent.getIp());
    return buildable;
  }
}
