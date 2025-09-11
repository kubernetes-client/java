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
import io.kubernetes.client.openapi.models.V1NodeSelectorTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 */
@ApiModel(description = "An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PreferredSchedulingTerm {
  public static final String SERIALIZED_NAME_PREFERENCE = "preference";
  @SerializedName(SERIALIZED_NAME_PREFERENCE)
  @jakarta.annotation.Nonnull
  private V1NodeSelectorTerm preference;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  @jakarta.annotation.Nonnull
  private Integer weight;

  public V1PreferredSchedulingTerm() {
  }

  public V1PreferredSchedulingTerm preference(@jakarta.annotation.Nonnull V1NodeSelectorTerm preference) {
    this.preference = preference;
    return this;
  }

  /**
   * Get preference
   * @return preference
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1NodeSelectorTerm getPreference() {
    return preference;
  }

  public void setPreference(@jakarta.annotation.Nonnull V1NodeSelectorTerm preference) {
    this.preference = preference;
  }


  public V1PreferredSchedulingTerm weight(@jakarta.annotation.Nonnull Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   * @return weight
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(@jakarta.annotation.Nonnull Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PreferredSchedulingTerm v1PreferredSchedulingTerm = (V1PreferredSchedulingTerm) o;
    return Objects.equals(this.preference, v1PreferredSchedulingTerm.preference) &&
        Objects.equals(this.weight, v1PreferredSchedulingTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PreferredSchedulingTerm {\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("preference");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("preference");
    openapiRequiredFields.add("weight");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PreferredSchedulingTerm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PreferredSchedulingTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PreferredSchedulingTerm is not found in the empty JSON string", V1PreferredSchedulingTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PreferredSchedulingTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PreferredSchedulingTerm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PreferredSchedulingTerm.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `preference`
      V1NodeSelectorTerm.validateJsonElement(jsonObj.get("preference"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PreferredSchedulingTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PreferredSchedulingTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PreferredSchedulingTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PreferredSchedulingTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PreferredSchedulingTerm>() {
           @Override
           public void write(JsonWriter out, V1PreferredSchedulingTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PreferredSchedulingTerm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PreferredSchedulingTerm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PreferredSchedulingTerm
   * @throws IOException if the JSON string is invalid with respect to V1PreferredSchedulingTerm
   */
  public static V1PreferredSchedulingTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PreferredSchedulingTerm.class);
  }

  /**
   * Convert an instance of V1PreferredSchedulingTerm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
