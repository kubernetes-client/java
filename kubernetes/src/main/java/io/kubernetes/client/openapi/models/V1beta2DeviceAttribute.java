/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceAttribute must have exactly one field set.
 */
@ApiModel(description = "DeviceAttribute must have exactly one field set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta2DeviceAttribute {
  public static final String SERIALIZED_NAME_BOOL = "bool";
  @SerializedName(SERIALIZED_NAME_BOOL)
  private Boolean bool;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  private Long _int;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public V1beta2DeviceAttribute bool(Boolean bool) {

    this.bool = bool;
    return this;
  }

   /**
   * BoolValue is a true/false value.
   * @return bool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BoolValue is a true/false value.")

  public Boolean getBool() {
    return bool;
  }


  public void setBool(Boolean bool) {
    this.bool = bool;
  }


  public V1beta2DeviceAttribute _int(Long _int) {

    this._int = _int;
    return this;
  }

   /**
   * IntValue is a number.
   * @return _int
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IntValue is a number.")

  public Long getInt() {
    return _int;
  }


  public void setInt(Long _int) {
    this._int = _int;
  }


  public V1beta2DeviceAttribute string(String string) {

    this.string = string;
    return this;
  }

   /**
   * StringValue is a string. Must not be longer than 64 characters.
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StringValue is a string. Must not be longer than 64 characters.")

  public String getString() {
    return string;
  }


  public void setString(String string) {
    this.string = string;
  }


  public V1beta2DeviceAttribute version(String version) {

    this.version = version;
    return this;
  }

   /**
   * VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceAttribute v1beta2DeviceAttribute = (V1beta2DeviceAttribute) o;
    return Objects.equals(this.bool, v1beta2DeviceAttribute.bool) &&
        Objects.equals(this._int, v1beta2DeviceAttribute._int) &&
        Objects.equals(this.string, v1beta2DeviceAttribute.string) &&
        Objects.equals(this.version, v1beta2DeviceAttribute.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool, _int, string, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceAttribute {\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
