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
 * NamespaceSpec describes the attributes on a Namespace.
 */
@ApiModel(description = "NamespaceSpec describes the attributes on a Namespace.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NamespaceSpec {
  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  @jakarta.annotation.Nullable
  private List<String> finalizers = new ArrayList<>();

  public V1NamespaceSpec() {
  }

  public V1NamespaceSpec finalizers(@jakarta.annotation.Nullable List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1NamespaceSpec addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return finalizers
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(@jakarta.annotation.Nullable List<String> finalizers) {
    this.finalizers = finalizers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceSpec v1NamespaceSpec = (V1NamespaceSpec) o;
    return Objects.equals(this.finalizers, v1NamespaceSpec.finalizers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceSpec {\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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
    openapiFields.add("finalizers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NamespaceSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NamespaceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NamespaceSpec is not found in the empty JSON string", V1NamespaceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NamespaceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NamespaceSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("finalizers") != null && !jsonObj.get("finalizers").isJsonNull() && !jsonObj.get("finalizers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `finalizers` to be an array in the JSON string but got `%s`", jsonObj.get("finalizers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NamespaceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NamespaceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NamespaceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NamespaceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NamespaceSpec>() {
           @Override
           public void write(JsonWriter out, V1NamespaceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NamespaceSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NamespaceSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NamespaceSpec
   * @throws IOException if the JSON string is invalid with respect to V1NamespaceSpec
   */
  public static V1NamespaceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NamespaceSpec.class);
  }

  /**
   * Convert an instance of V1NamespaceSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
