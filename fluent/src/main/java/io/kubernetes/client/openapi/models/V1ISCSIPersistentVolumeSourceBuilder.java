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
public class V1ISCSIPersistentVolumeSourceBuilder extends V1ISCSIPersistentVolumeSourceFluent<V1ISCSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1ISCSIPersistentVolumeSource,V1ISCSIPersistentVolumeSourceBuilder>{

  V1ISCSIPersistentVolumeSourceFluent<?> fluent;

  public V1ISCSIPersistentVolumeSourceBuilder() {
    this(new V1ISCSIPersistentVolumeSource());
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ISCSIPersistentVolumeSource());
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ISCSIPersistentVolumeSourceBuilder(V1ISCSIPersistentVolumeSourceFluent<?> fluent,V1ISCSIPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ISCSIPersistentVolumeSource build() {
    V1ISCSIPersistentVolumeSource buildable = new V1ISCSIPersistentVolumeSource();
    buildable.setChapAuthDiscovery(fluent.getChapAuthDiscovery());
    buildable.setChapAuthSession(fluent.getChapAuthSession());
    buildable.setFsType(fluent.getFsType());
    buildable.setInitiatorName(fluent.getInitiatorName());
    buildable.setIqn(fluent.getIqn());
    buildable.setIscsiInterface(fluent.getIscsiInterface());
    buildable.setLun(fluent.getLun());
    buildable.setPortals(fluent.getPortals());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
  
}