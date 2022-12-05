package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CronJobBuilder extends V1CronJobFluentImpl<V1CronJobBuilder> implements VisitableBuilder<V1CronJob,V1CronJobBuilder>{
  public V1CronJobBuilder() {
    this(false);
  }
  public V1CronJobBuilder(Boolean validationEnabled) {
    this(new V1CronJob(), validationEnabled);
  }
  public V1CronJobBuilder(V1CronJobFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobBuilder(V1CronJobFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CronJob(), validationEnabled);
  }
  public V1CronJobBuilder(V1CronJobFluent<?> fluent,V1CronJob instance) {
    this(fluent, instance, false);
  }
  public V1CronJobBuilder(V1CronJobFluent<?> fluent,V1CronJob instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobBuilder(V1CronJob instance) {
    this(instance,false);
  }
  public V1CronJobBuilder(V1CronJob instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1CronJobFluent<?> fluent;
  Boolean validationEnabled;
  public V1CronJob build() {
    V1CronJob buildable = new V1CronJob();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}