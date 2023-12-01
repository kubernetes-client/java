package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerBuilder extends V1ContainerFluent<V1ContainerBuilder> implements VisitableBuilder<V1Container,V1ContainerBuilder>{
  public V1ContainerBuilder() {
    this(new V1Container());
  }
  
  public V1ContainerBuilder(V1ContainerFluent<?> fluent) {
    this(fluent, new V1Container());
  }
  
  public V1ContainerBuilder(V1ContainerFluent<?> fluent,V1Container instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerBuilder(V1Container instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerFluent<?> fluent;
  
  public V1Container build() {
    V1Container buildable = new V1Container();
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
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.buildVolumeDevices());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }
  

}