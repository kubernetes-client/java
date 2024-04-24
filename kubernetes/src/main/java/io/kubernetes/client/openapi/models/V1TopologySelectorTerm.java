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
import io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement;
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
 * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1TopologySelectorTerm {
  public static final String SERIALIZED_NAME_MATCH_LABEL_EXPRESSIONS = "matchLabelExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_LABEL_EXPRESSIONS)
  private List<V1TopologySelectorLabelRequirement> matchLabelExpressions;

  public V1TopologySelectorTerm() {
  }

  public V1TopologySelectorTerm matchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {

    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }

  public V1TopologySelectorTerm addMatchLabelExpressionsItem(V1TopologySelectorLabelRequirement matchLabelExpressionsItem) {
    if (this.matchLabelExpressions == null) {
      this.matchLabelExpressions = new ArrayList<>();
    }
    this.matchLabelExpressions.add(matchLabelExpressionsItem);
    return this;
  }

   /**
   * A list of topology selector requirements by labels.
   * @return matchLabelExpressions
  **/
  @jakarta.annotation.Nullable
  public List<V1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions;
  }


  public void setMatchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySelectorTerm v1TopologySelectorTerm = (V1TopologySelectorTerm) o;
    return Objects.equals(this.matchLabelExpressions, v1TopologySelectorTerm.matchLabelExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchLabelExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySelectorTerm {\n");
    sb.append("    matchLabelExpressions: ").append(toIndentedString(matchLabelExpressions)).append("\n");
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
    openapiFields.add("matchLabelExpressions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1TopologySelectorTerm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1TopologySelectorTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TopologySelectorTerm is not found in the empty JSON string", V1TopologySelectorTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1TopologySelectorTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TopologySelectorTerm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("matchLabelExpressions") != null && !jsonObj.get("matchLabelExpressions").isJsonNull()) {
        JsonArray jsonArraymatchLabelExpressions = jsonObj.getAsJsonArray("matchLabelExpressions");
        if (jsonArraymatchLabelExpressions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchLabelExpressions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchLabelExpressions` to be an array in the JSON string but got `%s`", jsonObj.get("matchLabelExpressions").toString()));
          }

          // validate the optional field `matchLabelExpressions` (array)
          for (int i = 0; i < jsonArraymatchLabelExpressions.size(); i++) {
            V1TopologySelectorLabelRequirement.validateJsonObject(jsonArraymatchLabelExpressions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TopologySelectorTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TopologySelectorTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TopologySelectorTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TopologySelectorTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TopologySelectorTerm>() {
           @Override
           public void write(JsonWriter out, V1TopologySelectorTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TopologySelectorTerm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1TopologySelectorTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1TopologySelectorTerm
  * @throws IOException if the JSON string is invalid with respect to V1TopologySelectorTerm
  */
  public static V1TopologySelectorTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TopologySelectorTerm.class);
  }

 /**
  * Convert an instance of V1TopologySelectorTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
