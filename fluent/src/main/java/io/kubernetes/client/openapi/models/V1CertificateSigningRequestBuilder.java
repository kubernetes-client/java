package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CertificateSigningRequestBuilder extends V1CertificateSigningRequestFluent<V1CertificateSigningRequestBuilder> implements VisitableBuilder<V1CertificateSigningRequest,V1CertificateSigningRequestBuilder>{
  public V1CertificateSigningRequestBuilder() {
    this(new V1CertificateSigningRequest());
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequest());
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent,V1CertificateSigningRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CertificateSigningRequestFluent<?> fluent;
  
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