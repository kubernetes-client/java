package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionConditionBuilder extends V1alpha1StorageVersionConditionFluent<V1alpha1StorageVersionConditionBuilder> implements VisitableBuilder<V1alpha1StorageVersionCondition,V1alpha1StorageVersionConditionBuilder>{
  public V1alpha1StorageVersionConditionBuilder() {
    this(new V1alpha1StorageVersionCondition());
  }
  
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionCondition());
  }
  
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent,V1alpha1StorageVersionCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionConditionFluent<?> fluent;
  
  public V1alpha1StorageVersionCondition build() {
    V1alpha1StorageVersionCondition buildable = new V1alpha1StorageVersionCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}