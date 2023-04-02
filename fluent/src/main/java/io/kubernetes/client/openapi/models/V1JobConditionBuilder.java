package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobConditionBuilder extends V1JobConditionFluentImpl<V1JobConditionBuilder> implements VisitableBuilder<V1JobCondition,V1JobConditionBuilder>{
  public V1JobConditionBuilder() {
    this(false);
  }
  public V1JobConditionBuilder(Boolean validationEnabled) {
    this(new V1JobCondition(), validationEnabled);
  }
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JobCondition(), validationEnabled);
  }
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent,V1JobCondition instance) {
    this(fluent, instance, false);
  }
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent,V1JobCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastProbeTime(instance.getLastProbeTime());

    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobConditionBuilder(V1JobCondition instance) {
    this(instance,false);
  }
  public V1JobConditionBuilder(V1JobCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastProbeTime(instance.getLastProbeTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1JobConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1JobCondition build() {
    V1JobCondition buildable = new V1JobCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}