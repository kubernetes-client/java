/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1beta1CronJobSpecFluent<A extends V1beta1CronJobSpecFluent<A>> extends Fluent<A> {
  public String getConcurrencyPolicy();

  public A withConcurrencyPolicy(java.lang.String concurrencyPolicy);

  public Boolean hasConcurrencyPolicy();

  public Integer getFailedJobsHistoryLimit();

  public A withFailedJobsHistoryLimit(java.lang.Integer failedJobsHistoryLimit);

  public java.lang.Boolean hasFailedJobsHistoryLimit();

  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1JobTemplateSpec getJobTemplate();

  public io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec buildJobTemplate();

  public A withJobTemplate(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec jobTemplate);

  public java.lang.Boolean hasJobTemplate();

  public V1beta1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate();

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      withNewJobTemplateLike(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec item);

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editJobTemplate();

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editOrNewJobTemplate();

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpecFluent.JobTemplateNested<A>
      editOrNewJobTemplateLike(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec item);

  public java.lang.String getSchedule();

  public A withSchedule(java.lang.String schedule);

  public java.lang.Boolean hasSchedule();

  public Long getStartingDeadlineSeconds();

  public A withStartingDeadlineSeconds(java.lang.Long startingDeadlineSeconds);

  public java.lang.Boolean hasStartingDeadlineSeconds();

  public java.lang.Integer getSuccessfulJobsHistoryLimit();

  public A withSuccessfulJobsHistoryLimit(java.lang.Integer successfulJobsHistoryLimit);

  public java.lang.Boolean hasSuccessfulJobsHistoryLimit();

  public java.lang.Boolean getSuspend();

  public A withSuspend(java.lang.Boolean suspend);

  public java.lang.Boolean hasSuspend();

  public A withSuspend();

  public interface JobTemplateNested<N>
      extends Nested<N>,
          V1beta1JobTemplateSpecFluent<V1beta1CronJobSpecFluent.JobTemplateNested<N>> {
    public N and();

    public N endJobTemplate();
  }
}
