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
public class V1JobSpecBuilder extends V1JobSpecFluent<V1JobSpecBuilder> implements VisitableBuilder<V1JobSpec,V1JobSpecBuilder>{

  V1JobSpecFluent<?> fluent;

  public V1JobSpecBuilder() {
    this(new V1JobSpec());
  }
  
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent) {
    this(fluent, new V1JobSpec());
  }
  
  public V1JobSpecBuilder(V1JobSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent,V1JobSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JobSpec build() {
    V1JobSpec buildable = new V1JobSpec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setBackoffLimit(fluent.getBackoffLimit());
    buildable.setBackoffLimitPerIndex(fluent.getBackoffLimitPerIndex());
    buildable.setCompletionMode(fluent.getCompletionMode());
    buildable.setCompletions(fluent.getCompletions());
    buildable.setManagedBy(fluent.getManagedBy());
    buildable.setManualSelector(fluent.getManualSelector());
    buildable.setMaxFailedIndexes(fluent.getMaxFailedIndexes());
    buildable.setParallelism(fluent.getParallelism());
    buildable.setPodFailurePolicy(fluent.buildPodFailurePolicy());
    buildable.setPodReplacementPolicy(fluent.getPodReplacementPolicy());
    buildable.setSelector(fluent.buildSelector());
    buildable.setSuccessPolicy(fluent.buildSuccessPolicy());
    buildable.setSuspend(fluent.getSuspend());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setTtlSecondsAfterFinished(fluent.getTtlSecondsAfterFinished());
    return buildable;
  }
  
}