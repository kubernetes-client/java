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
import io.kubernetes.client.openapi.models.V1alpha3CELDeviceSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceSelector must have exactly one field set.
 */
@ApiModel(description = "DeviceSelector must have exactly one field set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1alpha3DeviceSelector {
  public static final String SERIALIZED_NAME_CEL = "cel";
  @SerializedName(SERIALIZED_NAME_CEL)
  private V1alpha3CELDeviceSelector cel;


  public V1alpha3DeviceSelector cel(V1alpha3CELDeviceSelector cel) {

    this.cel = cel;
    return this;
  }

   /**
   * Get cel
   * @return cel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3CELDeviceSelector getCel() {
    return cel;
  }


  public void setCel(V1alpha3CELDeviceSelector cel) {
    this.cel = cel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceSelector v1alpha3DeviceSelector = (V1alpha3DeviceSelector) o;
    return Objects.equals(this.cel, v1alpha3DeviceSelector.cel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceSelector {\n");
    sb.append("    cel: ").append(toIndentedString(cel)).append("\n");
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
