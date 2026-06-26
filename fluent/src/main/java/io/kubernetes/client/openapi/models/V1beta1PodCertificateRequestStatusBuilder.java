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
public class V1beta1PodCertificateRequestStatusBuilder extends V1beta1PodCertificateRequestStatusFluent<V1beta1PodCertificateRequestStatusBuilder> implements VisitableBuilder<V1beta1PodCertificateRequestStatus,V1beta1PodCertificateRequestStatusBuilder>{

  V1beta1PodCertificateRequestStatusFluent<?> fluent;

  public V1beta1PodCertificateRequestStatusBuilder() {
    this(new V1beta1PodCertificateRequestStatus());
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatusFluent<?> fluent) {
    this(fluent, new V1beta1PodCertificateRequestStatus());
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodCertificateRequestStatusBuilder(V1beta1PodCertificateRequestStatusFluent<?> fluent,V1beta1PodCertificateRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodCertificateRequestStatus build() {
    V1beta1PodCertificateRequestStatus buildable = new V1beta1PodCertificateRequestStatus();
    buildable.setBeginRefreshAt(fluent.getBeginRefreshAt());
    buildable.setCertificateChain(fluent.getCertificateChain());
    buildable.setConditions(fluent.buildConditions());
    buildable.setNotAfter(fluent.getNotAfter());
    buildable.setNotBefore(fluent.getNotBefore());
    return buildable;
  }
  
}