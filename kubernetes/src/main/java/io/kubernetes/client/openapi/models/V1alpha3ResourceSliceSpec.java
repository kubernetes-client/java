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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1alpha3Device;
import io.kubernetes.client.openapi.models.V1alpha3ResourcePool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3ResourceSliceSpec {
  public static final String SERIALIZED_NAME_ALL_NODES = "allNodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  private Boolean allNodes;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<V1alpha3Device> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private V1alpha3ResourcePool pool;

  public V1alpha3ResourceSliceSpec() {
  }

  public V1alpha3ResourceSliceSpec allNodes(Boolean allNodes) {
    this.allNodes = allNodes;
    return this;
  }

   /**
   * AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector and AllNodes must be set.
   * @return allNodes
  **/
  @jakarta.annotation.Nullable
  public Boolean getAllNodes() {
    return allNodes;
  }

  public void setAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
  }


  public V1alpha3ResourceSliceSpec devices(List<V1alpha3Device> devices) {
    this.devices = devices;
    return this;
  }

  public V1alpha3ResourceSliceSpec addDevicesItem(V1alpha3Device devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Devices lists some or all of the devices in this pool.  Must not have more than 128 entries.
   * @return devices
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3Device> getDevices() {
    return devices;
  }

  public void setDevices(List<V1alpha3Device> devices) {
    this.devices = devices;
  }


  public V1alpha3ResourceSliceSpec driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
   * @return driver
  **/
  @jakarta.annotation.Nonnull
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1alpha3ResourceSliceSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha3ResourceSliceSpec nodeSelector(V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @jakarta.annotation.Nullable
  public V1NodeSelector getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1alpha3ResourceSliceSpec pool(V1alpha3ResourcePool pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @jakarta.annotation.Nonnull
  public V1alpha3ResourcePool getPool() {
    return pool;
  }

  public void setPool(V1alpha3ResourcePool pool) {
    this.pool = pool;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ResourceSliceSpec v1alpha3ResourceSliceSpec = (V1alpha3ResourceSliceSpec) o;
    return Objects.equals(this.allNodes, v1alpha3ResourceSliceSpec.allNodes) &&
        Objects.equals(this.devices, v1alpha3ResourceSliceSpec.devices) &&
        Objects.equals(this.driver, v1alpha3ResourceSliceSpec.driver) &&
        Objects.equals(this.nodeName, v1alpha3ResourceSliceSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1alpha3ResourceSliceSpec.nodeSelector) &&
        Objects.equals(this.pool, v1alpha3ResourceSliceSpec.pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNodes, devices, driver, nodeName, nodeSelector, pool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceSliceSpec {\n");
    sb.append("    allNodes: ").append(toIndentedString(allNodes)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
    openapiFields.add("allNodes");
    openapiFields.add("devices");
    openapiFields.add("driver");
    openapiFields.add("nodeName");
    openapiFields.add("nodeSelector");
    openapiFields.add("pool");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("pool");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3ResourceSliceSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3ResourceSliceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3ResourceSliceSpec is not found in the empty JSON string", V1alpha3ResourceSliceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3ResourceSliceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3ResourceSliceSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3ResourceSliceSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            V1alpha3Device.validateJsonElement(jsonArraydevices.get(i));
          };
        }
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `nodeSelector`
      if (jsonObj.get("nodeSelector") != null && !jsonObj.get("nodeSelector").isJsonNull()) {
        V1NodeSelector.validateJsonElement(jsonObj.get("nodeSelector"));
      }
      // validate the required field `pool`
      V1alpha3ResourcePool.validateJsonElement(jsonObj.get("pool"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3ResourceSliceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3ResourceSliceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3ResourceSliceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3ResourceSliceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3ResourceSliceSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha3ResourceSliceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3ResourceSliceSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3ResourceSliceSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3ResourceSliceSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha3ResourceSliceSpec
  */
  public static V1alpha3ResourceSliceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3ResourceSliceSpec.class);
  }

 /**
  * Convert an instance of V1alpha3ResourceSliceSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
