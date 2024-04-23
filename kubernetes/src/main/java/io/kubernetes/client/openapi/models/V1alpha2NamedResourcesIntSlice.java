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
 * NamedResourcesIntSlice contains a slice of 64-bit integers.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2NamedResourcesIntSlice {
  public static final String SERIALIZED_NAME_INTS = "ints";
  @SerializedName(SERIALIZED_NAME_INTS)
  private List<Long> ints = new ArrayList<>();

  public V1alpha2NamedResourcesIntSlice() {
  }

  public V1alpha2NamedResourcesIntSlice ints(List<Long> ints) {

    this.ints = ints;
    return this;
  }

  public V1alpha2NamedResourcesIntSlice addIntsItem(Long intsItem) {
    if (this.ints == null) {
      this.ints = new ArrayList<>();
    }
    this.ints.add(intsItem);
    return this;
  }

   /**
   * Ints is the slice of 64-bit integers.
   * @return ints
  **/
  @jakarta.annotation.Nonnull
  public List<Long> getInts() {
    return ints;
  }


  public void setInts(List<Long> ints) {
    this.ints = ints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesIntSlice v1alpha2NamedResourcesIntSlice = (V1alpha2NamedResourcesIntSlice) o;
    return Objects.equals(this.ints, v1alpha2NamedResourcesIntSlice.ints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesIntSlice {\n");
    sb.append("    ints: ").append(toIndentedString(ints)).append("\n");
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
    openapiFields.add("ints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ints");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2NamedResourcesIntSlice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2NamedResourcesIntSlice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2NamedResourcesIntSlice is not found in the empty JSON string", V1alpha2NamedResourcesIntSlice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2NamedResourcesIntSlice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2NamedResourcesIntSlice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2NamedResourcesIntSlice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("ints") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ints` to be an array in the JSON string but got `%s`", jsonObj.get("ints").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2NamedResourcesIntSlice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2NamedResourcesIntSlice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2NamedResourcesIntSlice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2NamedResourcesIntSlice.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2NamedResourcesIntSlice>() {
           @Override
           public void write(JsonWriter out, V1alpha2NamedResourcesIntSlice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2NamedResourcesIntSlice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2NamedResourcesIntSlice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2NamedResourcesIntSlice
  * @throws IOException if the JSON string is invalid with respect to V1alpha2NamedResourcesIntSlice
  */
  public static V1alpha2NamedResourcesIntSlice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2NamedResourcesIntSlice.class);
  }

 /**
  * Convert an instance of V1alpha2NamedResourcesIntSlice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
