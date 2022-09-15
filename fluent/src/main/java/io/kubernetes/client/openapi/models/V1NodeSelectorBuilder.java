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

public class V1NodeSelectorBuilder extends V1NodeSelectorFluentImpl<V1NodeSelectorBuilder>
    implements VisitableBuilder<V1NodeSelector, V1NodeSelectorBuilder> {
  public V1NodeSelectorBuilder() {
    this(false);
  }

  public V1NodeSelectorBuilder(Boolean validationEnabled) {
    this(new V1NodeSelector(), validationEnabled);
  }

  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeSelector(), validationEnabled);
  }

  public V1NodeSelectorBuilder(V1NodeSelectorFluent<?> fluent, V1NodeSelector instance) {
    this(fluent, instance, false);
  }

  public V1NodeSelectorBuilder(
      V1NodeSelectorFluent<?> fluent, V1NodeSelector instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNodeSelectorTerms(instance.getNodeSelectorTerms());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeSelectorBuilder(V1NodeSelector instance) {
    this(instance, false);
  }

  public V1NodeSelectorBuilder(V1NodeSelector instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withNodeSelectorTerms(instance.getNodeSelectorTerms());

    this.validationEnabled = validationEnabled;
  }

  V1NodeSelectorFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeSelector build() {
    V1NodeSelector buildable = new V1NodeSelector();
    buildable.setNodeSelectorTerms(fluent.getNodeSelectorTerms());
    return buildable;
  }
}
