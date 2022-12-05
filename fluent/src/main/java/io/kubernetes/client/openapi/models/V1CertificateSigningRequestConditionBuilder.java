package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CertificateSigningRequestConditionBuilder extends V1CertificateSigningRequestConditionFluentImpl<V1CertificateSigningRequestConditionBuilder> implements VisitableBuilder<V1CertificateSigningRequestCondition,V1CertificateSigningRequestConditionBuilder>{
  public V1CertificateSigningRequestConditionBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestConditionBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequestCondition(), validationEnabled);
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestCondition(), validationEnabled);
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent,V1CertificateSigningRequestCondition instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestConditionFluent<?> fluent,V1CertificateSigningRequestCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withLastUpdateTime(instance.getLastUpdateTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestCondition instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestConditionBuilder(V1CertificateSigningRequestCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withLastUpdateTime(instance.getLastUpdateTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1CertificateSigningRequestConditionFluent<?> fluent;
  Boolean validationEnabled;
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