package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeSystemInfoBuilder extends V1NodeSystemInfoFluent<V1NodeSystemInfoBuilder> implements VisitableBuilder<V1NodeSystemInfo,V1NodeSystemInfoBuilder>{
  public V1NodeSystemInfoBuilder() {
    this(new V1NodeSystemInfo());
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent) {
    this(fluent, new V1NodeSystemInfo());
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfoFluent<?> fluent,V1NodeSystemInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeSystemInfoBuilder(V1NodeSystemInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeSystemInfoFluent<?> fluent;
  
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