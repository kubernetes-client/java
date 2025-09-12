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
import io.kubernetes.client.openapi.models.V1beta1BasicDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Device represents one individual hardware instance that can be selected based on its attributes. Besides the name, exactly one field must be set.
 */
@ApiModel(description = "Device represents one individual hardware instance that can be selected based on its attributes. Besides the name, exactly one field must be set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1beta1Device {
  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private V1beta1BasicDevice basic;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1beta1Device basic(V1beta1BasicDevice basic) {

    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1BasicDevice getBasic() {
    return basic;
  }


  public void setBasic(V1beta1BasicDevice basic) {
    this.basic = basic;
  }


  public V1beta1Device name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Device v1beta1Device = (V1beta1Device) o;
    return Objects.equals(this.basic, v1beta1Device.basic) &&
        Objects.equals(this.name, v1beta1Device.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Device {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
