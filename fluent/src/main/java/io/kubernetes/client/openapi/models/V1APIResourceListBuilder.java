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

public class V1APIResourceListBuilder extends V1APIResourceListFluentImpl<V1APIResourceListBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1APIResourceList, V1APIResourceListBuilder> {
  public V1APIResourceListBuilder() {
    this(false);
  }

  public V1APIResourceListBuilder(Boolean validationEnabled) {
    this(new V1APIResourceList(), validationEnabled);
  }

  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIResourceListBuilder(
      io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1APIResourceList(), validationEnabled);
  }

  public V1APIResourceListBuilder(
      io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIResourceList instance) {
    this(fluent, instance, false);
  }

  public V1APIResourceListBuilder(
      io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIResourceList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withGroupVersion(instance.getGroupVersion());

    fluent.withKind(instance.getKind());

    fluent.withResources(instance.getResources());

    this.validationEnabled = validationEnabled;
  }

  public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceList instance) {
    this(instance, false);
  }

  public V1APIResourceListBuilder(
      io.kubernetes.client.openapi.models.V1APIResourceList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withGroupVersion(instance.getGroupVersion());

    this.withKind(instance.getKind());

    this.withResources(instance.getResources());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1APIResourceList build() {
    V1APIResourceList buildable = new V1APIResourceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setKind(fluent.getKind());
    buildable.setResources(fluent.getResources());
    return buildable;
  }
}
