/*
Copyright 2026 The Kubernetes Authors.
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

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CronJobSpecBuilder extends V1CronJobSpecFluent<V1CronJobSpecBuilder> implements VisitableBuilder<V1CronJobSpec,V1CronJobSpecBuilder>{

  V1CronJobSpecFluent<?> fluent;

  public V1CronJobSpecBuilder() {
    this(new V1CronJobSpec());
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent) {
    this(fluent, new V1CronJobSpec());
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CronJobSpecBuilder(V1CronJobSpecFluent<?> fluent,V1CronJobSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

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