package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeploymentStrategyBuilder extends V1DeploymentStrategyFluentImpl<V1DeploymentStrategyBuilder> implements VisitableBuilder<V1DeploymentStrategy,V1DeploymentStrategyBuilder>{
  public V1DeploymentStrategyBuilder() {
    this(false);
  }
  public V1DeploymentStrategyBuilder(Boolean validationEnabled) {
    this(new V1DeploymentStrategy(), validationEnabled);
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DeploymentStrategy(), validationEnabled);
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent,V1DeploymentStrategy instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategyFluent<?> fluent,V1DeploymentStrategy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRollingUpdate(instance.getRollingUpdate());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategy instance) {
    this(instance,false);
  }
  public V1DeploymentStrategyBuilder(V1DeploymentStrategy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1DeploymentStrategyFluent<?> fluent;
  Boolean validationEnabled;
  public V1DeploymentStrategy build() {
    V1DeploymentStrategy buildable = new V1DeploymentStrategy();
    buildable.setRollingUpdate(fluent.getRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}