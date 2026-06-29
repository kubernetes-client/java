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
public class V1StatusDetailsBuilder extends V1StatusDetailsFluent<V1StatusDetailsBuilder> implements VisitableBuilder<V1StatusDetails,V1StatusDetailsBuilder>{

  V1StatusDetailsFluent<?> fluent;

  public V1StatusDetailsBuilder() {
    this(new V1StatusDetails());
  }
  
  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent) {
    this(fluent, new V1StatusDetails());
  }
  
  public V1StatusDetailsBuilder(V1StatusDetails instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent,V1StatusDetails instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StatusDetails build() {
    V1StatusDetails buildable = new V1StatusDetails();
    buildable.setCauses(fluent.buildCauses());
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setRetryAfterSeconds(fluent.getRetryAfterSeconds());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}