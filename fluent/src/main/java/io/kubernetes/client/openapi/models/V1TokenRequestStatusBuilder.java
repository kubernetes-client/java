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
public class V1TokenRequestStatusBuilder extends V1TokenRequestStatusFluent<V1TokenRequestStatusBuilder> implements VisitableBuilder<V1TokenRequestStatus,V1TokenRequestStatusBuilder>{

  V1TokenRequestStatusFluent<?> fluent;

  public V1TokenRequestStatusBuilder() {
    this(new V1TokenRequestStatus());
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent) {
    this(fluent, new V1TokenRequestStatus());
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent,V1TokenRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TokenRequestStatus build() {
    V1TokenRequestStatus buildable = new V1TokenRequestStatus();
    buildable.setExpirationTimestamp(fluent.getExpirationTimestamp());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
  
}