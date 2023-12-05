/*
Copyright 2023 The Kubernetes Authors.
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
import java.time.OffsetDateTime;

/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 */
@ApiModel(description = "PersistentVolumeStatus is the current status of a persistent volume.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1PersistentVolumeStatus {
  public static final String SERIALIZED_NAME_LAST_PHASE_TRANSITION_TIME = "lastPhaseTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_PHASE_TRANSITION_TIME)
  private OffsetDateTime lastPhaseTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public V1PersistentVolumeStatus lastPhaseTransitionTime(OffsetDateTime lastPhaseTransitionTime) {

    this.lastPhaseTransitionTime = lastPhaseTransitionTime;
    return this;
  }

   /**
   * lastPhaseTransitionTime is the time the phase transitioned from one to another and automatically resets to current time everytime a volume phase transitions. This is an alpha field and requires enabling PersistentVolumeLastPhaseTransitionTime feature.
   * @return lastPhaseTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "lastPhaseTransitionTime is the time the phase transitioned from one to another and automatically resets to current time everytime a volume phase transitions. This is an alpha field and requires enabling PersistentVolumeLastPhaseTransitionTime feature.")

  public OffsetDateTime getLastPhaseTransitionTime() {
    return lastPhaseTransitionTime;
  }


  public void setLastPhaseTransitionTime(OffsetDateTime lastPhaseTransitionTime) {
    this.lastPhaseTransitionTime = lastPhaseTransitionTime;
  }


  public V1PersistentVolumeStatus message(String message) {

    this.message = message;
    return this;
  }

   /**
   * message is a human-readable message indicating details about why the volume is in this state.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message is a human-readable message indicating details about why the volume is in this state.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1PersistentVolumeStatus phase(String phase) {

    this.phase = phase;
    return this;
  }

   /**
   * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1PersistentVolumeStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.")

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
    V1PersistentVolumeStatus v1PersistentVolumeStatus = (V1PersistentVolumeStatus) o;
    return Objects.equals(this.lastPhaseTransitionTime, v1PersistentVolumeStatus.lastPhaseTransitionTime) &&
        Objects.equals(this.message, v1PersistentVolumeStatus.message) &&
        Objects.equals(this.phase, v1PersistentVolumeStatus.phase) &&
        Objects.equals(this.reason, v1PersistentVolumeStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPhaseTransitionTime, message, phase, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeStatus {\n");
    sb.append("    lastPhaseTransitionTime: ").append(toIndentedString(lastPhaseTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
