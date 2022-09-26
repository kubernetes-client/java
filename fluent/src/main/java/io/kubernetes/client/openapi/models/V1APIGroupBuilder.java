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

public class V1APIGroupBuilder extends V1APIGroupFluentImpl<V1APIGroupBuilder>
    implements VisitableBuilder<V1APIGroup, V1APIGroupBuilder> {
  public V1APIGroupBuilder() {
    this(false);
  }

  public V1APIGroupBuilder(Boolean validationEnabled) {
    this(new V1APIGroup(), validationEnabled);
  }

  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1APIGroup(), validationEnabled);
  }

  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent, V1APIGroup instance) {
    this(fluent, instance, false);
  }

  public V1APIGroupBuilder(
      V1APIGroupFluent<?> fluent, V1APIGroup instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withPreferredVersion(instance.getPreferredVersion());

    fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1APIGroupBuilder(V1APIGroup instance) {
    this(instance, false);
  }

  public V1APIGroupBuilder(V1APIGroup instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withPreferredVersion(instance.getPreferredVersion());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  V1APIGroupFluent<?> fluent;
  Boolean validationEnabled;

  public V1APIGroup build() {
    V1APIGroup buildable = new V1APIGroup();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setPreferredVersion(fluent.getPreferredVersion());
    buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
}
