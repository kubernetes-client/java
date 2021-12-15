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
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1Taint {
  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
   * NoSchedule, PreferNoSchedule and NoExecute. Possible enum values: -
   * &#x60;\&quot;NoExecute\&quot;&#x60; Evict any already-running pods that do not tolerate the
   * taint. Currently enforced by NodeController. - &#x60;\&quot;NoSchedule\&quot;&#x60; Do not
   * allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods
   * submitted to Kubelet without going through the scheduler to start, and allow all
   * already-running pods to continue running. Enforced by the scheduler. -
   * &#x60;\&quot;PreferNoSchedule\&quot;&#x60; Like TaintEffectNoSchedule, but the scheduler tries
   * not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto
   * the node entirely. Enforced by the scheduler.
   */
  @JsonAdapter(EffectEnum.Adapter.class)
  public enum EffectEnum {
    NOEXECUTE("NoExecute"),

    NOSCHEDULE("NoSchedule"),

    PREFERNOSCHEDULE("PreferNoSchedule");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectEnum fromValue(String value) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EffectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFECT = "effect";

  @SerializedName(SERIALIZED_NAME_EFFECT)
  private EffectEnum effect;

  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TIME_ADDED = "timeAdded";

  @SerializedName(SERIALIZED_NAME_TIME_ADDED)
  private OffsetDateTime timeAdded;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public V1Taint effect(EffectEnum effect) {

    this.effect = effect;
    return this;
  }

  /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
   * NoSchedule, PreferNoSchedule and NoExecute. Possible enum values: -
   * &#x60;\&quot;NoExecute\&quot;&#x60; Evict any already-running pods that do not tolerate the
   * taint. Currently enforced by NodeController. - &#x60;\&quot;NoSchedule\&quot;&#x60; Do not
   * allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods
   * submitted to Kubelet without going through the scheduler to start, and allow all
   * already-running pods to continue running. Enforced by the scheduler. -
   * &#x60;\&quot;PreferNoSchedule\&quot;&#x60; Like TaintEffectNoSchedule, but the scheduler tries
   * not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto
   * the node entirely. Enforced by the scheduler.
   *
   * @return effect
   */
  @ApiModelProperty(
      required = true,
      value =
          "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.  Possible enum values:  - `\"NoExecute\"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.  - `\"NoSchedule\"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.  - `\"PreferNoSchedule\"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.")
  public EffectEnum getEffect() {
    return effect;
  }

  public void setEffect(EffectEnum effect) {
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
