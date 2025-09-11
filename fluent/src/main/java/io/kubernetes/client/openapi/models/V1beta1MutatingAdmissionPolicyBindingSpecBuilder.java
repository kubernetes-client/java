package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicyBindingSpecBuilder extends V1beta1MutatingAdmissionPolicyBindingSpecFluent<V1beta1MutatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicyBindingSpec,V1beta1MutatingAdmissionPolicyBindingSpecBuilder>{
  public V1beta1MutatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1beta1MutatingAdmissionPolicyBindingSpec());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingSpecBuilder(V1beta1MutatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicyBindingSpec());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingSpecBuilder(V1beta1MutatingAdmissionPolicyBindingSpecFluent<?> fluent,V1beta1MutatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyBindingSpecBuilder(V1beta1MutatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1MutatingAdmissionPolicyBindingSpecFluent<?> fluent;
  
  public V1beta1MutatingAdmissionPolicyBindingSpec build() {
    V1beta1MutatingAdmissionPolicyBindingSpec buildable = new V1beta1MutatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    return buildable;
  }
  

}