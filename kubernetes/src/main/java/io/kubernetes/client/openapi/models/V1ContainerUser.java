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
import io.kubernetes.client.openapi.models.V1LinuxContainerUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerUser represents user identity information
 */
@ApiModel(description = "ContainerUser represents user identity information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ContainerUser {
  public static final String SERIALIZED_NAME_LINUX = "linux";
  @SerializedName(SERIALIZED_NAME_LINUX)
  private V1LinuxContainerUser linux;


  public V1ContainerUser linux(V1LinuxContainerUser linux) {

    this.linux = linux;
    return this;
  }

   /**
   * Get linux
   * @return linux
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LinuxContainerUser getLinux() {
    return linux;
  }


  public void setLinux(V1LinuxContainerUser linux) {
    this.linux = linux;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerUser v1ContainerUser = (V1ContainerUser) o;
    return Objects.equals(this.linux, v1ContainerUser.linux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linux);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerUser {\n");
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
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
