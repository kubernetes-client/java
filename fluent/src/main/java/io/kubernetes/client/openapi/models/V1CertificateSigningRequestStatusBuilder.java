package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CertificateSigningRequestStatusBuilder extends V1CertificateSigningRequestStatusFluent<V1CertificateSigningRequestStatusBuilder> implements VisitableBuilder<V1CertificateSigningRequestStatus,V1CertificateSigningRequestStatusBuilder>{
  public V1CertificateSigningRequestStatusBuilder() {
    this(new V1CertificateSigningRequestStatus());
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestStatus());
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent,V1CertificateSigningRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CertificateSigningRequestStatusFluent<?> fluent;
  
  public V1CertificateSigningRequestStatus build() {
    V1CertificateSigningRequestStatus buildable = new V1CertificateSigningRequestStatus();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}