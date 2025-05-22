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
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationConfiguration;
import io.kubernetes.client.openapi.models.V1alpha3DeviceRequestAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceAllocationResult is the result of allocating devices.
 */
@ApiModel(description = "DeviceAllocationResult is the result of allocating devices.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T21:20:49.874193Z[Etc/UTC]")
public class V1alpha3DeviceAllocationResult {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<V1alpha3DeviceAllocationConfiguration> config = null;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<V1alpha3DeviceRequestAllocationResult> results = null;


  public V1alpha3DeviceAllocationResult config(List<V1alpha3DeviceAllocationConfiguration> config) {

    this.config = config;
    return this;
  }

  public V1alpha3DeviceAllocationResult addConfigItem(V1alpha3DeviceAllocationConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.")

  public List<V1alpha3DeviceAllocationConfiguration> getConfig() {
    return config;
  }


  public void setConfig(List<V1alpha3DeviceAllocationConfiguration> config) {
    this.config = config;
  }


  public V1alpha3DeviceAllocationResult results(List<V1alpha3DeviceRequestAllocationResult> results) {

    this.results = results;
    return this;
  }

  public V1alpha3DeviceAllocationResult addResultsItem(V1alpha3DeviceRequestAllocationResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Results lists all allocated devices.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Results lists all allocated devices.")

  public List<V1alpha3DeviceRequestAllocationResult> getResults() {
    return results;
  }


  public void setResults(List<V1alpha3DeviceRequestAllocationResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceAllocationResult v1alpha3DeviceAllocationResult = (V1alpha3DeviceAllocationResult) o;
    return Objects.equals(this.config, v1alpha3DeviceAllocationResult.config) &&
        Objects.equals(this.results, v1alpha3DeviceAllocationResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceAllocationResult {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
