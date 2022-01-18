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

public class V1CronJobSpecBuilder
    extends io.kubernetes.client.openapi.models.V1CronJobSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1CronJobSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CronJobSpec,
        io.kubernetes.client.openapi.models.V1CronJobSpecBuilder> {
  public V1CronJobSpecBuilder() {
    this(false);
  }

  public V1CronJobSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CronJobSpec(), validationEnabled);
  }

  public V1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V1CronJobSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CronJobSpecBuilder(
      io.kubernetes.client.openapi.models.V1CronJobSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CronJobSpec(), validationEnabled);
  }

  public V1CronJobSpecBuilder(
      io.kubernetes.client.openapi.models.V1CronJobSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CronJobSpec instance) {
    this(fluent, instance, false);
  }

  public V1CronJobSpecBuilder(
      io.kubernetes.client.openapi.models.V1CronJobSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CronJobSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    fluent.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    fluent.withJobTemplate(instance.getJobTemplate());

    fluent.withSchedule(instance.getSchedule());

    fluent.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    fluent.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    fluent.withSuspend(instance.getSuspend());

    this.validationEnabled = validationEnabled;
  }

  public V1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V1CronJobSpec instance) {
    this(instance, false);
  }

  public V1CronJobSpecBuilder(
      io.kubernetes.client.openapi.models.V1CronJobSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    this.withJobTemplate(instance.getJobTemplate());

    this.withSchedule(instance.getSchedule());

    this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    this.withSuspend(instance.getSuspend());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CronJobSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CronJobSpec build() {
    V1CronJobSpec buildable = new V1CronJobSpec();
    buildable.setConcurrencyPolicy(fluent.getConcurrencyPolicy());
    buildable.setFailedJobsHistoryLimit(fluent.getFailedJobsHistoryLimit());
    buildable.setJobTemplate(fluent.getJobTemplate());
    buildable.setSchedule(fluent.getSchedule());
    buildable.setStartingDeadlineSeconds(fluent.getStartingDeadlineSeconds());
    buildable.setSuccessfulJobsHistoryLimit(fluent.getSuccessfulJobsHistoryLimit());
    buildable.setSuspend(fluent.getSuspend());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CronJobSpecBuilder that = (V1CronJobSpecBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
