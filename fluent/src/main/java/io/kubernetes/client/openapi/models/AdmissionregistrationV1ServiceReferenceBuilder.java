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
public class AdmissionregistrationV1ServiceReferenceBuilder extends AdmissionregistrationV1ServiceReferenceFluent<AdmissionregistrationV1ServiceReferenceBuilder> implements VisitableBuilder<AdmissionregistrationV1ServiceReference,AdmissionregistrationV1ServiceReferenceBuilder>{

  AdmissionregistrationV1ServiceReferenceFluent<?> fluent;

  public AdmissionregistrationV1ServiceReferenceBuilder() {
    this(new AdmissionregistrationV1ServiceReference());
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReferenceFluent<?> fluent) {
    this(fluent, new AdmissionregistrationV1ServiceReference());
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public AdmissionregistrationV1ServiceReferenceBuilder(AdmissionregistrationV1ServiceReferenceFluent<?> fluent,AdmissionregistrationV1ServiceReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public AdmissionregistrationV1ServiceReference build() {
    AdmissionregistrationV1ServiceReference buildable = new AdmissionregistrationV1ServiceReference();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}