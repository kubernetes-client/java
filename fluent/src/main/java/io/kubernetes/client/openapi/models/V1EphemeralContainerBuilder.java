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
public class V1EphemeralContainerBuilder extends V1EphemeralContainerFluent<V1EphemeralContainerBuilder> implements VisitableBuilder<V1EphemeralContainer,V1EphemeralContainerBuilder>{

  V1EphemeralContainerFluent<?> fluent;

  public V1EphemeralContainerBuilder() {
    this(new V1EphemeralContainer());
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainerFluent<?> fluent) {
    this(fluent, new V1EphemeralContainer());
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainerFluent<?> fluent,V1EphemeralContainer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1EphemeralContainer build() {
    V1EphemeralContainer buildable = new V1EphemeralContainer();
    buildable.setArgs(fluent.getArgs());
    buildable.setCommand(fluent.getCommand());
    buildable.setEnv(fluent.buildEnv());
    buildable.setEnvFrom(fluent.buildEnvFrom());
    buildable.setImage(fluent.getImage());
    buildable.setImagePullPolicy(fluent.getImagePullPolicy());
    buildable.setLifecycle(fluent.buildLifecycle());
    buildable.setLivenessProbe(fluent.buildLivenessProbe());
    buildable.setName(fluent.getName());
    buildable.setPorts(fluent.buildPorts());
    buildable.setReadinessProbe(fluent.buildReadinessProbe());
    buildable.setResizePolicy(fluent.buildResizePolicy());
    buildable.setResources(fluent.buildResources());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    buildable.setRestartPolicyRules(fluent.buildRestartPolicyRules());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setStartupProbe(fluent.buildStartupProbe());
    buildable.setStdin(fluent.getStdin());
    buildable.setStdinOnce(fluent.getStdinOnce());
    buildable.setTargetContainerName(fluent.getTargetContainerName());
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.buildVolumeDevices());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }
  
}