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

public class V1ServicePortBuilder extends V1ServicePortFluentImpl<V1ServicePortBuilder>
    implements VisitableBuilder<V1ServicePort, V1ServicePortBuilder> {
  public V1ServicePortBuilder() {
    this(false);
  }

  public V1ServicePortBuilder(Boolean validationEnabled) {
    this(new V1ServicePort(), validationEnabled);
  }

  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ServicePort(), validationEnabled);
  }

  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent, V1ServicePort instance) {
    this(fluent, instance, false);
  }

  public V1ServicePortBuilder(
      V1ServicePortFluent<?> fluent, V1ServicePort instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withNodePort(instance.getNodePort());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    fluent.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled;
  }

  public V1ServicePortBuilder(V1ServicePort instance) {
    this(instance, false);
  }

  public V1ServicePortBuilder(V1ServicePort instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withNodePort(instance.getNodePort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled;
  }

  V1ServicePortFluent<?> fluent;
  Boolean validationEnabled;

  public V1ServicePort build() {
    V1ServicePort buildable = new V1ServicePort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setNodePort(fluent.getNodePort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    buildable.setTargetPort(fluent.getTargetPort());
    return buildable;
  }
}
