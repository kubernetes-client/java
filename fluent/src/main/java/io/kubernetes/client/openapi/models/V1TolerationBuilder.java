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

public class V1TolerationBuilder extends V1TolerationFluentImpl<V1TolerationBuilder>
    implements VisitableBuilder<V1Toleration, V1TolerationBuilder> {
  public V1TolerationBuilder() {
    this(false);
  }

  public V1TolerationBuilder(Boolean validationEnabled) {
    this(new V1Toleration(), validationEnabled);
  }

  public V1TolerationBuilder(V1TolerationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TolerationBuilder(V1TolerationFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Toleration(), validationEnabled);
  }

  public V1TolerationBuilder(V1TolerationFluent<?> fluent, V1Toleration instance) {
    this(fluent, instance, false);
  }

  public V1TolerationBuilder(
      V1TolerationFluent<?> fluent, V1Toleration instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEffect(instance.getEffect());

    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withTolerationSeconds(instance.getTolerationSeconds());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V1TolerationBuilder(V1Toleration instance) {
    this(instance, false);
  }

  public V1TolerationBuilder(V1Toleration instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withTolerationSeconds(instance.getTolerationSeconds());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  V1TolerationFluent<?> fluent;
  Boolean validationEnabled;

  public V1Toleration build() {
    V1Toleration buildable = new V1Toleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}
