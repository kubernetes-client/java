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
public class V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder> implements VisitableBuilder<V1StatefulSetPersistentVolumeClaimRetentionPolicy,V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder>{

  V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent;

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder() {
    this(new V1StatefulSetPersistentVolumeClaimRetentionPolicy());
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent) {
    this(fluent, new V1StatefulSetPersistentVolumeClaimRetentionPolicy());
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent,V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicy build() {
    V1StatefulSetPersistentVolumeClaimRetentionPolicy buildable = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
    buildable.setWhenDeleted(fluent.getWhenDeleted());
    buildable.setWhenScaled(fluent.getWhenScaled());
    return buildable;
  }
  
}