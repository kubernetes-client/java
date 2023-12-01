package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CertificateSigningRequestListBuilder extends V1CertificateSigningRequestListFluent<V1CertificateSigningRequestListBuilder> implements VisitableBuilder<V1CertificateSigningRequestList,V1CertificateSigningRequestListBuilder>{
  public V1CertificateSigningRequestListBuilder() {
    this(new V1CertificateSigningRequestList());
  }
  
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestList());
  }
  
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent,V1CertificateSigningRequestList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CertificateSigningRequestListFluent<?> fluent;
  
  public V1CertificateSigningRequestList build() {
    V1CertificateSigningRequestList buildable = new V1CertificateSigningRequestList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}