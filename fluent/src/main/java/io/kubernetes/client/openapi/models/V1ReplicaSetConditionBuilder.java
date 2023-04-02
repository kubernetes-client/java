package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicaSetConditionBuilder extends V1ReplicaSetConditionFluentImpl<V1ReplicaSetConditionBuilder> implements VisitableBuilder<V1ReplicaSetCondition,V1ReplicaSetConditionBuilder>{
  public V1ReplicaSetConditionBuilder() {
    this(false);
  }
  public V1ReplicaSetConditionBuilder(Boolean validationEnabled) {
    this(new V1ReplicaSetCondition(), validationEnabled);
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetCondition(), validationEnabled);
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent,V1ReplicaSetCondition instance) {
    this(fluent, instance, false);
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent,V1ReplicaSetCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetCondition instance) {
    this(instance,false);
  }
  public V1ReplicaSetConditionBuilder(V1ReplicaSetCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicaSetConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicaSetCondition build() {
    V1ReplicaSetCondition buildable = new V1ReplicaSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}