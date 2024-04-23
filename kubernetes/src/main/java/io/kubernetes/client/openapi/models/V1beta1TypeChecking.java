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
import io.kubernetes.client.openapi.models.V1beta1ExpressionWarning;
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
 * TypeChecking contains results of type checking the expressions in the ValidatingAdmissionPolicy
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1beta1TypeChecking {
  public static final String SERIALIZED_NAME_EXPRESSION_WARNINGS = "expressionWarnings";
  @SerializedName(SERIALIZED_NAME_EXPRESSION_WARNINGS)
  private List<V1beta1ExpressionWarning> expressionWarnings;

  public V1beta1TypeChecking() {
  }

  public V1beta1TypeChecking expressionWarnings(List<V1beta1ExpressionWarning> expressionWarnings) {

    this.expressionWarnings = expressionWarnings;
    return this;
  }

  public V1beta1TypeChecking addExpressionWarningsItem(V1beta1ExpressionWarning expressionWarningsItem) {
    if (this.expressionWarnings == null) {
      this.expressionWarnings = new ArrayList<>();
    }
    this.expressionWarnings.add(expressionWarningsItem);
    return this;
  }

   /**
   * The type checking warnings for each expression.
   * @return expressionWarnings
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1ExpressionWarning> getExpressionWarnings() {
    return expressionWarnings;
  }


  public void setExpressionWarnings(List<V1beta1ExpressionWarning> expressionWarnings) {
    this.expressionWarnings = expressionWarnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TypeChecking v1beta1TypeChecking = (V1beta1TypeChecking) o;
    return Objects.equals(this.expressionWarnings, v1beta1TypeChecking.expressionWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TypeChecking {\n");
    sb.append("    expressionWarnings: ").append(toIndentedString(expressionWarnings)).append("\n");
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
    openapiFields.add("expressionWarnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1TypeChecking
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1TypeChecking.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1TypeChecking is not found in the empty JSON string", V1beta1TypeChecking.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1TypeChecking.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1TypeChecking` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("expressionWarnings") != null && !jsonObj.get("expressionWarnings").isJsonNull()) {
        JsonArray jsonArrayexpressionWarnings = jsonObj.getAsJsonArray("expressionWarnings");
        if (jsonArrayexpressionWarnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expressionWarnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expressionWarnings` to be an array in the JSON string but got `%s`", jsonObj.get("expressionWarnings").toString()));
          }

          // validate the optional field `expressionWarnings` (array)
          for (int i = 0; i < jsonArrayexpressionWarnings.size(); i++) {
            V1beta1ExpressionWarning.validateJsonObject(jsonArrayexpressionWarnings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1TypeChecking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1TypeChecking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1TypeChecking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1TypeChecking.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1TypeChecking>() {
           @Override
           public void write(JsonWriter out, V1beta1TypeChecking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1TypeChecking read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1TypeChecking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1TypeChecking
  * @throws IOException if the JSON string is invalid with respect to V1beta1TypeChecking
  */
  public static V1beta1TypeChecking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1TypeChecking.class);
  }

 /**
  * Convert an instance of V1beta1TypeChecking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
