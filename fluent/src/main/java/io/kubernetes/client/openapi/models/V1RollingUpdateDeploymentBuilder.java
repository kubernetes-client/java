package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RollingUpdateDeploymentBuilder extends V1RollingUpdateDeploymentFluent<V1RollingUpdateDeploymentBuilder> implements VisitableBuilder<V1RollingUpdateDeployment,V1RollingUpdateDeploymentBuilder>{
  public V1RollingUpdateDeploymentBuilder() {
    this(new V1RollingUpdateDeployment());
  }
  
  public V1RollingUpdateDeploymentBuilder(V1RollingUpdateDeploymentFluent<?> fluent) {
    this(fluent, new V1RollingUpdateDeployment());
  }
  
  public V1RollingUpdateDeploymentBuilder(V1RollingUpdateDeploymentFluent<?> fluent,V1RollingUpdateDeployment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RollingUpdateDeploymentBuilder(V1RollingUpdateDeployment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RollingUpdateDeploymentFluent<?> fluent;
  
  public V1RollingUpdateDeployment build() {
    V1RollingUpdateDeployment buildable = new V1RollingUpdateDeployment();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
  

}