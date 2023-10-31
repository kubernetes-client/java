package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentBuilder extends V1DeploymentFluent<V1DeploymentBuilder> implements VisitableBuilder<V1Deployment,V1DeploymentBuilder>{
  public V1DeploymentBuilder() {
    this(new V1Deployment());
  }
  
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent) {
    this(fluent, new V1Deployment());
  }
  
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent,V1Deployment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentBuilder(V1Deployment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentFluent<?> fluent;
  
  public V1Deployment build() {
    V1Deployment buildable = new V1Deployment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}