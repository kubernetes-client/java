package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1EphemeralContainerFluent<A extends V1EphemeralContainerFluent<A>> extends Fluent<A>{
  public A addToArgs(Integer index,String item);
  public A setToArgs(Integer index,String item);
  public A addToArgs(java.lang.String... items);
  public A addAllToArgs(Collection<String> items);
  public A removeFromArgs(java.lang.String... items);
  public A removeAllFromArgs(Collection<String> items);
  public List<String> getArgs();
  public String getArg(Integer index);
  public String getFirstArg();
  public String getLastArg();
  public String getMatchingArg(Predicate<String> predicate);
  public Boolean hasMatchingArg(Predicate<String> predicate);
  public A withArgs(List<String> args);
  public A withArgs(java.lang.String... args);
  public Boolean hasArgs();
  public A addToCommand(Integer index,String item);
  public A setToCommand(Integer index,String item);
  public A addToCommand(java.lang.String... items);
  public A addAllToCommand(Collection<String> items);
  public A removeFromCommand(java.lang.String... items);
  public A removeAllFromCommand(Collection<String> items);
  public List<String> getCommand();
  public String getCommand(Integer index);
  public String getFirstCommand();
  public String getLastCommand();
  public String getMatchingCommand(Predicate<String> predicate);
  public Boolean hasMatchingCommand(Predicate<String> predicate);
  public A withCommand(List<String> command);
  public A withCommand(java.lang.String... command);
  public Boolean hasCommand();
  public A addToEnv(Integer index,V1EnvVar item);
  public A setToEnv(Integer index,V1EnvVar item);
  public A addToEnv(io.kubernetes.client.openapi.models.V1EnvVar... items);
  public A addAllToEnv(Collection<V1EnvVar> items);
  public A removeFromEnv(io.kubernetes.client.openapi.models.V1EnvVar... items);
  public A removeAllFromEnv(Collection<V1EnvVar> items);
  public A removeMatchingFromEnv(Predicate<V1EnvVarBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEnv instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EnvVar> getEnv();
  public List<V1EnvVar> buildEnv();
  public V1EnvVar buildEnv(Integer index);
  public V1EnvVar buildFirstEnv();
  public V1EnvVar buildLastEnv();
  public V1EnvVar buildMatchingEnv(Predicate<V1EnvVarBuilder> predicate);
  public Boolean hasMatchingEnv(Predicate<V1EnvVarBuilder> predicate);
  public A withEnv(List<V1EnvVar> env);
  public A withEnv(io.kubernetes.client.openapi.models.V1EnvVar... env);
  public Boolean hasEnv();
  public V1EphemeralContainerFluent.EnvNested<A> addNewEnv();
  public V1EphemeralContainerFluent.EnvNested<A> addNewEnvLike(V1EnvVar item);
  public V1EphemeralContainerFluent.EnvNested<A> setNewEnvLike(Integer index,V1EnvVar item);
  public V1EphemeralContainerFluent.EnvNested<A> editEnv(Integer index);
  public V1EphemeralContainerFluent.EnvNested<A> editFirstEnv();
  public V1EphemeralContainerFluent.EnvNested<A> editLastEnv();
  public V1EphemeralContainerFluent.EnvNested<A> editMatchingEnv(Predicate<V1EnvVarBuilder> predicate);
  public A addToEnvFrom(Integer index,V1EnvFromSource item);
  public A setToEnvFrom(Integer index,V1EnvFromSource item);
  public A addToEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items);
  public A addAllToEnvFrom(Collection<V1EnvFromSource> items);
  public A removeFromEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... items);
  public A removeAllFromEnvFrom(Collection<V1EnvFromSource> items);
  public A removeMatchingFromEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEnvFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EnvFromSource> getEnvFrom();
  public List<V1EnvFromSource> buildEnvFrom();
  public V1EnvFromSource buildEnvFrom(Integer index);
  public V1EnvFromSource buildFirstEnvFrom();
  public V1EnvFromSource buildLastEnvFrom();
  public V1EnvFromSource buildMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate);
  public Boolean hasMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate);
  public A withEnvFrom(List<V1EnvFromSource> envFrom);
  public A withEnvFrom(io.kubernetes.client.openapi.models.V1EnvFromSource... envFrom);
  public Boolean hasEnvFrom();
  public V1EphemeralContainerFluent.EnvFromNested<A> addNewEnvFrom();
  public V1EphemeralContainerFluent.EnvFromNested<A> addNewEnvFromLike(V1EnvFromSource item);
  public V1EphemeralContainerFluent.EnvFromNested<A> setNewEnvFromLike(Integer index,V1EnvFromSource item);
  public V1EphemeralContainerFluent.EnvFromNested<A> editEnvFrom(Integer index);
  public V1EphemeralContainerFluent.EnvFromNested<A> editFirstEnvFrom();
  public V1EphemeralContainerFluent.EnvFromNested<A> editLastEnvFrom();
  public V1EphemeralContainerFluent.EnvFromNested<A> editMatchingEnvFrom(Predicate<V1EnvFromSourceBuilder> predicate);
  public String getImage();
  public A withImage(String image);
  public Boolean hasImage();
  public String getImagePullPolicy();
  public A withImagePullPolicy(String imagePullPolicy);
  public Boolean hasImagePullPolicy();
  
  /**
   * This method has been deprecated, please use method buildLifecycle instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Lifecycle getLifecycle();
  public V1Lifecycle buildLifecycle();
  public A withLifecycle(V1Lifecycle lifecycle);
  public Boolean hasLifecycle();
  public V1EphemeralContainerFluent.LifecycleNested<A> withNewLifecycle();
  public V1EphemeralContainerFluent.LifecycleNested<A> withNewLifecycleLike(V1Lifecycle item);
  public V1EphemeralContainerFluent.LifecycleNested<A> editLifecycle();
  public V1EphemeralContainerFluent.LifecycleNested<A> editOrNewLifecycle();
  public V1EphemeralContainerFluent.LifecycleNested<A> editOrNewLifecycleLike(V1Lifecycle item);
  
  /**
   * This method has been deprecated, please use method buildLivenessProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getLivenessProbe();
  public V1Probe buildLivenessProbe();
  public A withLivenessProbe(V1Probe livenessProbe);
  public Boolean hasLivenessProbe();
  public V1EphemeralContainerFluent.LivenessProbeNested<A> withNewLivenessProbe();
  public V1EphemeralContainerFluent.LivenessProbeNested<A> withNewLivenessProbeLike(V1Probe item);
  public V1EphemeralContainerFluent.LivenessProbeNested<A> editLivenessProbe();
  public V1EphemeralContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbe();
  public V1EphemeralContainerFluent.LivenessProbeNested<A> editOrNewLivenessProbeLike(V1Probe item);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public A addToPorts(Integer index,V1ContainerPort item);
  public A setToPorts(Integer index,V1ContainerPort item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items);
  public A addAllToPorts(Collection<V1ContainerPort> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ContainerPort... items);
  public A removeAllFromPorts(Collection<V1ContainerPort> items);
  public A removeMatchingFromPorts(Predicate<V1ContainerPortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerPort> getPorts();
  public List<V1ContainerPort> buildPorts();
  public V1ContainerPort buildPort(Integer index);
  public V1ContainerPort buildFirstPort();
  public V1ContainerPort buildLastPort();
  public V1ContainerPort buildMatchingPort(Predicate<V1ContainerPortBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<V1ContainerPortBuilder> predicate);
  public A withPorts(List<V1ContainerPort> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1ContainerPort... ports);
  public Boolean hasPorts();
  public V1EphemeralContainerFluent.PortsNested<A> addNewPort();
  public V1EphemeralContainerFluent.PortsNested<A> addNewPortLike(V1ContainerPort item);
  public V1EphemeralContainerFluent.PortsNested<A> setNewPortLike(Integer index,V1ContainerPort item);
  public V1EphemeralContainerFluent.PortsNested<A> editPort(Integer index);
  public V1EphemeralContainerFluent.PortsNested<A> editFirstPort();
  public V1EphemeralContainerFluent.PortsNested<A> editLastPort();
  public V1EphemeralContainerFluent.PortsNested<A> editMatchingPort(Predicate<V1ContainerPortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildReadinessProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getReadinessProbe();
  public V1Probe buildReadinessProbe();
  public A withReadinessProbe(V1Probe readinessProbe);
  public Boolean hasReadinessProbe();
  public V1EphemeralContainerFluent.ReadinessProbeNested<A> withNewReadinessProbe();
  public V1EphemeralContainerFluent.ReadinessProbeNested<A> withNewReadinessProbeLike(V1Probe item);
  public V1EphemeralContainerFluent.ReadinessProbeNested<A> editReadinessProbe();
  public V1EphemeralContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbe();
  public V1EphemeralContainerFluent.ReadinessProbeNested<A> editOrNewReadinessProbeLike(V1Probe item);
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceRequirements getResources();
  public V1ResourceRequirements buildResources();
  public A withResources(V1ResourceRequirements resources);
  public Boolean hasResources();
  public V1EphemeralContainerFluent.ResourcesNested<A> withNewResources();
  public V1EphemeralContainerFluent.ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item);
  public V1EphemeralContainerFluent.ResourcesNested<A> editResources();
  public V1EphemeralContainerFluent.ResourcesNested<A> editOrNewResources();
  public V1EphemeralContainerFluent.ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item);
  
  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecurityContext getSecurityContext();
  public V1SecurityContext buildSecurityContext();
  public A withSecurityContext(V1SecurityContext securityContext);
  public Boolean hasSecurityContext();
  public V1EphemeralContainerFluent.SecurityContextNested<A> withNewSecurityContext();
  public V1EphemeralContainerFluent.SecurityContextNested<A> withNewSecurityContextLike(V1SecurityContext item);
  public V1EphemeralContainerFluent.SecurityContextNested<A> editSecurityContext();
  public V1EphemeralContainerFluent.SecurityContextNested<A> editOrNewSecurityContext();
  public V1EphemeralContainerFluent.SecurityContextNested<A> editOrNewSecurityContextLike(V1SecurityContext item);
  
  /**
   * This method has been deprecated, please use method buildStartupProbe instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Probe getStartupProbe();
  public V1Probe buildStartupProbe();
  public A withStartupProbe(V1Probe startupProbe);
  public Boolean hasStartupProbe();
  public V1EphemeralContainerFluent.StartupProbeNested<A> withNewStartupProbe();
  public V1EphemeralContainerFluent.StartupProbeNested<A> withNewStartupProbeLike(V1Probe item);
  public V1EphemeralContainerFluent.StartupProbeNested<A> editStartupProbe();
  public V1EphemeralContainerFluent.StartupProbeNested<A> editOrNewStartupProbe();
  public V1EphemeralContainerFluent.StartupProbeNested<A> editOrNewStartupProbeLike(V1Probe item);
  public Boolean getStdin();
  public A withStdin(Boolean stdin);
  public Boolean hasStdin();
  public Boolean getStdinOnce();
  public A withStdinOnce(Boolean stdinOnce);
  public Boolean hasStdinOnce();
  public String getTargetContainerName();
  public A withTargetContainerName(String targetContainerName);
  public Boolean hasTargetContainerName();
  public String getTerminationMessagePath();
  public A withTerminationMessagePath(String terminationMessagePath);
  public Boolean hasTerminationMessagePath();
  public String getTerminationMessagePolicy();
  public A withTerminationMessagePolicy(String terminationMessagePolicy);
  public Boolean hasTerminationMessagePolicy();
  public Boolean getTty();
  public A withTty(Boolean tty);
  public Boolean hasTty();
  public A addToVolumeDevices(Integer index,V1VolumeDevice item);
  public A setToVolumeDevices(Integer index,V1VolumeDevice item);
  public A addToVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items);
  public A addAllToVolumeDevices(Collection<V1VolumeDevice> items);
  public A removeFromVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... items);
  public A removeAllFromVolumeDevices(Collection<V1VolumeDevice> items);
  public A removeMatchingFromVolumeDevices(Predicate<V1VolumeDeviceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumeDevices instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeDevice> getVolumeDevices();
  public List<V1VolumeDevice> buildVolumeDevices();
  public V1VolumeDevice buildVolumeDevice(Integer index);
  public V1VolumeDevice buildFirstVolumeDevice();
  public V1VolumeDevice buildLastVolumeDevice();
  public V1VolumeDevice buildMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate);
  public Boolean hasMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate);
  public A withVolumeDevices(List<V1VolumeDevice> volumeDevices);
  public A withVolumeDevices(io.kubernetes.client.openapi.models.V1VolumeDevice... volumeDevices);
  public Boolean hasVolumeDevices();
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> addNewVolumeDevice();
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> addNewVolumeDeviceLike(V1VolumeDevice item);
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> setNewVolumeDeviceLike(Integer index,V1VolumeDevice item);
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> editVolumeDevice(Integer index);
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> editFirstVolumeDevice();
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> editLastVolumeDevice();
  public V1EphemeralContainerFluent.VolumeDevicesNested<A> editMatchingVolumeDevice(Predicate<V1VolumeDeviceBuilder> predicate);
  public A addToVolumeMounts(Integer index,V1VolumeMount item);
  public A setToVolumeMounts(Integer index,V1VolumeMount item);
  public A addToVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items);
  public A addAllToVolumeMounts(Collection<V1VolumeMount> items);
  public A removeFromVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... items);
  public A removeAllFromVolumeMounts(Collection<V1VolumeMount> items);
  public A removeMatchingFromVolumeMounts(Predicate<V1VolumeMountBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumeMounts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1VolumeMount> getVolumeMounts();
  public List<V1VolumeMount> buildVolumeMounts();
  public V1VolumeMount buildVolumeMount(Integer index);
  public V1VolumeMount buildFirstVolumeMount();
  public V1VolumeMount buildLastVolumeMount();
  public V1VolumeMount buildMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate);
  public Boolean hasMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate);
  public A withVolumeMounts(List<V1VolumeMount> volumeMounts);
  public A withVolumeMounts(io.kubernetes.client.openapi.models.V1VolumeMount... volumeMounts);
  public Boolean hasVolumeMounts();
  public V1EphemeralContainerFluent.VolumeMountsNested<A> addNewVolumeMount();
  public V1EphemeralContainerFluent.VolumeMountsNested<A> addNewVolumeMountLike(V1VolumeMount item);
  public V1EphemeralContainerFluent.VolumeMountsNested<A> setNewVolumeMountLike(Integer index,V1VolumeMount item);
  public V1EphemeralContainerFluent.VolumeMountsNested<A> editVolumeMount(Integer index);
  public V1EphemeralContainerFluent.VolumeMountsNested<A> editFirstVolumeMount();
  public V1EphemeralContainerFluent.VolumeMountsNested<A> editLastVolumeMount();
  public V1EphemeralContainerFluent.VolumeMountsNested<A> editMatchingVolumeMount(Predicate<V1VolumeMountBuilder> predicate);
  public String getWorkingDir();
  public A withWorkingDir(String workingDir);
  public Boolean hasWorkingDir();
  public A withStdin();
  public A withStdinOnce();
  public A withTty();
  public interface EnvNested<N> extends Nested<N>,V1EnvVarFluent<V1EphemeralContainerFluent.EnvNested<N>>{
    public N and();
    public N endEnv();
    
  }
  public interface EnvFromNested<N> extends Nested<N>,V1EnvFromSourceFluent<V1EphemeralContainerFluent.EnvFromNested<N>>{
    public N and();
    public N endEnvFrom();
    
  }
  public interface LifecycleNested<N> extends Nested<N>,V1LifecycleFluent<V1EphemeralContainerFluent.LifecycleNested<N>>{
    public N and();
    public N endLifecycle();
    
  }
  public interface LivenessProbeNested<N> extends Nested<N>,V1ProbeFluent<V1EphemeralContainerFluent.LivenessProbeNested<N>>{
    public N and();
    public N endLivenessProbe();
    
  }
  public interface PortsNested<N> extends Nested<N>,V1ContainerPortFluent<V1EphemeralContainerFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  public interface ReadinessProbeNested<N> extends Nested<N>,V1ProbeFluent<V1EphemeralContainerFluent.ReadinessProbeNested<N>>{
    public N and();
    public N endReadinessProbe();
    
  }
  public interface ResourcesNested<N> extends Nested<N>,V1ResourceRequirementsFluent<V1EphemeralContainerFluent.ResourcesNested<N>>{
    public N and();
    public N endResources();
    
  }
  public interface SecurityContextNested<N> extends Nested<N>,V1SecurityContextFluent<V1EphemeralContainerFluent.SecurityContextNested<N>>{
    public N and();
    public N endSecurityContext();
    
  }
  public interface StartupProbeNested<N> extends Nested<N>,V1ProbeFluent<V1EphemeralContainerFluent.StartupProbeNested<N>>{
    public N and();
    public N endStartupProbe();
    
  }
  public interface VolumeDevicesNested<N> extends Nested<N>,V1VolumeDeviceFluent<V1EphemeralContainerFluent.VolumeDevicesNested<N>>{
    public N and();
    public N endVolumeDevice();
    
  }
  public interface VolumeMountsNested<N> extends Nested<N>,V1VolumeMountFluent<V1EphemeralContainerFluent.VolumeMountsNested<N>>{
    public N and();
    public N endVolumeMount();
    
  }
  
}