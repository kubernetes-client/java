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
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 */
@ApiModel(
    description =
        "VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1VolumeNodeAffinity {
  public static final String SERIALIZED_NAME_REQUIRED = "required";

  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private V1NodeSelector required;

  public V1VolumeNodeAffinity required(V1NodeSelector required) {

    this.required = required;
    return this;
  }

  /**
   * Get required
   *
   * @return required
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeSelector getRequired() {
    return required;
  }

  public void setRequired(V1NodeSelector required) {
    this.required = required;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeNodeAffinity v1VolumeNodeAffinity = (V1VolumeNodeAffinity) o;
    return Objects.equals(this.required, v1VolumeNodeAffinity.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeNodeAffinity {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
