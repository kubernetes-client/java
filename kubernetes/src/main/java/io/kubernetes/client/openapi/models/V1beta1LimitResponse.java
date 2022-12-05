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

/** LimitResponse defines how to handle requests that can not be executed right now. */
@ApiModel(
    description =
        "LimitResponse defines how to handle requests that can not be executed right now.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1beta1LimitResponse {
  public static final String SERIALIZED_NAME_QUEUING = "queuing";

  @SerializedName(SERIALIZED_NAME_QUEUING)
  private V1beta1QueuingConfiguration queuing;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1beta1LimitResponse queuing(V1beta1QueuingConfiguration queuing) {

    this.queuing = queuing;
    return this;
  }

  /**
   * Get queuing
   *
   * @return queuing
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1QueuingConfiguration getQueuing() {
    return queuing;
  }

  public void setQueuing(V1beta1QueuingConfiguration queuing) {
    this.queuing = queuing;
  }

  public V1beta1LimitResponse type(String type) {

    this.type = type;
    return this;
  }

  /**
   * &#x60;type&#x60; is \&quot;Queue\&quot; or \&quot;Reject\&quot;. \&quot;Queue\&quot; means that
   * requests that can not be executed upon arrival are held in a queue until they can be executed
   * or a queuing limit is reached. \&quot;Reject\&quot; means that requests that can not be
   * executed upon arrival are rejected. Required.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "`type` is \"Queue\" or \"Reject\". \"Queue\" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \"Reject\" means that requests that can not be executed upon arrival are rejected. Required.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1LimitResponse v1beta1LimitResponse = (V1beta1LimitResponse) o;
    return Objects.equals(this.queuing, v1beta1LimitResponse.queuing)
        && Objects.equals(this.type, v1beta1LimitResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuing, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1LimitResponse {\n");
    sb.append("    queuing: ").append(toIndentedString(queuing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
