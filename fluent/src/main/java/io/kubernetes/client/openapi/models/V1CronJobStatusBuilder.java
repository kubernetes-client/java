package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CronJobStatusBuilder extends V1CronJobStatusFluentImpl<V1CronJobStatusBuilder> implements VisitableBuilder<V1CronJobStatus,V1CronJobStatusBuilder>{
  public V1CronJobStatusBuilder() {
    this(false);
  }
  public V1CronJobStatusBuilder(Boolean validationEnabled) {
    this(new V1CronJobStatus(), validationEnabled);
  }
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CronJobStatus(), validationEnabled);
  }
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent,V1CronJobStatus instance) {
    this(fluent, instance, false);
  }
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent,V1CronJobStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withActive(instance.getActive());

    fluent.withLastScheduleTime(instance.getLastScheduleTime());

    fluent.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobStatusBuilder(V1CronJobStatus instance) {
    this(instance,false);
  }
  public V1CronJobStatusBuilder(V1CronJobStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withActive(instance.getActive());

    this.withLastScheduleTime(instance.getLastScheduleTime());

    this.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled; 
  }
  V1CronJobStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1CronJobStatus build() {
    V1CronJobStatus buildable = new V1CronJobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setLastScheduleTime(fluent.getLastScheduleTime());
    buildable.setLastSuccessfulTime(fluent.getLastSuccessfulTime());
    return buildable;
  }
  
}