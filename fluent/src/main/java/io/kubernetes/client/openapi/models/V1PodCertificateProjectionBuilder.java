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
public class V1PodCertificateProjectionBuilder extends V1PodCertificateProjectionFluent<V1PodCertificateProjectionBuilder> implements VisitableBuilder<V1PodCertificateProjection,V1PodCertificateProjectionBuilder>{

  V1PodCertificateProjectionFluent<?> fluent;

  public V1PodCertificateProjectionBuilder() {
    this(new V1PodCertificateProjection());
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjectionFluent<?> fluent) {
    this(fluent, new V1PodCertificateProjection());
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodCertificateProjectionBuilder(V1PodCertificateProjectionFluent<?> fluent,V1PodCertificateProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodCertificateProjection build() {
    V1PodCertificateProjection buildable = new V1PodCertificateProjection();
    buildable.setCertificateChainPath(fluent.getCertificateChainPath());
    buildable.setCredentialBundlePath(fluent.getCredentialBundlePath());
    buildable.setKeyPath(fluent.getKeyPath());
    buildable.setKeyType(fluent.getKeyType());
    buildable.setMaxExpirationSeconds(fluent.getMaxExpirationSeconds());
    buildable.setSignerName(fluent.getSignerName());
    buildable.setUserAnnotations(fluent.getUserAnnotations());
    return buildable;
  }
  
}