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
public class V1WindowsSecurityContextOptionsBuilder extends V1WindowsSecurityContextOptionsFluent<V1WindowsSecurityContextOptionsBuilder> implements VisitableBuilder<V1WindowsSecurityContextOptions,V1WindowsSecurityContextOptionsBuilder>{

  V1WindowsSecurityContextOptionsFluent<?> fluent;

  public V1WindowsSecurityContextOptionsBuilder() {
    this(new V1WindowsSecurityContextOptions());
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent) {
    this(fluent, new V1WindowsSecurityContextOptions());
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent,V1WindowsSecurityContextOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1WindowsSecurityContextOptions build() {
    V1WindowsSecurityContextOptions buildable = new V1WindowsSecurityContextOptions();
    buildable.setGmsaCredentialSpec(fluent.getGmsaCredentialSpec());
    buildable.setGmsaCredentialSpecName(fluent.getGmsaCredentialSpecName());
    buildable.setHostProcess(fluent.getHostProcess());
    buildable.setRunAsUserName(fluent.getRunAsUserName());
    return buildable;
  }
  
}