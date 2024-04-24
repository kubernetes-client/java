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
 * Describe a container image
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ContainerImage {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "sizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Long sizeBytes;

  public V1ContainerImage() {
  }

  public V1ContainerImage names(List<String> names) {

    this.names = names;
    return this;
  }

  public V1ContainerImage addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Names by which this image is known. e.g. [\&quot;kubernetes.example/hyperkube:v1.0.7\&quot;, \&quot;cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7\&quot;]
   * @return names
  **/
  @jakarta.annotation.Nullable
  public List<String> getNames() {
    return names;
  }


  public void setNames(List<String> names) {
    this.names = names;
  }


  public V1ContainerImage sizeBytes(Long sizeBytes) {

    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * The size of the image in bytes.
   * @return sizeBytes
  **/
  @jakarta.annotation.Nullable
  public Long getSizeBytes() {
    return sizeBytes;
  }


  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerImage v1ContainerImage = (V1ContainerImage) o;
    return Objects.equals(this.names, v1ContainerImage.names) &&
        Objects.equals(this.sizeBytes, v1ContainerImage.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, sizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerImage {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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
    openapiFields.add("names");
    openapiFields.add("sizeBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ContainerImage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ContainerImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerImage is not found in the empty JSON string", V1ContainerImage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerImage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("names") != null && !jsonObj.get("names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `names` to be an array in the JSON string but got `%s`", jsonObj.get("names").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerImage.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerImage>() {
           @Override
           public void write(JsonWriter out, V1ContainerImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerImage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ContainerImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ContainerImage
  * @throws IOException if the JSON string is invalid with respect to V1ContainerImage
  */
  public static V1ContainerImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerImage.class);
  }

 /**
  * Convert an instance of V1ContainerImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
