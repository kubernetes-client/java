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
import io.kubernetes.client.openapi.models.V1alpha2ResourceRequest;
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
 * DriverRequests describes all resources that are needed from one particular driver.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2DriverRequests {
  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<V1alpha2ResourceRequest> requests;

  public static final String SERIALIZED_NAME_VENDOR_PARAMETERS = "vendorParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_PARAMETERS)
  private Object vendorParameters;

  public V1alpha2DriverRequests() {
  }

  public V1alpha2DriverRequests driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   * @return driverName
  **/
  @jakarta.annotation.Nullable
  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2DriverRequests requests(List<V1alpha2ResourceRequest> requests) {

    this.requests = requests;
    return this;
  }

  public V1alpha2DriverRequests addRequestsItem(V1alpha2ResourceRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests describes all resources that are needed from the driver.
   * @return requests
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2ResourceRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<V1alpha2ResourceRequest> requests) {
    this.requests = requests;
  }


  public V1alpha2DriverRequests vendorParameters(Object vendorParameters) {

    this.vendorParameters = vendorParameters;
    return this;
  }

   /**
   * VendorParameters are arbitrary setup parameters for all requests of the claim. They are ignored while allocating the claim.
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
    V1alpha2DriverRequests v1alpha2DriverRequests = (V1alpha2DriverRequests) o;
    return Objects.equals(this.driverName, v1alpha2DriverRequests.driverName) &&
        Objects.equals(this.requests, v1alpha2DriverRequests.requests) &&
        Objects.equals(this.vendorParameters, v1alpha2DriverRequests.vendorParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverName, requests, vendorParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DriverRequests {\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("driverName");
    openapiFields.add("requests");
    openapiFields.add("vendorParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2DriverRequests
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2DriverRequests.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2DriverRequests is not found in the empty JSON string", V1alpha2DriverRequests.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2DriverRequests.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2DriverRequests` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("driverName") != null && !jsonObj.get("driverName").isJsonNull()) && !jsonObj.get("driverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverName").toString()));
      }
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull()) {
        JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
        if (jsonArrayrequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
          }

          // validate the optional field `requests` (array)
          for (int i = 0; i < jsonArrayrequests.size(); i++) {
            V1alpha2ResourceRequest.validateJsonObject(jsonArrayrequests.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2DriverRequests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2DriverRequests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2DriverRequests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2DriverRequests.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2DriverRequests>() {
           @Override
           public void write(JsonWriter out, V1alpha2DriverRequests value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2DriverRequests read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2DriverRequests given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2DriverRequests
  * @throws IOException if the JSON string is invalid with respect to V1alpha2DriverRequests
  */
  public static V1alpha2DriverRequests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2DriverRequests.class);
  }

 /**
  * Convert an instance of V1alpha2DriverRequests to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
