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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceFilter is a filter for resources from one particular driver.
 */
@ApiModel(description = "ResourceFilter is a filter for resources from one particular driver.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2ResourceFilter {
  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_NAMED_RESOURCES = "namedResources";
  @SerializedName(SERIALIZED_NAME_NAMED_RESOURCES)
  private V1alpha2NamedResourcesFilter namedResources;


  public V1alpha2ResourceFilter driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   * @return driverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DriverName is the name used by the DRA driver kubelet plugin.")

  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceFilter namedResources(V1alpha2NamedResourcesFilter namedResources) {

    this.namedResources = namedResources;
    return this;
  }

   /**
   * Get namedResources
   * @return namedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2NamedResourcesFilter getNamedResources() {
    return namedResources;
  }


  public void setNamedResources(V1alpha2NamedResourcesFilter namedResources) {
    this.namedResources = namedResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceFilter v1alpha2ResourceFilter = (V1alpha2ResourceFilter) o;
    return Objects.equals(this.driverName, v1alpha2ResourceFilter.driverName) &&
        Objects.equals(this.namedResources, v1alpha2ResourceFilter.namedResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverName, namedResources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceFilter {\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
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
