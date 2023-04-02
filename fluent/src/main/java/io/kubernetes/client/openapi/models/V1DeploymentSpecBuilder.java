package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeploymentSpecBuilder extends V1DeploymentSpecFluentImpl<V1DeploymentSpecBuilder> implements VisitableBuilder<V1DeploymentSpec,V1DeploymentSpecBuilder>{
  public V1DeploymentSpecBuilder() {
    this(false);
  }
  public V1DeploymentSpecBuilder(Boolean validationEnabled) {
    this(new V1DeploymentSpec(), validationEnabled);
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DeploymentSpec(), validationEnabled);
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent,V1DeploymentSpec instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpecFluent<?> fluent,V1DeploymentSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withPaused(instance.getPaused());

    fluent.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    fluent.withSelector(instance.getSelector());

    fluent.withStrategy(instance.getStrategy());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpec instance) {
    this(instance,false);
  }
  public V1DeploymentSpecBuilder(V1DeploymentSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPaused(instance.getPaused());

    this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withStrategy(instance.getStrategy());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  V1DeploymentSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1DeploymentSpec build() {
    V1DeploymentSpec buildable = new V1DeploymentSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setPaused(fluent.getPaused());
    buildable.setProgressDeadlineSeconds(fluent.getProgressDeadlineSeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.getSelector());
    buildable.setStrategy(fluent.getStrategy());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
  
}