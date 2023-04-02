package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeSystemInfoBuilder extends V1NodeSystemInfoFluentImpl<V1NodeSystemInfoBuilder> implements VisitableBuilder<V1NodeSystemInfo,V1NodeSystemInfoBuilder>{
  public V1NodeSystemInfoBuilder() {
    this(false);
  }
  public V1NodeSystemInfoBuilder(Boolean validationEnabled) {
    this(new V1NodeSystemInfo(), validationEnabled);
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeSystemInfo(), validationEnabled);
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent,V1NodeSystemInfo instance) {
    this(fluent, instance, false);
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent,V1NodeSystemInfo instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withArchitecture(instance.getArchitecture());

    fluent.withBootID(instance.getBootID());

    fluent.withContainerRuntimeVersion(instance.getContainerRuntimeVersion());

    fluent.withKernelVersion(instance.getKernelVersion());

    fluent.withKubeProxyVersion(instance.getKubeProxyVersion());

    fluent.withKubeletVersion(instance.getKubeletVersion());

    fluent.withMachineID(instance.getMachineID());

    fluent.withOperatingSystem(instance.getOperatingSystem());

    fluent.withOsImage(instance.getOsImage());

    fluent.withSystemUUID(instance.getSystemUUID());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfo instance) {
    this(instance,false);
  }
  public V1NodeSystemInfoBuilder(V1NodeSystemInfo instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withArchitecture(instance.getArchitecture());

    this.withBootID(instance.getBootID());

    this.withContainerRuntimeVersion(instance.getContainerRuntimeVersion());

    this.withKernelVersion(instance.getKernelVersion());

    this.withKubeProxyVersion(instance.getKubeProxyVersion());

    this.withKubeletVersion(instance.getKubeletVersion());

    this.withMachineID(instance.getMachineID());

    this.withOperatingSystem(instance.getOperatingSystem());

    this.withOsImage(instance.getOsImage());

    this.withSystemUUID(instance.getSystemUUID());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeSystemInfoFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeSystemInfo build() {
    V1NodeSystemInfo buildable = new V1NodeSystemInfo();
    buildable.setArchitecture(fluent.getArchitecture());
    buildable.setBootID(fluent.getBootID());
    buildable.setContainerRuntimeVersion(fluent.getContainerRuntimeVersion());
    buildable.setKernelVersion(fluent.getKernelVersion());
    buildable.setKubeProxyVersion(fluent.getKubeProxyVersion());
    buildable.setKubeletVersion(fluent.getKubeletVersion());
    buildable.setMachineID(fluent.getMachineID());
    buildable.setOperatingSystem(fluent.getOperatingSystem());
    buildable.setOsImage(fluent.getOsImage());
    buildable.setSystemUUID(fluent.getSystemUUID());
    return buildable;
  }
  
}