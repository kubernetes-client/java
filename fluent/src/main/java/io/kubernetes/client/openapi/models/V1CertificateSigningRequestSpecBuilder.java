package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CertificateSigningRequestSpecBuilder extends V1CertificateSigningRequestSpecFluent<V1CertificateSigningRequestSpecBuilder> implements VisitableBuilder<V1CertificateSigningRequestSpec,V1CertificateSigningRequestSpecBuilder>{
  public V1CertificateSigningRequestSpecBuilder() {
    this(new V1CertificateSigningRequestSpec());
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestSpec());
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpecFluent<?> fluent,V1CertificateSigningRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestSpecBuilder(V1CertificateSigningRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CertificateSigningRequestSpecFluent<?> fluent;
  
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