package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicyStatusBuilder extends V1alpha1ValidatingAdmissionPolicyStatusFluentImpl<V1alpha1ValidatingAdmissionPolicyStatusBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyStatus,V1alpha1ValidatingAdmissionPolicyStatusBuilder>{
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicyStatus(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyStatus(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withConditions(instance.getConditions());
      fluent.withObservedGeneration(instance.getObservedGeneration());
      fluent.withTypeChecking(instance.getTypeChecking());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatus instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicyStatusBuilder(V1alpha1ValidatingAdmissionPolicyStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withConditions(instance.getConditions());
      this.withObservedGeneration(instance.getObservedGeneration());
      this.withTypeChecking(instance.getTypeChecking());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicyStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicyStatus build() {
    V1alpha1ValidatingAdmissionPolicyStatus buildable = new V1alpha1ValidatingAdmissionPolicyStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setTypeChecking(fluent.getTypeChecking());
    return buildable;
  }
  
}