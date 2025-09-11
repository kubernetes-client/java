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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * LeaseSpec is a specification of a Lease.
 */
@ApiModel(description = "LeaseSpec is a specification of a Lease.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LeaseSpec {
  public static final String SERIALIZED_NAME_ACQUIRE_TIME = "acquireTime";
  @SerializedName(SERIALIZED_NAME_ACQUIRE_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime acquireTime;

  public static final String SERIALIZED_NAME_HOLDER_IDENTITY = "holderIdentity";
  @SerializedName(SERIALIZED_NAME_HOLDER_IDENTITY)
  @jakarta.annotation.Nullable
  private String holderIdentity;

  public static final String SERIALIZED_NAME_LEASE_DURATION_SECONDS = "leaseDurationSeconds";
  @SerializedName(SERIALIZED_NAME_LEASE_DURATION_SECONDS)
  @jakarta.annotation.Nullable
  private Integer leaseDurationSeconds;

  public static final String SERIALIZED_NAME_LEASE_TRANSITIONS = "leaseTransitions";
  @SerializedName(SERIALIZED_NAME_LEASE_TRANSITIONS)
  @jakarta.annotation.Nullable
  private Integer leaseTransitions;

  public static final String SERIALIZED_NAME_PREFERRED_HOLDER = "preferredHolder";
  @SerializedName(SERIALIZED_NAME_PREFERRED_HOLDER)
  @jakarta.annotation.Nullable
  private String preferredHolder;

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime renewTime;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @jakarta.annotation.Nullable
  private String strategy;

  public V1LeaseSpec() {
  }

  public V1LeaseSpec acquireTime(@jakarta.annotation.Nullable OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
    return this;
  }

  /**
   * acquireTime is a time when the current lease was acquired.
   * @return acquireTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "acquireTime is a time when the current lease was acquired.")
  public OffsetDateTime getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(@jakarta.annotation.Nullable OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
  }


  public V1LeaseSpec holderIdentity(@jakarta.annotation.Nullable String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return this;
  }

  /**
   * holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field.
   * @return holderIdentity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field.")
  public String getHolderIdentity() {
    return holderIdentity;
  }

  public void setHolderIdentity(@jakarta.annotation.Nullable String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }


  public V1LeaseSpec leaseDurationSeconds(@jakarta.annotation.Nullable Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

  /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime.
   * @return leaseDurationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime.")
  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }

  public void setLeaseDurationSeconds(@jakarta.annotation.Nullable Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }


  public V1LeaseSpec leaseTransitions(@jakarta.annotation.Nullable Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return this;
  }

  /**
   * leaseTransitions is the number of transitions of a lease between holders.
   * @return leaseTransitions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "leaseTransitions is the number of transitions of a lease between holders.")
  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }

  public void setLeaseTransitions(@jakarta.annotation.Nullable Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }


  public V1LeaseSpec preferredHolder(@jakarta.annotation.Nullable String preferredHolder) {
    this.preferredHolder = preferredHolder;
    return this;
  }

  /**
   * PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set.
   * @return preferredHolder
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set.")
  public String getPreferredHolder() {
    return preferredHolder;
  }

  public void setPreferredHolder(@jakarta.annotation.Nullable String preferredHolder) {
    this.preferredHolder = preferredHolder;
  }


  public V1LeaseSpec renewTime(@jakarta.annotation.Nullable OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return this;
  }

  /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   * @return renewTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "renewTime is a time when the current holder of a lease has last updated the lease.")
  public OffsetDateTime getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(@jakarta.annotation.Nullable OffsetDateTime renewTime) {
    this.renewTime = renewTime;
  }


  public V1LeaseSpec strategy(@jakarta.annotation.Nullable String strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   * @return strategy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(@jakarta.annotation.Nullable String strategy) {
    this.strategy = strategy;
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
        Objects.equals(this.preferredHolder, v1LeaseSpec.preferredHolder) &&
        Objects.equals(this.renewTime, v1LeaseSpec.renewTime) &&
        Objects.equals(this.strategy, v1LeaseSpec.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, preferredHolder, renewTime, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LeaseSpec {\n");
    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ").append(toIndentedString(leaseDurationSeconds)).append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    preferredHolder: ").append(toIndentedString(preferredHolder)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
    openapiFields.add("preferredHolder");
    openapiFields.add("renewTime");
    openapiFields.add("strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LeaseSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LeaseSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LeaseSpec is not found in the empty JSON string", V1LeaseSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LeaseSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LeaseSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("holderIdentity") != null && !jsonObj.get("holderIdentity").isJsonNull()) && !jsonObj.get("holderIdentity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderIdentity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderIdentity").toString()));
      }
      if ((jsonObj.get("preferredHolder") != null && !jsonObj.get("preferredHolder").isJsonNull()) && !jsonObj.get("preferredHolder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredHolder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredHolder").toString()));
      }
      if ((jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) && !jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
