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

public class V1ClusterRoleBindingListBuilder
    extends V1ClusterRoleBindingListFluentImpl<V1ClusterRoleBindingListBuilder>
    implements VisitableBuilder<V1ClusterRoleBindingList, V1ClusterRoleBindingListBuilder> {
  public V1ClusterRoleBindingListBuilder() {
    this(false);
  }

  public V1ClusterRoleBindingListBuilder(Boolean validationEnabled) {
    this(new V1ClusterRoleBindingList(), validationEnabled);
  }

  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ClusterRoleBindingListBuilder(
      V1ClusterRoleBindingListFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ClusterRoleBindingList(), validationEnabled);
  }

  public V1ClusterRoleBindingListBuilder(
      V1ClusterRoleBindingListFluent<?> fluent, V1ClusterRoleBindingList instance) {
    this(fluent, instance, false);
  }

  public V1ClusterRoleBindingListBuilder(
      V1ClusterRoleBindingListFluent<?> fluent,
      V1ClusterRoleBindingList instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingList instance) {
    this(instance, false);
  }

  public V1ClusterRoleBindingListBuilder(
      V1ClusterRoleBindingList instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  V1ClusterRoleBindingListFluent<?> fluent;
  Boolean validationEnabled;

  public V1ClusterRoleBindingList build() {
    V1ClusterRoleBindingList buildable = new V1ClusterRoleBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
