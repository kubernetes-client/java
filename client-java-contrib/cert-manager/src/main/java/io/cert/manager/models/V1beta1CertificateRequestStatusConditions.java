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
package io.cert.manager.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;
import org.joda.time.DateTime;

/** CertificateRequestCondition contains condition information for a CertificateRequest. */
@ApiModel(
    description =
        "CertificateRequestCondition contains condition information for a CertificateRequest.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateRequestStatusConditions {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";

  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private DateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /** Status of the condition, one of (&#39;True&#39;, &#39;False&#39;, &#39;Unknown&#39;). */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    TRUE("True"),

    FALSE("False"),

    UNKNOWN("Unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1beta1CertificateRequestStatusConditions lastTransitionTime(DateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * LastTransitionTime is the timestamp corresponding to the last status change of this condition.
   *
   * @return lastTransitionTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "LastTransitionTime is the timestamp corresponding to the last status change of this condition.")
  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1beta1CertificateRequestStatusConditions message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Message is a human readable description of the details of the last transition, complementing
   * reason.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Message is a human readable description of the details of the last transition, complementing reason.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1beta1CertificateRequestStatusConditions reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Reason is a brief machine readable explanation for the condition&#39;s last transition.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Reason is a brief machine readable explanation for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1CertificateRequestStatusConditions status(StatusEnum status) {

    this.status = status;
    return this;
  }

  /**
   * Status of the condition, one of (&#39;True&#39;, &#39;False&#39;, &#39;Unknown&#39;).
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "Status of the condition, one of ('True', 'False', 'Unknown').")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public V1beta1CertificateRequestStatusConditions type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of the condition, known values are (&#39;Ready&#39;, &#39;InvalidRequest&#39;).
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value = "Type of the condition, known values are ('Ready', 'InvalidRequest').")
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
    V1beta1CertificateRequestStatusConditions v1beta1CertificateRequestStatusConditions =
        (V1beta1CertificateRequestStatusConditions) o;
    return Objects.equals(
            this.lastTransitionTime, v1beta1CertificateRequestStatusConditions.lastTransitionTime)
        && Objects.equals(this.message, v1beta1CertificateRequestStatusConditions.message)
        && Objects.equals(this.reason, v1beta1CertificateRequestStatusConditions.reason)
        && Objects.equals(this.status, v1beta1CertificateRequestStatusConditions.status)
        && Objects.equals(this.type, v1beta1CertificateRequestStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateRequestStatusConditions {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
