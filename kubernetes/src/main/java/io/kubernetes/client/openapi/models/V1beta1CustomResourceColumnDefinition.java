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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CustomResourceColumnDefinition specifies a column for server side printing. */
@ApiModel(
    description = "CustomResourceColumnDefinition specifies a column for server side printing.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1CustomResourceColumnDefinition {
  public static final String SERIALIZED_NAME_JS_O_N_PATH = "JSONPath";

  @SerializedName(SERIALIZED_NAME_JS_O_N_PATH)
  private String jsONPath;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORMAT = "format";

  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";

  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1beta1CustomResourceColumnDefinition jsONPath(String jsONPath) {

    this.jsONPath = jsONPath;
    return this;
  }

  /**
   * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each
   * custom resource to produce the value for this column.
   *
   * @return jsONPath
   */
  @ApiModelProperty(
      required = true,
      value =
          "JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.")
  public String getJsONPath() {
    return jsONPath;
  }

  public void setJsONPath(String jsONPath) {
    this.jsONPath = jsONPath;
  }

  public V1beta1CustomResourceColumnDefinition description(String description) {

    this.description = description;
    return this;
  }

  /**
   * description is a human readable description of this column.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description is a human readable description of this column.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1beta1CustomResourceColumnDefinition format(String format) {

    this.format = format;
    return this;
  }

  /**
   * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is
   * applied to the primary identifier column to assist in clients identifying column is the
   * resource name. See
   * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
   * details.
   *
   * @return format
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public V1beta1CustomResourceColumnDefinition name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is a human readable name for the column.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "name is a human readable name for the column.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1CustomResourceColumnDefinition priority(Integer priority) {

    this.priority = priority;
    return this;
  }

  /**
   * priority is an integer defining the relative importance of this column compared to others.
   * Lower numbers are considered higher priority. Columns that may be omitted in limited space
   * scenarios should be given a priority greater than 0.
   *
   * @return priority
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public V1beta1CustomResourceColumnDefinition type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type is an OpenAPI type definition for this column. See
   * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
   * details.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceColumnDefinition v1beta1CustomResourceColumnDefinition =
        (V1beta1CustomResourceColumnDefinition) o;
    return Objects.equals(this.jsONPath, v1beta1CustomResourceColumnDefinition.jsONPath)
        && Objects.equals(this.description, v1beta1CustomResourceColumnDefinition.description)
        && Objects.equals(this.format, v1beta1CustomResourceColumnDefinition.format)
        && Objects.equals(this.name, v1beta1CustomResourceColumnDefinition.name)
        && Objects.equals(this.priority, v1beta1CustomResourceColumnDefinition.priority)
        && Objects.equals(this.type, v1beta1CustomResourceColumnDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsONPath, description, format, name, priority, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceColumnDefinition {\n");
    sb.append("    jsONPath: ").append(toIndentedString(jsONPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
