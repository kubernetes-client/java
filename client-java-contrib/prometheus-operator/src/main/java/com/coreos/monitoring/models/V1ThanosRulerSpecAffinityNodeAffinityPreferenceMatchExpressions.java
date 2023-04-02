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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A node selector requirement is a selector that contains values, a key, and an operator that
 * relates the key and values.
 */
@ApiModel(
    description =
        "A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions {
  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";

  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions key(String key) {

    this.key = key;
    return this;
  }

  /**
   * The label key that the selector applies to.
   *
   * @return key
   */
  @ApiModelProperty(required = true, value = "The label key that the selector applies to.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions operator(String operator) {

    this.operator = operator;
    return this;
  }

  /**
   * Represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists,
   * DoesNotExist. Gt, and Lt.
   *
   * @return operator
   */
  @ApiModelProperty(
      required = true,
      value =
          "Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions values(
      List<String> values) {

    this.values = values;
    return this;
  }

  public V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions addValuesItem(
      String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty.
   * If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is
   * Gt or Lt, the values array must have a single element, which will be interpreted as an integer.
   * This array is replaced during a strategic merge patch.
   *
   * @return values
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions
        v1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions =
            (V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions) o;
    return Objects.equals(
            this.key, v1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions.key)
        && Objects.equals(
            this.operator, v1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions.operator)
        && Objects.equals(
            this.values, v1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecAffinityNodeAffinityPreferenceMatchExpressions {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
