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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NodeSystemInfo is a set of ids/uuids to uniquely identify the node. */
@ApiModel(description = "NodeSystemInfo is a set of ids/uuids to uniquely identify the node.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeSystemInfo {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_BOOT_I_D = "bootID";

  @SerializedName(SERIALIZED_NAME_BOOT_I_D)
  private String bootID;

  public static final String SERIALIZED_NAME_CONTAINER_RUNTIME_VERSION = "containerRuntimeVersion";

  @SerializedName(SERIALIZED_NAME_CONTAINER_RUNTIME_VERSION)
  private String containerRuntimeVersion;

  public static final String SERIALIZED_NAME_KERNEL_VERSION = "kernelVersion";

  @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
  private String kernelVersion;

  public static final String SERIALIZED_NAME_KUBE_PROXY_VERSION = "kubeProxyVersion";

  @SerializedName(SERIALIZED_NAME_KUBE_PROXY_VERSION)
  private String kubeProxyVersion;

  public static final String SERIALIZED_NAME_KUBELET_VERSION = "kubeletVersion";

  @SerializedName(SERIALIZED_NAME_KUBELET_VERSION)
  private String kubeletVersion;

  public static final String SERIALIZED_NAME_MACHINE_I_D = "machineID";

  @SerializedName(SERIALIZED_NAME_MACHINE_I_D)
  private String machineID;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operatingSystem";

  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private String operatingSystem;

  public static final String SERIALIZED_NAME_OS_IMAGE = "osImage";

  @SerializedName(SERIALIZED_NAME_OS_IMAGE)
  private String osImage;

  public static final String SERIALIZED_NAME_SYSTEM_U_U_I_D = "systemUUID";

  @SerializedName(SERIALIZED_NAME_SYSTEM_U_U_I_D)
  private String systemUUID;

  public V1NodeSystemInfo architecture(String architecture) {

    this.architecture = architecture;
    return this;
  }

  /**
   * The Architecture reported by the node
   *
   * @return architecture
   */
  @ApiModelProperty(required = true, value = "The Architecture reported by the node")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public V1NodeSystemInfo bootID(String bootID) {

    this.bootID = bootID;
    return this;
  }

  /**
   * Boot ID reported by the node.
   *
   * @return bootID
   */
  @ApiModelProperty(required = true, value = "Boot ID reported by the node.")
  public String getBootID() {
    return bootID;
  }

  public void setBootID(String bootID) {
    this.bootID = bootID;
  }

  public V1NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {

    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

  /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g.
   * containerd://1.4.2).
   *
   * @return containerRuntimeVersion
   */
  @ApiModelProperty(
      required = true,
      value =
          "ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).")
  public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }

  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }

  public V1NodeSystemInfo kernelVersion(String kernelVersion) {

    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
   *
   * @return kernelVersion
   */
  @ApiModelProperty(
      required = true,
      value = "Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public V1NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {

    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

  /**
   * KubeProxy Version reported by the node.
   *
   * @return kubeProxyVersion
   */
  @ApiModelProperty(required = true, value = "KubeProxy Version reported by the node.")
  public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }

  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }

  public V1NodeSystemInfo kubeletVersion(String kubeletVersion) {

    this.kubeletVersion = kubeletVersion;
    return this;
  }

  /**
   * Kubelet Version reported by the node.
   *
   * @return kubeletVersion
   */
  @ApiModelProperty(required = true, value = "Kubelet Version reported by the node.")
  public String getKubeletVersion() {
    return kubeletVersion;
  }

  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }

  public V1NodeSystemInfo machineID(String machineID) {

    this.machineID = machineID;
    return this;
  }

  /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is
   * preferred. Learn more from man(5) machine-id:
   * http://man7.org/linux/man-pages/man5/machine-id.5.html
   *
   * @return machineID
   */
  @ApiModelProperty(
      required = true,
      value =
          "MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html")
  public String getMachineID() {
    return machineID;
  }

  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  public V1NodeSystemInfo operatingSystem(String operatingSystem) {

    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * The Operating System reported by the node
   *
   * @return operatingSystem
   */
  @ApiModelProperty(required = true, value = "The Operating System reported by the node")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public V1NodeSystemInfo osImage(String osImage) {

    this.osImage = osImage;
    return this;
  }

  /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   *
   * @return osImage
   */
  @ApiModelProperty(
      required = true,
      value =
          "OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).")
  public String getOsImage() {
    return osImage;
  }

  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }

  public V1NodeSystemInfo systemUUID(String systemUUID) {

    this.systemUUID = systemUUID;
    return this;
  }

  /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This
   * field is specific to Red Hat hosts
   * https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
   *
   * @return systemUUID
   */
  @ApiModelProperty(
      required = true,
      value =
          "SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid")
  public String getSystemUUID() {
    return systemUUID;
  }

  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSystemInfo v1NodeSystemInfo = (V1NodeSystemInfo) o;
    return Objects.equals(this.architecture, v1NodeSystemInfo.architecture)
        && Objects.equals(this.bootID, v1NodeSystemInfo.bootID)
        && Objects.equals(this.containerRuntimeVersion, v1NodeSystemInfo.containerRuntimeVersion)
        && Objects.equals(this.kernelVersion, v1NodeSystemInfo.kernelVersion)
        && Objects.equals(this.kubeProxyVersion, v1NodeSystemInfo.kubeProxyVersion)
        && Objects.equals(this.kubeletVersion, v1NodeSystemInfo.kubeletVersion)
        && Objects.equals(this.machineID, v1NodeSystemInfo.machineID)
        && Objects.equals(this.operatingSystem, v1NodeSystemInfo.operatingSystem)
        && Objects.equals(this.osImage, v1NodeSystemInfo.osImage)
        && Objects.equals(this.systemUUID, v1NodeSystemInfo.systemUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        architecture,
        bootID,
        containerRuntimeVersion,
        kernelVersion,
        kubeProxyVersion,
        kubeletVersion,
        machineID,
        operatingSystem,
        osImage,
        systemUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSystemInfo {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ")
        .append(toIndentedString(containerRuntimeVersion))
        .append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
