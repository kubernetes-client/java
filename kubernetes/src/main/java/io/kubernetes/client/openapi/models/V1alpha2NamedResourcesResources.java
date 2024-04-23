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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NamedResourcesResources is used in ResourceModel.
 */
@ApiModel(description = "NamedResourcesResources is used in ResourceModel.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2NamedResourcesResources {
  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<V1alpha2NamedResourcesInstance> instances = new ArrayList<>();


  public V1alpha2NamedResourcesResources instances(List<V1alpha2NamedResourcesInstance> instances) {

    this.instances = instances;
    return this;
  }

  public V1alpha2NamedResourcesResources addInstancesItem(V1alpha2NamedResourcesInstance instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * The list of all individual resources instances currently available.
   * @return instances
  **/
  @ApiModelProperty(required = true, value = "The list of all individual resources instances currently available.")

  public List<V1alpha2NamedResourcesInstance> getInstances() {
    return instances;
  }


  public void setInstances(List<V1alpha2NamedResourcesInstance> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesResources v1alpha2NamedResourcesResources = (V1alpha2NamedResourcesResources) o;
    return Objects.equals(this.instances, v1alpha2NamedResourcesResources.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesResources {\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
