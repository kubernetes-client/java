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
public class V1CertificateSigningRequestSpecBuilder extends V1CertificateSigningRequestSpecFluent<V1CertificateSigningRequestSpecBuilder> implements VisitableBuilder<V1CertificateSigningRequestSpec,V1CertificateSigningRequestSpecBuilder>{

  V1CertificateSigningRequestSpecFluent<?> fluent;

  public V1CertificateSigningRequestSpecBuilder() {
    this(new V1CertificateSigningRequestSpec());
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestSpec());
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent,V1CertificateSigningRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CertificateSigningRequestSpec build() {
    V1CertificateSigningRequestSpec buildable = new V1CertificateSigningRequestSpec();
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setRequest(fluent.getRequest());
    buildable.setSignerName(fluent.getSignerName());
    buildable.setUid(fluent.getUid());
    buildable.setUsages(fluent.getUsages());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  
}