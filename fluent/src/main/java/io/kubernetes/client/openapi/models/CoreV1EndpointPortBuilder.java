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

public class CoreV1EndpointPortBuilder
    extends CoreV1EndpointPortFluentImpl<CoreV1EndpointPortBuilder>
    implements VisitableBuilder<CoreV1EndpointPort, CoreV1EndpointPortBuilder> {
  public CoreV1EndpointPortBuilder() {
    this(false);
  }

  public CoreV1EndpointPortBuilder(Boolean validationEnabled) {
    this(new CoreV1EndpointPort(), validationEnabled);
  }

  public CoreV1EndpointPortBuilder(CoreV1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EndpointPortBuilder(CoreV1EndpointPortFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new CoreV1EndpointPort(), validationEnabled);
  }

  public CoreV1EndpointPortBuilder(
      CoreV1EndpointPortFluent<?> fluent, CoreV1EndpointPort instance) {
    this(fluent, instance, false);
  }

  public CoreV1EndpointPortBuilder(
      CoreV1EndpointPortFluent<?> fluent, CoreV1EndpointPort instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EndpointPortBuilder(CoreV1EndpointPort instance) {
    this(instance, false);
  }

  public CoreV1EndpointPortBuilder(CoreV1EndpointPort instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  CoreV1EndpointPortFluent<?> fluent;
  Boolean validationEnabled;

  public CoreV1EndpointPort build() {
    CoreV1EndpointPort buildable = new CoreV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
}
