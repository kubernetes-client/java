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
public class V1NodeAffinityBuilder extends V1NodeAffinityFluent<V1NodeAffinityBuilder> implements VisitableBuilder<V1NodeAffinity,V1NodeAffinityBuilder>{

  V1NodeAffinityFluent<?> fluent;

  public V1NodeAffinityBuilder() {
    this(new V1NodeAffinity());
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent) {
    this(fluent, new V1NodeAffinity());
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent,V1NodeAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeAffinity build() {
    V1NodeAffinity buildable = new V1NodeAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  
}