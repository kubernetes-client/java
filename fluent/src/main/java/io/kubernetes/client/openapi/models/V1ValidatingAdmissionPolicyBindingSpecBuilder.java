package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyBindingSpecBuilder extends V1ValidatingAdmissionPolicyBindingSpecFluent<V1ValidatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyBindingSpec,V1ValidatingAdmissionPolicyBindingSpecBuilder>{
  public V1ValidatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyBindingSpec());
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent,V1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecBuilder(V1ValidatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyBindingSpecFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicyBindingSpec build() {
    V1ValidatingAdmissionPolicyBindingSpec buildable = new V1ValidatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    buildable.setValidationActions(fluent.getValidationActions());
    return buildable;
  }
  

}