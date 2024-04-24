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
 * PodSchedulingContextSpec describes where resources for the Pod are needed.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2PodSchedulingContextSpec {
  public static final String SERIALIZED_NAME_POTENTIAL_NODES = "potentialNodes";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_NODES)
  private List<String> potentialNodes;

  public static final String SERIALIZED_NAME_SELECTED_NODE = "selectedNode";
  @SerializedName(SERIALIZED_NAME_SELECTED_NODE)
  private String selectedNode;

  public V1alpha2PodSchedulingContextSpec() {
  }

  public V1alpha2PodSchedulingContextSpec potentialNodes(List<String> potentialNodes) {

    this.potentialNodes = potentialNodes;
    return this;
  }

  public V1alpha2PodSchedulingContextSpec addPotentialNodesItem(String potentialNodesItem) {
    if (this.potentialNodes == null) {
      this.potentialNodes = new ArrayList<>();
    }
    this.potentialNodes.add(potentialNodesItem);
    return this;
  }

   /**
   * PotentialNodes lists nodes where the Pod might be able to run.  The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
   * @return potentialNodes
  **/
  @jakarta.annotation.Nullable
  public List<String> getPotentialNodes() {
    return potentialNodes;
  }


  public void setPotentialNodes(List<String> potentialNodes) {
    this.potentialNodes = potentialNodes;
  }


  public V1alpha2PodSchedulingContextSpec selectedNode(String selectedNode) {

    this.selectedNode = selectedNode;
    return this;
  }

   /**
   * SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use \&quot;WaitForFirstConsumer\&quot; allocation is to be attempted.
   * @return selectedNode
  **/
  @jakarta.annotation.Nullable
  public String getSelectedNode() {
    return selectedNode;
  }


  public void setSelectedNode(String selectedNode) {
    this.selectedNode = selectedNode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodSchedulingContextSpec v1alpha2PodSchedulingContextSpec = (V1alpha2PodSchedulingContextSpec) o;
    return Objects.equals(this.potentialNodes, v1alpha2PodSchedulingContextSpec.potentialNodes) &&
        Objects.equals(this.selectedNode, v1alpha2PodSchedulingContextSpec.selectedNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potentialNodes, selectedNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodSchedulingContextSpec {\n");
    sb.append("    potentialNodes: ").append(toIndentedString(potentialNodes)).append("\n");
    sb.append("    selectedNode: ").append(toIndentedString(selectedNode)).append("\n");
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
    openapiFields.add("potentialNodes");
    openapiFields.add("selectedNode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2PodSchedulingContextSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2PodSchedulingContextSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2PodSchedulingContextSpec is not found in the empty JSON string", V1alpha2PodSchedulingContextSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2PodSchedulingContextSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2PodSchedulingContextSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("potentialNodes") != null && !jsonObj.get("potentialNodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `potentialNodes` to be an array in the JSON string but got `%s`", jsonObj.get("potentialNodes").toString()));
      }
      if ((jsonObj.get("selectedNode") != null && !jsonObj.get("selectedNode").isJsonNull()) && !jsonObj.get("selectedNode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedNode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedNode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2PodSchedulingContextSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2PodSchedulingContextSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2PodSchedulingContextSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2PodSchedulingContextSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2PodSchedulingContextSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2PodSchedulingContextSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2PodSchedulingContextSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2PodSchedulingContextSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2PodSchedulingContextSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha2PodSchedulingContextSpec
  */
  public static V1alpha2PodSchedulingContextSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2PodSchedulingContextSpec.class);
  }

 /**
  * Convert an instance of V1alpha2PodSchedulingContextSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
