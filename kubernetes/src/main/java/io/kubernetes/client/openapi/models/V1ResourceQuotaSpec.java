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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1ScopeSelector;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ResourceQuotaSpec {
  public static final String SERIALIZED_NAME_HARD = "hard";
  @SerializedName(SERIALIZED_NAME_HARD)
  private Map<String, Quantity> hard = new HashMap<>();

  public static final String SERIALIZED_NAME_SCOPE_SELECTOR = "scopeSelector";
  @SerializedName(SERIALIZED_NAME_SCOPE_SELECTOR)
  private V1ScopeSelector scopeSelector;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes;

  public V1ResourceQuotaSpec() {
  }

  public V1ResourceQuotaSpec hard(Map<String, Quantity> hard) {

    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaSpec putHardItem(String key, Quantity hardItem) {
    if (this.hard == null) {
      this.hard = new HashMap<>();
    }
    this.hard.put(key, hardItem);
    return this;
  }

   /**
   * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   * @return hard
  **/
  @jakarta.annotation.Nullable
  public Map<String, Quantity> getHard() {
    return hard;
  }


  public void setHard(Map<String, Quantity> hard) {
    this.hard = hard;
  }


  public V1ResourceQuotaSpec scopeSelector(V1ScopeSelector scopeSelector) {

    this.scopeSelector = scopeSelector;
    return this;
  }

   /**
   * Get scopeSelector
   * @return scopeSelector
  **/
  @jakarta.annotation.Nullable
  public V1ScopeSelector getScopeSelector() {
    return scopeSelector;
  }


  public void setScopeSelector(V1ScopeSelector scopeSelector) {
    this.scopeSelector = scopeSelector;
  }


  public V1ResourceQuotaSpec scopes(List<String> scopes) {

    this.scopes = scopes;
    return this;
  }

  public V1ResourceQuotaSpec addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
   * @return scopes
  **/
  @jakarta.annotation.Nullable
  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaSpec v1ResourceQuotaSpec = (V1ResourceQuotaSpec) o;
    return Objects.equals(this.hard, v1ResourceQuotaSpec.hard) &&
        Objects.equals(this.scopeSelector, v1ResourceQuotaSpec.scopeSelector) &&
        Objects.equals(this.scopes, v1ResourceQuotaSpec.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, scopeSelector, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaSpec {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    scopeSelector: ").append(toIndentedString(scopeSelector)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
    openapiFields.add("hard");
    openapiFields.add("scopeSelector");
    openapiFields.add("scopes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ResourceQuotaSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ResourceQuotaSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceQuotaSpec is not found in the empty JSON string", V1ResourceQuotaSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceQuotaSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceQuotaSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `scopeSelector`
      if (jsonObj.get("scopeSelector") != null && !jsonObj.get("scopeSelector").isJsonNull()) {
        V1ScopeSelector.validateJsonObject(jsonObj.getAsJsonObject("scopeSelector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceQuotaSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceQuotaSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceQuotaSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceQuotaSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceQuotaSpec>() {
           @Override
           public void write(JsonWriter out, V1ResourceQuotaSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceQuotaSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ResourceQuotaSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ResourceQuotaSpec
  * @throws IOException if the JSON string is invalid with respect to V1ResourceQuotaSpec
  */
  public static V1ResourceQuotaSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceQuotaSpec.class);
  }

 /**
  * Convert an instance of V1ResourceQuotaSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
