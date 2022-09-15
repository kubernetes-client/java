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

public class ApiextensionsV1ServiceReferenceBuilder
    extends ApiextensionsV1ServiceReferenceFluentImpl<ApiextensionsV1ServiceReferenceBuilder>
    implements VisitableBuilder<
        ApiextensionsV1ServiceReference, ApiextensionsV1ServiceReferenceBuilder> {
  public ApiextensionsV1ServiceReferenceBuilder() {
    this(false);
  }

  public ApiextensionsV1ServiceReferenceBuilder(Boolean validationEnabled) {
    this(new ApiextensionsV1ServiceReference(), validationEnabled);
  }

  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public ApiextensionsV1ServiceReferenceBuilder(
      ApiextensionsV1ServiceReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new ApiextensionsV1ServiceReference(), validationEnabled);
  }

  public ApiextensionsV1ServiceReferenceBuilder(
      ApiextensionsV1ServiceReferenceFluent<?> fluent, ApiextensionsV1ServiceReference instance) {
    this(fluent, instance, false);
  }

  public ApiextensionsV1ServiceReferenceBuilder(
      ApiextensionsV1ServiceReferenceFluent<?> fluent,
      ApiextensionsV1ServiceReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withPath(instance.getPath());

    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReference instance) {
    this(instance, false);
  }

  public ApiextensionsV1ServiceReferenceBuilder(
      ApiextensionsV1ServiceReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  ApiextensionsV1ServiceReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public ApiextensionsV1ServiceReference build() {
    ApiextensionsV1ServiceReference buildable = new ApiextensionsV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
}
