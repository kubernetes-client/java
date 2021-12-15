/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** PersistentVolumeStatus is the current status of a persistent volume. */
@ApiModel(description = "PersistentVolumeStatus is the current status of a persistent volume.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1PersistentVolumeStatus {
  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  /**
   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase Possible enum values: -
   * &#x60;\&quot;Available\&quot;&#x60; used for PersistentVolumes that are not yet bound Available
   * volumes are held by the binder and matched to PersistentVolumeClaims -
   * &#x60;\&quot;Bound\&quot;&#x60; used for PersistentVolumes that are bound -
   * &#x60;\&quot;Failed\&quot;&#x60; used for PersistentVolumes that failed to be correctly
   * recycled or deleted after being released from a claim - &#x60;\&quot;Pending\&quot;&#x60; used
   * for PersistentVolumes that are not available - &#x60;\&quot;Released\&quot;&#x60; used for
   * PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be
   * recycled before becoming available again this phase is used by the persistent volume claim
   * binder to signal to another process to reclaim the resource
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    AVAILABLE("Available"),

    BOUND("Bound"),

    FAILED("Failed"),

    PENDING("Pending"),

    RELEASED("Released");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHASE = "phase";

  @SerializedName(SERIALIZED_NAME_PHASE)
  private PhaseEnum phase;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public V1PersistentVolumeStatus message(String message) {

    this.message = message;
    return this;
  }

  /**
   * A human-readable message indicating details about why the volume is in this state.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "A human-readable message indicating details about why the volume is in this state.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1PersistentVolumeStatus phase(PhaseEnum phase) {

    this.phase = phase;
    return this;
  }

  /**
   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase Possible enum values: -
   * &#x60;\&quot;Available\&quot;&#x60; used for PersistentVolumes that are not yet bound Available
   * volumes are held by the binder and matched to PersistentVolumeClaims -
   * &#x60;\&quot;Bound\&quot;&#x60; used for PersistentVolumes that are bound -
   * &#x60;\&quot;Failed\&quot;&#x60; used for PersistentVolumes that failed to be correctly
   * recycled or deleted after being released from a claim - &#x60;\&quot;Pending\&quot;&#x60; used
   * for PersistentVolumes that are not available - &#x60;\&quot;Released\&quot;&#x60; used for
   * PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be
   * recycled before becoming available again this phase is used by the persistent volume claim
   * binder to signal to another process to reclaim the resource
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase  Possible enum values:  - `\"Available\"` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims  - `\"Bound\"` used for PersistentVolumes that are bound  - `\"Failed\"` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim  - `\"Pending\"` used for PersistentVolumes that are not available  - `\"Released\"` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource")
  public PhaseEnum getPhase() {
    return phase;
  }

  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }

  public V1PersistentVolumeStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing
   * and tidy display in the CLI.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.")
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
    return Objects.equals(this.message, v1PersistentVolumeStatus.message)
        && Objects.equals(this.phase, v1PersistentVolumeStatus.phase)
        && Objects.equals(this.reason, v1PersistentVolumeStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, phase, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeStatus {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
