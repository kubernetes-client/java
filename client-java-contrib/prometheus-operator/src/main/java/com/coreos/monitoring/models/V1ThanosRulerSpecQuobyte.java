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

/** Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime */
@ApiModel(
    description = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecQuobyte {
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

  public V1ThanosRulerSpecQuobyte group(String group) {

    this.group = group;
    return this;
  }

  /**
   * Group to map volume access to Default is no group
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group to map volume access to Default is no group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1ThanosRulerSpecQuobyte readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults
   * to false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecQuobyte registry(String registry) {

    this.registry = registry;
    return this;
  }

  /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as
   * host:port pair (multiple entries are separated with commas) which acts as the central registry
   * for volumes
   *
   * @return registry
   */
  @ApiModelProperty(
      required = true,
      value =
          "Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public V1ThanosRulerSpecQuobyte tenant(String tenant) {

    this.tenant = tenant;
    return this;
  }

  /**
   * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte
   * volumes, value is set by the plugin
   *
   * @return tenant
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public V1ThanosRulerSpecQuobyte user(String user) {

    this.user = user;
    return this;
  }

  /**
   * User to map volume access to Defaults to serivceaccount user
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User to map volume access to Defaults to serivceaccount user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public V1ThanosRulerSpecQuobyte volume(String volume) {

    this.volume = volume;
    return this;
  }

  /**
   * Volume is a string that references an already created Quobyte volume by name.
   *
   * @return volume
   */
  @ApiModelProperty(
      required = true,
      value = "Volume is a string that references an already created Quobyte volume by name.")
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
    V1ThanosRulerSpecQuobyte v1ThanosRulerSpecQuobyte = (V1ThanosRulerSpecQuobyte) o;
    return Objects.equals(this.group, v1ThanosRulerSpecQuobyte.group)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecQuobyte.readOnly)
        && Objects.equals(this.registry, v1ThanosRulerSpecQuobyte.registry)
        && Objects.equals(this.tenant, v1ThanosRulerSpecQuobyte.tenant)
        && Objects.equals(this.user, v1ThanosRulerSpecQuobyte.user)
        && Objects.equals(this.volume, v1ThanosRulerSpecQuobyte.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecQuobyte {\n");
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
