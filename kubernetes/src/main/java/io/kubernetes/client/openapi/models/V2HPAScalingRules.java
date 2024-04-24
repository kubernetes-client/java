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
import io.kubernetes.client.openapi.models.V2HPAScalingPolicy;
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
 * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2HPAScalingRules {
  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<V2HPAScalingPolicy> policies;

  public static final String SERIALIZED_NAME_SELECT_POLICY = "selectPolicy";
  @SerializedName(SERIALIZED_NAME_SELECT_POLICY)
  private String selectPolicy;

  public static final String SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS = "stabilizationWindowSeconds";
  @SerializedName(SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS)
  private Integer stabilizationWindowSeconds;

  public V2HPAScalingRules() {
  }

  public V2HPAScalingRules policies(List<V2HPAScalingPolicy> policies) {

    this.policies = policies;
    return this;
  }

  public V2HPAScalingRules addPoliciesItem(V2HPAScalingPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
   * @return policies
  **/
  @jakarta.annotation.Nullable
  public List<V2HPAScalingPolicy> getPolicies() {
    return policies;
  }


  public void setPolicies(List<V2HPAScalingPolicy> policies) {
    this.policies = policies;
  }


  public V2HPAScalingRules selectPolicy(String selectPolicy) {

    this.selectPolicy = selectPolicy;
    return this;
  }

   /**
   * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
   * @return selectPolicy
  **/
  @jakarta.annotation.Nullable
  public String getSelectPolicy() {
    return selectPolicy;
  }


  public void setSelectPolicy(String selectPolicy) {
    this.selectPolicy = selectPolicy;
  }


  public V2HPAScalingRules stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {

    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return this;
  }

   /**
   * stabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
   * @return stabilizationWindowSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getStabilizationWindowSeconds() {
    return stabilizationWindowSeconds;
  }


  public void setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HPAScalingRules v2HPAScalingRules = (V2HPAScalingRules) o;
    return Objects.equals(this.policies, v2HPAScalingRules.policies) &&
        Objects.equals(this.selectPolicy, v2HPAScalingRules.selectPolicy) &&
        Objects.equals(this.stabilizationWindowSeconds, v2HPAScalingRules.stabilizationWindowSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, selectPolicy, stabilizationWindowSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HPAScalingRules {\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    selectPolicy: ").append(toIndentedString(selectPolicy)).append("\n");
    sb.append("    stabilizationWindowSeconds: ").append(toIndentedString(stabilizationWindowSeconds)).append("\n");
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
    openapiFields.add("policies");
    openapiFields.add("selectPolicy");
    openapiFields.add("stabilizationWindowSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2HPAScalingRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2HPAScalingRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HPAScalingRules is not found in the empty JSON string", V2HPAScalingRules.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2HPAScalingRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HPAScalingRules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("policies") != null && !jsonObj.get("policies").isJsonNull()) {
        JsonArray jsonArraypolicies = jsonObj.getAsJsonArray("policies");
        if (jsonArraypolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
          }

          // validate the optional field `policies` (array)
          for (int i = 0; i < jsonArraypolicies.size(); i++) {
            V2HPAScalingPolicy.validateJsonObject(jsonArraypolicies.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("selectPolicy") != null && !jsonObj.get("selectPolicy").isJsonNull()) && !jsonObj.get("selectPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HPAScalingRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HPAScalingRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HPAScalingRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HPAScalingRules.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HPAScalingRules>() {
           @Override
           public void write(JsonWriter out, V2HPAScalingRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HPAScalingRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2HPAScalingRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2HPAScalingRules
  * @throws IOException if the JSON string is invalid with respect to V2HPAScalingRules
  */
  public static V2HPAScalingRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HPAScalingRules.class);
  }

 /**
  * Convert an instance of V2HPAScalingRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
