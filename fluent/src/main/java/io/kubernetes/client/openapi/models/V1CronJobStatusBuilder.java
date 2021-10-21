package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CronJobStatusBuilder extends io.kubernetes.client.openapi.models.V1CronJobStatusFluentImpl<io.kubernetes.client.openapi.models.V1CronJobStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CronJobStatus,io.kubernetes.client.openapi.models.V1CronJobStatusBuilder>{
  public V1CronJobStatusBuilder() {
    this(false);
  }
  public V1CronJobStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CronJobStatus(), validationEnabled);
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CronJobStatus(), validationEnabled);
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1CronJobStatus instance) {
    this(fluent, instance, false);
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1CronJobStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withActive(instance.getActive());

    fluent.withLastScheduleTime(instance.getLastScheduleTime());

    fluent.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatus instance) {
    this(instance,false);
  }
  public V1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V1CronJobStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withActive(instance.getActive());

    this.withLastScheduleTime(instance.getLastScheduleTime());

    this.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CronJobStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CronJobStatus build() {
    V1CronJobStatus buildable = new V1CronJobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setLastScheduleTime(fluent.getLastScheduleTime());
    buildable.setLastSuccessfulTime(fluent.getLastSuccessfulTime());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CronJobStatusBuilder that = (V1CronJobStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}