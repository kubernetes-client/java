/*
Copyright 2020 The Kubernetes Authors.
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CSIDriverSpec is the specification of a CSIDriver. */
@ApiModel(description = "CSIDriverSpec is the specification of a CSIDriver.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1CSIDriverSpec {
  public static final String SERIALIZED_NAME_ATTACH_REQUIRED = "attachRequired";

  @SerializedName(SERIALIZED_NAME_ATTACH_REQUIRED)
  private Boolean attachRequired;

  public static final String SERIALIZED_NAME_FS_GROUP_POLICY = "fsGroupPolicy";

  @SerializedName(SERIALIZED_NAME_FS_GROUP_POLICY)
  private String fsGroupPolicy;

  public static final String SERIALIZED_NAME_POD_INFO_ON_MOUNT = "podInfoOnMount";

  @SerializedName(SERIALIZED_NAME_POD_INFO_ON_MOUNT)
  private Boolean podInfoOnMount;

  public static final String SERIALIZED_NAME_STORAGE_CAPACITY = "storageCapacity";

  @SerializedName(SERIALIZED_NAME_STORAGE_CAPACITY)
  private Boolean storageCapacity;

  public static final String SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES = "volumeLifecycleModes";

  @SerializedName(SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES)
  private List<String> volumeLifecycleModes = null;

  public V1CSIDriverSpec attachRequired(Boolean attachRequired) {

    this.attachRequired = attachRequired;
    return this;
  }

  /**
   * attachRequired indicates this CSI volume driver requires an attach operation (because it
   * implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach
   * controller should call the attach volume interface which checks the volumeattachment status and
   * waits until the volume is attached before proceeding to mounting. The CSI external-attacher
   * coordinates with CSI volume driver and updates the volumeattachment status when the attach
   * operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is
   * specified to false, the attach operation will be skipped. Otherwise the attach operation will
   * be called.
   *
   * @return attachRequired
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.")
  public Boolean getAttachRequired() {
    return attachRequired;
  }

  public void setAttachRequired(Boolean attachRequired) {
    this.attachRequired = attachRequired;
  }

  public V1CSIDriverSpec fsGroupPolicy(String fsGroupPolicy) {

    this.fsGroupPolicy = fsGroupPolicy;
    return this;
  }

  /**
   * Defines if the underlying volume supports changing ownership and permission of the volume
   * before being mounted. Refer to the specific FSGroupPolicy values for additional details. This
   * field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy
   * feature gate.
   *
   * @return fsGroupPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.")
  public String getFsGroupPolicy() {
    return fsGroupPolicy;
  }

  public void setFsGroupPolicy(String fsGroupPolicy) {
    this.fsGroupPolicy = fsGroupPolicy;
  }

  public V1CSIDriverSpec podInfoOnMount(Boolean podInfoOnMount) {

    this.podInfoOnMount = podInfoOnMount;
    return this;
  }

  /**
   * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod
   * information (like podName, podUID, etc.) during mount operations. If set to false, pod
   * information will not be passed on mount. Default is false. The CSI driver specifies
   * podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as
   * VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing
   * and validating the information passed in as VolumeContext. The following VolumeConext will be
   * passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used.
   * \&quot;csi.storage.k8s.io/pod.name\&quot;: pod.Name
   * \&quot;csi.storage.k8s.io/pod.namespace\&quot;: pod.Namespace
   * \&quot;csi.storage.k8s.io/pod.uid\&quot;: string(pod.UID)
   * \&quot;csi.storage.k8s.io/ephemeral\&quot;: \&quot;true\&quot; iff the volume is an ephemeral
   * inline volume defined by a CSIVolumeSource, otherwise \&quot;false\&quot;
   * \&quot;csi.storage.k8s.io/ephemeral\&quot; is a new feature in Kubernetes 1.16. It is only
   * required for drivers which support both the \&quot;Persistent\&quot; and
   * \&quot;Ephemeral\&quot; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or
   * ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support
   * one mode when deployed on such a cluster and the deployment determines which mode that is, for
   * example via a command line parameter of the driver.
   *
   * @return podInfoOnMount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. \"csi.storage.k8s.io/pod.name\": pod.Name \"csi.storage.k8s.io/pod.namespace\": pod.Namespace \"csi.storage.k8s.io/pod.uid\": string(pod.UID) \"csi.storage.k8s.io/ephemeral\": \"true\" iff the volume is an ephemeral inline volume                                 defined by a CSIVolumeSource, otherwise \"false\"  \"csi.storage.k8s.io/ephemeral\" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the \"Persistent\" and \"Ephemeral\" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.")
  public Boolean getPodInfoOnMount() {
    return podInfoOnMount;
  }

  public void setPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
  }

  public V1CSIDriverSpec storageCapacity(Boolean storageCapacity) {

    this.storageCapacity = storageCapacity;
    return this;
  }

  /**
   * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to
   * consider the storage capacity that the driver deployment will report by creating
   * CSIStorageCapacity objects with capacity information. The check can be enabled immediately when
   * deploying a driver. In that case, provisioning new volumes with late binding will pause until
   * the driver deployment has published some suitable CSIStorageCapacity object. Alternatively, the
   * driver can be deployed with the field unset or false and it can be flipped later when storage
   * capacity information has been published. This is an alpha field and only available when the
   * CSIStorageCapacity feature is enabled. The default is false.
   *
   * @return storageCapacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.  The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.  Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.  This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.")
  public Boolean getStorageCapacity() {
    return storageCapacity;
  }

  public void setStorageCapacity(Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
  }

  public V1CSIDriverSpec volumeLifecycleModes(List<String> volumeLifecycleModes) {

    this.volumeLifecycleModes = volumeLifecycleModes;
    return this;
  }

  public V1CSIDriverSpec addVolumeLifecycleModesItem(String volumeLifecycleModesItem) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new ArrayList<String>();
    }
    this.volumeLifecycleModes.add(volumeLifecycleModesItem);
    return this;
  }

  /**
   * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default
   * if the list is empty is \&quot;Persistent\&quot;, which is the usage defined by the CSI
   * specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is
   * \&quot;Ephemeral\&quot;. In this mode, volumes are defined inline inside the pod spec with
   * CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be
   * aware of this because it is only going to get a NodePublishVolume call for such a volume. For
   * more information about implementing this mode, see
   * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or
   * more of these modes and more modes may be added in the future. This field is beta.
   *
   * @return volumeLifecycleModes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is \"Persistent\", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is \"Ephemeral\". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.")
  public List<String> getVolumeLifecycleModes() {
    return volumeLifecycleModes;
  }

  public void setVolumeLifecycleModes(List<String> volumeLifecycleModes) {
    this.volumeLifecycleModes = volumeLifecycleModes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIDriverSpec v1CSIDriverSpec = (V1CSIDriverSpec) o;
    return Objects.equals(this.attachRequired, v1CSIDriverSpec.attachRequired)
        && Objects.equals(this.fsGroupPolicy, v1CSIDriverSpec.fsGroupPolicy)
        && Objects.equals(this.podInfoOnMount, v1CSIDriverSpec.podInfoOnMount)
        && Objects.equals(this.storageCapacity, v1CSIDriverSpec.storageCapacity)
        && Objects.equals(this.volumeLifecycleModes, v1CSIDriverSpec.volumeLifecycleModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachRequired, fsGroupPolicy, podInfoOnMount, storageCapacity, volumeLifecycleModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIDriverSpec {\n");
    sb.append("    attachRequired: ").append(toIndentedString(attachRequired)).append("\n");
    sb.append("    fsGroupPolicy: ").append(toIndentedString(fsGroupPolicy)).append("\n");
    sb.append("    podInfoOnMount: ").append(toIndentedString(podInfoOnMount)).append("\n");
    sb.append("    storageCapacity: ").append(toIndentedString(storageCapacity)).append("\n");
    sb.append("    volumeLifecycleModes: ")
        .append(toIndentedString(volumeLifecycleModes))
        .append("\n");
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
