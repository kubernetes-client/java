package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyBindingSpecBuilder extends V1beta1ValidatingAdmissionPolicyBindingSpecFluent<V1beta1ValidatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicyBindingSpec,V1beta1ValidatingAdmissionPolicyBindingSpecBuilder>{
  public V1beta1ValidatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1beta1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingSpecBuilder(V1beta1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingSpecBuilder(V1beta1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1beta1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingSpecBuilder(V1beta1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicyBindingSpec build() {
    V1beta1ValidatingAdmissionPolicyBindingSpec buildable = new V1beta1ValidatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    buildable.setValidationActions(fluent.getValidationActions());
    return buildable;
  }
  

}