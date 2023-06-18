package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBindingSpec,V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicyBindingSpec(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBindingSpec(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withMatchResources(instance.getMatchResources());
      fluent.withParamRef(instance.getParamRef());
      fluent.withPolicyName(instance.getPolicyName());
      fluent.withValidationActions(instance.getValidationActions());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withMatchResources(instance.getMatchResources());
      this.withParamRef(instance.getParamRef());
      this.withPolicyName(instance.getPolicyName());
      this.withValidationActions(instance.getValidationActions());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicyBindingSpec build() {
    V1alpha1ValidatingAdmissionPolicyBindingSpec buildable = new V1alpha1ValidatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.getMatchResources());
    buildable.setParamRef(fluent.getParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    buildable.setValidationActions(fluent.getValidationActions());
    return buildable;
  }
  
}