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

/** ContainerStateWaiting is a waiting state of a container. */
@ApiModel(description = "ContainerStateWaiting is a waiting state of a container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ContainerStateWaiting {
  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public V1ContainerStateWaiting message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Message regarding why the container is not yet running.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message regarding why the container is not yet running.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ContainerStateWaiting reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * (brief) reason the container is not yet running.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(brief) reason the container is not yet running.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateWaiting v1ContainerStateWaiting = (V1ContainerStateWaiting) o;
    return Objects.equals(this.message, v1ContainerStateWaiting.message)
        && Objects.equals(this.reason, v1ContainerStateWaiting.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateWaiting {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
