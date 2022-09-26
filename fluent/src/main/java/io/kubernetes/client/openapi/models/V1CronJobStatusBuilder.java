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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1CronJobStatusBuilder extends V1CronJobStatusFluentImpl<V1CronJobStatusBuilder>
    implements VisitableBuilder<V1CronJobStatus, V1CronJobStatusBuilder> {
  public V1CronJobStatusBuilder() {
    this(false);
  }

  public V1CronJobStatusBuilder(Boolean validationEnabled) {
    this(new V1CronJobStatus(), validationEnabled);
  }

  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CronJobStatus(), validationEnabled);
  }

  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent, V1CronJobStatus instance) {
    this(fluent, instance, false);
  }

  public V1CronJobStatusBuilder(
      V1CronJobStatusFluent<?> fluent, V1CronJobStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withActive(instance.getActive());

    fluent.withLastScheduleTime(instance.getLastScheduleTime());

    fluent.withLastSuccessfulTime(instance.getLastSuccessfulTime());

    this.validationEnabled = validationEnabled;
  }

  public V1CronJobStatusBuilder(V1CronJobStatus instance) {
    this(instance, false);
  }

  public V1CronJobStatusBuilder(V1CronJobStatus instance, Boolean validationEnabled) {
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
