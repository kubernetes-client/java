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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesRequest;
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
 * ResourceRequest is a request for resources from one particular driver.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceRequest {
  public static final String SERIALIZED_NAME_NAMED_RESOURCES = "namedResources";
  @SerializedName(SERIALIZED_NAME_NAMED_RESOURCES)
  private V1alpha2NamedResourcesRequest namedResources;

  public static final String SERIALIZED_NAME_VENDOR_PARAMETERS = "vendorParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_PARAMETERS)
  private Object vendorParameters;

  public V1alpha2ResourceRequest() {
  }

  public V1alpha2ResourceRequest namedResources(V1alpha2NamedResourcesRequest namedResources) {

    this.namedResources = namedResources;
    return this;
  }

   /**
   * Get namedResources
   * @return namedResources
  **/
  @jakarta.annotation.Nullable
  public V1alpha2NamedResourcesRequest getNamedResources() {
    return namedResources;
  }


  public void setNamedResources(V1alpha2NamedResourcesRequest namedResources) {
    this.namedResources = namedResources;
  }


  public V1alpha2ResourceRequest vendorParameters(Object vendorParameters) {

    this.vendorParameters = vendorParameters;
    return this;
  }

   /**
   * VendorParameters are arbitrary setup parameters for the requested resource. They are ignored while allocating a claim.
   * @return vendorParameters
  **/
  @jakarta.annotation.Nullable
  public Object getVendorParameters() {
    return vendorParameters;
  }


  public void setVendorParameters(Object vendorParameters) {
    this.vendorParameters = vendorParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceRequest v1alpha2ResourceRequest = (V1alpha2ResourceRequest) o;
    return Objects.equals(this.namedResources, v1alpha2ResourceRequest.namedResources) &&
        Objects.equals(this.vendorParameters, v1alpha2ResourceRequest.vendorParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedResources, vendorParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceRequest {\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    vendorParameters: ").append(toIndentedString(vendorParameters)).append("\n");
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
    openapiFields.add("namedResources");
    openapiFields.add("vendorParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceRequest is not found in the empty JSON string", V1alpha2ResourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `namedResources`
      if (jsonObj.get("namedResources") != null && !jsonObj.get("namedResources").isJsonNull()) {
        V1alpha2NamedResourcesRequest.validateJsonObject(jsonObj.getAsJsonObject("namedResources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceRequest>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceRequest
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceRequest
  */
  public static V1alpha2ResourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceRequest.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
