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
public interface V1CronJobSpecFluent<A extends V1CronJobSpecFluent<A>> extends Fluent<A> {
  public String getConcurrencyPolicy();

  public A withConcurrencyPolicy(String concurrencyPolicy);

  public Boolean hasConcurrencyPolicy();

  public Integer getFailedJobsHistoryLimit();

  public A withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit);

  public Boolean hasFailedJobsHistoryLimit();

  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   *
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

  public interface JobTemplateNested<N>
      extends Nested<N>, V1JobTemplateSpecFluent<V1CronJobSpecFluent.JobTemplateNested<N>> {
    public N and();

    public N endJobTemplate();
  }
}
