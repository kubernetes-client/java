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

public class V1ListMetaBuilder extends V1ListMetaFluentImpl<V1ListMetaBuilder>
    implements VisitableBuilder<V1ListMeta, V1ListMetaBuilder> {
  public V1ListMetaBuilder() {
    this(false);
  }

  public V1ListMetaBuilder(Boolean validationEnabled) {
    this(new V1ListMeta(), validationEnabled);
  }

  public V1ListMetaBuilder(V1ListMetaFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ListMetaBuilder(V1ListMetaFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ListMeta(), validationEnabled);
  }

  public V1ListMetaBuilder(V1ListMetaFluent<?> fluent, V1ListMeta instance) {
    this(fluent, instance, false);
  }

  public V1ListMetaBuilder(
      V1ListMetaFluent<?> fluent, V1ListMeta instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContinue(instance.getContinue());

    fluent.withRemainingItemCount(instance.getRemainingItemCount());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withSelfLink(instance.getSelfLink());

    this.validationEnabled = validationEnabled;
  }

  public V1ListMetaBuilder(V1ListMeta instance) {
    this(instance, false);
  }

  public V1ListMetaBuilder(V1ListMeta instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withContinue(instance.getContinue());

    this.withRemainingItemCount(instance.getRemainingItemCount());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());

    this.validationEnabled = validationEnabled;
  }

  V1ListMetaFluent<?> fluent;
  Boolean validationEnabled;

  public V1ListMeta build() {
    V1ListMeta buildable = new V1ListMeta();
    buildable.setContinue(fluent.getContinue());
    buildable.setRemainingItemCount(fluent.getRemainingItemCount());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    return buildable;
  }
}
