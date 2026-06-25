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
public class V1CertificateSigningRequestBuilder extends V1CertificateSigningRequestFluent<V1CertificateSigningRequestBuilder> implements VisitableBuilder<V1CertificateSigningRequest,V1CertificateSigningRequestBuilder>{

  V1CertificateSigningRequestFluent<?> fluent;

  public V1CertificateSigningRequestBuilder() {
    this(new V1CertificateSigningRequest());
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequest());
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent,V1CertificateSigningRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CertificateSigningRequest build() {
    V1CertificateSigningRequest buildable = new V1CertificateSigningRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}