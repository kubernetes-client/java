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
 * A label selector requirement is a selector that contains values, a key, and an operator that
 * relates the key and values.
 */
@ApiModel(
    description =
        "A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecSelectorMatchExpressions {
  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";

  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public V1ServiceMonitorSpecSelectorMatchExpressions key(String key) {

    this.key = key;
    return this;
  }

  /**
   * key is the label key that the selector applies to.
   *
   * @return key
   */
  @ApiModelProperty(required = true, value = "key is the label key that the selector applies to.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ServiceMonitorSpecSelectorMatchExpressions operator(String operator) {

    this.operator = operator;
    return this;
  }

  /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn,
   * Exists and DoesNotExist.
   *
   * @return operator
   */
  @ApiModelProperty(
      required = true,
      value =
          "operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1ServiceMonitorSpecSelectorMatchExpressions values(List<String> values) {

    this.values = values;
    return this;
  }

  public V1ServiceMonitorSpecSelectorMatchExpressions addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be
   * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This
   * array is replaced during a strategic merge patch.
   *
   * @return values
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
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
    V1ServiceMonitorSpecSelectorMatchExpressions v1ServiceMonitorSpecSelectorMatchExpressions =
        (V1ServiceMonitorSpecSelectorMatchExpressions) o;
    return Objects.equals(this.key, v1ServiceMonitorSpecSelectorMatchExpressions.key)
        && Objects.equals(this.operator, v1ServiceMonitorSpecSelectorMatchExpressions.operator)
        && Objects.equals(this.values, v1ServiceMonitorSpecSelectorMatchExpressions.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecSelectorMatchExpressions {\n");
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
