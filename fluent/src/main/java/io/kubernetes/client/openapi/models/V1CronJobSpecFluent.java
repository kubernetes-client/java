package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CronJobSpecFluent<A extends io.kubernetes.client.openapi.models.V1CronJobSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public io.kubernetes.client.openapi.models.V1CronJobSpec.ConcurrencyPolicyEnum getConcurrencyPolicy();
  public A withConcurrencyPolicy(io.kubernetes.client.openapi.models.V1CronJobSpec.ConcurrencyPolicyEnum concurrencyPolicy);
  public java.lang.Boolean hasConcurrencyPolicy();
  public java.lang.Integer getFailedJobsHistoryLimit();
  public A withFailedJobsHistoryLimit(java.lang.Integer failedJobsHistoryLimit);
  public java.lang.Boolean hasFailedJobsHistoryLimit();
  
  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1JobTemplateSpec getJobTemplate();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpec buildJobTemplate();
  public A withJobTemplate(io.kubernetes.client.openapi.models.V1JobTemplateSpec jobTemplate);
  public java.lang.Boolean hasJobTemplate();
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate();
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(io.kubernetes.client.openapi.models.V1JobTemplateSpec item);
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editJobTemplate();
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate();
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(io.kubernetes.client.openapi.models.V1JobTemplateSpec item);
  public java.lang.String getSchedule();
  public A withSchedule(java.lang.String schedule);
  public java.lang.Boolean hasSchedule();
  
  /**
   * Method is deprecated. use withSchedule instead.
   */
  @java.lang.Deprecated
  public A withNewSchedule(java.lang.String original);
  public java.lang.Long getStartingDeadlineSeconds();
  public A withStartingDeadlineSeconds(java.lang.Long startingDeadlineSeconds);
  public java.lang.Boolean hasStartingDeadlineSeconds();
  public java.lang.Integer getSuccessfulJobsHistoryLimit();
  public A withSuccessfulJobsHistoryLimit(java.lang.Integer successfulJobsHistoryLimit);
  public java.lang.Boolean hasSuccessfulJobsHistoryLimit();
  public java.lang.Boolean getSuspend();
  public A withSuspend(java.lang.Boolean suspend);
  public java.lang.Boolean hasSuspend();
  public interface JobTemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<N>>{
    public N and();
    public N endJobTemplate();
    
  }
  
}