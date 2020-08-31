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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
@ApiModel(
    description =
        "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecScaleIO {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";

  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_PROTECTION_DOMAIN = "protectionDomain";

  @SerializedName(SERIALIZED_NAME_PROTECTION_DOMAIN)
  private String protectionDomain;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ThanosRulerSpecScaleIOSecretRef secretRef;

  public static final String SERIALIZED_NAME_SSL_ENABLED = "sslEnabled";

  @SerializedName(SERIALIZED_NAME_SSL_ENABLED)
  private Boolean sslEnabled;

  public static final String SERIALIZED_NAME_STORAGE_MODE = "storageMode";

  @SerializedName(SERIALIZED_NAME_STORAGE_MODE)
  private String storageMode;

  public static final String SERIALIZED_NAME_STORAGE_POOL = "storagePool";

  @SerializedName(SERIALIZED_NAME_STORAGE_POOL)
  private String storagePool;

  public static final String SERIALIZED_NAME_SYSTEM = "system";

  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private String system;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";

  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1ThanosRulerSpecScaleIO fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex.
   * \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\".")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecScaleIO gateway(String gateway) {

    this.gateway = gateway;
    return this;
  }

  /**
   * The host address of the ScaleIO API Gateway.
   *
   * @return gateway
   */
  @ApiModelProperty(required = true, value = "The host address of the ScaleIO API Gateway.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public V1ThanosRulerSpecScaleIO protectionDomain(String protectionDomain) {

    this.protectionDomain = protectionDomain;
    return this;
  }

  /**
   * The name of the ScaleIO Protection Domain for the configured storage.
   *
   * @return protectionDomain
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the ScaleIO Protection Domain for the configured storage.")
  public String getProtectionDomain() {
    return protectionDomain;
  }

  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }

  public V1ThanosRulerSpecScaleIO readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecScaleIO secretRef(V1ThanosRulerSpecScaleIOSecretRef secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1ThanosRulerSpecScaleIOSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecScaleIOSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public V1ThanosRulerSpecScaleIO sslEnabled(Boolean sslEnabled) {

    this.sslEnabled = sslEnabled;
    return this;
  }

  /**
   * Flag to enable/disable SSL communication with Gateway, default false
   *
   * @return sslEnabled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag to enable/disable SSL communication with Gateway, default false")
  public Boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public V1ThanosRulerSpecScaleIO storageMode(String storageMode) {

    this.storageMode = storageMode;
    return this;
  }

  /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
   * Default is ThinProvisioned.
   *
   * @return storageMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
  public String getStorageMode() {
    return storageMode;
  }

  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }

  public V1ThanosRulerSpecScaleIO storagePool(String storagePool) {

    this.storagePool = storagePool;
    return this;
  }

  /**
   * The ScaleIO Storage Pool associated with the protection domain.
   *
   * @return storagePool
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ScaleIO Storage Pool associated with the protection domain.")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  public V1ThanosRulerSpecScaleIO system(String system) {

    this.system = system;
    return this;
  }

  /**
   * The name of the storage system as configured in ScaleIO.
   *
   * @return system
   */
  @ApiModelProperty(
      required = true,
      value = "The name of the storage system as configured in ScaleIO.")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public V1ThanosRulerSpecScaleIO volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

  /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume
   * source.
   *
   * @return volumeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of a volume already created in the ScaleIO system that is associated with this volume source.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecScaleIO v1ThanosRulerSpecScaleIO = (V1ThanosRulerSpecScaleIO) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecScaleIO.fsType)
        && Objects.equals(this.gateway, v1ThanosRulerSpecScaleIO.gateway)
        && Objects.equals(this.protectionDomain, v1ThanosRulerSpecScaleIO.protectionDomain)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecScaleIO.readOnly)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecScaleIO.secretRef)
        && Objects.equals(this.sslEnabled, v1ThanosRulerSpecScaleIO.sslEnabled)
        && Objects.equals(this.storageMode, v1ThanosRulerSpecScaleIO.storageMode)
        && Objects.equals(this.storagePool, v1ThanosRulerSpecScaleIO.storagePool)
        && Objects.equals(this.system, v1ThanosRulerSpecScaleIO.system)
        && Objects.equals(this.volumeName, v1ThanosRulerSpecScaleIO.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fsType,
        gateway,
        protectionDomain,
        readOnly,
        secretRef,
        sslEnabled,
        storageMode,
        storagePool,
        system,
        volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecScaleIO {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
