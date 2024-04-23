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
import io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult;
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
 * StructuredResourceHandle is the in-tree representation of the allocation result.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2StructuredResourceHandle {
  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<V1alpha2DriverAllocationResult> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_VENDOR_CLAIM_PARAMETERS = "vendorClaimParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_CLAIM_PARAMETERS)
  private Object vendorClaimParameters;

  public static final String SERIALIZED_NAME_VENDOR_CLASS_PARAMETERS = "vendorClassParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_CLASS_PARAMETERS)
  private Object vendorClassParameters;

  public V1alpha2StructuredResourceHandle() {
  }

  public V1alpha2StructuredResourceHandle nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is the name of the node providing the necessary resources if the resources are local to a node.
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha2StructuredResourceHandle results(List<V1alpha2DriverAllocationResult> results) {

    this.results = results;
    return this;
  }

  public V1alpha2StructuredResourceHandle addResultsItem(V1alpha2DriverAllocationResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Results lists all allocated driver resources.
   * @return results
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha2DriverAllocationResult> getResults() {
    return results;
  }


  public void setResults(List<V1alpha2DriverAllocationResult> results) {
    this.results = results;
  }


  public V1alpha2StructuredResourceHandle vendorClaimParameters(Object vendorClaimParameters) {

    this.vendorClaimParameters = vendorClaimParameters;
    return this;
  }

   /**
   * VendorClaimParameters are the per-claim configuration parameters from the resource claim parameters at the time that the claim was allocated.
   * @return vendorClaimParameters
  **/
  @jakarta.annotation.Nullable
  public Object getVendorClaimParameters() {
    return vendorClaimParameters;
  }


  public void setVendorClaimParameters(Object vendorClaimParameters) {
    this.vendorClaimParameters = vendorClaimParameters;
  }


  public V1alpha2StructuredResourceHandle vendorClassParameters(Object vendorClassParameters) {

    this.vendorClassParameters = vendorClassParameters;
    return this;
  }

   /**
   * VendorClassParameters are the per-claim configuration parameters from the resource class at the time that the claim was allocated.
   * @return vendorClassParameters
  **/
  @jakarta.annotation.Nullable
  public Object getVendorClassParameters() {
    return vendorClassParameters;
  }


  public void setVendorClassParameters(Object vendorClassParameters) {
    this.vendorClassParameters = vendorClassParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2StructuredResourceHandle v1alpha2StructuredResourceHandle = (V1alpha2StructuredResourceHandle) o;
    return Objects.equals(this.nodeName, v1alpha2StructuredResourceHandle.nodeName) &&
        Objects.equals(this.results, v1alpha2StructuredResourceHandle.results) &&
        Objects.equals(this.vendorClaimParameters, v1alpha2StructuredResourceHandle.vendorClaimParameters) &&
        Objects.equals(this.vendorClassParameters, v1alpha2StructuredResourceHandle.vendorClassParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, results, vendorClaimParameters, vendorClassParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2StructuredResourceHandle {\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    vendorClaimParameters: ").append(toIndentedString(vendorClaimParameters)).append("\n");
    sb.append("    vendorClassParameters: ").append(toIndentedString(vendorClassParameters)).append("\n");
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
    openapiFields.add("nodeName");
    openapiFields.add("results");
    openapiFields.add("vendorClaimParameters");
    openapiFields.add("vendorClassParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2StructuredResourceHandle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2StructuredResourceHandle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2StructuredResourceHandle is not found in the empty JSON string", V1alpha2StructuredResourceHandle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2StructuredResourceHandle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2StructuredResourceHandle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2StructuredResourceHandle.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        V1alpha2DriverAllocationResult.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2StructuredResourceHandle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2StructuredResourceHandle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2StructuredResourceHandle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2StructuredResourceHandle.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2StructuredResourceHandle>() {
           @Override
           public void write(JsonWriter out, V1alpha2StructuredResourceHandle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2StructuredResourceHandle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2StructuredResourceHandle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2StructuredResourceHandle
  * @throws IOException if the JSON string is invalid with respect to V1alpha2StructuredResourceHandle
  */
  public static V1alpha2StructuredResourceHandle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2StructuredResourceHandle.class);
  }

 /**
  * Convert an instance of V1alpha2StructuredResourceHandle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
