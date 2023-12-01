package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EphemeralContainerBuilder extends V1EphemeralContainerFluent<V1EphemeralContainerBuilder> implements VisitableBuilder<V1EphemeralContainer,V1EphemeralContainerBuilder>{
  public V1EphemeralContainerBuilder() {
    this(new V1EphemeralContainer());
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainerFluent<?> fluent) {
    this(fluent, new V1EphemeralContainer());
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainerFluent<?> fluent,V1EphemeralContainer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EphemeralContainerBuilder(V1EphemeralContainer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EphemeralContainerFluent<?> fluent;
  
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