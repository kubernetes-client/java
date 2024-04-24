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
import io.kubernetes.client.openapi.models.V1PodAffinityTerm;
import io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm;
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
 * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1PodAntiAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "preferredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "requiredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

  public V1PodAntiAffinity() {
  }

  public V1PodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {

    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1PodAntiAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(V1WeightedPodAffinityTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public List<V1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }


  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }


  public V1PodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {

    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public V1PodAntiAffinity addRequiredDuringSchedulingIgnoredDuringExecutionItem(V1PodAffinityTerm requiredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
    }
    this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @jakarta.annotation.Nullable
  public List<V1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }


  public void setRequiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodAntiAffinity v1PodAntiAffinity = (V1PodAntiAffinity) o;
    return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution, v1PodAntiAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution, v1PodAntiAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodAntiAffinity {\n");
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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
    openapiFields.add("preferredDuringSchedulingIgnoredDuringExecution");
    openapiFields.add("requiredDuringSchedulingIgnoredDuringExecution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodAntiAffinity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodAntiAffinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodAntiAffinity is not found in the empty JSON string", V1PodAntiAffinity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodAntiAffinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodAntiAffinity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        JsonArray jsonArraypreferredDuringSchedulingIgnoredDuringExecution = jsonObj.getAsJsonArray("preferredDuringSchedulingIgnoredDuringExecution");
        if (jsonArraypreferredDuringSchedulingIgnoredDuringExecution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preferredDuringSchedulingIgnoredDuringExecution` to be an array in the JSON string but got `%s`", jsonObj.get("preferredDuringSchedulingIgnoredDuringExecution").toString()));
          }

          // validate the optional field `preferredDuringSchedulingIgnoredDuringExecution` (array)
          for (int i = 0; i < jsonArraypreferredDuringSchedulingIgnoredDuringExecution.size(); i++) {
            V1WeightedPodAffinityTerm.validateJsonObject(jsonArraypreferredDuringSchedulingIgnoredDuringExecution.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution") != null && !jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").isJsonNull()) {
        JsonArray jsonArrayrequiredDuringSchedulingIgnoredDuringExecution = jsonObj.getAsJsonArray("requiredDuringSchedulingIgnoredDuringExecution");
        if (jsonArrayrequiredDuringSchedulingIgnoredDuringExecution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requiredDuringSchedulingIgnoredDuringExecution` to be an array in the JSON string but got `%s`", jsonObj.get("requiredDuringSchedulingIgnoredDuringExecution").toString()));
          }

          // validate the optional field `requiredDuringSchedulingIgnoredDuringExecution` (array)
          for (int i = 0; i < jsonArrayrequiredDuringSchedulingIgnoredDuringExecution.size(); i++) {
            V1PodAffinityTerm.validateJsonObject(jsonArrayrequiredDuringSchedulingIgnoredDuringExecution.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodAntiAffinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodAntiAffinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodAntiAffinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodAntiAffinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodAntiAffinity>() {
           @Override
           public void write(JsonWriter out, V1PodAntiAffinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodAntiAffinity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodAntiAffinity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodAntiAffinity
  * @throws IOException if the JSON string is invalid with respect to V1PodAntiAffinity
  */
  public static V1PodAntiAffinity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodAntiAffinity.class);
  }

 /**
  * Convert an instance of V1PodAntiAffinity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
