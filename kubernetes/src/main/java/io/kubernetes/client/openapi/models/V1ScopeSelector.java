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
import io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement;
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
 * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ScopeSelector {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1ScopedResourceSelectorRequirement> matchExpressions;

  public V1ScopeSelector() {
  }

  public V1ScopeSelector matchExpressions(List<V1ScopedResourceSelectorRequirement> matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1ScopeSelector addMatchExpressionsItem(V1ScopedResourceSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * A list of scope selector requirements by scope of the resources.
   * @return matchExpressions
  **/
  @jakarta.annotation.Nullable
  public List<V1ScopedResourceSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1ScopedResourceSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScopeSelector v1ScopeSelector = (V1ScopeSelector) o;
    return Objects.equals(this.matchExpressions, v1ScopeSelector.matchExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopeSelector {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ScopeSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ScopeSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ScopeSelector is not found in the empty JSON string", V1ScopeSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ScopeSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ScopeSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
            V1ScopedResourceSelectorRequirement.validateJsonObject(jsonArraymatchExpressions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ScopeSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ScopeSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ScopeSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ScopeSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ScopeSelector>() {
           @Override
           public void write(JsonWriter out, V1ScopeSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ScopeSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ScopeSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ScopeSelector
  * @throws IOException if the JSON string is invalid with respect to V1ScopeSelector
  */
  public static V1ScopeSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ScopeSelector.class);
  }

 /**
  * Convert an instance of V1ScopeSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
