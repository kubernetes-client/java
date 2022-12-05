package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonSetConditionBuilder extends V1DaemonSetConditionFluentImpl<V1DaemonSetConditionBuilder> implements VisitableBuilder<V1DaemonSetCondition,V1DaemonSetConditionBuilder>{
  public V1DaemonSetConditionBuilder() {
    this(false);
  }
  public V1DaemonSetConditionBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetCondition(), validationEnabled);
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonSetCondition(), validationEnabled);
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent,V1DaemonSetCondition instance) {
    this(fluent, instance, false);
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent,V1DaemonSetCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetCondition instance) {
    this(instance,false);
  }
  public V1DaemonSetConditionBuilder(V1DaemonSetCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonSetConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonSetCondition build() {
    V1DaemonSetCondition buildable = new V1DaemonSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}