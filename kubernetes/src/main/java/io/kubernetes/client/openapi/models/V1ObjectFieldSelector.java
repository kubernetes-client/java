/*
Copyright 2025 The Kubernetes Authors.
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
 * ObjectFieldSelector selects an APIVersioned field of an object.
 */
@ApiModel(description = "ObjectFieldSelector selects an APIVersioned field of an object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1ObjectFieldSelector {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;


  public V1ObjectFieldSelector apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1ObjectFieldSelector fieldPath(String fieldPath) {

    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * Path of the field to select in the specified API version.
   * @return fieldPath
  **/
  @ApiModelProperty(required = true, value = "Path of the field to select in the specified API version.")

  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectFieldSelector v1ObjectFieldSelector = (V1ObjectFieldSelector) o;
    return Objects.equals(this.apiVersion, v1ObjectFieldSelector.apiVersion) &&
        Objects.equals(this.fieldPath, v1ObjectFieldSelector.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectFieldSelector {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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
