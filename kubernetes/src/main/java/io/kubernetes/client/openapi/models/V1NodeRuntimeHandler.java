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
import io.kubernetes.client.openapi.models.V1NodeRuntimeHandlerFeatures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NodeRuntimeHandler is a set of runtime handler information.
 */
@ApiModel(description = "NodeRuntimeHandler is a set of runtime handler information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1NodeRuntimeHandler {
  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private V1NodeRuntimeHandlerFeatures features;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1NodeRuntimeHandler features(V1NodeRuntimeHandlerFeatures features) {

    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NodeRuntimeHandlerFeatures getFeatures() {
    return features;
  }


  public void setFeatures(V1NodeRuntimeHandlerFeatures features) {
    this.features = features;
  }


  public V1NodeRuntimeHandler name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Runtime handler name. Empty for the default runtime handler.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Runtime handler name. Empty for the default runtime handler.")

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
    V1NodeRuntimeHandler v1NodeRuntimeHandler = (V1NodeRuntimeHandler) o;
    return Objects.equals(this.features, v1NodeRuntimeHandler.features) &&
        Objects.equals(this.name, v1NodeRuntimeHandler.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeRuntimeHandler {\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
