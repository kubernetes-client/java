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
public class V1DeleteOptionsBuilder extends V1DeleteOptionsFluent<V1DeleteOptionsBuilder> implements VisitableBuilder<V1DeleteOptions,V1DeleteOptionsBuilder>{

  V1DeleteOptionsFluent<?> fluent;

  public V1DeleteOptionsBuilder() {
    this(new V1DeleteOptions());
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent) {
    this(fluent, new V1DeleteOptions());
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent,V1DeleteOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeleteOptions build() {
    V1DeleteOptions buildable = new V1DeleteOptions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDryRun(fluent.getDryRun());
    buildable.setGracePeriodSeconds(fluent.getGracePeriodSeconds());
    buildable.setIgnoreStoreReadErrorWithClusterBreakingPotential(fluent.getIgnoreStoreReadErrorWithClusterBreakingPotential());
    buildable.setKind(fluent.getKind());
    buildable.setOrphanDependents(fluent.getOrphanDependents());
    buildable.setPreconditions(fluent.buildPreconditions());
    buildable.setPropagationPolicy(fluent.getPropagationPolicy());
    return buildable;
  }
  
}