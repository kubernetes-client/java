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

public class V1beta1CronJobStatusBuilder
    extends io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1CronJobStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1CronJobStatus,
        io.kubernetes.client.openapi.models.V1beta1CronJobStatusBuilder> {
  public V1beta1CronJobStatusBuilder() {
    this(false);
  }

  public V1beta1CronJobStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1CronJobStatus(), validationEnabled);
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1CronJobStatus(), validationEnabled);
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1CronJobStatus instance) {
    this(fluent, instance, false);
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1CronJobStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withActive(instance.getActive());

    fluent.withLastScheduleTime(instance.getLastScheduleTime());

    fluent.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatus instance) {
    this(instance, false);
  }

  public V1beta1CronJobStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withActive(instance.getActive());

    this.withLastScheduleTime(instance.getLastScheduleTime());

    this.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1CronJobStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1CronJobStatus build() {
    V1beta1CronJobStatus buildable = new V1beta1CronJobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setLastScheduleTime(fluent.getLastScheduleTime());
    buildable.setLastSuccessfulTime(fluent.getLastSuccessfulTime());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1CronJobStatusBuilder that = (V1beta1CronJobStatusBuilder) o;
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
