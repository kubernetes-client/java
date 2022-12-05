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
 * SecretEnvSource selects a Secret to populate the environment variables with. The contents of the
 * target Secret&#39;s Data field will represent the key-value pairs as environment variables.
 */
@ApiModel(
    description =
        "SecretEnvSource selects a Secret to populate the environment variables with.  The contents of the target Secret's Data field will represent the key-value pairs as environment variables.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SecretEnvSource {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";

  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public V1SecretEnvSource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1SecretEnvSource optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

  /**
   * Specify whether the Secret must be defined
   *
   * @return optional
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the Secret must be defined")
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
    V1SecretEnvSource v1SecretEnvSource = (V1SecretEnvSource) o;
    return Objects.equals(this.name, v1SecretEnvSource.name)
        && Objects.equals(this.optional, v1SecretEnvSource.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecretEnvSource {\n");
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
