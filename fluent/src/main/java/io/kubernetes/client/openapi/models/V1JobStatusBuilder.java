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
public class V1JobStatusBuilder extends V1JobStatusFluent<V1JobStatusBuilder> implements VisitableBuilder<V1JobStatus,V1JobStatusBuilder>{

  V1JobStatusFluent<?> fluent;

  public V1JobStatusBuilder() {
    this(new V1JobStatus());
  }
  
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent) {
    this(fluent, new V1JobStatus());
  }
  
  public V1JobStatusBuilder(V1JobStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent,V1JobStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JobStatus build() {
    V1JobStatus buildable = new V1JobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setCompletedIndexes(fluent.getCompletedIndexes());
    buildable.setCompletionTime(fluent.getCompletionTime());
    buildable.setConditions(fluent.buildConditions());
    buildable.setFailed(fluent.getFailed());
    buildable.setFailedIndexes(fluent.getFailedIndexes());
    buildable.setReady(fluent.getReady());
    buildable.setStartTime(fluent.getStartTime());
    buildable.setSucceeded(fluent.getSucceeded());
    buildable.setTerminating(fluent.getTerminating());
    buildable.setUncountedTerminatedPods(fluent.buildUncountedTerminatedPods());
    return buildable;
  }
  
}