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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1alpha2ResourceHandle;
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
 * AllocationResult contains attributes of an allocated resource.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2AllocationResult {
  public static final String SERIALIZED_NAME_AVAILABLE_ON_NODES = "availableOnNodes";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ON_NODES)
  private V1NodeSelector availableOnNodes;

  public static final String SERIALIZED_NAME_RESOURCE_HANDLES = "resourceHandles";
  @SerializedName(SERIALIZED_NAME_RESOURCE_HANDLES)
  private List<V1alpha2ResourceHandle> resourceHandles;

  public static final String SERIALIZED_NAME_SHAREABLE = "shareable";
  @SerializedName(SERIALIZED_NAME_SHAREABLE)
  private Boolean shareable;

  public V1alpha2AllocationResult() {
  }

  public V1alpha2AllocationResult availableOnNodes(V1NodeSelector availableOnNodes) {

    this.availableOnNodes = availableOnNodes;
    return this;
  }

   /**
   * Get availableOnNodes
   * @return availableOnNodes
  **/
  @jakarta.annotation.Nullable
  public V1NodeSelector getAvailableOnNodes() {
    return availableOnNodes;
  }


  public void setAvailableOnNodes(V1NodeSelector availableOnNodes) {
    this.availableOnNodes = availableOnNodes;
  }


  public V1alpha2AllocationResult resourceHandles(List<V1alpha2ResourceHandle> resourceHandles) {

    this.resourceHandles = resourceHandles;
    return this;
  }

  public V1alpha2AllocationResult addResourceHandlesItem(V1alpha2ResourceHandle resourceHandlesItem) {
    if (this.resourceHandles == null) {
      this.resourceHandles = new ArrayList<>();
    }
    this.resourceHandles.add(resourceHandlesItem);
    return this;
  }

   /**
   * ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.  Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.
   * @return resourceHandles
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2ResourceHandle> getResourceHandles() {
    return resourceHandles;
  }


  public void setResourceHandles(List<V1alpha2ResourceHandle> resourceHandles) {
    this.resourceHandles = resourceHandles;
  }


  public V1alpha2AllocationResult shareable(Boolean shareable) {

    this.shareable = shareable;
    return this;
  }

   /**
   * Shareable determines whether the resource supports more than one consumer at a time.
   * @return shareable
  **/
  @jakarta.annotation.Nullable
  public Boolean getShareable() {
    return shareable;
  }


  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2AllocationResult v1alpha2AllocationResult = (V1alpha2AllocationResult) o;
    return Objects.equals(this.availableOnNodes, v1alpha2AllocationResult.availableOnNodes) &&
        Objects.equals(this.resourceHandles, v1alpha2AllocationResult.resourceHandles) &&
        Objects.equals(this.shareable, v1alpha2AllocationResult.shareable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableOnNodes, resourceHandles, shareable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2AllocationResult {\n");
    sb.append("    availableOnNodes: ").append(toIndentedString(availableOnNodes)).append("\n");
    sb.append("    resourceHandles: ").append(toIndentedString(resourceHandles)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
    openapiFields.add("availableOnNodes");
    openapiFields.add("resourceHandles");
    openapiFields.add("shareable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2AllocationResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2AllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2AllocationResult is not found in the empty JSON string", V1alpha2AllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2AllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2AllocationResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `availableOnNodes`
      if (jsonObj.get("availableOnNodes") != null && !jsonObj.get("availableOnNodes").isJsonNull()) {
        V1NodeSelector.validateJsonObject(jsonObj.getAsJsonObject("availableOnNodes"));
      }
      if (jsonObj.get("resourceHandles") != null && !jsonObj.get("resourceHandles").isJsonNull()) {
        JsonArray jsonArrayresourceHandles = jsonObj.getAsJsonArray("resourceHandles");
        if (jsonArrayresourceHandles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceHandles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceHandles` to be an array in the JSON string but got `%s`", jsonObj.get("resourceHandles").toString()));
          }

          // validate the optional field `resourceHandles` (array)
          for (int i = 0; i < jsonArrayresourceHandles.size(); i++) {
            V1alpha2ResourceHandle.validateJsonObject(jsonArrayresourceHandles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2AllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2AllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2AllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2AllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2AllocationResult>() {
           @Override
           public void write(JsonWriter out, V1alpha2AllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2AllocationResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2AllocationResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2AllocationResult
  * @throws IOException if the JSON string is invalid with respect to V1alpha2AllocationResult
  */
  public static V1alpha2AllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2AllocationResult.class);
  }

 /**
  * Convert an instance of V1alpha2AllocationResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
