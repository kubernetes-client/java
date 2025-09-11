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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.CoreV1ResourceClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ResourceRequirements describes the compute resource requirements.
 */
@ApiModel(description = "ResourceRequirements describes the compute resource requirements.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ResourceRequirements {
  public static final String SERIALIZED_NAME_CLAIMS = "claims";
  @SerializedName(SERIALIZED_NAME_CLAIMS)
  @jakarta.annotation.Nullable
  private List<CoreV1ResourceClaim> claims = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> limits = new HashMap<>();

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> requests = new HashMap<>();

  public V1ResourceRequirements() {
  }

  public V1ResourceRequirements claims(@jakarta.annotation.Nullable List<CoreV1ResourceClaim> claims) {
    this.claims = claims;
    return this;
  }

  public V1ResourceRequirements addClaimsItem(CoreV1ResourceClaim claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<>();
    }
    this.claims.add(claimsItem);
    return this;
  }

  /**
   * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.  This field depends on the DynamicResourceAllocation feature gate.  This field is immutable. It can only be set for containers.
   * @return claims
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.  This field depends on the DynamicResourceAllocation feature gate.  This field is immutable. It can only be set for containers.")
  public List<CoreV1ResourceClaim> getClaims() {
    return claims;
  }

  public void setClaims(@jakarta.annotation.Nullable List<CoreV1ResourceClaim> claims) {
    this.claims = claims;
  }


  public V1ResourceRequirements limits(@jakarta.annotation.Nullable Map<String, Quantity> limits) {
    this.limits = limits;
    return this;
  }

  public V1ResourceRequirements putLimitsItem(String key, Quantity limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

  /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return limits
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
  public Map<String, Quantity> getLimits() {
    return limits;
  }

  public void setLimits(@jakarta.annotation.Nullable Map<String, Quantity> limits) {
    this.limits = limits;
  }


  public V1ResourceRequirements requests(@jakarta.annotation.Nullable Map<String, Quantity> requests) {
    this.requests = requests;
    return this;
  }

  public V1ResourceRequirements putRequestsItem(String key, Quantity requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return requests
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
  public Map<String, Quantity> getRequests() {
    return requests;
  }

  public void setRequests(@jakarta.annotation.Nullable Map<String, Quantity> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRequirements v1ResourceRequirements = (V1ResourceRequirements) o;
    return Objects.equals(this.claims, v1ResourceRequirements.claims) &&
        Objects.equals(this.limits, v1ResourceRequirements.limits) &&
        Objects.equals(this.requests, v1ResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRequirements {\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("claims");
    openapiFields.add("limits");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ResourceRequirements
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourceRequirements.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceRequirements is not found in the empty JSON string", V1ResourceRequirements.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceRequirements.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceRequirements` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("claims") != null && !jsonObj.get("claims").isJsonNull()) {
        JsonArray jsonArrayclaims = jsonObj.getAsJsonArray("claims");
        if (jsonArrayclaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("claims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `claims` to be an array in the JSON string but got `%s`", jsonObj.get("claims").toString()));
          }

          // validate the optional field `claims` (array)
          for (int i = 0; i < jsonArrayclaims.size(); i++) {
            CoreV1ResourceClaim.validateJsonElement(jsonArrayclaims.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceRequirements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceRequirements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceRequirements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceRequirements.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceRequirements>() {
           @Override
           public void write(JsonWriter out, V1ResourceRequirements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceRequirements read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ResourceRequirements given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ResourceRequirements
   * @throws IOException if the JSON string is invalid with respect to V1ResourceRequirements
   */
  public static V1ResourceRequirements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceRequirements.class);
  }

  /**
   * Convert an instance of V1ResourceRequirements to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
