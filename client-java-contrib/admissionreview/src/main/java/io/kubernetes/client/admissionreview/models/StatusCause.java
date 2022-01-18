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
package io.kubernetes.client.admissionreview.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple
 * errors are encountered.
 */
@ApiModel(
    description =
        "StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class StatusCause {
  public static final String SERIALIZED_NAME_FIELD = "field";

  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public StatusCause field(String field) {

    this.field = field;
    return this;
  }

  /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May
   * include dot and postfix notation for nested attributes. Arrays are zero-indexed. Fields may
   * appear more than once in an array of causes due to fields having multiple errors. Optional.
   * Examples: \&quot;name\&quot; - the field \&quot;name\&quot; on the current resource
   * \&quot;items[0].name\&quot; - the field \&quot;name\&quot; on the first array entry in
   * \&quot;items\&quot;
   *
   * @return field
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public StatusCause message(String message) {

    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the cause of the error. This field may be presented as-is to a
   * reader.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A human-readable description of the cause of the error.  This field may be presented as-is to a reader.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StatusCause reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * A machine-readable description of the cause of the error. If this value is empty there is no
   * information available.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A machine-readable description of the cause of the error. If this value is empty there is no information available.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCause statusCause = (StatusCause) o;
    return Objects.equals(this.field, statusCause.field)
        && Objects.equals(this.message, statusCause.message)
        && Objects.equals(this.reason, statusCause.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
