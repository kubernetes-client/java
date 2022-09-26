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

public class V1KeyToPathBuilder extends V1KeyToPathFluentImpl<V1KeyToPathBuilder>
    implements VisitableBuilder<V1KeyToPath, V1KeyToPathBuilder> {
  public V1KeyToPathBuilder() {
    this(false);
  }

  public V1KeyToPathBuilder(Boolean validationEnabled) {
    this(new V1KeyToPath(), validationEnabled);
  }

  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent) {
    this(fluent, false);
  }

  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1KeyToPath(), validationEnabled);
  }

  public V1KeyToPathBuilder(V1KeyToPathFluent<?> fluent, V1KeyToPath instance) {
    this(fluent, instance, false);
  }

  public V1KeyToPathBuilder(
      V1KeyToPathFluent<?> fluent, V1KeyToPath instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKey(instance.getKey());

    fluent.withMode(instance.getMode());

    fluent.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  public V1KeyToPathBuilder(V1KeyToPath instance) {
    this(instance, false);
  }

  public V1KeyToPathBuilder(V1KeyToPath instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withKey(instance.getKey());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  V1KeyToPathFluent<?> fluent;
  Boolean validationEnabled;

  public V1KeyToPath build() {
    V1KeyToPath buildable = new V1KeyToPath();
    buildable.setKey(fluent.getKey());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
}
