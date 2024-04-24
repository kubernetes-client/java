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
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * LeaseSpec is a specification of a Lease.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1LeaseSpec {
  public static final String SERIALIZED_NAME_ACQUIRE_TIME = "acquireTime";
  @SerializedName(SERIALIZED_NAME_ACQUIRE_TIME)
  private OffsetDateTime acquireTime;

  public static final String SERIALIZED_NAME_HOLDER_IDENTITY = "holderIdentity";
  @SerializedName(SERIALIZED_NAME_HOLDER_IDENTITY)
  private String holderIdentity;

  public static final String SERIALIZED_NAME_LEASE_DURATION_SECONDS = "leaseDurationSeconds";
  @SerializedName(SERIALIZED_NAME_LEASE_DURATION_SECONDS)
  private Integer leaseDurationSeconds;

  public static final String SERIALIZED_NAME_LEASE_TRANSITIONS = "leaseTransitions";
  @SerializedName(SERIALIZED_NAME_LEASE_TRANSITIONS)
  private Integer leaseTransitions;

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  private OffsetDateTime renewTime;

  public V1LeaseSpec() {
  }

  public V1LeaseSpec acquireTime(OffsetDateTime acquireTime) {

    this.acquireTime = acquireTime;
    return this;
  }

   /**
   * acquireTime is a time when the current lease was acquired.
   * @return acquireTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAcquireTime() {
    return acquireTime;
  }


  public void setAcquireTime(OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
  }


  public V1LeaseSpec holderIdentity(String holderIdentity) {

    this.holderIdentity = holderIdentity;
    return this;
  }

   /**
   * holderIdentity contains the identity of the holder of a current lease.
   * @return holderIdentity
  **/
  @jakarta.annotation.Nullable
  public String getHolderIdentity() {
    return holderIdentity;
  }


  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }


  public V1LeaseSpec leaseDurationSeconds(Integer leaseDurationSeconds) {

    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

   /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
   * @return leaseDurationSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }


  public void setLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }


  public V1LeaseSpec leaseTransitions(Integer leaseTransitions) {

    this.leaseTransitions = leaseTransitions;
    return this;
  }

   /**
   * leaseTransitions is the number of transitions of a lease between holders.
   * @return leaseTransitions
  **/
  @jakarta.annotation.Nullable
  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }


  public void setLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }


  public V1LeaseSpec renewTime(OffsetDateTime renewTime) {

    this.renewTime = renewTime;
    return this;
  }

   /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   * @return renewTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getRenewTime() {
    return renewTime;
  }


  public void setRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LeaseSpec v1LeaseSpec = (V1LeaseSpec) o;
    return Objects.equals(this.acquireTime, v1LeaseSpec.acquireTime) &&
        Objects.equals(this.holderIdentity, v1LeaseSpec.holderIdentity) &&
        Objects.equals(this.leaseDurationSeconds, v1LeaseSpec.leaseDurationSeconds) &&
        Objects.equals(this.leaseTransitions, v1LeaseSpec.leaseTransitions) &&
        Objects.equals(this.renewTime, v1LeaseSpec.renewTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LeaseSpec {\n");
    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ").append(toIndentedString(leaseDurationSeconds)).append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
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
    openapiFields.add("acquireTime");
    openapiFields.add("holderIdentity");
    openapiFields.add("leaseDurationSeconds");
    openapiFields.add("leaseTransitions");
    openapiFields.add("renewTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1LeaseSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1LeaseSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LeaseSpec is not found in the empty JSON string", V1LeaseSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1LeaseSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LeaseSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("holderIdentity") != null && !jsonObj.get("holderIdentity").isJsonNull()) && !jsonObj.get("holderIdentity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderIdentity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderIdentity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LeaseSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LeaseSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LeaseSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LeaseSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LeaseSpec>() {
           @Override
           public void write(JsonWriter out, V1LeaseSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LeaseSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1LeaseSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1LeaseSpec
  * @throws IOException if the JSON string is invalid with respect to V1LeaseSpec
  */
  public static V1LeaseSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LeaseSpec.class);
  }

 /**
  * Convert an instance of V1LeaseSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
