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
public class V1APIServiceSpecBuilder extends V1APIServiceSpecFluent<V1APIServiceSpecBuilder> implements VisitableBuilder<V1APIServiceSpec,V1APIServiceSpecBuilder>{

  V1APIServiceSpecFluent<?> fluent;

  public V1APIServiceSpecBuilder() {
    this(new V1APIServiceSpec());
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent) {
    this(fluent, new V1APIServiceSpec());
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent,V1APIServiceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1APIServiceSpec build() {
    V1APIServiceSpec buildable = new V1APIServiceSpec();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setGroup(fluent.getGroup());
    buildable.setGroupPriorityMinimum(fluent.getGroupPriorityMinimum());
    buildable.setInsecureSkipTLSVerify(fluent.getInsecureSkipTLSVerify());
    buildable.setService(fluent.buildService());
    buildable.setVersion(fluent.getVersion());
    buildable.setVersionPriority(fluent.getVersionPriority());
    return buildable;
  }
  
}