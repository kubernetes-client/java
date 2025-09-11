/*
Copyright 2025 The Kubernetes Authors.
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
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 */
@ApiModel(description = "NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NonResourcePolicyRule {
  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  @jakarta.annotation.Nonnull
  private List<String> nonResourceURLs = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  @jakarta.annotation.Nonnull
  private List<String> verbs = new ArrayList<>();

  public V1NonResourcePolicyRule() {
  }

  public V1NonResourcePolicyRule nonResourceURLs(@jakarta.annotation.Nonnull List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1NonResourcePolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

  /**
   * &#x60;nonResourceURLs&#x60; is a set of url prefixes that a user should have access to and may not be empty. For example:   - \&quot;/healthz\&quot; is legal   - \&quot;/hea*\&quot; is illegal   - \&quot;/hea\&quot; is legal but matches nothing   - \&quot;/hea/_*\&quot; also matches nothing   - \&quot;/healthz/_*\&quot; matches all per-component health checks. \&quot;*\&quot; matches all non-resource urls. if it is present, it must be the only entry. Required.
   * @return nonResourceURLs
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:   - \"/healthz\" is legal   - \"/hea*\" is illegal   - \"/hea\" is legal but matches nothing   - \"/hea/_*\" also matches nothing   - \"/healthz/_*\" matches all per-component health checks. \"*\" matches all non-resource urls. if it is present, it must be the only entry. Required.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(@jakarta.annotation.Nonnull List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }


  public V1NonResourcePolicyRule verbs(@jakarta.annotation.Nonnull List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public V1NonResourcePolicyRule addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * &#x60;verbs&#x60; is a list of matching verbs and may not be empty. \&quot;*\&quot; matches all verbs. If it is present, it must be the only entry. Required.
   * @return verbs
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`verbs` is a list of matching verbs and may not be empty. \"*\" matches all verbs. If it is present, it must be the only entry. Required.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(@jakarta.annotation.Nonnull List<String> verbs) {
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
    V1NonResourcePolicyRule v1NonResourcePolicyRule = (V1NonResourcePolicyRule) o;
    return Objects.equals(this.nonResourceURLs, v1NonResourcePolicyRule.nonResourceURLs) &&
        Objects.equals(this.verbs, v1NonResourcePolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceURLs, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NonResourcePolicyRule {\n");
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
    openapiRequiredFields.add("nonResourceURLs");
    openapiRequiredFields.add("verbs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NonResourcePolicyRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NonResourcePolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NonResourcePolicyRule is not found in the empty JSON string", V1NonResourcePolicyRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NonResourcePolicyRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NonResourcePolicyRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NonResourcePolicyRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("nonResourceURLs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("nonResourceURLs").isJsonArray()) {
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
       if (!V1NonResourcePolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NonResourcePolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NonResourcePolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NonResourcePolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NonResourcePolicyRule>() {
           @Override
           public void write(JsonWriter out, V1NonResourcePolicyRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NonResourcePolicyRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NonResourcePolicyRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NonResourcePolicyRule
   * @throws IOException if the JSON string is invalid with respect to V1NonResourcePolicyRule
   */
  public static V1NonResourcePolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NonResourcePolicyRule.class);
  }

  /**
   * Convert an instance of V1NonResourcePolicyRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
