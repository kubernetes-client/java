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

public class V1PreconditionsBuilder extends V1PreconditionsFluentImpl<V1PreconditionsBuilder>
    implements VisitableBuilder<V1Preconditions, V1PreconditionsBuilder> {
  public V1PreconditionsBuilder() {
    this(false);
  }

  public V1PreconditionsBuilder(Boolean validationEnabled) {
    this(new V1Preconditions(), validationEnabled);
  }

  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1Preconditions(), validationEnabled);
  }

  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent, V1Preconditions instance) {
    this(fluent, instance, false);
  }

  public V1PreconditionsBuilder(
      V1PreconditionsFluent<?> fluent, V1Preconditions instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1PreconditionsBuilder(V1Preconditions instance) {
    this(instance, false);
  }

  public V1PreconditionsBuilder(V1Preconditions instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  V1PreconditionsFluent<?> fluent;
  Boolean validationEnabled;

  public V1Preconditions build() {
    V1Preconditions buildable = new V1Preconditions();
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
}
