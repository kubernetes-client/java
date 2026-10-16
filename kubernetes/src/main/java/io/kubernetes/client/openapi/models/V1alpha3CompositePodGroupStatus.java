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
 * CompositePodGroupStatus represents information about the status of a composite pod group.
 */
@ApiModel(description = "CompositePodGroupStatus represents information about the status of a composite pod group.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3CompositePodGroupStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1Condition> conditions = new ArrayList<>();

  public V1alpha3CompositePodGroupStatus() {
  }

  public V1alpha3CompositePodGroupStatus conditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha3CompositePodGroupStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions represent the latest observations of the CompositePodGroup&#39;s state.  Known condition types: - \&quot;CompositePodGroupInitiallyScheduled\&quot;: Indicates whether the overall scheduling requirement   for the subtree under this CompositePodGroup has been satisfied. Once this condition   transitions to True, it serves as a terminal state and will never revert to False,   even if pods are subsequently deleted and group constraints are no longer met. - \&quot;DisruptionTarget\&quot;: Indicates whether the CompositePodGroup is about to be terminated   due to disruption such as preemption.  Known reasons for the CompositePodGroupInitiallyScheduled condition: - \&quot;Unschedulable\&quot;: The CompositePodGroup&#39;s subtree could not be placed due to resource constraints,   affinity/anti-affinity, or topological constraints. - \&quot;SchedulerError\&quot;: The CompositePodGroup cannot be scheduled due to some internal error   that occurred during scheduling. - \&quot;Invalid\&quot;: Set to True when kube-scheduler detects an invalid group layout during   runtime validation. The &#x60;message&#x60; field details the specific layout violation (such as   a detected cycle, exceeding the maximum depth of 4, or referencing multiple distinct Workloads).  Known reasons for the DisruptionTarget condition: - \&quot;PreemptionByScheduler\&quot;: The CompositePodGroup was targeted by the scheduler&#39;s preemption loop   to free up capacity for higher-priority preemptors.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "conditions represent the latest observations of the CompositePodGroup's state.  Known condition types: - \"CompositePodGroupInitiallyScheduled\": Indicates whether the overall scheduling requirement   for the subtree under this CompositePodGroup has been satisfied. Once this condition   transitions to True, it serves as a terminal state and will never revert to False,   even if pods are subsequently deleted and group constraints are no longer met. - \"DisruptionTarget\": Indicates whether the CompositePodGroup is about to be terminated   due to disruption such as preemption.  Known reasons for the CompositePodGroupInitiallyScheduled condition: - \"Unschedulable\": The CompositePodGroup's subtree could not be placed due to resource constraints,   affinity/anti-affinity, or topological constraints. - \"SchedulerError\": The CompositePodGroup cannot be scheduled due to some internal error   that occurred during scheduling. - \"Invalid\": Set to True when kube-scheduler detects an invalid group layout during   runtime validation. The `message` field details the specific layout violation (such as   a detected cycle, exceeding the maximum depth of 4, or referencing multiple distinct Workloads).  Known reasons for the DisruptionTarget condition: - \"PreemptionByScheduler\": The CompositePodGroup was targeted by the scheduler's preemption loop   to free up capacity for higher-priority preemptors.")
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
    V1alpha3CompositePodGroupStatus v1alpha3CompositePodGroupStatus = (V1alpha3CompositePodGroupStatus) o;
    return Objects.equals(this.conditions, v1alpha3CompositePodGroupStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3CompositePodGroupStatus {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3CompositePodGroupStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3CompositePodGroupStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3CompositePodGroupStatus is not found in the empty JSON string", V1alpha3CompositePodGroupStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3CompositePodGroupStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3CompositePodGroupStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!V1alpha3CompositePodGroupStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3CompositePodGroupStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3CompositePodGroupStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3CompositePodGroupStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3CompositePodGroupStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha3CompositePodGroupStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3CompositePodGroupStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3CompositePodGroupStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3CompositePodGroupStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha3CompositePodGroupStatus
   */
  public static V1alpha3CompositePodGroupStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3CompositePodGroupStatus.class);
  }

  /**
   * Convert an instance of V1alpha3CompositePodGroupStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
