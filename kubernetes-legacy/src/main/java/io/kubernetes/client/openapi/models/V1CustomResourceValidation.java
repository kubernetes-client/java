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
import io.kubernetes.client.openapi.models.V1JSONSchemaProps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 */
@ApiModel(description = "CustomResourceValidation is a list of validation methods for CustomResources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1CustomResourceValidation {
  public static final String SERIALIZED_NAME_OPEN_A_P_I_V3_SCHEMA = "openAPIV3Schema";
  @SerializedName(SERIALIZED_NAME_OPEN_A_P_I_V3_SCHEMA)
  private V1JSONSchemaProps openAPIV3Schema;


  public V1CustomResourceValidation openAPIV3Schema(V1JSONSchemaProps openAPIV3Schema) {

    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }

   /**
   * Get openAPIV3Schema
   * @return openAPIV3Schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }


  public void setOpenAPIV3Schema(V1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceValidation v1CustomResourceValidation = (V1CustomResourceValidation) o;
    return Objects.equals(this.openAPIV3Schema, v1CustomResourceValidation.openAPIV3Schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAPIV3Schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceValidation {\n");
    sb.append("    openAPIV3Schema: ").append(toIndentedString(openAPIV3Schema)).append("\n");
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
