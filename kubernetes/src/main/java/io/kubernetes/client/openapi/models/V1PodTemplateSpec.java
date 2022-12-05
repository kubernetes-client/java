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

/** PodTemplateSpec describes the data a pod should have when created from a template */
@ApiModel(
    description =
        "PodTemplateSpec describes the data a pod should have when created from a template")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodTemplateSpec {
  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";

  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1PodSpec spec;

  public V1PodTemplateSpec metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1PodTemplateSpec spec(V1PodSpec spec) {

    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   *
   * @return spec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodSpec getSpec() {
    return spec;
  }

  public void setSpec(V1PodSpec spec) {
    this.spec = spec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodTemplateSpec v1PodTemplateSpec = (V1PodTemplateSpec) o;
    return Objects.equals(this.metadata, v1PodTemplateSpec.metadata)
        && Objects.equals(this.spec, v1PodTemplateSpec.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodTemplateSpec {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
