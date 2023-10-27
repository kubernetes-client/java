package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentConditionBuilder extends V1DeploymentConditionFluent<V1DeploymentConditionBuilder> implements VisitableBuilder<V1DeploymentCondition,V1DeploymentConditionBuilder>{
  public V1DeploymentConditionBuilder() {
    this(new V1DeploymentCondition());
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent) {
    this(fluent, new V1DeploymentCondition());
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent,V1DeploymentCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentConditionFluent<?> fluent;
  
  public V1DeploymentCondition build() {
    V1DeploymentCondition buildable = new V1DeploymentCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}