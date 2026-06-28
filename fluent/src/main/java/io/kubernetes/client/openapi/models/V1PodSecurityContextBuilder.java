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
public class V1PodSecurityContextBuilder extends V1PodSecurityContextFluent<V1PodSecurityContextBuilder> implements VisitableBuilder<V1PodSecurityContext,V1PodSecurityContextBuilder>{

  V1PodSecurityContextFluent<?> fluent;

  public V1PodSecurityContextBuilder() {
    this(new V1PodSecurityContext());
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent) {
    this(fluent, new V1PodSecurityContext());
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent,V1PodSecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodSecurityContext build() {
    V1PodSecurityContext buildable = new V1PodSecurityContext();
    buildable.setAppArmorProfile(fluent.buildAppArmorProfile());
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setFsGroupChangePolicy(fluent.getFsGroupChangePolicy());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxChangePolicy(fluent.getSeLinuxChangePolicy());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setSupplementalGroupsPolicy(fluent.getSupplementalGroupsPolicy());
    buildable.setSysctls(fluent.buildSysctls());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    return buildable;
  }
  
}