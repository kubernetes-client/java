package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CronJobStatusBuilder extends V1CronJobStatusFluent<V1CronJobStatusBuilder> implements VisitableBuilder<V1CronJobStatus,V1CronJobStatusBuilder>{
  public V1CronJobStatusBuilder() {
    this(new V1CronJobStatus());
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent) {
    this(fluent, new V1CronJobStatus());
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent,V1CronJobStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CronJobStatusFluent<?> fluent;
  
  public V1CronJobStatus build() {
    V1CronJobStatus buildable = new V1CronJobStatus();
    buildable.setActive(fluent.buildActive());
    buildable.setLastScheduleTime(fluent.getLastScheduleTime());
    buildable.setLastSuccessfulTime(fluent.getLastSuccessfulTime());
    return buildable;
  }
  

}