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
import io.kubernetes.client.openapi.models.V1Condition;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceTaintRuleStatus provides information about an on-going pod eviction.
 */
@ApiModel(description = "DeviceTaintRuleStatus provides information about an on-going pod eviction.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3DeviceTaintRuleStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1Condition> conditions = new ArrayList<>();

  public V1alpha3DeviceTaintRuleStatus() {
  }

  public V1alpha3DeviceTaintRuleStatus conditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha3DeviceTaintRuleStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions provide information about the state of the DeviceTaintRule and the cluster at some point in time, in a machine-readable and human-readable format.  The following condition is currently defined as part of this API, more may get added: - Type: EvictionInProgress - Status: True if there are currently pods which need to be evicted, False otherwise   (includes the effects which don&#39;t cause eviction). - Reason: not specified, may change - Message: includes information about number of pending pods and already evicted pods   in a human-readable format, updated periodically, may change  For &#x60;effect: None&#x60;, the condition above gets set once for each change to the spec, with the message containing information about what would happen if the effect was &#x60;NoExecute&#x60;. This feedback can be used to decide whether changing the effect to &#x60;NoExecute&#x60; will work as intended. It only gets set once to avoid having to constantly update the status.  Must have 8 or fewer entries.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Conditions provide information about the state of the DeviceTaintRule and the cluster at some point in time, in a machine-readable and human-readable format.  The following condition is currently defined as part of this API, more may get added: - Type: EvictionInProgress - Status: True if there are currently pods which need to be evicted, False otherwise   (includes the effects which don't cause eviction). - Reason: not specified, may change - Message: includes information about number of pending pods and already evicted pods   in a human-readable format, updated periodically, may change  For `effect: None`, the condition above gets set once for each change to the spec, with the message containing information about what would happen if the effect was `NoExecute`. This feedback can be used to decide whether changing the effect to `NoExecute` will work as intended. It only gets set once to avoid having to constantly update the status.  Must have 8 or fewer entries.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceTaintRuleStatus v1alpha3DeviceTaintRuleStatus = (V1alpha3DeviceTaintRuleStatus) o;
    return Objects.equals(this.conditions, v1alpha3DeviceTaintRuleStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceTaintRuleStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("conditions"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceTaintRuleStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceTaintRuleStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3DeviceTaintRuleStatus is not found in the empty JSON string", V1alpha3DeviceTaintRuleStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceTaintRuleStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3DeviceTaintRuleStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1Condition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceTaintRuleStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceTaintRuleStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceTaintRuleStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceTaintRuleStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceTaintRuleStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceTaintRuleStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceTaintRuleStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3DeviceTaintRuleStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3DeviceTaintRuleStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceTaintRuleStatus
   */
  public static V1alpha3DeviceTaintRuleStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceTaintRuleStatus.class);
  }

  /**
   * Convert an instance of V1alpha3DeviceTaintRuleStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
