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

public class V1beta2UserSubjectBuilder
    extends V1beta2UserSubjectFluentImpl<V1beta2UserSubjectBuilder>
    implements VisitableBuilder<V1beta2UserSubject, V1beta2UserSubjectBuilder> {
  public V1beta2UserSubjectBuilder() {
    this(false);
  }

  public V1beta2UserSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2UserSubject(), validationEnabled);
  }

  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2UserSubjectBuilder(V1beta2UserSubjectFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta2UserSubject(), validationEnabled);
  }

  public V1beta2UserSubjectBuilder(
      V1beta2UserSubjectFluent<?> fluent, V1beta2UserSubject instance) {
    this(fluent, instance, false);
  }

  public V1beta2UserSubjectBuilder(
      V1beta2UserSubjectFluent<?> fluent, V1beta2UserSubject instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2UserSubjectBuilder(V1beta2UserSubject instance) {
    this(instance, false);
  }

  public V1beta2UserSubjectBuilder(V1beta2UserSubject instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1beta2UserSubjectFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta2UserSubject build() {
    V1beta2UserSubject buildable = new V1beta2UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
