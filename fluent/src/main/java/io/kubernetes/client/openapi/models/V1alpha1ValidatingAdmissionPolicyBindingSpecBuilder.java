package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBindingSpec,V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicyBindingSpec build() {
    V1alpha1ValidatingAdmissionPolicyBindingSpec buildable = new V1alpha1ValidatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    buildable.setValidationActions(fluent.getValidationActions());
    return buildable;
  }
  

}