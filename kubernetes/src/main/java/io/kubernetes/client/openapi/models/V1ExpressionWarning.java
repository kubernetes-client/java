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
 * ExpressionWarning is a warning information that targets a specific expression.
 */
@ApiModel(description = "ExpressionWarning is a warning information that targets a specific expression.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ExpressionWarning {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  @jakarta.annotation.Nonnull
  private String fieldRef;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  @jakarta.annotation.Nonnull
  private String warning;

  public V1ExpressionWarning() {
  }

  public V1ExpressionWarning fieldRef(@jakarta.annotation.Nonnull String fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * The path to the field that refers the expression. For example, the reference to the expression of the first item of validations is \&quot;spec.validations[0].expression\&quot;
   * @return fieldRef
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path to the field that refers the expression. For example, the reference to the expression of the first item of validations is \"spec.validations[0].expression\"")
  public String getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(@jakarta.annotation.Nonnull String fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1ExpressionWarning warning(@jakarta.annotation.Nonnull String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * The content of type checking information in a human-readable form. Each line of the warning contains the type that the expression is checked against, followed by the type check error from the compiler.
   * @return warning
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The content of type checking information in a human-readable form. Each line of the warning contains the type that the expression is checked against, followed by the type check error from the compiler.")
  public String getWarning() {
    return warning;
  }

  public void setWarning(@jakarta.annotation.Nonnull String warning) {
    this.warning = warning;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ExpressionWarning v1ExpressionWarning = (V1ExpressionWarning) o;
    return Objects.equals(this.fieldRef, v1ExpressionWarning.fieldRef) &&
        Objects.equals(this.warning, v1ExpressionWarning.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ExpressionWarning {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
    openapiFields.add("fieldRef");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldRef");
    openapiRequiredFields.add("warning");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ExpressionWarning
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ExpressionWarning.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ExpressionWarning is not found in the empty JSON string", V1ExpressionWarning.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ExpressionWarning.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ExpressionWarning` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ExpressionWarning.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fieldRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldRef").toString()));
      }
      if (!jsonObj.get("warning").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ExpressionWarning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ExpressionWarning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ExpressionWarning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ExpressionWarning.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ExpressionWarning>() {
           @Override
           public void write(JsonWriter out, V1ExpressionWarning value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ExpressionWarning read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ExpressionWarning given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ExpressionWarning
   * @throws IOException if the JSON string is invalid with respect to V1ExpressionWarning
   */
  public static V1ExpressionWarning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ExpressionWarning.class);
  }

  /**
   * Convert an instance of V1ExpressionWarning to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
