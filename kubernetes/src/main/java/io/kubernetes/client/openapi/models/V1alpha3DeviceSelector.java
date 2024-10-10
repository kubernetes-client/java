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
import io.kubernetes.client.openapi.models.V1alpha3CELDeviceSelector;
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
 * DeviceSelector must have exactly one field set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceSelector {
  public static final String SERIALIZED_NAME_CEL = "cel";
  @SerializedName(SERIALIZED_NAME_CEL)
  private V1alpha3CELDeviceSelector cel;

  public V1alpha3DeviceSelector() {
  }

  public V1alpha3DeviceSelector cel(V1alpha3CELDeviceSelector cel) {
    this.cel = cel;
    return this;
  }

   /**
   * Get cel
   * @return cel
  **/
  @jakarta.annotation.Nullable
  public V1alpha3CELDeviceSelector getCel() {
    return cel;
  }

  public void setCel(V1alpha3CELDeviceSelector cel) {
    this.cel = cel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceSelector v1alpha3DeviceSelector = (V1alpha3DeviceSelector) o;
    return Objects.equals(this.cel, v1alpha3DeviceSelector.cel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceSelector {\n");
    sb.append("    cel: ").append(toIndentedString(cel)).append("\n");
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
    openapiFields.add("cel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceSelector
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceSelector is not found in the empty JSON string", V1alpha3DeviceSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cel`
      if (jsonObj.get("cel") != null && !jsonObj.get("cel").isJsonNull()) {
        V1alpha3CELDeviceSelector.validateJsonElement(jsonObj.get("cel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceSelector>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceSelector
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceSelector
  */
  public static V1alpha3DeviceSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceSelector.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
