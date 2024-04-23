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
import io.kubernetes.client.openapi.models.V1alpha2AllocationResult;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClaimStatus {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  private V1alpha2AllocationResult allocation;

  public static final String SERIALIZED_NAME_DEALLOCATION_REQUESTED = "deallocationRequested";
  @SerializedName(SERIALIZED_NAME_DEALLOCATION_REQUESTED)
  private Boolean deallocationRequested;

  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_RESERVED_FOR = "reservedFor";
  @SerializedName(SERIALIZED_NAME_RESERVED_FOR)
  private List<V1alpha2ResourceClaimConsumerReference> reservedFor;

  public V1alpha2ResourceClaimStatus() {
  }

  public V1alpha2ResourceClaimStatus allocation(V1alpha2AllocationResult allocation) {

    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @jakarta.annotation.Nullable
  public V1alpha2AllocationResult getAllocation() {
    return allocation;
  }


  public void setAllocation(V1alpha2AllocationResult allocation) {
    this.allocation = allocation;
  }


  public V1alpha2ResourceClaimStatus deallocationRequested(Boolean deallocationRequested) {

    this.deallocationRequested = deallocationRequested;
    return this;
  }

   /**
   * DeallocationRequested indicates that a ResourceClaim is to be deallocated.  The driver then must deallocate this claim and reset the field together with clearing the Allocation field.  While DeallocationRequested is set, no new consumers may be added to ReservedFor.
   * @return deallocationRequested
  **/
  @jakarta.annotation.Nullable
  public Boolean getDeallocationRequested() {
    return deallocationRequested;
  }


  public void setDeallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested = deallocationRequested;
  }


  public V1alpha2ResourceClaimStatus driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
   * @return driverName
  **/
  @jakarta.annotation.Nullable
  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceClaimStatus reservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor) {

    this.reservedFor = reservedFor;
    return this;
  }

  public V1alpha2ResourceClaimStatus addReservedForItem(V1alpha2ResourceClaimConsumerReference reservedForItem) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList<>();
    }
    this.reservedFor.add(reservedForItem);
    return this;
  }

   /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.  There can be at most 32 such reservations. This may get increased in the future, but not reduced.
   * @return reservedFor
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2ResourceClaimConsumerReference> getReservedFor() {
    return reservedFor;
  }


  public void setReservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor) {
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
    V1alpha2ResourceClaimStatus v1alpha2ResourceClaimStatus = (V1alpha2ResourceClaimStatus) o;
    return Objects.equals(this.allocation, v1alpha2ResourceClaimStatus.allocation) &&
        Objects.equals(this.deallocationRequested, v1alpha2ResourceClaimStatus.deallocationRequested) &&
        Objects.equals(this.driverName, v1alpha2ResourceClaimStatus.driverName) &&
        Objects.equals(this.reservedFor, v1alpha2ResourceClaimStatus.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, deallocationRequested, driverName, reservedFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimStatus {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    deallocationRequested: ").append(toIndentedString(deallocationRequested)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
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
    openapiFields.add("deallocationRequested");
    openapiFields.add("driverName");
    openapiFields.add("reservedFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClaimStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClaimStatus is not found in the empty JSON string", V1alpha2ResourceClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClaimStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `allocation`
      if (jsonObj.get("allocation") != null && !jsonObj.get("allocation").isJsonNull()) {
        V1alpha2AllocationResult.validateJsonObject(jsonObj.getAsJsonObject("allocation"));
      }
      if ((jsonObj.get("driverName") != null && !jsonObj.get("driverName").isJsonNull()) && !jsonObj.get("driverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverName").toString()));
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
            V1alpha2ResourceClaimConsumerReference.validateJsonObject(jsonArrayreservedFor.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClaimStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClaimStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClaimStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClaimStatus
  */
  public static V1alpha2ResourceClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClaimStatus.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClaimStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
