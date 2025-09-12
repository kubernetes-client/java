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
import io.kubernetes.client.openapi.models.V1beta1ParentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IPAddressSpec describe the attributes in an IP Address.
 */
@ApiModel(description = "IPAddressSpec describe the attributes in an IP Address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1IPAddressSpec {
  public static final String SERIALIZED_NAME_PARENT_REF = "parentRef";
  @SerializedName(SERIALIZED_NAME_PARENT_REF)
  private V1beta1ParentReference parentRef;


  public V1beta1IPAddressSpec parentRef(V1beta1ParentReference parentRef) {

    this.parentRef = parentRef;
    return this;
  }

   /**
   * Get parentRef
   * @return parentRef
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1ParentReference getParentRef() {
    return parentRef;
  }


  public void setParentRef(V1beta1ParentReference parentRef) {
    this.parentRef = parentRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IPAddressSpec v1beta1IPAddressSpec = (V1beta1IPAddressSpec) o;
    return Objects.equals(this.parentRef, v1beta1IPAddressSpec.parentRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IPAddressSpec {\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
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
