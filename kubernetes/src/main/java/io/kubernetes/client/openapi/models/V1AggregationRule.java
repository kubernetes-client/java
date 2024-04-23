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
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1AggregationRule {
  public static final String SERIALIZED_NAME_CLUSTER_ROLE_SELECTORS = "clusterRoleSelectors";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ROLE_SELECTORS)
  private List<V1LabelSelector> clusterRoleSelectors;

  public V1AggregationRule() {
  }

  public V1AggregationRule clusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {

    this.clusterRoleSelectors = clusterRoleSelectors;
    return this;
  }

  public V1AggregationRule addClusterRoleSelectorsItem(V1LabelSelector clusterRoleSelectorsItem) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList<>();
    }
    this.clusterRoleSelectors.add(clusterRoleSelectorsItem);
    return this;
  }

   /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
   * @return clusterRoleSelectors
  **/
  @jakarta.annotation.Nullable
  public List<V1LabelSelector> getClusterRoleSelectors() {
    return clusterRoleSelectors;
  }


  public void setClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AggregationRule v1AggregationRule = (V1AggregationRule) o;
    return Objects.equals(this.clusterRoleSelectors, v1AggregationRule.clusterRoleSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRoleSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AggregationRule {\n");
    sb.append("    clusterRoleSelectors: ").append(toIndentedString(clusterRoleSelectors)).append("\n");
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
    openapiFields.add("clusterRoleSelectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AggregationRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AggregationRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AggregationRule is not found in the empty JSON string", V1AggregationRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AggregationRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AggregationRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("clusterRoleSelectors") != null && !jsonObj.get("clusterRoleSelectors").isJsonNull()) {
        JsonArray jsonArrayclusterRoleSelectors = jsonObj.getAsJsonArray("clusterRoleSelectors");
        if (jsonArrayclusterRoleSelectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clusterRoleSelectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clusterRoleSelectors` to be an array in the JSON string but got `%s`", jsonObj.get("clusterRoleSelectors").toString()));
          }

          // validate the optional field `clusterRoleSelectors` (array)
          for (int i = 0; i < jsonArrayclusterRoleSelectors.size(); i++) {
            V1LabelSelector.validateJsonObject(jsonArrayclusterRoleSelectors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AggregationRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AggregationRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AggregationRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AggregationRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AggregationRule>() {
           @Override
           public void write(JsonWriter out, V1AggregationRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AggregationRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AggregationRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AggregationRule
  * @throws IOException if the JSON string is invalid with respect to V1AggregationRule
  */
  public static V1AggregationRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AggregationRule.class);
  }

 /**
  * Convert an instance of V1AggregationRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
