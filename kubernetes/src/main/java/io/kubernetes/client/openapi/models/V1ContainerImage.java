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

/** Describe a container image */
@ApiModel(description = "Describe a container image")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ContainerImage {
  public static final String SERIALIZED_NAME_NAMES = "names";

  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = null;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "sizeBytes";

  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Long sizeBytes;

  public V1ContainerImage names(List<String> names) {

    this.names = names;
    return this;
  }

  public V1ContainerImage addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Names by which this image is known. e.g. [\&quot;kubernetes.example/hyperkube:v1.0.7\&quot;,
   * \&quot;cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7\&quot;]
   *
   * @return names
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Names by which this image is known. e.g. [\"kubernetes.example/hyperkube:v1.0.7\", \"cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7\"]")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public V1ContainerImage sizeBytes(Long sizeBytes) {

    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The size of the image in bytes.
   *
   * @return sizeBytes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the image in bytes.")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerImage v1ContainerImage = (V1ContainerImage) o;
    return Objects.equals(this.names, v1ContainerImage.names)
        && Objects.equals(this.sizeBytes, v1ContainerImage.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, sizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerImage {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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
