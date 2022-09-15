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

public class V1StatusDetailsBuilder extends V1StatusDetailsFluentImpl<V1StatusDetailsBuilder>
    implements VisitableBuilder<V1StatusDetails, V1StatusDetailsBuilder> {
  public V1StatusDetailsBuilder() {
    this(false);
  }

  public V1StatusDetailsBuilder(Boolean validationEnabled) {
    this(new V1StatusDetails(), validationEnabled);
  }

  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1StatusDetails(), validationEnabled);
  }

  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent, V1StatusDetails instance) {
    this(fluent, instance, false);
  }

  public V1StatusDetailsBuilder(
      V1StatusDetailsFluent<?> fluent, V1StatusDetails instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCauses(instance.getCauses());

    fluent.withGroup(instance.getGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1StatusDetailsBuilder(V1StatusDetails instance) {
    this(instance, false);
  }

  public V1StatusDetailsBuilder(V1StatusDetails instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCauses(instance.getCauses());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  V1StatusDetailsFluent<?> fluent;
  Boolean validationEnabled;

  public V1StatusDetails build() {
    V1StatusDetails buildable = new V1StatusDetails();
    buildable.setCauses(fluent.getCauses());
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setRetryAfterSeconds(fluent.getRetryAfterSeconds());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
}
