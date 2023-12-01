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

/**
 * ExpressionWarning is a warning information that targets a specific expression.
 */
@ApiModel(description = "ExpressionWarning is a warning information that targets a specific expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta1ExpressionWarning {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private String fieldRef;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private String warning;


  public V1beta1ExpressionWarning fieldRef(String fieldRef) {

    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * The path to the field that refers the expression. For example, the reference to the expression of the first item of validations is \&quot;spec.validations[0].expression\&quot;
   * @return fieldRef
  **/
  @ApiModelProperty(required = true, value = "The path to the field that refers the expression. For example, the reference to the expression of the first item of validations is \"spec.validations[0].expression\"")

  public String getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(String fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1beta1ExpressionWarning warning(String warning) {

    this.warning = warning;
    return this;
  }

   /**
   * The content of type checking information in a human-readable form. Each line of the warning contains the type that the expression is checked against, followed by the type check error from the compiler.
   * @return warning
  **/
  @ApiModelProperty(required = true, value = "The content of type checking information in a human-readable form. Each line of the warning contains the type that the expression is checked against, followed by the type check error from the compiler.")

  public String getWarning() {
    return warning;
  }


  public void setWarning(String warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ExpressionWarning v1beta1ExpressionWarning = (V1beta1ExpressionWarning) o;
    return Objects.equals(this.fieldRef, v1beta1ExpressionWarning.fieldRef) &&
        Objects.equals(this.warning, v1beta1ExpressionWarning.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ExpressionWarning {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
