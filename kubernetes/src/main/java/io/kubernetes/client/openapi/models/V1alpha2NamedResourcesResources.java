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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance;
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
 * NamedResourcesResources is used in ResourceModel.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T20:15:56.920539Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha2NamedResourcesResources {
  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<V1alpha2NamedResourcesInstance> instances = new ArrayList<>();

  public V1alpha2NamedResourcesResources() {
  }

  public V1alpha2NamedResourcesResources instances(List<V1alpha2NamedResourcesInstance> instances) {
    this.instances = instances;
    return this;
  }

  public V1alpha2NamedResourcesResources addInstancesItem(V1alpha2NamedResourcesInstance instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * The list of all individual resources instances currently available.
   * @return instances
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha2NamedResourcesInstance> getInstances() {
    return instances;
  }

  public void setInstances(List<V1alpha2NamedResourcesInstance> instances) {
    this.instances = instances;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesResources v1alpha2NamedResourcesResources = (V1alpha2NamedResourcesResources) o;
    return Objects.equals(this.instances, v1alpha2NamedResourcesResources.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesResources {\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
    openapiFields.add("instances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instances");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2NamedResourcesResources
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2NamedResourcesResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2NamedResourcesResources is not found in the empty JSON string", V1alpha2NamedResourcesResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2NamedResourcesResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2NamedResourcesResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2NamedResourcesResources.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("instances").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `instances` to be an array in the JSON string but got `%s`", jsonObj.get("instances").toString()));
      }

      JsonArray jsonArrayinstances = jsonObj.getAsJsonArray("instances");
      // validate the required field `instances` (array)
      for (int i = 0; i < jsonArrayinstances.size(); i++) {
        V1alpha2NamedResourcesInstance.validateJsonElement(jsonArrayinstances.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2NamedResourcesResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2NamedResourcesResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2NamedResourcesResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2NamedResourcesResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2NamedResourcesResources>() {
           @Override
           public void write(JsonWriter out, V1alpha2NamedResourcesResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2NamedResourcesResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2NamedResourcesResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2NamedResourcesResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha2NamedResourcesResources
  */
  public static V1alpha2NamedResourcesResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2NamedResourcesResources.class);
  }

 /**
  * Convert an instance of V1alpha2NamedResourcesResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
