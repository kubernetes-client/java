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

/** Generated */
public interface V1EphemeralContainerFluent<
        A extends io.kubernetes.client.openapi.models.V1EphemeralContainerFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToArgs(java.lang.Integer index, java.lang.String item);

  public A setToArgs(java.lang.Integer index, java.lang.String item);

  public A addToArgs(java.lang.String... items);

  public A addAllToArgs(java.util.Collection<java.lang.String> items);

  public A removeFromArgs(java.lang.String... items);

  public A removeAllFromArgs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getArgs();

  public java.lang.String getArg(java.lang.Integer index);

  public java.lang.String getFirstArg();

  public java.lang.String getLastArg();

  public java.lang.String getMatchingArg(java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingArg(java.util.function.Predicate<java.lang.String> predicate);

  public A withArgs(java.util.List<java.lang.String> args);

  public A withArgs(java.lang.String... args);

  public java.lang.Boolean hasArgs();

  public A addNewArg(java.lang.String original);

  public A addToCommand(java.lang.Integer index, java.lang.String item);

  public A setToCommand(java.lang.Integer index, java.lang.String item);

  public A addToCommand(java.lang.String... items);

  public A addAllToCommand(java.util.Collection<java.lang.String> items);

  public A removeFromCommand(java.lang.String... items);

  public A removeAllFromCommand(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getCommand();

  public java.lang.String getCommand(java.lang.Integer index);

  public java.lang.String getFirstCommand();

  public java.lang.String getLastCommand();

  public java.lang.String getMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingCommand(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withCommand(java.util.List<java.lang.String> command);

  public A withCommand(java.lang.String... command);

  public java.lang.Boolean hasCommand();

  public A addNewCommand(java.lang.String original);

  public A addToEnv(java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item);

  public A setToEnv(java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item);

  public A addToEnv(io.kubernetes.client.openapi.models.V1EnvVar... items);

  public A addAllToEnv(java.util.Collection<io.kubernetes.client.openapi.models.V1EnvVar> items);

  public A removeFromEnv(io.kubernetes.client.openapi.models.V1EnvVar... items);

  public A removeAllFromEnv(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvVar> items);

  public A removeMatchingFromEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildEnv instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> getEnv();

  public java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> buildEnv();

  public io.kubernetes.client.openapi.models.V1EnvVar buildEnv(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EnvVar buildFirstEnv();

  public io.kubernetes.client.openapi.models.V1EnvVar buildLastEnv();

  public io.kubernetes.client.openapi.models.V1EnvVar buildMatchingEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate);

  public java.lang.Boolean hasMatchingEnv(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder> predicate);

  public A withEnv(java.util.List<io.kubernetes.client.openapi.models.V1EnvVar> env);

  public A withEnv(io.kubernetes.client.openapi.models.V1EnvVar... env);

  public java.lang.Boolean hasEnv();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> addNewEnv();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> addNewEnvLike(
      io.kubernetes.client.openapi.models.V1EnvVar item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> setNewEnvLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvVar item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> editEnv(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> editFirstEnv();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A> editLastEnv();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<A>
      editMatchingEnv(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvVarBuilder>
              predicate);

  public A addToEnvFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item);

  public A setToEnvFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item);

  public A addToEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items);

  public A addAllToEnvFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvFromSource> items);

  public A removeFromEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items);

  public A removeAllFromEnvFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EnvFromSource> items);

  public A removeMatchingFromEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildEnvFrom instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> getEnvFrom();

  public java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> buildEnvFrom();

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildEnvFrom(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildFirstEnvFrom();

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildLastEnvFrom();

  public io.kubernetes.client.openapi.models.V1EnvFromSource buildMatchingEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingEnvFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
          predicate);

  public A withEnvFrom(java.util.List<io.kubernetes.client.openapi.models.V1EnvFromSource> envFrom);

  public A withEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... envFrom);

  public java.lang.Boolean hasEnvFrom();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      addNewEnvFrom();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      addNewEnvFromLike(io.kubernetes.client.openapi.models.V1EnvFromSource item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      setNewEnvFromLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EnvFromSource item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      editEnvFrom(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      editFirstEnvFrom();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      editLastEnvFrom();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<A>
      editMatchingEnvFrom(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EnvFromSourceBuilder>
              predicate);

  public java.lang.String getImage();

  public A withImage(java.lang.String image);

  public java.lang.Boolean hasImage();

  /** Method is deprecated. use withImage instead. */
  @java.lang.Deprecated
  public A withNewImage(java.lang.String original);

  public io.kubernetes.client.openapi.models.V1EphemeralContainer.ImagePullPolicyEnum
      getImagePullPolicy();

  public A withImagePullPolicy(
      io.kubernetes.client.openapi.models.V1EphemeralContainer.ImagePullPolicyEnum imagePullPolicy);

  public java.lang.Boolean hasImagePullPolicy();

  /**
   * This method has been deprecated, please use method buildLifecycle instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Lifecycle getLifecycle();

  public io.kubernetes.client.openapi.models.V1Lifecycle buildLifecycle();

  public A withLifecycle(io.kubernetes.client.openapi.models.V1Lifecycle lifecycle);

  public java.lang.Boolean hasLifecycle();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<A>
      withNewLifecycle();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<A>
      withNewLifecycleLike(io.kubernetes.client.openapi.models.V1Lifecycle item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<A>
      editLifecycle();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<A>
      editOrNewLifecycle();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<A>
      editOrNewLifecycleLike(io.kubernetes.client.openapi.models.V1Lifecycle item);

  /**
   * This method has been deprecated, please use method buildLivenessProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getLivenessProbe();

  public io.kubernetes.client.openapi.models.V1Probe buildLivenessProbe();

  public A withLivenessProbe(io.kubernetes.client.openapi.models.V1Probe livenessProbe);

  public java.lang.Boolean hasLivenessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<A>
      withNewLivenessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<A>
      withNewLivenessProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<A>
      editLivenessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<A>
      editOrNewLivenessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<A>
      editOrNewLivenessProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item);

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items);

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerPort> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items);

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerPort> items);

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> getPorts();

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> buildPorts();

  public io.kubernetes.client.openapi.models.V1ContainerPort buildPort(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ContainerPort buildFirstPort();

  public io.kubernetes.client.openapi.models.V1ContainerPort buildLastPort();

  public io.kubernetes.client.openapi.models.V1ContainerPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
          predicate);

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1ContainerPort> ports);

  public A withPorts(io.kubernetes.client.openapi.models.V1ContainerPort... ports);

  public java.lang.Boolean hasPorts();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A> addNewPort();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1ContainerPort item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerPort item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A> editPort(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A>
      editFirstPort();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A>
      editLastPort();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerPortBuilder>
              predicate);

  /**
   * This method has been deprecated, please use method buildReadinessProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getReadinessProbe();

  public io.kubernetes.client.openapi.models.V1Probe buildReadinessProbe();

  public A withReadinessProbe(io.kubernetes.client.openapi.models.V1Probe readinessProbe);

  public java.lang.Boolean hasReadinessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<A>
      withNewReadinessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<A>
      withNewReadinessProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<A>
      editReadinessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<A>
      editOrNewReadinessProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<A>
      editOrNewReadinessProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  /**
   * This method has been deprecated, please use method buildResources instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceRequirements getResources();

  public io.kubernetes.client.openapi.models.V1ResourceRequirements buildResources();

  public A withResources(io.kubernetes.client.openapi.models.V1ResourceRequirements resources);

  public java.lang.Boolean hasResources();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<A>
      withNewResources();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<A>
      withNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<A>
      editResources();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<A>
      editOrNewResources();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<A>
      editOrNewResourcesLike(io.kubernetes.client.openapi.models.V1ResourceRequirements item);

  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecurityContext getSecurityContext();

  public io.kubernetes.client.openapi.models.V1SecurityContext buildSecurityContext();

  public A withSecurityContext(
      io.kubernetes.client.openapi.models.V1SecurityContext securityContext);

  public java.lang.Boolean hasSecurityContext();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<A>
      withNewSecurityContext();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<A>
      withNewSecurityContextLike(io.kubernetes.client.openapi.models.V1SecurityContext item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<A>
      editSecurityContext();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<A>
      editOrNewSecurityContext();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<A>
      editOrNewSecurityContextLike(io.kubernetes.client.openapi.models.V1SecurityContext item);

  /**
   * This method has been deprecated, please use method buildStartupProbe instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Probe getStartupProbe();

  public io.kubernetes.client.openapi.models.V1Probe buildStartupProbe();

  public A withStartupProbe(io.kubernetes.client.openapi.models.V1Probe startupProbe);

  public java.lang.Boolean hasStartupProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<A>
      withNewStartupProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<A>
      withNewStartupProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<A>
      editStartupProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<A>
      editOrNewStartupProbe();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<A>
      editOrNewStartupProbeLike(io.kubernetes.client.openapi.models.V1Probe item);

  public java.lang.Boolean getStdin();

  public A withStdin(java.lang.Boolean stdin);

  public java.lang.Boolean hasStdin();

  public java.lang.Boolean getStdinOnce();

  public A withStdinOnce(java.lang.Boolean stdinOnce);

  public java.lang.Boolean hasStdinOnce();

  public java.lang.String getTargetContainerName();

  public A withTargetContainerName(java.lang.String targetContainerName);

  public java.lang.Boolean hasTargetContainerName();

  /** Method is deprecated. use withTargetContainerName instead. */
  @java.lang.Deprecated
  public A withNewTargetContainerName(java.lang.String original);

  public java.lang.String getTerminationMessagePath();

  public A withTerminationMessagePath(java.lang.String terminationMessagePath);

  public java.lang.Boolean hasTerminationMessagePath();

  /** Method is deprecated. use withTerminationMessagePath instead. */
  @java.lang.Deprecated
  public A withNewTerminationMessagePath(java.lang.String original);

  public io.kubernetes.client.openapi.models.V1EphemeralContainer.TerminationMessagePolicyEnum
      getTerminationMessagePolicy();

  public A withTerminationMessagePolicy(
      io.kubernetes.client.openapi.models.V1EphemeralContainer.TerminationMessagePolicyEnum
          terminationMessagePolicy);

  public java.lang.Boolean hasTerminationMessagePolicy();

  public java.lang.Boolean getTty();

  public A withTty(java.lang.Boolean tty);

  public java.lang.Boolean hasTty();

  public A addToVolumeDevices(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item);

  public A setToVolumeDevices(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item);

  public A addToVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items);

  public A addAllToVolumeDevices(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeDevice> items);

  public A removeFromVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items);

  public A removeAllFromVolumeDevices(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeDevice> items);

  public A removeMatchingFromVolumeDevices(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildVolumeDevices instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> getVolumeDevices();

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> buildVolumeDevices();

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildVolumeDevice(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildFirstVolumeDevice();

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildLastVolumeDevice();

  public io.kubernetes.client.openapi.models.V1VolumeDevice buildMatchingVolumeDevice(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingVolumeDevice(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
          predicate);

  public A withVolumeDevices(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeDevice> volumeDevices);

  public A withVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... volumeDevices);

  public java.lang.Boolean hasVolumeDevices();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      addNewVolumeDevice();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      addNewVolumeDeviceLike(io.kubernetes.client.openapi.models.V1VolumeDevice item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      setNewVolumeDeviceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeDevice item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      editVolumeDevice(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      editFirstVolumeDevice();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      editLastVolumeDevice();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<A>
      editMatchingVolumeDevice(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder>
              predicate);

  public A addToVolumeMounts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item);

  public A setToVolumeMounts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item);

  public A addToVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items);

  public A addAllToVolumeMounts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeMount> items);

  public A removeFromVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items);

  public A removeAllFromVolumeMounts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1VolumeMount> items);

  public A removeMatchingFromVolumeMounts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildVolumeMounts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> getVolumeMounts();

  public java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> buildVolumeMounts();

  public io.kubernetes.client.openapi.models.V1VolumeMount buildVolumeMount(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1VolumeMount buildFirstVolumeMount();

  public io.kubernetes.client.openapi.models.V1VolumeMount buildLastVolumeMount();

  public io.kubernetes.client.openapi.models.V1VolumeMount buildMatchingVolumeMount(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate);

  public java.lang.Boolean hasMatchingVolumeMount(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
          predicate);

  public A withVolumeMounts(
      java.util.List<io.kubernetes.client.openapi.models.V1VolumeMount> volumeMounts);

  public A withVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... volumeMounts);

  public java.lang.Boolean hasVolumeMounts();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      addNewVolumeMount();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      addNewVolumeMountLike(io.kubernetes.client.openapi.models.V1VolumeMount item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      setNewVolumeMountLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1VolumeMount item);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      editVolumeMount(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      editFirstVolumeMount();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      editLastVolumeMount();

  public io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<A>
      editMatchingVolumeMount(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeMountBuilder>
              predicate);

  public java.lang.String getWorkingDir();

  public A withWorkingDir(java.lang.String workingDir);

  public java.lang.Boolean hasWorkingDir();

  /** Method is deprecated. use withWorkingDir instead. */
  @java.lang.Deprecated
  public A withNewWorkingDir(java.lang.String original);

  public interface EnvNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EnvVarFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvNested<N>> {
    public N and();

    public N endEnv();
  }

  public interface EnvFromNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.EnvFromNested<N>> {
    public N and();

    public N endEnvFrom();
  }

  public interface LifecycleNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LifecycleFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LifecycleNested<N>> {
    public N and();

    public N endLifecycle();
  }

  public interface LivenessProbeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ProbeFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.LivenessProbeNested<
                  N>> {
    public N and();

    public N endLivenessProbe();
  }

  public interface PortsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ContainerPortFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }

  public interface ReadinessProbeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ProbeFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ReadinessProbeNested<
                  N>> {
    public N and();

    public N endReadinessProbe();
  }

  public interface ResourcesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.ResourcesNested<N>> {
    public N and();

    public N endResources();
  }

  public interface SecurityContextNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SecurityContextFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.SecurityContextNested<
                  N>> {
    public N and();

    public N endSecurityContext();
  }

  public interface StartupProbeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ProbeFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.StartupProbeNested<
                  N>> {
    public N and();

    public N endStartupProbe();
  }

  public interface VolumeDevicesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeDevicesNested<
                  N>> {
    public N and();

    public N endVolumeDevice();
  }

  public interface VolumeMountsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeMountFluent<
              io.kubernetes.client.openapi.models.V1EphemeralContainerFluent.VolumeMountsNested<
                  N>> {
    public N and();

    public N endVolumeMount();
  }
}
