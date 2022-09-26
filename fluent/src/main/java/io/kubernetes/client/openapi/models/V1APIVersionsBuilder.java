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

public class V1APIVersionsBuilder extends V1APIVersionsFluentImpl<V1APIVersionsBuilder>
    implements VisitableBuilder<V1APIVersions, V1APIVersionsBuilder> {
  public V1APIVersionsBuilder() {
    this(false);
  }

  public V1APIVersionsBuilder(Boolean validationEnabled) {
    this(new V1APIVersions(), validationEnabled);
  }

  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1APIVersions(), validationEnabled);
  }

  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent, V1APIVersions instance) {
    this(fluent, instance, false);
  }

  public V1APIVersionsBuilder(
      V1APIVersionsFluent<?> fluent, V1APIVersions instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1APIVersionsBuilder(V1APIVersions instance) {
    this(instance, false);
  }

  public V1APIVersionsBuilder(V1APIVersions instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  V1APIVersionsFluent<?> fluent;
  Boolean validationEnabled;

  public V1APIVersions build() {
    V1APIVersions buildable = new V1APIVersions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
}
