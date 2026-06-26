/*
Copyright 2020 The Kubernetes Authors.
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
public class V1CronJobStatusBuilder extends V1CronJobStatusFluent<V1CronJobStatusBuilder> implements VisitableBuilder<V1CronJobStatus,V1CronJobStatusBuilder>{

  V1CronJobStatusFluent<?> fluent;

  public V1CronJobStatusBuilder() {
    this(new V1CronJobStatus());
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent) {
    this(fluent, new V1CronJobStatus());
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CronJobStatusBuilder(V1CronJobStatusFluent<?> fluent,V1CronJobStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CronJobStatus build() {
    V1CronJobStatus buildable = new V1CronJobStatus();
    buildable.setActive(fluent.buildActive());
    buildable.setLastScheduleTime(fluent.getLastScheduleTime());
    buildable.setLastSuccessfulTime(fluent.getLastSuccessfulTime());
    return buildable;
  }
  
}