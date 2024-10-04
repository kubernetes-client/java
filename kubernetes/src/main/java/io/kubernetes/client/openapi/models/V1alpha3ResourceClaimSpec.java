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
import io.kubernetes.client.openapi.models.V1alpha3DeviceClaim;
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
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3ResourceClaimSpec {
  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private String controller;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private V1alpha3DeviceClaim devices;

  public V1alpha3ResourceClaimSpec() {
  }

  public V1alpha3ResourceClaimSpec controller(String controller) {
    this.controller = controller;
    return this;
  }

   /**
   * Controller is the name of the DRA driver that is meant to handle allocation of this claim. If empty, allocation is handled by the scheduler while scheduling a pod.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.  This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
   * @return controller
  **/
  @jakarta.annotation.Nullable
  public String getController() {
    return controller;
  }

  public void setController(String controller) {
    this.controller = controller;
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
    return Objects.equals(this.controller, v1alpha3ResourceClaimSpec.controller) &&
        Objects.equals(this.devices, v1alpha3ResourceClaimSpec.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceClaimSpec {\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
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
    openapiFields.add("controller");
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
      if ((jsonObj.get("controller") != null && !jsonObj.get("controller").isJsonNull()) && !jsonObj.get("controller").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controller` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controller").toString()));
      }
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
