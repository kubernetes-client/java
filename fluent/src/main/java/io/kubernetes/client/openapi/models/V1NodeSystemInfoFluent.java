package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeSystemInfoFluent<A extends io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<A>> extends BaseFluent<A>{
  public V1NodeSystemInfoFluent() {
  }
  
  public V1NodeSystemInfoFluent(V1NodeSystemInfo instance) {
    this.copyInstance(instance);
  }
  private String architecture;
  private String bootID;
  private String containerRuntimeVersion;
  private String kernelVersion;
  private String kubeProxyVersion;
  private String kubeletVersion;
  private String machineID;
  private String operatingSystem;
  private String osImage;
  private V1NodeSwapStatusBuilder swap;
  private String systemUUID;
  
  protected void copyInstance(V1NodeSystemInfo instance) {
    instance = instance != null ? instance : new V1NodeSystemInfo();
    if (instance != null) {
        this.withArchitecture(instance.getArchitecture());
        this.withBootID(instance.getBootID());
        this.withContainerRuntimeVersion(instance.getContainerRuntimeVersion());
        this.withKernelVersion(instance.getKernelVersion());
        this.withKubeProxyVersion(instance.getKubeProxyVersion());
        this.withKubeletVersion(instance.getKubeletVersion());
        this.withMachineID(instance.getMachineID());
        this.withOperatingSystem(instance.getOperatingSystem());
        this.withOsImage(instance.getOsImage());
        this.withSwap(instance.getSwap());
        this.withSystemUUID(instance.getSystemUUID());
    }
  }
  
  public String getArchitecture() {
    return this.architecture;
  }
  
  public A withArchitecture(String architecture) {
    this.architecture = architecture;
    return (A) this;
  }
  
  public boolean hasArchitecture() {
    return this.architecture != null;
  }
  
  public String getBootID() {
    return this.bootID;
  }
  
  public A withBootID(String bootID) {
    this.bootID = bootID;
    return (A) this;
  }
  
  public boolean hasBootID() {
    return this.bootID != null;
  }
  
  public String getContainerRuntimeVersion() {
    return this.containerRuntimeVersion;
  }
  
  public A withContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return (A) this;
  }
  
  public boolean hasContainerRuntimeVersion() {
    return this.containerRuntimeVersion != null;
  }
  
  public String getKernelVersion() {
    return this.kernelVersion;
  }
  
  public A withKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return (A) this;
  }
  
  public boolean hasKernelVersion() {
    return this.kernelVersion != null;
  }
  
  public String getKubeProxyVersion() {
    return this.kubeProxyVersion;
  }
  
  public A withKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return (A) this;
  }
  
  public boolean hasKubeProxyVersion() {
    return this.kubeProxyVersion != null;
  }
  
  public String getKubeletVersion() {
    return this.kubeletVersion;
  }
  
  public A withKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return (A) this;
  }
  
  public boolean hasKubeletVersion() {
    return this.kubeletVersion != null;
  }
  
  public String getMachineID() {
    return this.machineID;
  }
  
  public A withMachineID(String machineID) {
    this.machineID = machineID;
    return (A) this;
  }
  
  public boolean hasMachineID() {
    return this.machineID != null;
  }
  
  public String getOperatingSystem() {
    return this.operatingSystem;
  }
  
  public A withOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return (A) this;
  }
  
  public boolean hasOperatingSystem() {
    return this.operatingSystem != null;
  }
  
  public String getOsImage() {
    return this.osImage;
  }
  
  public A withOsImage(String osImage) {
    this.osImage = osImage;
    return (A) this;
  }
  
  public boolean hasOsImage() {
    return this.osImage != null;
  }
  
  public V1NodeSwapStatus buildSwap() {
    return this.swap != null ? this.swap.build() : null;
  }
  
  public A withSwap(V1NodeSwapStatus swap) {
    this._visitables.remove("swap");
    if (swap != null) {
        this.swap = new V1NodeSwapStatusBuilder(swap);
        this._visitables.get("swap").add(this.swap);
    } else {
        this.swap = null;
        this._visitables.get("swap").remove(this.swap);
    }
    return (A) this;
  }
  
  public boolean hasSwap() {
    return this.swap != null;
  }
  
  public SwapNested<A> withNewSwap() {
    return new SwapNested(null);
  }
  
  public SwapNested<A> withNewSwapLike(V1NodeSwapStatus item) {
    return new SwapNested(item);
  }
  
  public SwapNested<A> editSwap() {
    return this.withNewSwapLike(Optional.ofNullable(this.buildSwap()).orElse(null));
  }
  
  public SwapNested<A> editOrNewSwap() {
    return this.withNewSwapLike(Optional.ofNullable(this.buildSwap()).orElse(new V1NodeSwapStatusBuilder().build()));
  }
  
  public SwapNested<A> editOrNewSwapLike(V1NodeSwapStatus item) {
    return this.withNewSwapLike(Optional.ofNullable(this.buildSwap()).orElse(item));
  }
  
  public String getSystemUUID() {
    return this.systemUUID;
  }
  
  public A withSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return (A) this;
  }
  
  public boolean hasSystemUUID() {
    return this.systemUUID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1NodeSystemInfoFluent that = (V1NodeSystemInfoFluent) o;
    if (!(Objects.equals(architecture, that.architecture))) {
      return false;
    }
    if (!(Objects.equals(bootID, that.bootID))) {
      return false;
    }
    if (!(Objects.equals(containerRuntimeVersion, that.containerRuntimeVersion))) {
      return false;
    }
    if (!(Objects.equals(kernelVersion, that.kernelVersion))) {
      return false;
    }
    if (!(Objects.equals(kubeProxyVersion, that.kubeProxyVersion))) {
      return false;
    }
    if (!(Objects.equals(kubeletVersion, that.kubeletVersion))) {
      return false;
    }
    if (!(Objects.equals(machineID, that.machineID))) {
      return false;
    }
    if (!(Objects.equals(operatingSystem, that.operatingSystem))) {
      return false;
    }
    if (!(Objects.equals(osImage, that.osImage))) {
      return false;
    }
    if (!(Objects.equals(swap, that.swap))) {
      return false;
    }
    if (!(Objects.equals(systemUUID, that.systemUUID))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, swap, systemUUID);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(architecture == null)) {
        sb.append("architecture:");
        sb.append(architecture);
        sb.append(",");
    }
    if (!(bootID == null)) {
        sb.append("bootID:");
        sb.append(bootID);
        sb.append(",");
    }
    if (!(containerRuntimeVersion == null)) {
        sb.append("containerRuntimeVersion:");
        sb.append(containerRuntimeVersion);
        sb.append(",");
    }
    if (!(kernelVersion == null)) {
        sb.append("kernelVersion:");
        sb.append(kernelVersion);
        sb.append(",");
    }
    if (!(kubeProxyVersion == null)) {
        sb.append("kubeProxyVersion:");
        sb.append(kubeProxyVersion);
        sb.append(",");
    }
    if (!(kubeletVersion == null)) {
        sb.append("kubeletVersion:");
        sb.append(kubeletVersion);
        sb.append(",");
    }
    if (!(machineID == null)) {
        sb.append("machineID:");
        sb.append(machineID);
        sb.append(",");
    }
    if (!(operatingSystem == null)) {
        sb.append("operatingSystem:");
        sb.append(operatingSystem);
        sb.append(",");
    }
    if (!(osImage == null)) {
        sb.append("osImage:");
        sb.append(osImage);
        sb.append(",");
    }
    if (!(swap == null)) {
        sb.append("swap:");
        sb.append(swap);
        sb.append(",");
    }
    if (!(systemUUID == null)) {
        sb.append("systemUUID:");
        sb.append(systemUUID);
    }
    sb.append("}");
    return sb.toString();
  }
  public class SwapNested<N> extends V1NodeSwapStatusFluent<SwapNested<N>> implements Nested<N>{
    SwapNested(V1NodeSwapStatus item) {
      this.builder = new V1NodeSwapStatusBuilder(this, item);
    }
    V1NodeSwapStatusBuilder builder;
    
    public N and() {
      return (N) V1NodeSystemInfoFluent.this.withSwap(builder.build());
    }
    
    public N endSwap() {
      return and();
    }
    
  
  }

}