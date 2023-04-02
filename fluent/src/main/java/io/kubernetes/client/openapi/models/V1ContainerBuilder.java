package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerBuilder extends V1ContainerFluentImpl<V1ContainerBuilder> implements VisitableBuilder<V1Container,V1ContainerBuilder>{
  public V1ContainerBuilder() {
    this(false);
  }
  public V1ContainerBuilder(Boolean validationEnabled) {
    this(new V1Container(), validationEnabled);
  }
  public V1ContainerBuilder(V1ContainerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerBuilder(V1ContainerFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Container(), validationEnabled);
  }
  public V1ContainerBuilder(V1ContainerFluent<?> fluent,V1Container instance) {
    this(fluent, instance, false);
  }
  public V1ContainerBuilder(V1ContainerFluent<?> fluent,V1Container instance,Boolean validationEnabled) {
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

    fluent.withTerminationMessagePath(instance.getTerminationMessagePath());

    fluent.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());

    fluent.withTty(instance.getTty());

    fluent.withVolumeDevices(instance.getVolumeDevices());

    fluent.withVolumeMounts(instance.getVolumeMounts());

    fluent.withWorkingDir(instance.getWorkingDir());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerBuilder(V1Container instance) {
    this(instance,false);
  }
  public V1ContainerBuilder(V1Container instance,Boolean validationEnabled) {
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

    this.withTerminationMessagePath(instance.getTerminationMessagePath());

    this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());

    this.withTty(instance.getTty());

    this.withVolumeDevices(instance.getVolumeDevices());

    this.withVolumeMounts(instance.getVolumeMounts());

    this.withWorkingDir(instance.getWorkingDir());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerFluent<?> fluent;
  Boolean validationEnabled;
  public V1Container build() {
    V1Container buildable = new V1Container();
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
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.getVolumeDevices());
    buildable.setVolumeMounts(fluent.getVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }
  
}