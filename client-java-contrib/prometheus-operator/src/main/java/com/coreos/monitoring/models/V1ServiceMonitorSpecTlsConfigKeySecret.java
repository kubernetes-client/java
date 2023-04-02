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

/** Secret containing the client key file for the targets. */
@ApiModel(description = "Secret containing the client key file for the targets.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecTlsConfigKeySecret {
  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";

  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public V1ServiceMonitorSpecTlsConfigKeySecret key(String key) {

    this.key = key;
    return this;
  }

  /**
   * The key of the secret to select from. Must be a valid secret key.
   *
   * @return key
   */
  @ApiModelProperty(
      required = true,
      value = "The key of the secret to select from.  Must be a valid secret key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ServiceMonitorSpecTlsConfigKeySecret name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other
   * useful fields. apiVersion, kind, uid?
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ServiceMonitorSpecTlsConfigKeySecret optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

  /**
   * Specify whether the Secret or its key must be defined
   *
   * @return optional
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the Secret or its key must be defined")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceMonitorSpecTlsConfigKeySecret v1ServiceMonitorSpecTlsConfigKeySecret =
        (V1ServiceMonitorSpecTlsConfigKeySecret) o;
    return Objects.equals(this.key, v1ServiceMonitorSpecTlsConfigKeySecret.key)
        && Objects.equals(this.name, v1ServiceMonitorSpecTlsConfigKeySecret.name)
        && Objects.equals(this.optional, v1ServiceMonitorSpecTlsConfigKeySecret.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecTlsConfigKeySecret {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
