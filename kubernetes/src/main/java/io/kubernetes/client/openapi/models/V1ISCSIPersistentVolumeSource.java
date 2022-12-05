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

/**
 * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as
 * read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@ApiModel(
    description =
        "ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ISCSIPersistentVolumeSource {
  public static final String SERIALIZED_NAME_CHAP_AUTH_DISCOVERY = "chapAuthDiscovery";

  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_DISCOVERY)
  private Boolean chapAuthDiscovery;

  public static final String SERIALIZED_NAME_CHAP_AUTH_SESSION = "chapAuthSession";

  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_SESSION)
  private Boolean chapAuthSession;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_INITIATOR_NAME = "initiatorName";

  @SerializedName(SERIALIZED_NAME_INITIATOR_NAME)
  private String initiatorName;

  public static final String SERIALIZED_NAME_IQN = "iqn";

  @SerializedName(SERIALIZED_NAME_IQN)
  private String iqn;

  public static final String SERIALIZED_NAME_ISCSI_INTERFACE = "iscsiInterface";

  @SerializedName(SERIALIZED_NAME_ISCSI_INTERFACE)
  private String iscsiInterface;

  public static final String SERIALIZED_NAME_LUN = "lun";

  @SerializedName(SERIALIZED_NAME_LUN)
  private Integer lun;

  public static final String SERIALIZED_NAME_PORTALS = "portals";

  @SerializedName(SERIALIZED_NAME_PORTALS)
  private List<String> portals = null;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretReference secretRef;

  public static final String SERIALIZED_NAME_TARGET_PORTAL = "targetPortal";

  @SerializedName(SERIALIZED_NAME_TARGET_PORTAL)
  private String targetPortal;

  public V1ISCSIPersistentVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {

    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

  /**
   * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
   *
   * @return chapAuthDiscovery
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication")
  public Boolean getChapAuthDiscovery() {
    return chapAuthDiscovery;
  }

  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }

  public V1ISCSIPersistentVolumeSource chapAuthSession(Boolean chapAuthSession) {

    this.chapAuthSession = chapAuthSession;
    return this;
  }

  /**
   * chapAuthSession defines whether support iSCSI Session CHAP authentication
   *
   * @return chapAuthSession
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "chapAuthSession defines whether support iSCSI Session CHAP authentication")
  public Boolean getChapAuthSession() {
    return chapAuthSession;
  }

  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }

  public V1ISCSIPersistentVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the
   * filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;,
   * \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if
   * unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ISCSIPersistentVolumeSource initiatorName(String initiatorName) {

    this.initiatorName = initiatorName;
    return this;
  }

  /**
   * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with
   * iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt;
   * will be created for the connection.
   *
   * @return initiatorName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
  public String getInitiatorName() {
    return initiatorName;
  }

  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }

  public V1ISCSIPersistentVolumeSource iqn(String iqn) {

    this.iqn = iqn;
    return this;
  }

  /**
   * iqn is Target iSCSI Qualified Name.
   *
   * @return iqn
   */
  @ApiModelProperty(required = true, value = "iqn is Target iSCSI Qualified Name.")
  public String getIqn() {
    return iqn;
  }

  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  public V1ISCSIPersistentVolumeSource iscsiInterface(String iscsiInterface) {

    this.iscsiInterface = iscsiInterface;
    return this;
  }

  /**
   * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to
   * &#39;default&#39; (tcp).
   *
   * @return iscsiInterface
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
  public String getIscsiInterface() {
    return iscsiInterface;
  }

  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  public V1ISCSIPersistentVolumeSource lun(Integer lun) {

    this.lun = lun;
    return this;
  }

  /**
   * lun is iSCSI Target Lun number.
   *
   * @return lun
   */
  @ApiModelProperty(required = true, value = "lun is iSCSI Target Lun number.")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1ISCSIPersistentVolumeSource portals(List<String> portals) {

    this.portals = portals;
    return this;
  }

  public V1ISCSIPersistentVolumeSource addPortalsItem(String portalsItem) {
    if (this.portals == null) {
      this.portals = new ArrayList<>();
    }
    this.portals.add(portalsItem);
    return this;
  }

  /**
   * portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port
   * is other than default (typically TCP ports 860 and 3260).
   *
   * @return portals
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public List<String> getPortals() {
    return portals;
  }

  public void setPortals(List<String> portals) {
    this.portals = portals;
  }

  public V1ISCSIPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ISCSIPersistentVolumeSource secretRef(V1SecretReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public V1ISCSIPersistentVolumeSource targetPortal(String targetPortal) {

    this.targetPortal = targetPortal;
    return this;
  }

  /**
   * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is
   * other than default (typically TCP ports 860 and 3260).
   *
   * @return targetPortal
   */
  @ApiModelProperty(
      required = true,
      value =
          "targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public String getTargetPortal() {
    return targetPortal;
  }

  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ISCSIPersistentVolumeSource v1ISCSIPersistentVolumeSource = (V1ISCSIPersistentVolumeSource) o;
    return Objects.equals(this.chapAuthDiscovery, v1ISCSIPersistentVolumeSource.chapAuthDiscovery)
        && Objects.equals(this.chapAuthSession, v1ISCSIPersistentVolumeSource.chapAuthSession)
        && Objects.equals(this.fsType, v1ISCSIPersistentVolumeSource.fsType)
        && Objects.equals(this.initiatorName, v1ISCSIPersistentVolumeSource.initiatorName)
        && Objects.equals(this.iqn, v1ISCSIPersistentVolumeSource.iqn)
        && Objects.equals(this.iscsiInterface, v1ISCSIPersistentVolumeSource.iscsiInterface)
        && Objects.equals(this.lun, v1ISCSIPersistentVolumeSource.lun)
        && Objects.equals(this.portals, v1ISCSIPersistentVolumeSource.portals)
        && Objects.equals(this.readOnly, v1ISCSIPersistentVolumeSource.readOnly)
        && Objects.equals(this.secretRef, v1ISCSIPersistentVolumeSource.secretRef)
        && Objects.equals(this.targetPortal, v1ISCSIPersistentVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chapAuthDiscovery,
        chapAuthSession,
        fsType,
        initiatorName,
        iqn,
        iscsiInterface,
        lun,
        portals,
        readOnly,
        secretRef,
        targetPortal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ISCSIPersistentVolumeSource {\n");
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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
