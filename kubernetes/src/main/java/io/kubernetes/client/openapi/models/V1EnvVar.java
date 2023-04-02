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

/** EnvVar represents an environment variable present in a Container. */
@ApiModel(description = "EnvVar represents an environment variable present in a Container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1EnvVar {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";

  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private V1EnvVarSource valueFrom;

  public V1EnvVar name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value = "Name of the environment variable. Must be a C_IDENTIFIER.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EnvVar value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previously defined environment variables
   * in the container and any service environment variables. If a variable cannot be resolved, the
   * reference in the input string will be unchanged. Double $$ are reduced to a single $, which
   * allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the
   * string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless
   * of whether the variable exists or not. Defaults to \&quot;\&quot;.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public V1EnvVar valueFrom(V1EnvVarSource valueFrom) {

    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * Get valueFrom
   *
   * @return valueFrom
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EnvVarSource getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(V1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EnvVar v1EnvVar = (V1EnvVar) o;
    return Objects.equals(this.name, v1EnvVar.name)
        && Objects.equals(this.value, v1EnvVar.value)
        && Objects.equals(this.valueFrom, v1EnvVar.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvVar {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
