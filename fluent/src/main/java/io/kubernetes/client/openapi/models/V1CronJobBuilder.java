package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CronJobBuilder extends V1CronJobFluent<V1CronJobBuilder> implements VisitableBuilder<V1CronJob,V1CronJobBuilder>{
  public V1CronJobBuilder() {
    this(new V1CronJob());
  }
  
  public V1CronJobBuilder(V1CronJobFluent<?> fluent) {
    this(fluent, new V1CronJob());
  }
  
  public V1CronJobBuilder(V1CronJobFluent<?> fluent,V1CronJob instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CronJobBuilder(V1CronJob instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CronJobFluent<?> fluent;
  
  public V1CronJob build() {
    V1CronJob buildable = new V1CronJob();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}