/*
Copyright 2026 The Kubernetes Authors.
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
public class ApiregistrationV1ServiceReferenceBuilder extends ApiregistrationV1ServiceReferenceFluent<ApiregistrationV1ServiceReferenceBuilder> implements VisitableBuilder<ApiregistrationV1ServiceReference,ApiregistrationV1ServiceReferenceBuilder>{

  ApiregistrationV1ServiceReferenceFluent<?> fluent;

  public ApiregistrationV1ServiceReferenceBuilder() {
    this(new ApiregistrationV1ServiceReference());
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new ApiregistrationV1ServiceReference());
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public ApiregistrationV1ServiceReferenceBuilder(ApiregistrationV1ServiceReferenceFluent<?> fluent,ApiregistrationV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public ApiregistrationV1ServiceReference build() {
    ApiregistrationV1ServiceReference buildable = new ApiregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}