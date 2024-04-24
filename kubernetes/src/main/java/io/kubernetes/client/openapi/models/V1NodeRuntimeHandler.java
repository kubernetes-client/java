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
import io.kubernetes.client.openapi.models.V1NodeRuntimeHandlerFeatures;
import java.io.IOException;

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
 * NodeRuntimeHandler is a set of runtime handler information.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeRuntimeHandler {
  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private V1NodeRuntimeHandlerFeatures features;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1NodeRuntimeHandler() {
  }

  public V1NodeRuntimeHandler features(V1NodeRuntimeHandlerFeatures features) {

    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @jakarta.annotation.Nullable
  public V1NodeRuntimeHandlerFeatures getFeatures() {
    return features;
  }


  public void setFeatures(V1NodeRuntimeHandlerFeatures features) {
    this.features = features;
  }


  public V1NodeRuntimeHandler name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Runtime handler name. Empty for the default runtime handler.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeRuntimeHandler v1NodeRuntimeHandler = (V1NodeRuntimeHandler) o;
    return Objects.equals(this.features, v1NodeRuntimeHandler.features) &&
        Objects.equals(this.name, v1NodeRuntimeHandler.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeRuntimeHandler {\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("features");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeRuntimeHandler
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeRuntimeHandler.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeRuntimeHandler is not found in the empty JSON string", V1NodeRuntimeHandler.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeRuntimeHandler.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeRuntimeHandler` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `features`
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        V1NodeRuntimeHandlerFeatures.validateJsonObject(jsonObj.getAsJsonObject("features"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeRuntimeHandler.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeRuntimeHandler' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeRuntimeHandler> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeRuntimeHandler.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeRuntimeHandler>() {
           @Override
           public void write(JsonWriter out, V1NodeRuntimeHandler value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeRuntimeHandler read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeRuntimeHandler given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeRuntimeHandler
  * @throws IOException if the JSON string is invalid with respect to V1NodeRuntimeHandler
  */
  public static V1NodeRuntimeHandler fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeRuntimeHandler.class);
  }

 /**
  * Convert an instance of V1NodeRuntimeHandler to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
