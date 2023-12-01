package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CertificateSigningRequestConditionBuilder extends V1CertificateSigningRequestConditionFluent<V1CertificateSigningRequestConditionBuilder> implements VisitableBuilder<V1CertificateSigningRequestCondition,V1CertificateSigningRequestConditionBuilder>{
  public V1CertificateSigningRequestConditionBuilder() {
    this(new V1CertificateSigningRequestCondition());
  }
  
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent) {
    this(fluent, new V1CertificateSigningRequestCondition());
  }
  
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent,V1CertificateSigningRequestCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CertificateSigningRequestConditionFluent<?> fluent;
  
  public V1CertificateSigningRequestCondition build() {
    V1CertificateSigningRequestCondition buildable = new V1CertificateSigningRequestCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}