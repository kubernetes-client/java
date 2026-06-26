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
public class V1CSIDriverSpecBuilder extends V1CSIDriverSpecFluent<V1CSIDriverSpecBuilder> implements VisitableBuilder<V1CSIDriverSpec,V1CSIDriverSpecBuilder>{

  V1CSIDriverSpecFluent<?> fluent;

  public V1CSIDriverSpecBuilder() {
    this(new V1CSIDriverSpec());
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent) {
    this(fluent, new V1CSIDriverSpec());
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent,V1CSIDriverSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CSIDriverSpec build() {
    V1CSIDriverSpec buildable = new V1CSIDriverSpec();
    buildable.setAttachRequired(fluent.getAttachRequired());
    buildable.setFsGroupPolicy(fluent.getFsGroupPolicy());
    buildable.setNodeAllocatableUpdatePeriodSeconds(fluent.getNodeAllocatableUpdatePeriodSeconds());
    buildable.setPodInfoOnMount(fluent.getPodInfoOnMount());
    buildable.setRequiresRepublish(fluent.getRequiresRepublish());
    buildable.setSeLinuxMount(fluent.getSeLinuxMount());
    buildable.setServiceAccountTokenInSecrets(fluent.getServiceAccountTokenInSecrets());
    buildable.setStorageCapacity(fluent.getStorageCapacity());
    buildable.setTokenRequests(fluent.buildTokenRequests());
    buildable.setVolumeLifecycleModes(fluent.getVolumeLifecycleModes());
    return buildable;
  }
  
}