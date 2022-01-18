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
public class V1NodeSystemInfoFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<A> {
  public V1NodeSystemInfoFluentImpl() {}

  public V1NodeSystemInfoFluentImpl(io.kubernetes.client.openapi.models.V1NodeSystemInfo instance) {
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
  }

  private java.lang.String architecture;
  private java.lang.String bootID;
  private java.lang.String containerRuntimeVersion;
  private java.lang.String kernelVersion;
  private java.lang.String kubeProxyVersion;
  private java.lang.String kubeletVersion;
  private java.lang.String machineID;
  private java.lang.String operatingSystem;
  private java.lang.String osImage;
  private java.lang.String systemUUID;

  public java.lang.String getArchitecture() {
    return this.architecture;
  }

  public A withArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return (A) this;
  }

  public java.lang.Boolean hasArchitecture() {
    return this.architecture != null;
  }

  /** Method is deprecated. use withArchitecture instead. */
  @java.lang.Deprecated
  public A withNewArchitecture(java.lang.String original) {
    return (A) withArchitecture(new String(original));
  }

  public java.lang.String getBootID() {
    return this.bootID;
  }

  public A withBootID(java.lang.String bootID) {
    this.bootID = bootID;
    return (A) this;
  }

  public java.lang.Boolean hasBootID() {
    return this.bootID != null;
  }

  /** Method is deprecated. use withBootID instead. */
  @java.lang.Deprecated
  public A withNewBootID(java.lang.String original) {
    return (A) withBootID(new String(original));
  }

  public java.lang.String getContainerRuntimeVersion() {
    return this.containerRuntimeVersion;
  }

  public A withContainerRuntimeVersion(java.lang.String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return (A) this;
  }

  public java.lang.Boolean hasContainerRuntimeVersion() {
    return this.containerRuntimeVersion != null;
  }

  /** Method is deprecated. use withContainerRuntimeVersion instead. */
  @java.lang.Deprecated
  public A withNewContainerRuntimeVersion(java.lang.String original) {
    return (A) withContainerRuntimeVersion(new String(original));
  }

  public java.lang.String getKernelVersion() {
    return this.kernelVersion;
  }

  public A withKernelVersion(java.lang.String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return (A) this;
  }

  public java.lang.Boolean hasKernelVersion() {
    return this.kernelVersion != null;
  }

  /** Method is deprecated. use withKernelVersion instead. */
  @java.lang.Deprecated
  public A withNewKernelVersion(java.lang.String original) {
    return (A) withKernelVersion(new String(original));
  }

  public java.lang.String getKubeProxyVersion() {
    return this.kubeProxyVersion;
  }

  public A withKubeProxyVersion(java.lang.String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return (A) this;
  }

  public java.lang.Boolean hasKubeProxyVersion() {
    return this.kubeProxyVersion != null;
  }

  /** Method is deprecated. use withKubeProxyVersion instead. */
  @java.lang.Deprecated
  public A withNewKubeProxyVersion(java.lang.String original) {
    return (A) withKubeProxyVersion(new String(original));
  }

  public java.lang.String getKubeletVersion() {
    return this.kubeletVersion;
  }

  public A withKubeletVersion(java.lang.String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return (A) this;
  }

  public java.lang.Boolean hasKubeletVersion() {
    return this.kubeletVersion != null;
  }

  /** Method is deprecated. use withKubeletVersion instead. */
  @java.lang.Deprecated
  public A withNewKubeletVersion(java.lang.String original) {
    return (A) withKubeletVersion(new String(original));
  }

  public java.lang.String getMachineID() {
    return this.machineID;
  }

  public A withMachineID(java.lang.String machineID) {
    this.machineID = machineID;
    return (A) this;
  }

  public java.lang.Boolean hasMachineID() {
    return this.machineID != null;
  }

  /** Method is deprecated. use withMachineID instead. */
  @java.lang.Deprecated
  public A withNewMachineID(java.lang.String original) {
    return (A) withMachineID(new String(original));
  }

  public java.lang.String getOperatingSystem() {
    return this.operatingSystem;
  }

  public A withOperatingSystem(java.lang.String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return (A) this;
  }

  public java.lang.Boolean hasOperatingSystem() {
    return this.operatingSystem != null;
  }

  /** Method is deprecated. use withOperatingSystem instead. */
  @java.lang.Deprecated
  public A withNewOperatingSystem(java.lang.String original) {
    return (A) withOperatingSystem(new String(original));
  }

  public java.lang.String getOsImage() {
    return this.osImage;
  }

  public A withOsImage(java.lang.String osImage) {
    this.osImage = osImage;
    return (A) this;
  }

  public java.lang.Boolean hasOsImage() {
    return this.osImage != null;
  }

  /** Method is deprecated. use withOsImage instead. */
  @java.lang.Deprecated
  public A withNewOsImage(java.lang.String original) {
    return (A) withOsImage(new String(original));
  }

  public java.lang.String getSystemUUID() {
    return this.systemUUID;
  }

  public A withSystemUUID(java.lang.String systemUUID) {
    this.systemUUID = systemUUID;
    return (A) this;
  }

  public java.lang.Boolean hasSystemUUID() {
    return this.systemUUID != null;
  }

  /** Method is deprecated. use withSystemUUID instead. */
  @java.lang.Deprecated
  public A withNewSystemUUID(java.lang.String original) {
    return (A) withSystemUUID(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSystemInfoFluentImpl that = (V1NodeSystemInfoFluentImpl) o;
    if (architecture != null ? !architecture.equals(that.architecture) : that.architecture != null)
      return false;
    if (bootID != null ? !bootID.equals(that.bootID) : that.bootID != null) return false;
    if (containerRuntimeVersion != null
        ? !containerRuntimeVersion.equals(that.containerRuntimeVersion)
        : that.containerRuntimeVersion != null) return false;
    if (kernelVersion != null
        ? !kernelVersion.equals(that.kernelVersion)
        : that.kernelVersion != null) return false;
    if (kubeProxyVersion != null
        ? !kubeProxyVersion.equals(that.kubeProxyVersion)
        : that.kubeProxyVersion != null) return false;
    if (kubeletVersion != null
        ? !kubeletVersion.equals(that.kubeletVersion)
        : that.kubeletVersion != null) return false;
    if (machineID != null ? !machineID.equals(that.machineID) : that.machineID != null)
      return false;
    if (operatingSystem != null
        ? !operatingSystem.equals(that.operatingSystem)
        : that.operatingSystem != null) return false;
    if (osImage != null ? !osImage.equals(that.osImage) : that.osImage != null) return false;
    if (systemUUID != null ? !systemUUID.equals(that.systemUUID) : that.systemUUID != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        architecture,
        bootID,
        containerRuntimeVersion,
        kernelVersion,
        kubeProxyVersion,
        kubeletVersion,
        machineID,
        operatingSystem,
        osImage,
        systemUUID,
        super.hashCode());
  }
}
