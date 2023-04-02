package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicationControllerConditionBuilder extends V1ReplicationControllerConditionFluentImpl<V1ReplicationControllerConditionBuilder> implements VisitableBuilder<V1ReplicationControllerCondition,V1ReplicationControllerConditionBuilder>{
  public V1ReplicationControllerConditionBuilder() {
    this(false);
  }
  public V1ReplicationControllerConditionBuilder(Boolean validationEnabled) {
    this(new V1ReplicationControllerCondition(), validationEnabled);
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerCondition(), validationEnabled);
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent,V1ReplicationControllerCondition instance) {
    this(fluent, instance, false);
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent,V1ReplicationControllerCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerCondition instance) {
    this(instance,false);
  }
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicationControllerConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicationControllerCondition build() {
    V1ReplicationControllerCondition buildable = new V1ReplicationControllerCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}