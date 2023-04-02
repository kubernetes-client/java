package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CertificateSigningRequestStatusBuilder extends V1CertificateSigningRequestStatusFluentImpl<V1CertificateSigningRequestStatusBuilder> implements VisitableBuilder<V1CertificateSigningRequestStatus,V1CertificateSigningRequestStatusBuilder>{
  public V1CertificateSigningRequestStatusBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestStatusBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestStatus(), validationEnabled);
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestStatus(), validationEnabled);
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent,V1CertificateSigningRequestStatus instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatusFluent<?> fluent,V1CertificateSigningRequestStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCertificate(instance.getCertificate());

    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatus instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestStatusBuilder(V1CertificateSigningRequestStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCertificate(instance.getCertificate());

    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1CertificateSigningRequestStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1CertificateSigningRequestStatus build() {
    V1CertificateSigningRequestStatus buildable = new V1CertificateSigningRequestStatus();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}