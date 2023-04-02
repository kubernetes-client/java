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

/** CustomResourceSubresources defines the status and scale subresources for CustomResources. */
@ApiModel(
    description =
        "CustomResourceSubresources defines the status and scale subresources for CustomResources.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceSubresources {
  public static final String SERIALIZED_NAME_SCALE = "scale";

  @SerializedName(SERIALIZED_NAME_SCALE)
  private V1CustomResourceSubresourceScale scale;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status;

  public V1CustomResourceSubresources scale(V1CustomResourceSubresourceScale scale) {

    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   *
   * @return scale
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CustomResourceSubresourceScale getScale() {
    return scale;
  }

  public void setScale(V1CustomResourceSubresourceScale scale) {
    this.scale = scale;
  }

  public V1CustomResourceSubresources status(Object status) {

    this.status = status;
    return this;
  }

  /**
   * status indicates the custom resource should serve a &#x60;/status&#x60; subresource. When
   * enabled: 1. requests to the custom resource primary endpoint ignore changes to the
   * &#x60;status&#x60; stanza of the object. 2. requests to the custom resource &#x60;/status&#x60;
   * subresource ignore changes to anything other than the &#x60;status&#x60; stanza of the object.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.")
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceSubresources v1CustomResourceSubresources = (V1CustomResourceSubresources) o;
    return Objects.equals(this.scale, v1CustomResourceSubresources.scale)
        && Objects.equals(this.status, v1CustomResourceSubresources.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceSubresources {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
