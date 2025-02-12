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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1AllocatedDeviceStatus;
import io.kubernetes.client.openapi.models.V1beta1AllocationResult;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimConsumerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.
 */
@ApiModel(description = "ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1ResourceClaimStatus {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  private V1beta1AllocationResult allocation;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<V1beta1AllocatedDeviceStatus> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESERVED_FOR = "reservedFor";
  @SerializedName(SERIALIZED_NAME_RESERVED_FOR)
  private List<V1beta1ResourceClaimConsumerReference> reservedFor = new ArrayList<>();

  public V1beta1ResourceClaimStatus() {
  }

  public V1beta1ResourceClaimStatus allocation(V1beta1AllocationResult allocation) {
    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1AllocationResult getAllocation() {
    return allocation;
  }

  public void setAllocation(V1beta1AllocationResult allocation) {
    this.allocation = allocation;
  }


  public V1beta1ResourceClaimStatus devices(List<V1beta1AllocatedDeviceStatus> devices) {
    this.devices = devices;
    return this;
  }

  public V1beta1ResourceClaimStatus addDevicesItem(V1beta1AllocatedDeviceStatus devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Devices contains the status of each device allocated for this claim, as reported by the driver. This can include driver-specific information. Entries are owned by their respective drivers.
   * @return devices
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Devices contains the status of each device allocated for this claim, as reported by the driver. This can include driver-specific information. Entries are owned by their respective drivers.")
  public List<V1beta1AllocatedDeviceStatus> getDevices() {
    return devices;
  }

  public void setDevices(List<V1beta1AllocatedDeviceStatus> devices) {
    this.devices = devices;
  }


  public V1beta1ResourceClaimStatus reservedFor(List<V1beta1ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
    return this;
  }

  public V1beta1ResourceClaimStatus addReservedForItem(V1beta1ResourceClaimConsumerReference reservedForItem) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList<>();
    }
    this.reservedFor.add(reservedForItem);
    return this;
  }

   /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.  In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.  Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.  There can be at most 256 such reservations. This may get increased in the future, but not reduced.
   * @return reservedFor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.  In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.  Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.  There can be at most 256 such reservations. This may get increased in the future, but not reduced.")
  public List<V1beta1ResourceClaimConsumerReference> getReservedFor() {
    return reservedFor;
  }

  public void setReservedFor(List<V1beta1ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ResourceClaimStatus v1beta1ResourceClaimStatus = (V1beta1ResourceClaimStatus) o;
    return Objects.equals(this.allocation, v1beta1ResourceClaimStatus.allocation) &&
        Objects.equals(this.devices, v1beta1ResourceClaimStatus.devices) &&
        Objects.equals(this.reservedFor, v1beta1ResourceClaimStatus.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, devices, reservedFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ResourceClaimStatus {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    reservedFor: ").append(toIndentedString(reservedFor)).append("\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("allocation");
    openapiFields.add("devices");
    openapiFields.add("reservedFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1ResourceClaimStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1ResourceClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ResourceClaimStatus is not found in the empty JSON string", V1beta1ResourceClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ResourceClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ResourceClaimStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `allocation`
      if (jsonObj.get("allocation") != null && !jsonObj.get("allocation").isJsonNull()) {
        V1beta1AllocationResult.validateJsonElement(jsonObj.get("allocation"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            V1beta1AllocatedDeviceStatus.validateJsonElement(jsonArraydevices.get(i));
          };
        }
      }
      if (jsonObj.get("reservedFor") != null && !jsonObj.get("reservedFor").isJsonNull()) {
        JsonArray jsonArrayreservedFor = jsonObj.getAsJsonArray("reservedFor");
        if (jsonArrayreservedFor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reservedFor").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reservedFor` to be an array in the JSON string but got `%s`", jsonObj.get("reservedFor").toString()));
          }

          // validate the optional field `reservedFor` (array)
          for (int i = 0; i < jsonArrayreservedFor.size(); i++) {
            V1beta1ResourceClaimConsumerReference.validateJsonElement(jsonArrayreservedFor.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ResourceClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ResourceClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ResourceClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ResourceClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ResourceClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1beta1ResourceClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ResourceClaimStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ResourceClaimStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ResourceClaimStatus
  * @throws IOException if the JSON string is invalid with respect to V1beta1ResourceClaimStatus
  */
  public static V1beta1ResourceClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ResourceClaimStatus.class);
  }

 /**
  * Convert an instance of V1beta1ResourceClaimStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
