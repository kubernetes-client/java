package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConditionBuilder extends V1ConditionFluentImpl<V1ConditionBuilder> implements VisitableBuilder<V1Condition,V1ConditionBuilder>{
  public V1ConditionBuilder() {
    this(false);
  }
  public V1ConditionBuilder(Boolean validationEnabled) {
    this(new V1Condition(), validationEnabled);
  }
  public V1ConditionBuilder(V1ConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConditionBuilder(V1ConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Condition(), validationEnabled);
  }
  public V1ConditionBuilder(V1ConditionFluent<?> fluent,V1Condition instance) {
    this(fluent, instance, false);
  }
  public V1ConditionBuilder(V1ConditionFluent<?> fluent,V1Condition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConditionBuilder(V1Condition instance) {
    this(instance,false);
  }
  public V1ConditionBuilder(V1Condition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1ConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1Condition build() {
    V1Condition buildable = new V1Condition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}