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
import io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration;
import io.kubernetes.client.openapi.models.V1beta1DeviceConstraint;
import io.kubernetes.client.openapi.models.V1beta1DeviceRequest;
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
 * DeviceClaim defines how to request devices with a ResourceClaim.
 */
@ApiModel(description = "DeviceClaim defines how to request devices with a ResourceClaim.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1DeviceClaim {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<V1beta1DeviceClaimConfiguration> config = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private List<V1beta1DeviceConstraint> constraints = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<V1beta1DeviceRequest> requests = new ArrayList<>();

  public V1beta1DeviceClaim() {
  }

  public V1beta1DeviceClaim config(List<V1beta1DeviceClaimConfiguration> config) {
    this.config = config;
    return this;
  }

  public V1beta1DeviceClaim addConfigItem(V1beta1DeviceClaimConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * This field holds configuration for multiple potential drivers which could satisfy requests in this claim. It is ignored while allocating the claim.
   * @return config
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This field holds configuration for multiple potential drivers which could satisfy requests in this claim. It is ignored while allocating the claim.")
  public List<V1beta1DeviceClaimConfiguration> getConfig() {
    return config;
  }

  public void setConfig(List<V1beta1DeviceClaimConfiguration> config) {
    this.config = config;
  }


  public V1beta1DeviceClaim constraints(List<V1beta1DeviceConstraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public V1beta1DeviceClaim addConstraintsItem(V1beta1DeviceConstraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * These constraints must be satisfied by the set of devices that get allocated for the claim.
   * @return constraints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "These constraints must be satisfied by the set of devices that get allocated for the claim.")
  public List<V1beta1DeviceConstraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<V1beta1DeviceConstraint> constraints) {
    this.constraints = constraints;
  }


  public V1beta1DeviceClaim requests(List<V1beta1DeviceRequest> requests) {
    this.requests = requests;
    return this;
  }

  public V1beta1DeviceClaim addRequestsItem(V1beta1DeviceRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests represent individual requests for distinct devices which must all be satisfied. If empty, nothing needs to be allocated.
   * @return requests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Requests represent individual requests for distinct devices which must all be satisfied. If empty, nothing needs to be allocated.")
  public List<V1beta1DeviceRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<V1beta1DeviceRequest> requests) {
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
    V1beta1DeviceClaim v1beta1DeviceClaim = (V1beta1DeviceClaim) o;
    return Objects.equals(this.config, v1beta1DeviceClaim.config) &&
        Objects.equals(this.constraints, v1beta1DeviceClaim.constraints) &&
        Objects.equals(this.requests, v1beta1DeviceClaim.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, constraints, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DeviceClaim {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("constraints");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1DeviceClaim
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1DeviceClaim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1DeviceClaim is not found in the empty JSON string", V1beta1DeviceClaim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1DeviceClaim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1DeviceClaim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        JsonArray jsonArrayconfig = jsonObj.getAsJsonArray("config");
        if (jsonArrayconfig != null) {
          // ensure the json data is an array
          if (!jsonObj.get("config").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `config` to be an array in the JSON string but got `%s`", jsonObj.get("config").toString()));
          }

          // validate the optional field `config` (array)
          for (int i = 0; i < jsonArrayconfig.size(); i++) {
            V1beta1DeviceClaimConfiguration.validateJsonElement(jsonArrayconfig.get(i));
          };
        }
      }
      if (jsonObj.get("constraints") != null && !jsonObj.get("constraints").isJsonNull()) {
        JsonArray jsonArrayconstraints = jsonObj.getAsJsonArray("constraints");
        if (jsonArrayconstraints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("constraints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `constraints` to be an array in the JSON string but got `%s`", jsonObj.get("constraints").toString()));
          }

          // validate the optional field `constraints` (array)
          for (int i = 0; i < jsonArrayconstraints.size(); i++) {
            V1beta1DeviceConstraint.validateJsonElement(jsonArrayconstraints.get(i));
          };
        }
      }
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull()) {
        JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
        if (jsonArrayrequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
          }

          // validate the optional field `requests` (array)
          for (int i = 0; i < jsonArrayrequests.size(); i++) {
            V1beta1DeviceRequest.validateJsonElement(jsonArrayrequests.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1DeviceClaim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1DeviceClaim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1DeviceClaim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1DeviceClaim.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1DeviceClaim>() {
           @Override
           public void write(JsonWriter out, V1beta1DeviceClaim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1DeviceClaim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1DeviceClaim given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1DeviceClaim
  * @throws IOException if the JSON string is invalid with respect to V1beta1DeviceClaim
  */
  public static V1beta1DeviceClaim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1DeviceClaim.class);
  }

 /**
  * Convert an instance of V1beta1DeviceClaim to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
