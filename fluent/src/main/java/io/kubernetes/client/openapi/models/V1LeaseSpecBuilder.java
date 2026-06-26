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
public class V1LeaseSpecBuilder extends V1LeaseSpecFluent<V1LeaseSpecBuilder> implements VisitableBuilder<V1LeaseSpec,V1LeaseSpecBuilder>{

  V1LeaseSpecFluent<?> fluent;

  public V1LeaseSpecBuilder() {
    this(new V1LeaseSpec());
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent) {
    this(fluent, new V1LeaseSpec());
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LeaseSpecBuilder(V1LeaseSpecFluent<?> fluent,V1LeaseSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LeaseSpec build() {
    V1LeaseSpec buildable = new V1LeaseSpec();
    buildable.setAcquireTime(fluent.getAcquireTime());
    buildable.setHolderIdentity(fluent.getHolderIdentity());
    buildable.setLeaseDurationSeconds(fluent.getLeaseDurationSeconds());
    buildable.setLeaseTransitions(fluent.getLeaseTransitions());
    buildable.setPreferredHolder(fluent.getPreferredHolder());
    buildable.setRenewTime(fluent.getRenewTime());
    buildable.setStrategy(fluent.getStrategy());
    return buildable;
  }
  
}