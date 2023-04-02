package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeploymentBuilder extends V1DeploymentFluentImpl<V1DeploymentBuilder> implements VisitableBuilder<V1Deployment,V1DeploymentBuilder>{
  public V1DeploymentBuilder() {
    this(false);
  }
  public V1DeploymentBuilder(Boolean validationEnabled) {
    this(new V1Deployment(), validationEnabled);
  }
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Deployment(), validationEnabled);
  }
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent,V1Deployment instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentBuilder(V1DeploymentFluent<?> fluent,V1Deployment instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentBuilder(V1Deployment instance) {
    this(instance,false);
  }
  public V1DeploymentBuilder(V1Deployment instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1DeploymentFluent<?> fluent;
  Boolean validationEnabled;
  public V1Deployment build() {
    V1Deployment buildable = new V1Deployment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}