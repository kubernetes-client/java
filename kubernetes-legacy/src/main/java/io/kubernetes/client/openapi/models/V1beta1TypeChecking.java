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
import io.kubernetes.client.openapi.models.V1beta1ExpressionWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TypeChecking contains results of type checking the expressions in the ValidatingAdmissionPolicy
 */
@ApiModel(description = "TypeChecking contains results of type checking the expressions in the ValidatingAdmissionPolicy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta1TypeChecking {
  public static final String SERIALIZED_NAME_EXPRESSION_WARNINGS = "expressionWarnings";
  @SerializedName(SERIALIZED_NAME_EXPRESSION_WARNINGS)
  private List<V1beta1ExpressionWarning> expressionWarnings = null;


  public V1beta1TypeChecking expressionWarnings(List<V1beta1ExpressionWarning> expressionWarnings) {

    this.expressionWarnings = expressionWarnings;
    return this;
  }

  public V1beta1TypeChecking addExpressionWarningsItem(V1beta1ExpressionWarning expressionWarningsItem) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList<>();
    }
    this.expressionWarnings.add(expressionWarningsItem);
    return this;
  }

   /**
   * The type checking warnings for each expression.
   * @return expressionWarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type checking warnings for each expression.")

  public List<V1beta1ExpressionWarning> getExpressionWarnings() {
    return expressionWarnings;
  }


  public void setExpressionWarnings(List<V1beta1ExpressionWarning> expressionWarnings) {
    this.expressionWarnings = expressionWarnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TypeChecking v1beta1TypeChecking = (V1beta1TypeChecking) o;
    return Objects.equals(this.expressionWarnings, v1beta1TypeChecking.expressionWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionWarnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TypeChecking {\n");
    sb.append("    expressionWarnings: ").append(toIndentedString(expressionWarnings)).append("\n");
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
