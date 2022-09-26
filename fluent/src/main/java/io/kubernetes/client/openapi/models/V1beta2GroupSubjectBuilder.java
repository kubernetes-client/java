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

public class V1beta2GroupSubjectBuilder
    extends V1beta2GroupSubjectFluentImpl<V1beta2GroupSubjectBuilder>
    implements VisitableBuilder<V1beta2GroupSubject, V1beta2GroupSubjectBuilder> {
  public V1beta2GroupSubjectBuilder() {
    this(false);
  }

  public V1beta2GroupSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2GroupSubject(), validationEnabled);
  }

  public V1beta2GroupSubjectBuilder(V1beta2GroupSubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2GroupSubjectBuilder(
      V1beta2GroupSubjectFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta2GroupSubject(), validationEnabled);
  }

  public V1beta2GroupSubjectBuilder(
      V1beta2GroupSubjectFluent<?> fluent, V1beta2GroupSubject instance) {
    this(fluent, instance, false);
  }

  public V1beta2GroupSubjectBuilder(
      V1beta2GroupSubjectFluent<?> fluent,
      V1beta2GroupSubject instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2GroupSubjectBuilder(V1beta2GroupSubject instance) {
    this(instance, false);
  }

  public V1beta2GroupSubjectBuilder(V1beta2GroupSubject instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1beta2GroupSubjectFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta2GroupSubject build() {
    V1beta2GroupSubject buildable = new V1beta2GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
