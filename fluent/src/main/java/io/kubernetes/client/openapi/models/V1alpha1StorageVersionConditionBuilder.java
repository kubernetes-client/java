package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1StorageVersionConditionBuilder extends V1alpha1StorageVersionConditionFluentImpl<V1alpha1StorageVersionConditionBuilder> implements VisitableBuilder<V1alpha1StorageVersionCondition,V1alpha1StorageVersionConditionBuilder>{
  public V1alpha1StorageVersionConditionBuilder() {
    this(false);
  }
  public V1alpha1StorageVersionConditionBuilder(Boolean validationEnabled) {
    this(new V1alpha1StorageVersionCondition(), validationEnabled);
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersionCondition(), validationEnabled);
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent,V1alpha1StorageVersionCondition instance) {
    this(fluent, instance, false);
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionConditionFluent<?> fluent,V1alpha1StorageVersionCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionCondition instance) {
    this(instance,false);
  }
  public V1alpha1StorageVersionConditionBuilder(V1alpha1StorageVersionCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1StorageVersionConditionFluent<?> fluent;
  Boolean validationEnabled;
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