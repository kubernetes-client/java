package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyBindingBuilder extends V1alpha1ValidatingAdmissionPolicyBindingFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBinding,V1alpha1ValidatingAdmissionPolicyBindingBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicyBinding(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBinding(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBinding instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBinding instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBinding instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBinding instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicyBinding build() {
    V1alpha1ValidatingAdmissionPolicyBinding buildable = new V1alpha1ValidatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}