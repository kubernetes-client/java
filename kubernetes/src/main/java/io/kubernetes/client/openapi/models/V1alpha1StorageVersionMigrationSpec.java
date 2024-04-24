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
import io.kubernetes.client.openapi.models.V1alpha1GroupVersionResource;
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
 * Spec of the storage version migration.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1StorageVersionMigrationSpec {
  public static final String SERIALIZED_NAME_CONTINUE_TOKEN = "continueToken";
  @SerializedName(SERIALIZED_NAME_CONTINUE_TOKEN)
  private String continueToken;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V1alpha1GroupVersionResource resource;

  public V1alpha1StorageVersionMigrationSpec() {
  }

  public V1alpha1StorageVersionMigrationSpec continueToken(String continueToken) {

    this.continueToken = continueToken;
    return this;
  }

   /**
   * The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is \&quot;Running\&quot;, users can use this token to check the progress of the migration.
   * @return continueToken
  **/
  @jakarta.annotation.Nullable
  public String getContinueToken() {
    return continueToken;
  }


  public void setContinueToken(String continueToken) {
    this.continueToken = continueToken;
  }


  public V1alpha1StorageVersionMigrationSpec resource(V1alpha1GroupVersionResource resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @jakarta.annotation.Nonnull
  public V1alpha1GroupVersionResource getResource() {
    return resource;
  }


  public void setResource(V1alpha1GroupVersionResource resource) {
    this.resource = resource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StorageVersionMigrationSpec v1alpha1StorageVersionMigrationSpec = (V1alpha1StorageVersionMigrationSpec) o;
    return Objects.equals(this.continueToken, v1alpha1StorageVersionMigrationSpec.continueToken) &&
        Objects.equals(this.resource, v1alpha1StorageVersionMigrationSpec.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continueToken, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionMigrationSpec {\n");
    sb.append("    continueToken: ").append(toIndentedString(continueToken)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("continueToken");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resource");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1StorageVersionMigrationSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1StorageVersionMigrationSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1StorageVersionMigrationSpec is not found in the empty JSON string", V1alpha1StorageVersionMigrationSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1StorageVersionMigrationSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1StorageVersionMigrationSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1StorageVersionMigrationSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("continueToken") != null && !jsonObj.get("continueToken").isJsonNull()) && !jsonObj.get("continueToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `continueToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("continueToken").toString()));
      }
      // validate the required field `resource`
      V1alpha1GroupVersionResource.validateJsonObject(jsonObj.getAsJsonObject("resource"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1StorageVersionMigrationSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1StorageVersionMigrationSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1StorageVersionMigrationSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1StorageVersionMigrationSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1StorageVersionMigrationSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1StorageVersionMigrationSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1StorageVersionMigrationSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1StorageVersionMigrationSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1StorageVersionMigrationSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1StorageVersionMigrationSpec
  */
  public static V1alpha1StorageVersionMigrationSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1StorageVersionMigrationSpec.class);
  }

 /**
  * Convert an instance of V1alpha1StorageVersionMigrationSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
