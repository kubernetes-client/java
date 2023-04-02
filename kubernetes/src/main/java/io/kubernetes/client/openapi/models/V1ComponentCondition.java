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

/** Information about the condition of a component. */
@ApiModel(description = "Information about the condition of a component.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ComponentCondition {
  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1ComponentCondition error(String error) {

    this.error = error;
    return this;
  }

  /**
   * Condition error code for a component. For example, a health check error code.
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Condition error code for a component. For example, a health check error code.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1ComponentCondition message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Message about the condition for a component. For example, information about a health check.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Message about the condition for a component. For example, information about a health check.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ComponentCondition status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Status of the condition for a component. Valid values for \&quot;Healthy\&quot;:
   * \&quot;True\&quot;, \&quot;False\&quot;, or \&quot;Unknown\&quot;.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value =
          "Status of the condition for a component. Valid values for \"Healthy\": \"True\", \"False\", or \"Unknown\".")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1ComponentCondition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of condition for a component. Valid value: \&quot;Healthy\&quot;
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value = "Type of condition for a component. Valid value: \"Healthy\"")
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
    V1ComponentCondition v1ComponentCondition = (V1ComponentCondition) o;
    return Objects.equals(this.error, v1ComponentCondition.error)
        && Objects.equals(this.message, v1ComponentCondition.message)
        && Objects.equals(this.status, v1ComponentCondition.status)
        && Objects.equals(this.type, v1ComponentCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ComponentCondition {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
