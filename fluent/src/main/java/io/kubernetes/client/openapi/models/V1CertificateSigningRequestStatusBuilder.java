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
public class V1CertificateSigningRequestStatusBuilder extends V1CertificateSigningRequestStatusFluent<V1CertificateSigningRequestStatusBuilder> implements VisitableBuilder<V1CertificateSigningRequestStatus,V1CertificateSigningRequestStatusBuilder>{

  V1CertificateSigningRequestStatusFluent<?> fluent;

  public V1CertificateSigningRequestStatusBuilder() {
    this(new V1CertificateSigningRequestStatus());
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestStatus());
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent,V1CertificateSigningRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CertificateSigningRequestStatus build() {
    V1CertificateSigningRequestStatus buildable = new V1CertificateSigningRequestStatus();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}