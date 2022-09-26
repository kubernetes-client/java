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

public class V1SysctlBuilder extends V1SysctlFluentImpl<V1SysctlBuilder>
    implements VisitableBuilder<V1Sysctl, V1SysctlBuilder> {
  public V1SysctlBuilder() {
    this(false);
  }

  public V1SysctlBuilder(Boolean validationEnabled) {
    this(new V1Sysctl(), validationEnabled);
  }

  public V1SysctlBuilder(V1SysctlFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SysctlBuilder(V1SysctlFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Sysctl(), validationEnabled);
  }

  public V1SysctlBuilder(V1SysctlFluent<?> fluent, V1Sysctl instance) {
    this(fluent, instance, false);
  }

  public V1SysctlBuilder(V1SysctlFluent<?> fluent, V1Sysctl instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V1SysctlBuilder(V1Sysctl instance) {
    this(instance, false);
  }

  public V1SysctlBuilder(V1Sysctl instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  V1SysctlFluent<?> fluent;
  Boolean validationEnabled;

  public V1Sysctl build() {
    V1Sysctl buildable = new V1Sysctl();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}
