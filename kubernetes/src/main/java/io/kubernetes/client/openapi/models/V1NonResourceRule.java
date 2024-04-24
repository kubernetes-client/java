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
 * NonResourceRule holds information that describes a rule for the non-resource
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NonResourceRule {
  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  private List<String> nonResourceURLs;

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public V1NonResourceRule() {
  }

  public V1NonResourceRule nonResourceURLs(List<String> nonResourceURLs) {

    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1NonResourceRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

   /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \&quot;*\&quot; means all.
   * @return nonResourceURLs
  **/
  @jakarta.annotation.Nullable
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }


  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }


  public V1NonResourceRule verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1NonResourceRule addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

   /**
   * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \&quot;*\&quot; means all.
   * @return verbs
  **/
  @jakarta.annotation.Nonnull
  public List<String> getVerbs() {
    return verbs;
  }


  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NonResourceRule v1NonResourceRule = (V1NonResourceRule) o;
    return Objects.equals(this.nonResourceURLs, v1NonResourceRule.nonResourceURLs) &&
        Objects.equals(this.verbs, v1NonResourceRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceURLs, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NonResourceRule {\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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
    openapiFields.add("nonResourceURLs");
    openapiFields.add("verbs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verbs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NonResourceRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NonResourceRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NonResourceRule is not found in the empty JSON string", V1NonResourceRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NonResourceRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NonResourceRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NonResourceRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nonResourceURLs") != null && !jsonObj.get("nonResourceURLs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonResourceURLs` to be an array in the JSON string but got `%s`", jsonObj.get("nonResourceURLs").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("verbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("verbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbs` to be an array in the JSON string but got `%s`", jsonObj.get("verbs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NonResourceRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NonResourceRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NonResourceRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NonResourceRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NonResourceRule>() {
           @Override
           public void write(JsonWriter out, V1NonResourceRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NonResourceRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NonResourceRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NonResourceRule
  * @throws IOException if the JSON string is invalid with respect to V1NonResourceRule
  */
  public static V1NonResourceRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NonResourceRule.class);
  }

 /**
  * Convert an instance of V1NonResourceRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
