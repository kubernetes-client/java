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

/** NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource. */
@ApiModel(
    description =
        "NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeConfigStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";

  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private V1NodeConfigSource active;

  public static final String SERIALIZED_NAME_ASSIGNED = "assigned";

  @SerializedName(SERIALIZED_NAME_ASSIGNED)
  private V1NodeConfigSource assigned;

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_LAST_KNOWN_GOOD = "lastKnownGood";

  @SerializedName(SERIALIZED_NAME_LAST_KNOWN_GOOD)
  private V1NodeConfigSource lastKnownGood;

  public V1NodeConfigStatus active(V1NodeConfigSource active) {

    this.active = active;
    return this;
  }

  /**
   * Get active
   *
   * @return active
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigSource getActive() {
    return active;
  }

  public void setActive(V1NodeConfigSource active) {
    this.active = active;
  }

  public V1NodeConfigStatus assigned(V1NodeConfigSource assigned) {

    this.assigned = assigned;
    return this;
  }

  /**
   * Get assigned
   *
   * @return assigned
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigSource getAssigned() {
    return assigned;
  }

  public void setAssigned(V1NodeConfigSource assigned) {
    this.assigned = assigned;
  }

  public V1NodeConfigStatus error(String error) {

    this.error = error;
    return this;
  }

  /**
   * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may
   * occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record,
   * attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or
   * validate the Assigned config, etc. Errors may occur at different points while syncing config.
   * Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to
   * LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating
   * a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is
   * usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You
   * can find additional information for debugging by searching the error message in the Kubelet
   * log. Error is a human-readable description of the error state; machines can check whether or
   * not Error is empty, but should not rely on the stability of the Error text across Kubelet
   * versions.
   *
   * @return error
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1NodeConfigStatus lastKnownGood(V1NodeConfigSource lastKnownGood) {

    this.lastKnownGood = lastKnownGood;
    return this;
  }

  /**
   * Get lastKnownGood
   *
   * @return lastKnownGood
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigSource getLastKnownGood() {
    return lastKnownGood;
  }

  public void setLastKnownGood(V1NodeConfigSource lastKnownGood) {
    this.lastKnownGood = lastKnownGood;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeConfigStatus v1NodeConfigStatus = (V1NodeConfigStatus) o;
    return Objects.equals(this.active, v1NodeConfigStatus.active)
        && Objects.equals(this.assigned, v1NodeConfigStatus.assigned)
        && Objects.equals(this.error, v1NodeConfigStatus.error)
        && Objects.equals(this.lastKnownGood, v1NodeConfigStatus.lastKnownGood);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, assigned, error, lastKnownGood);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeConfigStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    lastKnownGood: ").append(toIndentedString(lastKnownGood)).append("\n");
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
