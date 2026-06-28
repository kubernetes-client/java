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
public class V1NodeSystemInfoBuilder extends V1NodeSystemInfoFluent<V1NodeSystemInfoBuilder> implements VisitableBuilder<V1NodeSystemInfo,V1NodeSystemInfoBuilder>{

  V1NodeSystemInfoFluent<?> fluent;

  public V1NodeSystemInfoBuilder() {
    this(new V1NodeSystemInfo());
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent) {
    this(fluent, new V1NodeSystemInfo());
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent,V1NodeSystemInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeSystemInfo build() {
    V1NodeSystemInfo buildable = new V1NodeSystemInfo();
    buildable.setArchitecture(fluent.getArchitecture());
    buildable.setBootID(fluent.getBootID());
    buildable.setContainerRuntimeVersion(fluent.getContainerRuntimeVersion());
    buildable.setKernelVersion(fluent.getKernelVersion());
    buildable.setKubeProxyVersion(fluent.getKubeProxyVersion());
    buildable.setKubeletVersion(fluent.getKubeletVersion());
    buildable.setMachineID(fluent.getMachineID());
    buildable.setOperatingSystem(fluent.getOperatingSystem());
    buildable.setOsImage(fluent.getOsImage());
    buildable.setSwap(fluent.buildSwap());
    buildable.setSystemUUID(fluent.getSystemUUID());
    return buildable;
  }
  
}