package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CertificateSigningRequestListBuilder extends V1CertificateSigningRequestListFluentImpl<V1CertificateSigningRequestListBuilder> implements VisitableBuilder<V1CertificateSigningRequestList,V1CertificateSigningRequestListBuilder>{
  public V1CertificateSigningRequestListBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestListBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestList(), validationEnabled);
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestList(), validationEnabled);
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent,V1CertificateSigningRequestList instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestListFluent<?> fluent,V1CertificateSigningRequestList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestList instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestListBuilder(V1CertificateSigningRequestList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1CertificateSigningRequestListFluent<?> fluent;
  Boolean validationEnabled;
  public V1CertificateSigningRequestList build() {
    V1CertificateSigningRequestList buildable = new V1CertificateSigningRequestList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}