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
 * NodeFeatures describes the set of features implemented by the CRI implementation. The features contained in the NodeFeatures should depend only on the cri implementation independent of runtime handlers.
 */
@ApiModel(description = "NodeFeatures describes the set of features implemented by the CRI implementation. The features contained in the NodeFeatures should depend only on the cri implementation independent of runtime handlers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1NodeFeatures {
  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY = "supplementalGroupsPolicy";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY)
  private Boolean supplementalGroupsPolicy;


  public V1NodeFeatures supplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {

    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return this;
  }

   /**
   * SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.
   * @return supplementalGroupsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.")

  public Boolean getSupplementalGroupsPolicy() {
    return supplementalGroupsPolicy;
  }


  public void setSupplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeFeatures v1NodeFeatures = (V1NodeFeatures) o;
    return Objects.equals(this.supplementalGroupsPolicy, v1NodeFeatures.supplementalGroupsPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplementalGroupsPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeFeatures {\n");
    sb.append("    supplementalGroupsPolicy: ").append(toIndentedString(supplementalGroupsPolicy)).append("\n");
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
