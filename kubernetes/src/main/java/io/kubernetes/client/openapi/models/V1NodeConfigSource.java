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
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
 * metadata) must be non-nil. This API is deprecated since 1.22
 */
@ApiModel(
    description =
        "NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeConfigSource {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ConfigMapNodeConfigSource configMap;

  public V1NodeConfigSource configMap(V1ConfigMapNodeConfigSource configMap) {

    this.configMap = configMap;
    return this;
  }

  /**
   * Get configMap
   *
   * @return configMap
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ConfigMapNodeConfigSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeConfigSource v1NodeConfigSource = (V1NodeConfigSource) o;
    return Objects.equals(this.configMap, v1NodeConfigSource.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeConfigSource {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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
