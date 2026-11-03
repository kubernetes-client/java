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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1PodCertificateRequestStatusBuilder extends V1PodCertificateRequestStatusFluent<V1PodCertificateRequestStatusBuilder> implements VisitableBuilder<V1PodCertificateRequestStatus,V1PodCertificateRequestStatusBuilder>{

  V1PodCertificateRequestStatusFluent<?> fluent;

  public V1PodCertificateRequestStatusBuilder() {
    this(new V1PodCertificateRequestStatus());
  }
  
  public V1PodCertificateRequestStatusBuilder(V1PodCertificateRequestStatusFluent<?> fluent) {
    this(fluent, new V1PodCertificateRequestStatus());
  }
  
  public V1PodCertificateRequestStatusBuilder(V1PodCertificateRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodCertificateRequestStatusBuilder(V1PodCertificateRequestStatusFluent<?> fluent,V1PodCertificateRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodCertificateRequestStatus build() {
    V1PodCertificateRequestStatus buildable = new V1PodCertificateRequestStatus();
    buildable.setBeginRefreshAt(fluent.getBeginRefreshAt());
    buildable.setCertificateChain(fluent.getCertificateChain());
    buildable.setConditions(fluent.buildConditions());
    buildable.setNotAfter(fluent.getNotAfter());
    buildable.setNotBefore(fluent.getNotBefore());
    return buildable;
  }
  
}