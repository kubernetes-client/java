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

public class V1APIGroupListBuilder extends V1APIGroupListFluentImpl<V1APIGroupListBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1APIGroupList,
        io.kubernetes.client.openapi.models.V1APIGroupListBuilder> {
  public V1APIGroupListBuilder() {
    this(false);
  }

  public V1APIGroupListBuilder(Boolean validationEnabled) {
    this(new V1APIGroupList(), validationEnabled);
  }

  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIGroupListBuilder(
      io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1APIGroupList(), validationEnabled);
  }

  public V1APIGroupListBuilder(
      io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIGroupList instance) {
    this(fluent, instance, false);
  }

  public V1APIGroupListBuilder(
      io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIGroupList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withGroups(instance.getGroups());

    fluent.withKind(instance.getKind());

    this.validationEnabled = validationEnabled;
  }

  public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupList instance) {
    this(instance, false);
  }

  public V1APIGroupListBuilder(
      io.kubernetes.client.openapi.models.V1APIGroupList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withGroups(instance.getGroups());

    this.withKind(instance.getKind());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1APIGroupList build() {
    V1APIGroupList buildable = new V1APIGroupList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroups(fluent.getGroups());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
}
