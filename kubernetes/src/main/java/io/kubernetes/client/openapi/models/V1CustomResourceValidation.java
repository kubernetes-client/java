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
import io.kubernetes.client.openapi.models.V1JSONSchemaProps;
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
 * CustomResourceValidation is a list of validation methods for CustomResources.
 */
@ApiModel(description = "CustomResourceValidation is a list of validation methods for CustomResources.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CustomResourceValidation {
  public static final String SERIALIZED_NAME_OPEN_A_P_I_V3_SCHEMA = "openAPIV3Schema";
  @SerializedName(SERIALIZED_NAME_OPEN_A_P_I_V3_SCHEMA)
  @jakarta.annotation.Nullable
  private V1JSONSchemaProps openAPIV3Schema;

  public V1CustomResourceValidation() {
  }

  public V1CustomResourceValidation openAPIV3Schema(@jakarta.annotation.Nullable V1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }

  /**
   * Get openAPIV3Schema
   * @return openAPIV3Schema
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }

  public void setOpenAPIV3Schema(@jakarta.annotation.Nullable V1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceValidation v1CustomResourceValidation = (V1CustomResourceValidation) o;
    return Objects.equals(this.openAPIV3Schema, v1CustomResourceValidation.openAPIV3Schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAPIV3Schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceValidation {\n");
    sb.append("    openAPIV3Schema: ").append(toIndentedString(openAPIV3Schema)).append("\n");
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
    openapiFields.add("openAPIV3Schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CustomResourceValidation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CustomResourceValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceValidation is not found in the empty JSON string", V1CustomResourceValidation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceValidation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceValidation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `openAPIV3Schema`
      if (jsonObj.get("openAPIV3Schema") != null && !jsonObj.get("openAPIV3Schema").isJsonNull()) {
        V1JSONSchemaProps.validateJsonElement(jsonObj.get("openAPIV3Schema"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceValidation>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceValidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceValidation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CustomResourceValidation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CustomResourceValidation
   * @throws IOException if the JSON string is invalid with respect to V1CustomResourceValidation
   */
  public static V1CustomResourceValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceValidation.class);
  }

  /**
   * Convert an instance of V1CustomResourceValidation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
