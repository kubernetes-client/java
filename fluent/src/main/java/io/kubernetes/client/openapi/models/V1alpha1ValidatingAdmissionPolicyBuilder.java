package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyBuilder extends V1alpha1ValidatingAdmissionPolicyFluentImpl<V1alpha1ValidatingAdmissionPolicyBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicy,V1alpha1ValidatingAdmissionPolicyBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicy(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicy(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent,V1alpha1ValidatingAdmissionPolicy instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent,V1alpha1ValidatingAdmissionPolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicy instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicy build() {
    V1alpha1ValidatingAdmissionPolicy buildable = new V1alpha1ValidatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}