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

public class V1DaemonSetSpecBuilder extends V1DaemonSetSpecFluentImpl<V1DaemonSetSpecBuilder>
    implements VisitableBuilder<V1DaemonSetSpec, V1DaemonSetSpecBuilder> {
  public V1DaemonSetSpecBuilder() {
    this(false);
  }

  public V1DaemonSetSpecBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetSpec(), validationEnabled);
  }

  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1DaemonSetSpec(), validationEnabled);
  }

  public V1DaemonSetSpecBuilder(V1DaemonSetSpecFluent<?> fluent, V1DaemonSetSpec instance) {
    this(fluent, instance, false);
  }

  public V1DaemonSetSpecBuilder(
      V1DaemonSetSpecFluent<?> fluent, V1DaemonSetSpec instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    fluent.withUpdateStrategy(instance.getUpdateStrategy());

    this.validationEnabled = validationEnabled;
  }

  public V1DaemonSetSpecBuilder(V1DaemonSetSpec instance) {
    this(instance, false);
  }

  public V1DaemonSetSpecBuilder(V1DaemonSetSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

    this.validationEnabled = validationEnabled;
  }

  V1DaemonSetSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1DaemonSetSpec build() {
    V1DaemonSetSpec buildable = new V1DaemonSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    buildable.setUpdateStrategy(fluent.getUpdateStrategy());
    return buildable;
  }
}
