package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyStatusBuilder extends V1beta1ValidatingAdmissionPolicyStatusFluent<V1beta1ValidatingAdmissionPolicyStatusBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicyStatus,V1beta1ValidatingAdmissionPolicyStatusBuilder>{
  public V1beta1ValidatingAdmissionPolicyStatusBuilder() {
    this(new V1beta1ValidatingAdmissionPolicyStatus());
  }
  
  public V1beta1ValidatingAdmissionPolicyStatusBuilder(V1beta1ValidatingAdmissionPolicyStatusFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicyStatus());
  }
  
  public V1beta1ValidatingAdmissionPolicyStatusBuilder(V1beta1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1beta1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyStatusBuilder(V1beta1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyStatusFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicyStatus build() {
    V1beta1ValidatingAdmissionPolicyStatus buildable = new V1beta1ValidatingAdmissionPolicyStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setTypeChecking(fluent.buildTypeChecking());
    return buildable;
  }
  

}