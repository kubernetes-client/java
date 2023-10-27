package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentStrategyBuilder extends V1DeploymentStrategyFluent<V1DeploymentStrategyBuilder> implements VisitableBuilder<V1DeploymentStrategy,V1DeploymentStrategyBuilder>{
  public V1DeploymentStrategyBuilder() {
    this(new V1DeploymentStrategy());
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent) {
    this(fluent, new V1DeploymentStrategy());
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent,V1DeploymentStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentStrategyBuilder(V1DeploymentStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentStrategyFluent<?> fluent;
  
  public V1DeploymentStrategy build() {
    V1DeploymentStrategy buildable = new V1DeploymentStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}