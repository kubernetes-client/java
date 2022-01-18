/*
Copyright 2022 The Kubernetes Authors.
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

public class V1EphemeralContainerBuilder
    extends io.kubernetes.client.openapi.models.V1EphemeralContainerFluentImpl<
        io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EphemeralContainer,
        io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder> {
  public V1EphemeralContainerBuilder() {
    this(false);
  }

  public V1EphemeralContainerBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EphemeralContainer(), validationEnabled);
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EphemeralContainer(), validationEnabled);
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EphemeralContainer instance) {
    this(fluent, instance, false);
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EphemeralContainer instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withArgs(instance.getArgs());

    fluent.withCommand(instance.getCommand());

    fluent.withEnv(instance.getEnv());

    fluent.withEnvFrom(instance.getEnvFrom());

    fluent.withImage(instance.getImage());

    fluent.withImagePullPolicy(instance.getImagePullPolicy());

    fluent.withLifecycle(instance.getLifecycle());

    fluent.withLivenessProbe(instance.getLivenessProbe());

    fluent.withName(instance.getName());

    fluent.withPorts(instance.getPorts());

    fluent.withReadinessProbe(instance.getReadinessProbe());

    fluent.withResources(instance.getResources());

    fluent.withSecurityContext(instance.getSecurityContext());

    fluent.withStartupProbe(instance.getStartupProbe());

    fluent.withStdin(instance.getStdin());

    fluent.withStdinOnce(instance.getStdinOnce());

    fluent.withTargetContainerName(instance.getTargetContainerName());

    fluent.withTerminationMessagePath(instance.getTerminationMessagePath());

    fluent.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());

    fluent.withTty(instance.getTty());

    fluent.withVolumeDevices(instance.getVolumeDevices());

    fluent.withVolumeMounts(instance.getVolumeMounts());

    fluent.withWorkingDir(instance.getWorkingDir());

    this.validationEnabled = validationEnabled;
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainer instance) {
    this(instance, false);
  }

  public V1EphemeralContainerBuilder(
      io.kubernetes.client.openapi.models.V1EphemeralContainer instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withArgs(instance.getArgs());

    this.withCommand(instance.getCommand());

    this.withEnv(instance.getEnv());

    this.withEnvFrom(instance.getEnvFrom());

    this.withImage(instance.getImage());

    this.withImagePullPolicy(instance.getImagePullPolicy());

    this.withLifecycle(instance.getLifecycle());

    this.withLivenessProbe(instance.getLivenessProbe());

    this.withName(instance.getName());

    this.withPorts(instance.getPorts());

    this.withReadinessProbe(instance.getReadinessProbe());

    this.withResources(instance.getResources());

    this.withSecurityContext(instance.getSecurityContext());

    this.withStartupProbe(instance.getStartupProbe());

    this.withStdin(instance.getStdin());

    this.withStdinOnce(instance.getStdinOnce());

    this.withTargetContainerName(instance.getTargetContainerName());

    this.withTerminationMessagePath(instance.getTerminationMessagePath());

    this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());

    this.withTty(instance.getTty());

    this.withVolumeDevices(instance.getVolumeDevices());

    this.withVolumeMounts(instance.getVolumeMounts());

    this.withWorkingDir(instance.getWorkingDir());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EphemeralContainer build() {
    V1EphemeralContainer buildable = new V1EphemeralContainer();
    buildable.setArgs(fluent.getArgs());
    buildable.setCommand(fluent.getCommand());
    buildable.setEnv(fluent.getEnv());
    buildable.setEnvFrom(fluent.getEnvFrom());
    buildable.setImage(fluent.getImage());
    buildable.setImagePullPolicy(fluent.getImagePullPolicy());
    buildable.setLifecycle(fluent.getLifecycle());
    buildable.setLivenessProbe(fluent.getLivenessProbe());
    buildable.setName(fluent.getName());
    buildable.setPorts(fluent.getPorts());
    buildable.setReadinessProbe(fluent.getReadinessProbe());
    buildable.setResources(fluent.getResources());
    buildable.setSecurityContext(fluent.getSecurityContext());
    buildable.setStartupProbe(fluent.getStartupProbe());
    buildable.setStdin(fluent.getStdin());
    buildable.setStdinOnce(fluent.getStdinOnce());
    buildable.setTargetContainerName(fluent.getTargetContainerName());
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.getVolumeDevices());
    buildable.setVolumeMounts(fluent.getVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EphemeralContainerBuilder that = (V1EphemeralContainerBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
