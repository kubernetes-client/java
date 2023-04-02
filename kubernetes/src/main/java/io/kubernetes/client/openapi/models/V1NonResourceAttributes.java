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
import java.util.Objects;

/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests
 * to the Authorizer interface
 */
@ApiModel(
    description =
        "NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NonResourceAttributes {
  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_VERB = "verb";

  @SerializedName(SERIALIZED_NAME_VERB)
  private String verb;

  public V1NonResourceAttributes path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path is the URL path of the request
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is the URL path of the request")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1NonResourceAttributes verb(String verb) {

    this.verb = verb;
    return this;
  }

  /**
   * Verb is the standard HTTP verb
   *
   * @return verb
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Verb is the standard HTTP verb")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NonResourceAttributes v1NonResourceAttributes = (V1NonResourceAttributes) o;
    return Objects.equals(this.path, v1NonResourceAttributes.path)
        && Objects.equals(this.verb, v1NonResourceAttributes.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, verb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NonResourceAttributes {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
