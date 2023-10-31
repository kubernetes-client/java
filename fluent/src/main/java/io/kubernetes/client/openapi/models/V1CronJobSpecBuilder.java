package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CronJobSpecBuilder extends V1CronJobSpecFluent<V1CronJobSpecBuilder> implements VisitableBuilder<V1CronJobSpec,V1CronJobSpecBuilder>{
  public V1CronJobSpecBuilder() {
    this(new V1CronJobSpec());
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent) {
    this(fluent, new V1CronJobSpec());
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent,V1CronJobSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CronJobSpecFluent<?> fluent;
  
  public V1CronJobSpec build() {
    V1CronJobSpec buildable = new V1CronJobSpec();
    buildable.setConcurrencyPolicy(fluent.getConcurrencyPolicy());
    buildable.setFailedJobsHistoryLimit(fluent.getFailedJobsHistoryLimit());
    buildable.setJobTemplate(fluent.buildJobTemplate());
    buildable.setSchedule(fluent.getSchedule());
    buildable.setStartingDeadlineSeconds(fluent.getStartingDeadlineSeconds());
    buildable.setSuccessfulJobsHistoryLimit(fluent.getSuccessfulJobsHistoryLimit());
    buildable.setSuspend(fluent.getSuspend());
    buildable.setTimeZone(fluent.getTimeZone());
    return buildable;
  }
  

}