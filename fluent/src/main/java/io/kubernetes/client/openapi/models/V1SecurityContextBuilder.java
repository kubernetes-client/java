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
public class V1SecurityContextBuilder extends V1SecurityContextFluent<V1SecurityContextBuilder> implements VisitableBuilder<V1SecurityContext,V1SecurityContextBuilder>{

  V1SecurityContextFluent<?> fluent;

  public V1SecurityContextBuilder() {
    this(new V1SecurityContext());
  }
  
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent) {
    this(fluent, new V1SecurityContext());
  }
  
  public V1SecurityContextBuilder(V1SecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent,V1SecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SecurityContext build() {
    V1SecurityContext buildable = new V1SecurityContext();
    buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
    buildable.setAppArmorProfile(fluent.buildAppArmorProfile());
    buildable.setCapabilities(fluent.buildCapabilities());
    buildable.setPrivileged(fluent.getPrivileged());
    buildable.setProcMount(fluent.getProcMount());
    buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    return buildable;
  }
  
}