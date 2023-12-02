package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentSpecBuilder extends V1DeploymentSpecFluent<V1DeploymentSpecBuilder> implements VisitableBuilder<V1DeploymentSpec,V1DeploymentSpecBuilder>{
  public V1DeploymentSpecBuilder() {
    this(new V1DeploymentSpec());
  }
  
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent) {
    this(fluent, new V1DeploymentSpec());
  }
  
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent,V1DeploymentSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentSpecBuilder(V1DeploymentSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentSpecFluent<?> fluent;
  
  public V1DeploymentSpec build() {
    V1DeploymentSpec buildable = new V1DeploymentSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setPaused(fluent.getPaused());
    buildable.setProgressDeadlineSeconds(fluent.getProgressDeadlineSeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.buildSelector());
    buildable.setStrategy(fluent.buildStrategy());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  

}