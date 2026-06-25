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
public class V1ResourceQuotaBuilder extends V1ResourceQuotaFluent<V1ResourceQuotaBuilder> implements VisitableBuilder<V1ResourceQuota,V1ResourceQuotaBuilder>{

  V1ResourceQuotaFluent<?> fluent;

  public V1ResourceQuotaBuilder() {
    this(new V1ResourceQuota());
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent) {
    this(fluent, new V1ResourceQuota());
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuota instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent,V1ResourceQuota instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceQuota build() {
    V1ResourceQuota buildable = new V1ResourceQuota();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}