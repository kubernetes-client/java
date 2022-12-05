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

/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support
 * ownership management or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1QuobyteVolumeSource {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";

  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private String registry;

  public static final String SERIALIZED_NAME_TENANT = "tenant";

  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_VOLUME = "volume";

  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public V1QuobyteVolumeSource group(String group) {

    this.group = group;
    return this;
  }

  /**
   * group to map volume access to Default is no group
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "group to map volume access to Default is no group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1QuobyteVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults
   * to false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1QuobyteVolumeSource registry(String registry) {

    this.registry = registry;
    return this;
  }

  /**
   * registry represents a single or multiple Quobyte Registry services specified as a string as
   * host:port pair (multiple entries are separated with commas) which acts as the central registry
   * for volumes
   *
   * @return registry
   */
  @ApiModelProperty(
      required = true,
      value =
          "registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public V1QuobyteVolumeSource tenant(String tenant) {

    this.tenant = tenant;
    return this;
  }

  /**
   * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte
   * volumes, value is set by the plugin
   *
   * @return tenant
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public V1QuobyteVolumeSource user(String user) {

    this.user = user;
    return this;
  }

  /**
   * user to map volume access to Defaults to serivceaccount user
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "user to map volume access to Defaults to serivceaccount user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public V1QuobyteVolumeSource volume(String volume) {

    this.volume = volume;
    return this;
  }

  /**
   * volume is a string that references an already created Quobyte volume by name.
   *
   * @return volume
   */
  @ApiModelProperty(
      required = true,
      value = "volume is a string that references an already created Quobyte volume by name.")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1QuobyteVolumeSource v1QuobyteVolumeSource = (V1QuobyteVolumeSource) o;
    return Objects.equals(this.group, v1QuobyteVolumeSource.group)
        && Objects.equals(this.readOnly, v1QuobyteVolumeSource.readOnly)
        && Objects.equals(this.registry, v1QuobyteVolumeSource.registry)
        && Objects.equals(this.tenant, v1QuobyteVolumeSource.tenant)
        && Objects.equals(this.user, v1QuobyteVolumeSource.user)
        && Objects.equals(this.volume, v1QuobyteVolumeSource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QuobyteVolumeSource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
