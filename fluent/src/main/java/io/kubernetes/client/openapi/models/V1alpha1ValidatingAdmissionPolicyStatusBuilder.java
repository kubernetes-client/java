package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyStatusBuilder extends V1alpha1ValidatingAdmissionPolicyStatusFluent<V1alpha1ValidatingAdmissionPolicyStatusBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyStatus,V1alpha1ValidatingAdmissionPolicyStatusBuilder>{
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicyStatus());
  }
  
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyStatus());
  }
  
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicyStatus build() {
    V1alpha1ValidatingAdmissionPolicyStatus buildable = new V1alpha1ValidatingAdmissionPolicyStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setTypeChecking(fluent.buildTypeChecking());
    return buildable;
  }
  

}