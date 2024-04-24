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
import io.kubernetes.client.openapi.models.V1VolumeNodeResources;
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
 * CSINodeDriver holds information about the specification of one CSI driver installed on a node
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CSINodeDriver {
  public static final String SERIALIZED_NAME_ALLOCATABLE = "allocatable";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE)
  private V1VolumeNodeResources allocatable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_I_D = "nodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEYS = "topologyKeys";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEYS)
  private List<String> topologyKeys;

  public V1CSINodeDriver() {
  }

  public V1CSINodeDriver allocatable(V1VolumeNodeResources allocatable) {

    this.allocatable = allocatable;
    return this;
  }

   /**
   * Get allocatable
   * @return allocatable
  **/
  @jakarta.annotation.Nullable
  public V1VolumeNodeResources getAllocatable() {
    return allocatable;
  }


  public void setAllocatable(V1VolumeNodeResources allocatable) {
    this.allocatable = allocatable;
  }


  public V1CSINodeDriver name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name represents the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1CSINodeDriver nodeID(String nodeID) {

    this.nodeID = nodeID;
    return this;
  }

   /**
   * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as \&quot;node1\&quot;, but the storage system may refer to the same node as \&quot;nodeA\&quot;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. \&quot;nodeA\&quot; instead of \&quot;node1\&quot;. This field is required.
   * @return nodeID
  **/
  @jakarta.annotation.Nonnull
  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  public V1CSINodeDriver topologyKeys(List<String> topologyKeys) {

    this.topologyKeys = topologyKeys;
    return this;
  }

  public V1CSINodeDriver addTopologyKeysItem(String topologyKeysItem) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList<>();
    }
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }

   /**
   * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. \&quot;company.com/zone\&quot;, \&quot;company.com/region\&quot;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
   * @return topologyKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }


  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSINodeDriver v1CSINodeDriver = (V1CSINodeDriver) o;
    return Objects.equals(this.allocatable, v1CSINodeDriver.allocatable) &&
        Objects.equals(this.name, v1CSINodeDriver.name) &&
        Objects.equals(this.nodeID, v1CSINodeDriver.nodeID) &&
        Objects.equals(this.topologyKeys, v1CSINodeDriver.topologyKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatable, name, nodeID, topologyKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSINodeDriver {\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
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
    openapiFields.add("allocatable");
    openapiFields.add("name");
    openapiFields.add("nodeID");
    openapiFields.add("topologyKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("nodeID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CSINodeDriver
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CSINodeDriver.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CSINodeDriver is not found in the empty JSON string", V1CSINodeDriver.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CSINodeDriver.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CSINodeDriver` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CSINodeDriver.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `allocatable`
      if (jsonObj.get("allocatable") != null && !jsonObj.get("allocatable").isJsonNull()) {
        V1VolumeNodeResources.validateJsonObject(jsonObj.getAsJsonObject("allocatable"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("nodeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("topologyKeys") != null && !jsonObj.get("topologyKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKeys` to be an array in the JSON string but got `%s`", jsonObj.get("topologyKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CSINodeDriver.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CSINodeDriver' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CSINodeDriver> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CSINodeDriver.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CSINodeDriver>() {
           @Override
           public void write(JsonWriter out, V1CSINodeDriver value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CSINodeDriver read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CSINodeDriver given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CSINodeDriver
  * @throws IOException if the JSON string is invalid with respect to V1CSINodeDriver
  */
  public static V1CSINodeDriver fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CSINodeDriver.class);
  }

 /**
  * Convert an instance of V1CSINodeDriver to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
