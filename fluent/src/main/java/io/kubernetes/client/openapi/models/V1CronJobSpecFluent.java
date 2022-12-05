package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CronJobSpecFluent<A extends V1CronJobSpecFluent<A>> extends Fluent<A>{
  public String getConcurrencyPolicy();
  public A withConcurrencyPolicy(String concurrencyPolicy);
  public Boolean hasConcurrencyPolicy();
  public Integer getFailedJobsHistoryLimit();
  public A withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit);
  public Boolean hasFailedJobsHistoryLimit();
  
  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobTemplateSpec getJobTemplate();
  public V1JobTemplateSpec buildJobTemplate();
  public A withJobTemplate(V1JobTemplateSpec jobTemplate);
  public Boolean hasJobTemplate();
  public V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate();
  public V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(V1JobTemplateSpec item);
  public V1CronJobSpecFluent.JobTemplateNested<A> editJobTemplate();
  public V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate();
  public V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(V1JobTemplateSpec item);
  public String getSchedule();
  public A withSchedule(String schedule);
  public Boolean hasSchedule();
  public Long getStartingDeadlineSeconds();
  public A withStartingDeadlineSeconds(Long startingDeadlineSeconds);
  public Boolean hasStartingDeadlineSeconds();
  public Integer getSuccessfulJobsHistoryLimit();
  public A withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit);
  public Boolean hasSuccessfulJobsHistoryLimit();
  public Boolean getSuspend();
  public A withSuspend(Boolean suspend);
  public Boolean hasSuspend();
  public String getTimeZone();
  public A withTimeZone(String timeZone);
  public Boolean hasTimeZone();
  public A withSuspend();
  public interface JobTemplateNested<N> extends Nested<N>,V1JobTemplateSpecFluent<V1CronJobSpecFluent.JobTemplateNested<N>>{
    public N and();
    public N endJobTemplate();
    
  }
  
}