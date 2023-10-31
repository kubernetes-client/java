package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentStatusBuilder extends V1DeploymentStatusFluent<V1DeploymentStatusBuilder> implements VisitableBuilder<V1DeploymentStatus,V1DeploymentStatusBuilder>{
  public V1DeploymentStatusBuilder() {
    this(new V1DeploymentStatus());
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent) {
    this(fluent, new V1DeploymentStatus());
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent,V1DeploymentStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentStatusFluent<?> fluent;
  
  public V1DeploymentStatus build() {
    V1DeploymentStatus buildable = new V1DeploymentStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUnavailableReplicas(fluent.getUnavailableReplicas());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
  

}