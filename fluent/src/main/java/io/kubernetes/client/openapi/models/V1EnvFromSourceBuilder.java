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

public class V1EnvFromSourceBuilder extends V1EnvFromSourceFluentImpl<V1EnvFromSourceBuilder>
    implements VisitableBuilder<V1EnvFromSource, V1EnvFromSourceBuilder> {
  public V1EnvFromSourceBuilder() {
    this(false);
  }

  public V1EnvFromSourceBuilder(Boolean validationEnabled) {
    this(new V1EnvFromSource(), validationEnabled);
  }

  public V1EnvFromSourceBuilder(V1EnvFromSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EnvFromSourceBuilder(V1EnvFromSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1EnvFromSource(), validationEnabled);
  }

  public V1EnvFromSourceBuilder(V1EnvFromSourceFluent<?> fluent, V1EnvFromSource instance) {
    this(fluent, instance, false);
  }

  public V1EnvFromSourceBuilder(
      V1EnvFromSourceFluent<?> fluent, V1EnvFromSource instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConfigMapRef(instance.getConfigMapRef());

    fluent.withPrefix(instance.getPrefix());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  public V1EnvFromSourceBuilder(V1EnvFromSource instance) {
    this(instance, false);
  }

  public V1EnvFromSourceBuilder(V1EnvFromSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConfigMapRef(instance.getConfigMapRef());

    this.withPrefix(instance.getPrefix());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  V1EnvFromSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1EnvFromSource build() {
    V1EnvFromSource buildable = new V1EnvFromSource();
    buildable.setConfigMapRef(fluent.getConfigMapRef());
    buildable.setPrefix(fluent.getPrefix());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }
}
