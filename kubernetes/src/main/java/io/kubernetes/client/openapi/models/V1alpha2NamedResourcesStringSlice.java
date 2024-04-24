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
 * NamedResourcesStringSlice contains a slice of strings.
 */
@ApiModel(description = "NamedResourcesStringSlice contains a slice of strings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2NamedResourcesStringSlice {
  public static final String SERIALIZED_NAME_STRINGS = "strings";
  @SerializedName(SERIALIZED_NAME_STRINGS)
  private List<String> strings = new ArrayList<>();


  public V1alpha2NamedResourcesStringSlice strings(List<String> strings) {

    this.strings = strings;
    return this;
  }

  public V1alpha2NamedResourcesStringSlice addStringsItem(String stringsItem) {
    this.strings.add(stringsItem);
    return this;
  }

   /**
   * Strings is the slice of strings.
   * @return strings
  **/
  @ApiModelProperty(required = true, value = "Strings is the slice of strings.")

  public List<String> getStrings() {
    return strings;
  }


  public void setStrings(List<String> strings) {
    this.strings = strings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesStringSlice v1alpha2NamedResourcesStringSlice = (V1alpha2NamedResourcesStringSlice) o;
    return Objects.equals(this.strings, v1alpha2NamedResourcesStringSlice.strings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesStringSlice {\n");
    sb.append("    strings: ").append(toIndentedString(strings)).append("\n");
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
