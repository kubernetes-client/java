package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyStatusBuilder extends V1ValidatingAdmissionPolicyStatusFluent<V1ValidatingAdmissionPolicyStatusBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyStatus,V1ValidatingAdmissionPolicyStatusBuilder>{
  public V1ValidatingAdmissionPolicyStatusBuilder() {
    this(new V1ValidatingAdmissionPolicyStatus());
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatusFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyStatus());
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyStatusBuilder(V1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyStatusFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicyStatus build() {
    V1ValidatingAdmissionPolicyStatus buildable = new V1ValidatingAdmissionPolicyStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setTypeChecking(fluent.buildTypeChecking());
    return buildable;
  }
  

}