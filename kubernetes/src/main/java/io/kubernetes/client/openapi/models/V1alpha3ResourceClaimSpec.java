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
import io.kubernetes.client.openapi.models.V1alpha3DeviceClaim;
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
 * ResourceClaimSpec defines what is being requested in a ResourceClaim and how to configure it.
 */
@ApiModel(description = "ResourceClaimSpec defines what is being requested in a ResourceClaim and how to configure it.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3ResourceClaimSpec {
  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private V1alpha3DeviceClaim devices;

  public V1alpha3ResourceClaimSpec() {
  }

  public V1alpha3ResourceClaimSpec devices(V1alpha3DeviceClaim devices) {
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3DeviceClaim getDevices() {
    return devices;
  }

  public void setDevices(V1alpha3DeviceClaim devices) {
    this.devices = devices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ResourceClaimSpec v1alpha3ResourceClaimSpec = (V1alpha3ResourceClaimSpec) o;
    return Objects.equals(this.devices, v1alpha3ResourceClaimSpec.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceClaimSpec {\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
    openapiFields.add("devices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3ResourceClaimSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3ResourceClaimSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3ResourceClaimSpec is not found in the empty JSON string", V1alpha3ResourceClaimSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3ResourceClaimSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3ResourceClaimSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `devices`
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        V1alpha3DeviceClaim.validateJsonElement(jsonObj.get("devices"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3ResourceClaimSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3ResourceClaimSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3ResourceClaimSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3ResourceClaimSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3ResourceClaimSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha3ResourceClaimSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3ResourceClaimSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3ResourceClaimSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3ResourceClaimSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha3ResourceClaimSpec
  */
  public static V1alpha3ResourceClaimSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3ResourceClaimSpec.class);
  }

 /**
  * Convert an instance of V1alpha3ResourceClaimSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
