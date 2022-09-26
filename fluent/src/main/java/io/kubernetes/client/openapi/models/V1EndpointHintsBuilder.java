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

public class V1EndpointHintsBuilder extends V1EndpointHintsFluentImpl<V1EndpointHintsBuilder>
    implements VisitableBuilder<V1EndpointHints, V1EndpointHintsBuilder> {
  public V1EndpointHintsBuilder() {
    this(false);
  }

  public V1EndpointHintsBuilder(Boolean validationEnabled) {
    this(new V1EndpointHints(), validationEnabled);
  }

  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1EndpointHints(), validationEnabled);
  }

  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent, V1EndpointHints instance) {
    this(fluent, instance, false);
  }

  public V1EndpointHintsBuilder(
      V1EndpointHintsFluent<?> fluent, V1EndpointHints instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointHintsBuilder(V1EndpointHints instance) {
    this(instance, false);
  }

  public V1EndpointHintsBuilder(V1EndpointHints instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  V1EndpointHintsFluent<?> fluent;
  Boolean validationEnabled;

  public V1EndpointHints build() {
    V1EndpointHints buildable = new V1EndpointHints();
    buildable.setForZones(fluent.getForZones());
    return buildable;
  }
}
