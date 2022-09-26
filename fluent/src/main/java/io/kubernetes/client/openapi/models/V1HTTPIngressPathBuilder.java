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

public class V1HTTPIngressPathBuilder extends V1HTTPIngressPathFluentImpl<V1HTTPIngressPathBuilder>
    implements VisitableBuilder<V1HTTPIngressPath, V1HTTPIngressPathBuilder> {
  public V1HTTPIngressPathBuilder() {
    this(false);
  }

  public V1HTTPIngressPathBuilder(Boolean validationEnabled) {
    this(new V1HTTPIngressPath(), validationEnabled);
  }

  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressPath(), validationEnabled);
  }

  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent, V1HTTPIngressPath instance) {
    this(fluent, instance, false);
  }

  public V1HTTPIngressPathBuilder(
      V1HTTPIngressPathFluent<?> fluent, V1HTTPIngressPath instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withBackend(instance.getBackend());

    fluent.withPath(instance.getPath());

    fluent.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled;
  }

  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance) {
    this(instance, false);
  }

  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withBackend(instance.getBackend());

    this.withPath(instance.getPath());

    this.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled;
  }

  V1HTTPIngressPathFluent<?> fluent;
  Boolean validationEnabled;

  public V1HTTPIngressPath build() {
    V1HTTPIngressPath buildable = new V1HTTPIngressPath();
    buildable.setBackend(fluent.getBackend());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }
}
