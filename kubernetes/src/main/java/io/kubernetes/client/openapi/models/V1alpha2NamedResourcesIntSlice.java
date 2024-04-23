/*
Copyright 2024 The Kubernetes Authors.
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
import java.util.ArrayList;
import java.util.List;

/**
 * NamedResourcesIntSlice contains a slice of 64-bit integers.
 */
@ApiModel(description = "NamedResourcesIntSlice contains a slice of 64-bit integers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2NamedResourcesIntSlice {
  public static final String SERIALIZED_NAME_INTS = "ints";
  @SerializedName(SERIALIZED_NAME_INTS)
  private List<Long> ints = new ArrayList<>();


  public V1alpha2NamedResourcesIntSlice ints(List<Long> ints) {

    this.ints = ints;
    return this;
  }

  public V1alpha2NamedResourcesIntSlice addIntsItem(Long intsItem) {
    this.ints.add(intsItem);
    return this;
  }

   /**
   * Ints is the slice of 64-bit integers.
   * @return ints
  **/
  @ApiModelProperty(required = true, value = "Ints is the slice of 64-bit integers.")

  public List<Long> getInts() {
    return ints;
  }


  public void setInts(List<Long> ints) {
    this.ints = ints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesIntSlice v1alpha2NamedResourcesIntSlice = (V1alpha2NamedResourcesIntSlice) o;
    return Objects.equals(this.ints, v1alpha2NamedResourcesIntSlice.ints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesIntSlice {\n");
    sb.append("    ints: ").append(toIndentedString(ints)).append("\n");
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
