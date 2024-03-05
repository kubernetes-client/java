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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple
 * &lt;key,value,effect&gt; using the matching operator &lt;operator&gt;.
 */
@ApiModel(
    description =
        "The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecTolerations {
  public static final String SERIALIZED_NAME_EFFECT = "effect";

  @SerializedName(SERIALIZED_NAME_EFFECT)
  private String effect;

  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_TOLERATION_SECONDS = "tolerationSeconds";

  @SerializedName(SERIALIZED_NAME_TOLERATION_SECONDS)
  private Long tolerationSeconds;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public V1ThanosRulerSpecTolerations effect(String effect) {

    this.effect = effect;
    return this;
  }

  /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When
   * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
   *
   * @return effect
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public V1ThanosRulerSpecTolerations key(String key) {

    this.key = key;
    return this;
  }

  /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the
   * key is empty, operator must be Exists; this combination means to match all values and all keys.
   *
   * @return key
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ThanosRulerSpecTolerations operator(String operator) {

    this.operator = operator;
    return this;
  }

  /**
   * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and
   * Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can
   * tolerate all taints of a particular category.
   *
   * @return operator
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1ThanosRulerSpecTolerations tolerationSeconds(Long tolerationSeconds) {

    this.tolerationSeconds = tolerationSeconds;
    return this;
  }

  /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect
   * NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set,
   * which means tolerate the taint forever (do not evict). Zero and negative values will be treated
   * as 0 (evict immediately) by the system.
   *
   * @return tolerationSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.")
  public Long getTolerationSeconds() {
    return tolerationSeconds;
  }

  public void setTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }

  public V1ThanosRulerSpecTolerations value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value should
   * be empty, otherwise just a regular string.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.")
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
    V1ThanosRulerSpecTolerations v1ThanosRulerSpecTolerations = (V1ThanosRulerSpecTolerations) o;
    return Objects.equals(this.effect, v1ThanosRulerSpecTolerations.effect)
        && Objects.equals(this.key, v1ThanosRulerSpecTolerations.key)
        && Objects.equals(this.operator, v1ThanosRulerSpecTolerations.operator)
        && Objects.equals(this.tolerationSeconds, v1ThanosRulerSpecTolerations.tolerationSeconds)
        && Objects.equals(this.value, v1ThanosRulerSpecTolerations.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, operator, tolerationSeconds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecTolerations {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
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
