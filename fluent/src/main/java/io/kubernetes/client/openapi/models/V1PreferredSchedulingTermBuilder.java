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

public class V1PreferredSchedulingTermBuilder
    extends V1PreferredSchedulingTermFluentImpl<V1PreferredSchedulingTermBuilder>
    implements VisitableBuilder<V1PreferredSchedulingTerm, V1PreferredSchedulingTermBuilder> {
  public V1PreferredSchedulingTermBuilder() {
    this(false);
  }

  public V1PreferredSchedulingTermBuilder(Boolean validationEnabled) {
    this(new V1PreferredSchedulingTerm(), validationEnabled);
  }

  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PreferredSchedulingTermBuilder(
      V1PreferredSchedulingTermFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PreferredSchedulingTerm(), validationEnabled);
  }

  public V1PreferredSchedulingTermBuilder(
      V1PreferredSchedulingTermFluent<?> fluent, V1PreferredSchedulingTerm instance) {
    this(fluent, instance, false);
  }

  public V1PreferredSchedulingTermBuilder(
      V1PreferredSchedulingTermFluent<?> fluent,
      V1PreferredSchedulingTerm instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPreference(instance.getPreference());

    fluent.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTerm instance) {
    this(instance, false);
  }

  public V1PreferredSchedulingTermBuilder(
      V1PreferredSchedulingTerm instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPreference(instance.getPreference());

    this.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled;
  }

  V1PreferredSchedulingTermFluent<?> fluent;
  Boolean validationEnabled;

  public V1PreferredSchedulingTerm build() {
    V1PreferredSchedulingTerm buildable = new V1PreferredSchedulingTerm();
    buildable.setPreference(fluent.getPreference());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
}
