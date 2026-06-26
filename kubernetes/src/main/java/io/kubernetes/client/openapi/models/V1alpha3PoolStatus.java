/*
Copyright 2026 The Kubernetes Authors.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PoolStatus contains status information for a single resource pool.
 */
@ApiModel(description = "PoolStatus contains status information for a single resource pool.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3PoolStatus {
  public static final String SERIALIZED_NAME_ALLOCATED_DEVICES = "allocatedDevices";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_DEVICES)
  @jakarta.annotation.Nullable
  private Integer allocatedDevices;

  public static final String SERIALIZED_NAME_AVAILABLE_DEVICES = "availableDevices";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_DEVICES)
  @jakarta.annotation.Nullable
  private Integer availableDevices;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_GENERATION = "generation";
  @SerializedName(SERIALIZED_NAME_GENERATION)
  @jakarta.annotation.Nonnull
  private Long generation;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nodeName;

  public static final String SERIALIZED_NAME_POOL_NAME = "poolName";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  @jakarta.annotation.Nonnull
  private String poolName;

  public static final String SERIALIZED_NAME_RESOURCE_SLICE_COUNT = "resourceSliceCount";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SLICE_COUNT)
  @jakarta.annotation.Nullable
  private Integer resourceSliceCount;

  public static final String SERIALIZED_NAME_TOTAL_DEVICES = "totalDevices";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEVICES)
  @jakarta.annotation.Nullable
  private Integer totalDevices;

  public static final String SERIALIZED_NAME_UNAVAILABLE_DEVICES = "unavailableDevices";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_DEVICES)
  @jakarta.annotation.Nullable
  private Integer unavailableDevices;

  public static final String SERIALIZED_NAME_VALIDATION_ERROR = "validationError";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERROR)
  @jakarta.annotation.Nullable
  private String validationError;

  public V1alpha3PoolStatus() {
  }

  public V1alpha3PoolStatus allocatedDevices(@jakarta.annotation.Nullable Integer allocatedDevices) {
    this.allocatedDevices = allocatedDevices;
    return this;
  }

  /**
   * AllocatedDevices is the number of devices currently allocated to claims. A value of 0 means no devices are allocated. May be unset when validationError is set.
   * @return allocatedDevices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllocatedDevices is the number of devices currently allocated to claims. A value of 0 means no devices are allocated. May be unset when validationError is set.")
  public Integer getAllocatedDevices() {
    return allocatedDevices;
  }

  public void setAllocatedDevices(@jakarta.annotation.Nullable Integer allocatedDevices) {
    this.allocatedDevices = allocatedDevices;
  }


  public V1alpha3PoolStatus availableDevices(@jakarta.annotation.Nullable Integer availableDevices) {
    this.availableDevices = availableDevices;
    return this;
  }

  /**
   * AvailableDevices is the number of devices available for allocation. This equals TotalDevices - AllocatedDevices - UnavailableDevices. A value of 0 means no devices are currently available. May be unset when validationError is set.
   * @return availableDevices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AvailableDevices is the number of devices available for allocation. This equals TotalDevices - AllocatedDevices - UnavailableDevices. A value of 0 means no devices are currently available. May be unset when validationError is set.")
  public Integer getAvailableDevices() {
    return availableDevices;
  }

  public void setAvailableDevices(@jakarta.annotation.Nullable Integer availableDevices) {
    this.availableDevices = availableDevices;
  }


  public V1alpha3PoolStatus driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver is the DRA driver name for this pool. Must be a DNS subdomain (e.g., \&quot;gpu.example.com\&quot;).
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver is the DRA driver name for this pool. Must be a DNS subdomain (e.g., \"gpu.example.com\").")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1alpha3PoolStatus generation(@jakarta.annotation.Nonnull Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Generation is the pool generation observed across all ResourceSlices in this pool. Only the latest generation is reported. During a generation rollout, if not all slices at the latest generation have been published, the pool is included with a validationError and device counts unset.
   * @return generation
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Generation is the pool generation observed across all ResourceSlices in this pool. Only the latest generation is reported. During a generation rollout, if not all slices at the latest generation have been published, the pool is included with a validationError and device counts unset.")
  public Long getGeneration() {
    return generation;
  }

  public void setGeneration(@jakarta.annotation.Nonnull Long generation) {
    this.generation = generation;
  }


  public V1alpha3PoolStatus nodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * NodeName is the node this pool is associated with. When omitted, the pool is not associated with a specific node. Must be a valid DNS subdomain name (RFC1123).
   * @return nodeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "NodeName is the node this pool is associated with. When omitted, the pool is not associated with a specific node. Must be a valid DNS subdomain name (RFC1123).")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha3PoolStatus poolName(@jakarta.annotation.Nonnull String poolName) {
    this.poolName = poolName;
    return this;
  }

  /**
   * PoolName is the name of the pool. Must be a valid resource pool name (DNS subdomains separated by \&quot;/\&quot;).
   * @return poolName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PoolName is the name of the pool. Must be a valid resource pool name (DNS subdomains separated by \"/\").")
  public String getPoolName() {
    return poolName;
  }

  public void setPoolName(@jakarta.annotation.Nonnull String poolName) {
    this.poolName = poolName;
  }


  public V1alpha3PoolStatus resourceSliceCount(@jakarta.annotation.Nullable Integer resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return this;
  }

  /**
   * ResourceSliceCount is the number of ResourceSlices that make up this pool. May be unset when validationError is set.
   * @return resourceSliceCount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ResourceSliceCount is the number of ResourceSlices that make up this pool. May be unset when validationError is set.")
  public Integer getResourceSliceCount() {
    return resourceSliceCount;
  }

  public void setResourceSliceCount(@jakarta.annotation.Nullable Integer resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
  }


  public V1alpha3PoolStatus totalDevices(@jakarta.annotation.Nullable Integer totalDevices) {
    this.totalDevices = totalDevices;
    return this;
  }

  /**
   * TotalDevices is the total number of devices in the pool across all slices. A value of 0 means the pool has no devices. May be unset when validationError is set.
   * @return totalDevices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TotalDevices is the total number of devices in the pool across all slices. A value of 0 means the pool has no devices. May be unset when validationError is set.")
  public Integer getTotalDevices() {
    return totalDevices;
  }

  public void setTotalDevices(@jakarta.annotation.Nullable Integer totalDevices) {
    this.totalDevices = totalDevices;
  }


  public V1alpha3PoolStatus unavailableDevices(@jakarta.annotation.Nullable Integer unavailableDevices) {
    this.unavailableDevices = unavailableDevices;
    return this;
  }

  /**
   * UnavailableDevices is the number of devices that are not available due to taints or other conditions, but are not allocated. A value of 0 means all unallocated devices are available. May be unset when validationError is set.
   * @return unavailableDevices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "UnavailableDevices is the number of devices that are not available due to taints or other conditions, but are not allocated. A value of 0 means all unallocated devices are available. May be unset when validationError is set.")
  public Integer getUnavailableDevices() {
    return unavailableDevices;
  }

  public void setUnavailableDevices(@jakarta.annotation.Nullable Integer unavailableDevices) {
    this.unavailableDevices = unavailableDevices;
  }


  public V1alpha3PoolStatus validationError(@jakarta.annotation.Nullable String validationError) {
    this.validationError = validationError;
    return this;
  }

  /**
   * ValidationError is set when the pool&#39;s data could not be fully validated (e.g., incomplete slice publication). When set, device count fields and ResourceSliceCount may be unset.
   * @return validationError
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ValidationError is set when the pool's data could not be fully validated (e.g., incomplete slice publication). When set, device count fields and ResourceSliceCount may be unset.")
  public String getValidationError() {
    return validationError;
  }

  public void setValidationError(@jakarta.annotation.Nullable String validationError) {
    this.validationError = validationError;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3PoolStatus v1alpha3PoolStatus = (V1alpha3PoolStatus) o;
    return Objects.equals(this.allocatedDevices, v1alpha3PoolStatus.allocatedDevices) &&
        Objects.equals(this.availableDevices, v1alpha3PoolStatus.availableDevices) &&
        Objects.equals(this.driver, v1alpha3PoolStatus.driver) &&
        Objects.equals(this.generation, v1alpha3PoolStatus.generation) &&
        Objects.equals(this.nodeName, v1alpha3PoolStatus.nodeName) &&
        Objects.equals(this.poolName, v1alpha3PoolStatus.poolName) &&
        Objects.equals(this.resourceSliceCount, v1alpha3PoolStatus.resourceSliceCount) &&
        Objects.equals(this.totalDevices, v1alpha3PoolStatus.totalDevices) &&
        Objects.equals(this.unavailableDevices, v1alpha3PoolStatus.unavailableDevices) &&
        Objects.equals(this.validationError, v1alpha3PoolStatus.validationError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedDevices, availableDevices, driver, generation, nodeName, poolName, resourceSliceCount, totalDevices, unavailableDevices, validationError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3PoolStatus {\n");
    sb.append("    allocatedDevices: ").append(toIndentedString(allocatedDevices)).append("\n");
    sb.append("    availableDevices: ").append(toIndentedString(availableDevices)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    resourceSliceCount: ").append(toIndentedString(resourceSliceCount)).append("\n");
    sb.append("    totalDevices: ").append(toIndentedString(totalDevices)).append("\n");
    sb.append("    unavailableDevices: ").append(toIndentedString(unavailableDevices)).append("\n");
    sb.append("    validationError: ").append(toIndentedString(validationError)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>(Arrays.asList("allocatedDevices", "availableDevices", "driver", "generation", "nodeName", "poolName", "resourceSliceCount", "totalDevices", "unavailableDevices", "validationError"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("driver", "generation", "poolName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3PoolStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3PoolStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3PoolStatus is not found in the empty JSON string", V1alpha3PoolStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3PoolStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3PoolStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3PoolStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      if (!jsonObj.get("poolName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `poolName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("poolName").toString()));
      }
      if ((jsonObj.get("validationError") != null && !jsonObj.get("validationError").isJsonNull()) && !jsonObj.get("validationError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `validationError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationError").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3PoolStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3PoolStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3PoolStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3PoolStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3PoolStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha3PoolStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3PoolStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3PoolStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3PoolStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha3PoolStatus
   */
  public static V1alpha3PoolStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3PoolStatus.class);
  }

  /**
   * Convert an instance of V1alpha3PoolStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
