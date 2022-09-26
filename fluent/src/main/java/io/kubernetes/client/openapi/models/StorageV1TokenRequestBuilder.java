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

public class StorageV1TokenRequestBuilder
    extends StorageV1TokenRequestFluentImpl<StorageV1TokenRequestBuilder>
    implements VisitableBuilder<StorageV1TokenRequest, StorageV1TokenRequestBuilder> {
  public StorageV1TokenRequestBuilder() {
    this(false);
  }

  public StorageV1TokenRequestBuilder(Boolean validationEnabled) {
    this(new StorageV1TokenRequest(), validationEnabled);
  }

  public StorageV1TokenRequestBuilder(StorageV1TokenRequestFluent<?> fluent) {
    this(fluent, false);
  }

  public StorageV1TokenRequestBuilder(
      StorageV1TokenRequestFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new StorageV1TokenRequest(), validationEnabled);
  }

  public StorageV1TokenRequestBuilder(
      StorageV1TokenRequestFluent<?> fluent, StorageV1TokenRequest instance) {
    this(fluent, instance, false);
  }

  public StorageV1TokenRequestBuilder(
      StorageV1TokenRequestFluent<?> fluent,
      StorageV1TokenRequest instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAudience(instance.getAudience());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled;
  }

  public StorageV1TokenRequestBuilder(StorageV1TokenRequest instance) {
    this(instance, false);
  }

  public StorageV1TokenRequestBuilder(StorageV1TokenRequest instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAudience(instance.getAudience());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled;
  }

  StorageV1TokenRequestFluent<?> fluent;
  Boolean validationEnabled;

  public StorageV1TokenRequest build() {
    StorageV1TokenRequest buildable = new StorageV1TokenRequest();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
}
