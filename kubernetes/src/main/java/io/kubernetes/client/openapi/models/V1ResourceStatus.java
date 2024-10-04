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
import io.kubernetes.client.openapi.models.V1ResourceHealth;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * V1ResourceStatus
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1ResourceStatus {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<V1ResourceHealth> resources = new ArrayList<>();

  public V1ResourceStatus() {
  }

  public V1ResourceStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the resource. Must be unique within the pod and match one of the resources from the pod spec.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1ResourceStatus resources(List<V1ResourceHealth> resources) {
    this.resources = resources;
    return this;
  }

  public V1ResourceStatus addResourcesItem(V1ResourceHealth resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of unique Resources health. Each element in the list contains an unique resource ID and resource health. At a minimum, ResourceID must uniquely identify the Resource allocated to the Pod on the Node for the lifetime of a Pod. See ResourceID type for it&#39;s definition.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public List<V1ResourceHealth> getResources() {
    return resources;
  }

  public void setResources(List<V1ResourceHealth> resources) {
    this.resources = resources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceStatus v1ResourceStatus = (V1ResourceStatus) o;
    return Objects.equals(this.name, v1ResourceStatus.name) &&
        Objects.equals(this.resources, v1ResourceStatus.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceStatus {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1ResourceStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceStatus is not found in the empty JSON string", V1ResourceStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ResourceStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
          }

          // validate the optional field `resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            V1ResourceHealth.validateJsonElement(jsonArrayresources.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceStatus>() {
           @Override
           public void write(JsonWriter out, V1ResourceStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ResourceStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ResourceStatus
  * @throws IOException if the JSON string is invalid with respect to V1ResourceStatus
  */
  public static V1ResourceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceStatus.class);
  }

 /**
  * Convert an instance of V1ResourceStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
