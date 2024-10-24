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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * NodeRuntimeHandlerFeatures is a set of features implemented by the runtime handler.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1NodeRuntimeHandlerFeatures {
  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY_MOUNTS = "recursiveReadOnlyMounts";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY_MOUNTS)
  private Boolean recursiveReadOnlyMounts;

  public static final String SERIALIZED_NAME_USER_NAMESPACES = "userNamespaces";
  @SerializedName(SERIALIZED_NAME_USER_NAMESPACES)
  private Boolean userNamespaces;

  public V1NodeRuntimeHandlerFeatures() {
  }

  public V1NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return this;
  }

   /**
   * RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
   * @return recursiveReadOnlyMounts
  **/
  @jakarta.annotation.Nullable
  public Boolean getRecursiveReadOnlyMounts() {
    return recursiveReadOnlyMounts;
  }

  public void setRecursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
  }


  public V1NodeRuntimeHandlerFeatures userNamespaces(Boolean userNamespaces) {
    this.userNamespaces = userNamespaces;
    return this;
  }

   /**
   * UserNamespaces is set to true if the runtime handler supports UserNamespaces, including for volumes.
   * @return userNamespaces
  **/
  @jakarta.annotation.Nullable
  public Boolean getUserNamespaces() {
    return userNamespaces;
  }

  public void setUserNamespaces(Boolean userNamespaces) {
    this.userNamespaces = userNamespaces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeRuntimeHandlerFeatures v1NodeRuntimeHandlerFeatures = (V1NodeRuntimeHandlerFeatures) o;
    return Objects.equals(this.recursiveReadOnlyMounts, v1NodeRuntimeHandlerFeatures.recursiveReadOnlyMounts) &&
        Objects.equals(this.userNamespaces, v1NodeRuntimeHandlerFeatures.userNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recursiveReadOnlyMounts, userNamespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeRuntimeHandlerFeatures {\n");
    sb.append("    recursiveReadOnlyMounts: ").append(toIndentedString(recursiveReadOnlyMounts)).append("\n");
    sb.append("    userNamespaces: ").append(toIndentedString(userNamespaces)).append("\n");
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
    openapiFields.add("recursiveReadOnlyMounts");
    openapiFields.add("userNamespaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1NodeRuntimeHandlerFeatures
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeRuntimeHandlerFeatures.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeRuntimeHandlerFeatures is not found in the empty JSON string", V1NodeRuntimeHandlerFeatures.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeRuntimeHandlerFeatures.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeRuntimeHandlerFeatures` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeRuntimeHandlerFeatures.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeRuntimeHandlerFeatures' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeRuntimeHandlerFeatures> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeRuntimeHandlerFeatures.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeRuntimeHandlerFeatures>() {
           @Override
           public void write(JsonWriter out, V1NodeRuntimeHandlerFeatures value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeRuntimeHandlerFeatures read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeRuntimeHandlerFeatures given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeRuntimeHandlerFeatures
  * @throws IOException if the JSON string is invalid with respect to V1NodeRuntimeHandlerFeatures
  */
  public static V1NodeRuntimeHandlerFeatures fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeRuntimeHandlerFeatures.class);
  }

 /**
  * Convert an instance of V1NodeRuntimeHandlerFeatures to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
