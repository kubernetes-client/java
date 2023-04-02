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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an
 * operator that relates the scope name and values.
 */
@ApiModel(
    description =
        "A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ScopedResourceSelectorRequirement {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_SCOPE_NAME = "scopeName";

  @SerializedName(SERIALIZED_NAME_SCOPE_NAME)
  private String scopeName;

  public static final String SERIALIZED_NAME_VALUES = "values";

  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public V1ScopedResourceSelectorRequirement operator(String operator) {

    this.operator = operator;
    return this;
  }

  /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn,
   * Exists, DoesNotExist.
   *
   * @return operator
   */
  @ApiModelProperty(
      required = true,
      value =
          "Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.  ")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1ScopedResourceSelectorRequirement scopeName(String scopeName) {

    this.scopeName = scopeName;
    return this;
  }

  /**
   * The name of the scope that the selector applies to.
   *
   * @return scopeName
   */
  @ApiModelProperty(
      required = true,
      value = "The name of the scope that the selector applies to.  ")
  public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }

  public V1ScopedResourceSelectorRequirement values(List<String> values) {

    this.values = values;
    return this;
  }

  public V1ScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty.
   * If the operator is Exists or DoesNotExist, the values array must be empty. This array is
   * replaced during a strategic merge patch.
   *
   * @return values
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
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
    V1ScopedResourceSelectorRequirement v1ScopedResourceSelectorRequirement =
        (V1ScopedResourceSelectorRequirement) o;
    return Objects.equals(this.operator, v1ScopedResourceSelectorRequirement.operator)
        && Objects.equals(this.scopeName, v1ScopedResourceSelectorRequirement.scopeName)
        && Objects.equals(this.values, v1ScopedResourceSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, scopeName, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopedResourceSelectorRequirement {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
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
