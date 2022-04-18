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

public class V1IPBlockBuilder extends V1IPBlockFluentImpl<V1IPBlockBuilder>
    implements VisitableBuilder<V1IPBlock, io.kubernetes.client.openapi.models.V1IPBlockBuilder> {
  public V1IPBlockBuilder() {
    this(false);
  }

  public V1IPBlockBuilder(Boolean validationEnabled) {
    this(new V1IPBlock(), validationEnabled);
  }

  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IPBlockBuilder(
      io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1IPBlock(), validationEnabled);
  }

  public V1IPBlockBuilder(
      io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IPBlock instance) {
    this(fluent, instance, false);
  }

  public V1IPBlockBuilder(
      io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1IPBlock instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCidr(instance.getCidr());

    fluent.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled;
  }

  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlock instance) {
    this(instance, false);
  }

  public V1IPBlockBuilder(
      io.kubernetes.client.openapi.models.V1IPBlock instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCidr(instance.getCidr());

    this.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1IPBlock build() {
    V1IPBlock buildable = new V1IPBlock();
    buildable.setCidr(fluent.getCidr());
    buildable.setExcept(fluent.getExcept());
    return buildable;
  }
}
