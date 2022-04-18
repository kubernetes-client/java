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

public class V1ServiceAccountBuilder extends V1ServiceAccountFluentImpl<V1ServiceAccountBuilder>
    implements VisitableBuilder<
        V1ServiceAccount, io.kubernetes.client.openapi.models.V1ServiceAccountBuilder> {
  public V1ServiceAccountBuilder() {
    this(false);
  }

  public V1ServiceAccountBuilder(Boolean validationEnabled) {
    this(new V1ServiceAccount(), validationEnabled);
  }

  public V1ServiceAccountBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceAccountBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServiceAccount(), validationEnabled);
  }

  public V1ServiceAccountBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceAccount instance) {
    this(fluent, instance, false);
  }

  public V1ServiceAccountBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccountFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ServiceAccount instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    fluent.withImagePullSecrets(instance.getImagePullSecrets());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSecrets(instance.getSecrets());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceAccountBuilder(io.kubernetes.client.openapi.models.V1ServiceAccount instance) {
    this(instance, false);
  }

  public V1ServiceAccountBuilder(
      io.kubernetes.client.openapi.models.V1ServiceAccount instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    this.withImagePullSecrets(instance.getImagePullSecrets());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSecrets(instance.getSecrets());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ServiceAccountFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ServiceAccount build() {
    V1ServiceAccount buildable = new V1ServiceAccount();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setAutomountServiceAccountToken(fluent.getAutomountServiceAccountToken());
    buildable.setImagePullSecrets(fluent.getImagePullSecrets());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSecrets(fluent.getSecrets());
    return buildable;
  }
}
