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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourcePool describes the pool that ResourceSlices belong to.
 */
@ApiModel(description = "ResourcePool describes the pool that ResourceSlices belong to.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1ResourcePool {
  public static final String SERIALIZED_NAME_GENERATION = "generation";
  @SerializedName(SERIALIZED_NAME_GENERATION)
  private Long generation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE_SLICE_COUNT = "resourceSliceCount";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SLICE_COUNT)
  private Long resourceSliceCount;

  public V1beta1ResourcePool() {
  }

  public V1beta1ResourcePool generation(Long generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Generation tracks the change in a pool over time. Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.  Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.
   * @return generation
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Generation tracks the change in a pool over time. Whenever a driver changes something about one or more of the resources in a pool, it must change the generation in all ResourceSlices which are part of that pool. Consumers of ResourceSlices should only consider resources from the pool with the highest generation number. The generation may be reset by drivers, which should be fine for consumers, assuming that all ResourceSlices in a pool are updated to match or deleted.  Combined with ResourceSliceCount, this mechanism enables consumers to detect pools which are comprised of multiple ResourceSlices and are in an incomplete state.")
  public Long getGeneration() {
    return generation;
  }

  public void setGeneration(Long generation) {
    this.generation = generation;
  }


  public V1beta1ResourcePool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is used to identify the pool. For node-local devices, this is often the node name, but this is not required.  It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name is used to identify the pool. For node-local devices, this is often the node name, but this is not required.  It must not be longer than 253 characters and must consist of one or more DNS sub-domains separated by slashes. This field is immutable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ResourcePool resourceSliceCount(Long resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return this;
  }

   /**
   * ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.  Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.
   * @return resourceSliceCount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ResourceSliceCount is the total number of ResourceSlices in the pool at this generation number. Must be greater than zero.  Consumers can use this to check whether they have seen all ResourceSlices belonging to the same pool.")
  public Long getResourceSliceCount() {
    return resourceSliceCount;
  }

  public void setResourceSliceCount(Long resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ResourcePool v1beta1ResourcePool = (V1beta1ResourcePool) o;
    return Objects.equals(this.generation, v1beta1ResourcePool.generation) &&
        Objects.equals(this.name, v1beta1ResourcePool.name) &&
        Objects.equals(this.resourceSliceCount, v1beta1ResourcePool.resourceSliceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, name, resourceSliceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ResourcePool {\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSliceCount: ").append(toIndentedString(resourceSliceCount)).append("\n");
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
    openapiFields.add("generation");
    openapiFields.add("name");
    openapiFields.add("resourceSliceCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("generation");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("resourceSliceCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1ResourcePool
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1ResourcePool.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ResourcePool is not found in the empty JSON string", V1beta1ResourcePool.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ResourcePool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ResourcePool` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1ResourcePool.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ResourcePool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ResourcePool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ResourcePool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ResourcePool.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ResourcePool>() {
           @Override
           public void write(JsonWriter out, V1beta1ResourcePool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ResourcePool read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ResourcePool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ResourcePool
  * @throws IOException if the JSON string is invalid with respect to V1beta1ResourcePool
  */
  public static V1beta1ResourcePool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ResourcePool.class);
  }

 /**
  * Convert an instance of V1beta1ResourcePool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
