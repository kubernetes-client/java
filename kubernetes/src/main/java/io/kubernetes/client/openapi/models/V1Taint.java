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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The node this Taint is attached to has the \&quot;effect\&quot; on any pod that does not tolerate
 * the Taint.
 */
@ApiModel(
    description =
        "The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Taint {
  public static final String SERIALIZED_NAME_EFFECT = "effect";

  @SerializedName(SERIALIZED_NAME_EFFECT)
  private String effect;

  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TIME_ADDED = "timeAdded";

  @SerializedName(SERIALIZED_NAME_TIME_ADDED)
  private OffsetDateTime timeAdded;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public V1Taint effect(String effect) {

    this.effect = effect;
    return this;
  }

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
   * NoSchedule, PreferNoSchedule and NoExecute.
   *
   * @return effect
   */
  @ApiModelProperty(
      required = true,
      value =
          "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.  ")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public V1Taint key(String key) {

    this.key = key;
    return this;
  }

  /**
   * Required. The taint key to be applied to a node.
   *
   * @return key
   */
  @ApiModelProperty(required = true, value = "Required. The taint key to be applied to a node.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1Taint timeAdded(OffsetDateTime timeAdded) {

    this.timeAdded = timeAdded;
    return this;
  }

  /**
   * TimeAdded represents the time at which the taint was added. It is only written for NoExecute
   * taints.
   *
   * @return timeAdded
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.")
  public OffsetDateTime getTimeAdded() {
    return timeAdded;
  }

  public void setTimeAdded(OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
  }

  public V1Taint value(String value) {

    this.value = value;
    return this;
  }

  /**
   * The taint value corresponding to the taint key.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The taint value corresponding to the taint key.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Taint v1Taint = (V1Taint) o;
    return Objects.equals(this.effect, v1Taint.effect)
        && Objects.equals(this.key, v1Taint.key)
        && Objects.equals(this.timeAdded, v1Taint.timeAdded)
        && Objects.equals(this.value, v1Taint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, timeAdded, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Taint {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
