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
 * NodeFeatures describes the set of features implemented by the CRI implementation. The features contained in the NodeFeatures should depend only on the cri implementation independent of runtime handlers.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1NodeFeatures {
  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY = "supplementalGroupsPolicy";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY)
  private Boolean supplementalGroupsPolicy;

  public V1NodeFeatures() {
  }

  public V1NodeFeatures supplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return this;
  }

   /**
   * SupplementalGroupsPolicy is set to true if the runtime supports SupplementalGroupsPolicy and ContainerUser.
   * @return supplementalGroupsPolicy
  **/
  @jakarta.annotation.Nullable
  public Boolean getSupplementalGroupsPolicy() {
    return supplementalGroupsPolicy;
  }

  public void setSupplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeFeatures v1NodeFeatures = (V1NodeFeatures) o;
    return Objects.equals(this.supplementalGroupsPolicy, v1NodeFeatures.supplementalGroupsPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplementalGroupsPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeFeatures {\n");
    sb.append("    supplementalGroupsPolicy: ").append(toIndentedString(supplementalGroupsPolicy)).append("\n");
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
    openapiFields.add("supplementalGroupsPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1NodeFeatures
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeFeatures.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeFeatures is not found in the empty JSON string", V1NodeFeatures.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeFeatures.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeFeatures` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeFeatures.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeFeatures' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeFeatures> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeFeatures.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeFeatures>() {
           @Override
           public void write(JsonWriter out, V1NodeFeatures value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeFeatures read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeFeatures given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeFeatures
  * @throws IOException if the JSON string is invalid with respect to V1NodeFeatures
  */
  public static V1NodeFeatures fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeFeatures.class);
  }

 /**
  * Convert an instance of V1NodeFeatures to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
