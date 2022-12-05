package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CronJobSpecFluentImpl<A extends V1CronJobSpecFluent<A>> extends BaseFluent<A> implements V1CronJobSpecFluent<A>{
  public V1CronJobSpecFluentImpl() {
  }
  public V1CronJobSpecFluentImpl(V1CronJobSpec instance) {
    this.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    this.withJobTemplate(instance.getJobTemplate());

    this.withSchedule(instance.getSchedule());

    this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    this.withSuspend(instance.getSuspend());

    this.withTimeZone(instance.getTimeZone());

  }
  private String concurrencyPolicy;
  private Integer failedJobsHistoryLimit;
  private V1JobTemplateSpecBuilder jobTemplate;
  private String schedule;
  private Long startingDeadlineSeconds;
  private Integer successfulJobsHistoryLimit;
  private Boolean suspend;
  private String timeZone;
  public String getConcurrencyPolicy() {
    return this.concurrencyPolicy;
  }
  public A withConcurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy=concurrencyPolicy; return (A) this;
  }
  public Boolean hasConcurrencyPolicy() {
    return this.concurrencyPolicy != null;
  }
  public Integer getFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit;
  }
  public A withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit=failedJobsHistoryLimit; return (A) this;
  }
  public Boolean hasFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit != null;
  }
  
  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobTemplateSpec getJobTemplate() {
    return this.jobTemplate!=null ?this.jobTemplate.build():null;
  }
  public V1JobTemplateSpec buildJobTemplate() {
    return this.jobTemplate!=null ?this.jobTemplate.build():null;
  }
  public A withJobTemplate(V1JobTemplateSpec jobTemplate) {
    _visitables.get("jobTemplate").remove(this.jobTemplate);
    if (jobTemplate!=null){ this.jobTemplate= new V1JobTemplateSpecBuilder(jobTemplate); _visitables.get("jobTemplate").add(this.jobTemplate);} else { this.jobTemplate = null; _visitables.get("jobTemplate").remove(this.jobTemplate); } return (A) this;
  }
  public Boolean hasJobTemplate() {
    return this.jobTemplate != null;
  }
  public V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate() {
    return new V1CronJobSpecFluentImpl.JobTemplateNestedImpl();
  }
  public V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(V1JobTemplateSpec item) {
    return new V1CronJobSpecFluentImpl.JobTemplateNestedImpl(item);
  }
  public V1CronJobSpecFluent.JobTemplateNested<A> editJobTemplate() {
    return withNewJobTemplateLike(getJobTemplate());
  }
  public V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate() {
    return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): new V1JobTemplateSpecBuilder().build());
  }
  public V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(V1JobTemplateSpec item) {
    return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): item);
  }
  public String getSchedule() {
    return this.schedule;
  }
  public A withSchedule(String schedule) {
    this.schedule=schedule; return (A) this;
  }
  public Boolean hasSchedule() {
    return this.schedule != null;
  }
  public Long getStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds;
  }
  public A withStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds=startingDeadlineSeconds; return (A) this;
  }
  public Boolean hasStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds != null;
  }
  public Integer getSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit;
  }
  public A withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit=successfulJobsHistoryLimit; return (A) this;
  }
  public Boolean hasSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit != null;
  }
  public Boolean getSuspend() {
    return this.suspend;
  }
  public A withSuspend(Boolean suspend) {
    this.suspend=suspend; return (A) this;
  }
  public Boolean hasSuspend() {
    return this.suspend != null;
  }
  public String getTimeZone() {
    return this.timeZone;
  }
  public A withTimeZone(String timeZone) {
    this.timeZone=timeZone; return (A) this;
  }
  public Boolean hasTimeZone() {
    return this.timeZone != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CronJobSpecFluentImpl that = (V1CronJobSpecFluentImpl) o;
    if (concurrencyPolicy != null ? !concurrencyPolicy.equals(that.concurrencyPolicy) :that.concurrencyPolicy != null) return false;
    if (failedJobsHistoryLimit != null ? !failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) :that.failedJobsHistoryLimit != null) return false;
    if (jobTemplate != null ? !jobTemplate.equals(that.jobTemplate) :that.jobTemplate != null) return false;
    if (schedule != null ? !schedule.equals(that.schedule) :that.schedule != null) return false;
    if (startingDeadlineSeconds != null ? !startingDeadlineSeconds.equals(that.startingDeadlineSeconds) :that.startingDeadlineSeconds != null) return false;
    if (successfulJobsHistoryLimit != null ? !successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) :that.successfulJobsHistoryLimit != null) return false;
    if (suspend != null ? !suspend.equals(that.suspend) :that.suspend != null) return false;
    if (timeZone != null ? !timeZone.equals(that.timeZone) :that.timeZone != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(concurrencyPolicy,  failedJobsHistoryLimit,  jobTemplate,  schedule,  startingDeadlineSeconds,  successfulJobsHistoryLimit,  suspend,  timeZone,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (concurrencyPolicy != null) { sb.append("concurrencyPolicy:"); sb.append(concurrencyPolicy + ","); }
    if (failedJobsHistoryLimit != null) { sb.append("failedJobsHistoryLimit:"); sb.append(failedJobsHistoryLimit + ","); }
    if (jobTemplate != null) { sb.append("jobTemplate:"); sb.append(jobTemplate + ","); }
    if (schedule != null) { sb.append("schedule:"); sb.append(schedule + ","); }
    if (startingDeadlineSeconds != null) { sb.append("startingDeadlineSeconds:"); sb.append(startingDeadlineSeconds + ","); }
    if (successfulJobsHistoryLimit != null) { sb.append("successfulJobsHistoryLimit:"); sb.append(successfulJobsHistoryLimit + ","); }
    if (suspend != null) { sb.append("suspend:"); sb.append(suspend + ","); }
    if (timeZone != null) { sb.append("timeZone:"); sb.append(timeZone); }
    sb.append("}");
    return sb.toString();
  }
  public A withSuspend() {
    return withSuspend(true);
  }
  class JobTemplateNestedImpl<N> extends V1JobTemplateSpecFluentImpl<V1CronJobSpecFluent.JobTemplateNested<N>> implements V1CronJobSpecFluent.JobTemplateNested<N>,Nested<N>{
    JobTemplateNestedImpl(V1JobTemplateSpec item) {
      this.builder = new V1JobTemplateSpecBuilder(this, item);
    }
    JobTemplateNestedImpl() {
      this.builder = new V1JobTemplateSpecBuilder(this);
    }
    V1JobTemplateSpecBuilder builder;
    public N and() {
      return (N) V1CronJobSpecFluentImpl.this.withJobTemplate(builder.build());
    }
    public N endJobTemplate() {
      return and();
    }
    
  }
  
}