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
import io.kubernetes.client.openapi.models.V1NodeSelectorRequirement;
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
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeSelectorTerm {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1NodeSelectorRequirement> matchExpressions;

  public static final String SERIALIZED_NAME_MATCH_FIELDS = "matchFields";
  @SerializedName(SERIALIZED_NAME_MATCH_FIELDS)
  private List<V1NodeSelectorRequirement> matchFields;

  public V1NodeSelectorTerm() {
  }

  public V1NodeSelectorTerm matchExpressions(List<V1NodeSelectorRequirement> matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1NodeSelectorTerm addMatchExpressionsItem(V1NodeSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s labels.
   * @return matchExpressions
  **/
  @jakarta.annotation.Nullable
  public List<V1NodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1NodeSelectorTerm matchFields(List<V1NodeSelectorRequirement> matchFields) {

    this.matchFields = matchFields;
    return this;
  }

  public V1NodeSelectorTerm addMatchFieldsItem(V1NodeSelectorRequirement matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList<>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s fields.
   * @return matchFields
  **/
  @jakarta.annotation.Nullable
  public List<V1NodeSelectorRequirement> getMatchFields() {
    return matchFields;
  }


  public void setMatchFields(List<V1NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSelectorTerm v1NodeSelectorTerm = (V1NodeSelectorTerm) o;
    return Objects.equals(this.matchExpressions, v1NodeSelectorTerm.matchExpressions) &&
        Objects.equals(this.matchFields, v1NodeSelectorTerm.matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSelectorTerm {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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
    openapiFields.add("matchExpressions");
    openapiFields.add("matchFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeSelectorTerm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeSelectorTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeSelectorTerm is not found in the empty JSON string", V1NodeSelectorTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeSelectorTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeSelectorTerm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("matchExpressions") != null && !jsonObj.get("matchExpressions").isJsonNull()) {
        JsonArray jsonArraymatchExpressions = jsonObj.getAsJsonArray("matchExpressions");
        if (jsonArraymatchExpressions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchExpressions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchExpressions` to be an array in the JSON string but got `%s`", jsonObj.get("matchExpressions").toString()));
          }

          // validate the optional field `matchExpressions` (array)
          for (int i = 0; i < jsonArraymatchExpressions.size(); i++) {
            V1NodeSelectorRequirement.validateJsonObject(jsonArraymatchExpressions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("matchFields") != null && !jsonObj.get("matchFields").isJsonNull()) {
        JsonArray jsonArraymatchFields = jsonObj.getAsJsonArray("matchFields");
        if (jsonArraymatchFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchFields` to be an array in the JSON string but got `%s`", jsonObj.get("matchFields").toString()));
          }

          // validate the optional field `matchFields` (array)
          for (int i = 0; i < jsonArraymatchFields.size(); i++) {
            V1NodeSelectorRequirement.validateJsonObject(jsonArraymatchFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeSelectorTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeSelectorTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeSelectorTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeSelectorTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeSelectorTerm>() {
           @Override
           public void write(JsonWriter out, V1NodeSelectorTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeSelectorTerm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeSelectorTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeSelectorTerm
  * @throws IOException if the JSON string is invalid with respect to V1NodeSelectorTerm
  */
  public static V1NodeSelectorTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeSelectorTerm.class);
  }

 /**
  * Convert an instance of V1NodeSelectorTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
