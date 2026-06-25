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
public class V1ResourceSliceSpecBuilder extends V1ResourceSliceSpecFluent<V1ResourceSliceSpecBuilder> implements VisitableBuilder<V1ResourceSliceSpec,V1ResourceSliceSpecBuilder>{

  V1ResourceSliceSpecFluent<?> fluent;

  public V1ResourceSliceSpecBuilder() {
    this(new V1ResourceSliceSpec());
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpecFluent<?> fluent) {
    this(fluent, new V1ResourceSliceSpec());
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpecFluent<?> fluent,V1ResourceSliceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceSliceSpec build() {
    V1ResourceSliceSpec buildable = new V1ResourceSliceSpec();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setDevices(fluent.buildDevices());
    buildable.setDriver(fluent.getDriver());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setPerDeviceNodeSelection(fluent.getPerDeviceNodeSelection());
    buildable.setPool(fluent.buildPool());
    buildable.setSharedCounters(fluent.buildSharedCounters());
    return buildable;
  }
  
}