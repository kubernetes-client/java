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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CSIDriverSpec is the specification of a CSIDriver. */
@ApiModel(description = "CSIDriverSpec is the specification of a CSIDriver.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
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

  public static final String SERIALIZED_NAME_REQUIRES_REPUBLISH = "requiresRepublish";

  @SerializedName(SERIALIZED_NAME_REQUIRES_REPUBLISH)
  private Boolean requiresRepublish;

  public static final String SERIALIZED_NAME_SE_LINUX_MOUNT = "seLinuxMount";

  @SerializedName(SERIALIZED_NAME_SE_LINUX_MOUNT)
  private Boolean seLinuxMount;

  public static final String SERIALIZED_NAME_STORAGE_CAPACITY = "storageCapacity";

  @SerializedName(SERIALIZED_NAME_STORAGE_CAPACITY)
  private Boolean storageCapacity;

  public static final String SERIALIZED_NAME_TOKEN_REQUESTS = "tokenRequests";

  @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTS)
  private List<StorageV1TokenRequest> tokenRequests = null;

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
   * be called. This field is immutable.
   *
   * @return attachRequired
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.  This field is immutable.")
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
   * field is immutable. Defaults to ReadWriteOnceWithFSType, which will examine each volume to
   * determine if Kubernetes should modify ownership and permissions of the volume. With the default
   * policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s
   * access mode contains ReadWriteOnce.
   *
   * @return fsGroupPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.  This field is immutable.  Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume's access mode contains ReadWriteOnce.")
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
   * \&quot;csi.storage.k8s.io/ephemeral\&quot;: \&quot;true\&quot; if the volume is an ephemeral
   * inline volume defined by a CSIVolumeSource, otherwise \&quot;false\&quot;
   * \&quot;csi.storage.k8s.io/ephemeral\&quot; is a new feature in Kubernetes 1.16. It is only
   * required for drivers which support both the \&quot;Persistent\&quot; and
   * \&quot;Ephemeral\&quot; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or
   * ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support
   * one mode when deployed on such a cluster and the deployment determines which mode that is, for
   * example via a command line parameter of the driver. This field is immutable.
   *
   * @return podInfoOnMount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. \"csi.storage.k8s.io/pod.name\": pod.Name \"csi.storage.k8s.io/pod.namespace\": pod.Namespace \"csi.storage.k8s.io/pod.uid\": string(pod.UID) \"csi.storage.k8s.io/ephemeral\": \"true\" if the volume is an ephemeral inline volume                                 defined by a CSIVolumeSource, otherwise \"false\"  \"csi.storage.k8s.io/ephemeral\" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the \"Persistent\" and \"Ephemeral\" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.  This field is immutable.")
  public Boolean getPodInfoOnMount() {
    return podInfoOnMount;
  }

  public void setPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
  }

  public V1CSIDriverSpec requiresRepublish(Boolean requiresRepublish) {

    this.requiresRepublish = requiresRepublish;
    return this;
  }

  /**
   * RequiresRepublish indicates the CSI driver wants &#x60;NodePublishVolume&#x60; being
   * periodically called to reflect any possible change in the mounted volume. This field defaults
   * to false. Note: After a successful initial NodePublishVolume call, subsequent calls to
   * NodePublishVolume should only update the contents of the volume. New mount points will not be
   * seen by a running container.
   *
   * @return requiresRepublish
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.  Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.")
  public Boolean getRequiresRepublish() {
    return requiresRepublish;
  }

  public void setRequiresRepublish(Boolean requiresRepublish) {
    this.requiresRepublish = requiresRepublish;
  }

  public V1CSIDriverSpec seLinuxMount(Boolean seLinuxMount) {

    this.seLinuxMount = seLinuxMount;
    return this;
  }

  /**
   * SELinuxMount specifies if the CSI driver supports \&quot;-o context\&quot; mount option. When
   * \&quot;true\&quot;, the CSI driver must ensure that all volumes provided by this CSI driver can
   * be mounted separately with different &#x60;-o context&#x60; options. This is typical for
   * storage backends that provide volumes as filesystems on block devices or as independent shared
   * volumes. Kubernetes will call NodeStage / NodePublish with \&quot;-o context&#x3D;xyz\&quot;
   * mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set
   * SELinux context. In the future, it may be expanded to other volume AccessModes. In any case,
   * Kubernetes will ensure that the volume is mounted only with a single SELinux context. When
   * \&quot;false\&quot;, Kubernetes won&#39;t pass any special SELinux mount options to the driver.
   * This is typical for volumes that represent subdirectories of a bigger shared filesystem.
   * Default is \&quot;false\&quot;.
   *
   * @return seLinuxMount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SELinuxMount specifies if the CSI driver supports \"-o context\" mount option.  When \"true\", the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with \"-o context=xyz\" mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.  When \"false\", Kubernetes won't pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.  Default is \"false\".")
  public Boolean getSeLinuxMount() {
    return seLinuxMount;
  }

  public void setSeLinuxMount(Boolean seLinuxMount) {
    this.seLinuxMount = seLinuxMount;
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
   * capacity information has been published. This field was immutable in Kubernetes &lt;&#x3D; 1.22
   * and now is mutable.
   *
   * @return storageCapacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.  The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.  Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.  This field was immutable in Kubernetes <= 1.22 and now is mutable.")
  public Boolean getStorageCapacity() {
    return storageCapacity;
  }

  public void setStorageCapacity(Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
  }

  public V1CSIDriverSpec tokenRequests(List<StorageV1TokenRequest> tokenRequests) {

    this.tokenRequests = tokenRequests;
    return this;
  }

  public V1CSIDriverSpec addTokenRequestsItem(StorageV1TokenRequest tokenRequestsItem) {
    if (this.tokenRequests == null) {
      this.tokenRequests = new ArrayList<>();
    }
    this.tokenRequests.add(tokenRequestsItem);
    return this;
  }

  /**
   * TokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting
   * volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the
   * CSI NodePublishVolume calls. The CSI driver should parse and validate the following
   * VolumeContext: \&quot;csi.storage.k8s.io/serviceAccount.tokens\&quot;: {
   * \&quot;&lt;audience&gt;\&quot;: { \&quot;token\&quot;: &lt;token&gt;,
   * \&quot;expirationTimestamp\&quot;: &lt;expiration timestamp in RFC3339&gt;, }, ... } Note:
   * Audience in each TokenRequest should be different and at most one token is empty string. To
   * receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume
   * periodically.
   *
   * @return tokenRequests
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: \"csi.storage.k8s.io/serviceAccount.tokens\": {   \"<audience>\": {     \"token\": <token>,     \"expirationTimestamp\": <expiration timestamp in RFC3339>,   },   ... }  Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.")
  public List<StorageV1TokenRequest> getTokenRequests() {
    return tokenRequests;
  }

  public void setTokenRequests(List<StorageV1TokenRequest> tokenRequests) {
    this.tokenRequests = tokenRequests;
  }

  public V1CSIDriverSpec volumeLifecycleModes(List<String> volumeLifecycleModes) {

    this.volumeLifecycleModes = volumeLifecycleModes;
    return this;
  }

  public V1CSIDriverSpec addVolumeLifecycleModesItem(String volumeLifecycleModesItem) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new ArrayList<>();
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
   * more of these modes and more modes may be added in the future. This field is beta. This field
   * is immutable.
   *
   * @return volumeLifecycleModes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is \"Persistent\", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is \"Ephemeral\". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.  This field is immutable.")
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
        && Objects.equals(this.requiresRepublish, v1CSIDriverSpec.requiresRepublish)
        && Objects.equals(this.seLinuxMount, v1CSIDriverSpec.seLinuxMount)
        && Objects.equals(this.storageCapacity, v1CSIDriverSpec.storageCapacity)
        && Objects.equals(this.tokenRequests, v1CSIDriverSpec.tokenRequests)
        && Objects.equals(this.volumeLifecycleModes, v1CSIDriverSpec.volumeLifecycleModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachRequired,
        fsGroupPolicy,
        podInfoOnMount,
        requiresRepublish,
        seLinuxMount,
        storageCapacity,
        tokenRequests,
        volumeLifecycleModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIDriverSpec {\n");
    sb.append("    attachRequired: ").append(toIndentedString(attachRequired)).append("\n");
    sb.append("    fsGroupPolicy: ").append(toIndentedString(fsGroupPolicy)).append("\n");
    sb.append("    podInfoOnMount: ").append(toIndentedString(podInfoOnMount)).append("\n");
    sb.append("    requiresRepublish: ").append(toIndentedString(requiresRepublish)).append("\n");
    sb.append("    seLinuxMount: ").append(toIndentedString(seLinuxMount)).append("\n");
    sb.append("    storageCapacity: ").append(toIndentedString(storageCapacity)).append("\n");
    sb.append("    tokenRequests: ").append(toIndentedString(tokenRequests)).append("\n");
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
