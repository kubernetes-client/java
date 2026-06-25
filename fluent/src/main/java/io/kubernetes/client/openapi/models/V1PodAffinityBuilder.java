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
public class V1PodAffinityBuilder extends V1PodAffinityFluent<V1PodAffinityBuilder> implements VisitableBuilder<V1PodAffinity,V1PodAffinityBuilder>{

  V1PodAffinityFluent<?> fluent;

  public V1PodAffinityBuilder() {
    this(new V1PodAffinity());
  }
  
  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent) {
    this(fluent, new V1PodAffinity());
  }
  
  public V1PodAffinityBuilder(V1PodAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent,V1PodAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodAffinity build() {
    V1PodAffinity buildable = new V1PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  
}