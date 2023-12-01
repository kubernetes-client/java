/*
Copyright 2023 The Kubernetes Authors.
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
 * ContainerResizePolicy represents resource resize policy for the container.
 */
@ApiModel(description = "ContainerResizePolicy represents resource resize policy for the container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1ContainerResizePolicy {
  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;


  public V1ContainerResizePolicy resourceName(String resourceName) {

    this.resourceName = resourceName;
    return this;
  }

   /**
   * Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
   * @return resourceName
  **/
  @ApiModelProperty(required = true, value = "Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.")

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public V1ContainerResizePolicy restartPolicy(String restartPolicy) {

    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
   * @return restartPolicy
  **/
  @ApiModelProperty(required = true, value = "Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.")

  public String getRestartPolicy() {
    return restartPolicy;
  }


  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerResizePolicy v1ContainerResizePolicy = (V1ContainerResizePolicy) o;
    return Objects.equals(this.resourceName, v1ContainerResizePolicy.resourceName) &&
        Objects.equals(this.restartPolicy, v1ContainerResizePolicy.restartPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, restartPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerResizePolicy {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
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
