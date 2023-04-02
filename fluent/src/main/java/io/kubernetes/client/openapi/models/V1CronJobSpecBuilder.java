package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CronJobSpecBuilder extends V1CronJobSpecFluentImpl<V1CronJobSpecBuilder> implements VisitableBuilder<V1CronJobSpec,V1CronJobSpecBuilder>{
  public V1CronJobSpecBuilder() {
    this(false);
  }
  public V1CronJobSpecBuilder(Boolean validationEnabled) {
    this(new V1CronJobSpec(), validationEnabled);
  }
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CronJobSpec(), validationEnabled);
  }
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent,V1CronJobSpec instance) {
    this(fluent, instance, false);
  }
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent,V1CronJobSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    fluent.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    fluent.withJobTemplate(instance.getJobTemplate());

    fluent.withSchedule(instance.getSchedule());

    fluent.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    fluent.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    fluent.withSuspend(instance.getSuspend());

    fluent.withTimeZone(instance.getTimeZone());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobSpecBuilder(V1CronJobSpec instance) {
    this(instance,false);
  }
  public V1CronJobSpecBuilder(V1CronJobSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    this.withJobTemplate(instance.getJobTemplate());

    this.withSchedule(instance.getSchedule());

    this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    this.withSuspend(instance.getSuspend());

    this.withTimeZone(instance.getTimeZone());

    this.validationEnabled = validationEnabled; 
  }
  V1CronJobSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1CronJobSpec build() {
    V1CronJobSpec buildable = new V1CronJobSpec();
    buildable.setConcurrencyPolicy(fluent.getConcurrencyPolicy());
    buildable.setFailedJobsHistoryLimit(fluent.getFailedJobsHistoryLimit());
    buildable.setJobTemplate(fluent.getJobTemplate());
    buildable.setSchedule(fluent.getSchedule());
    buildable.setStartingDeadlineSeconds(fluent.getStartingDeadlineSeconds());
    buildable.setSuccessfulJobsHistoryLimit(fluent.getSuccessfulJobsHistoryLimit());
    buildable.setSuspend(fluent.getSuspend());
    buildable.setTimeZone(fluent.getTimeZone());
    return buildable;
  }
  
}