/*
Copyright 2020 The Kubernetes Authors.
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
import java.lang.Object;
public class ApiextensionsV1ServiceReferenceBuilder extends ApiextensionsV1ServiceReferenceFluent<ApiextensionsV1ServiceReferenceBuilder> implements VisitableBuilder<ApiextensionsV1ServiceReference,ApiextensionsV1ServiceReferenceBuilder>{

  ApiextensionsV1ServiceReferenceFluent<?> fluent;

  public ApiextensionsV1ServiceReferenceBuilder() {
    this(new ApiextensionsV1ServiceReference());
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new ApiextensionsV1ServiceReference());
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public ApiextensionsV1ServiceReferenceBuilder(ApiextensionsV1ServiceReferenceFluent<?> fluent,ApiextensionsV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public ApiextensionsV1ServiceReference build() {
    ApiextensionsV1ServiceReference buildable = new ApiextensionsV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}