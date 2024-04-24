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
import io.kubernetes.client.openapi.models.V1Toleration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1Scheduling {
  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = new HashMap<>();

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations;

  public V1Scheduling() {
  }

  public V1Scheduling nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1Scheduling putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
   * @return nodeSelector
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1Scheduling tolerations(List<V1Toleration> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1Scheduling addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Scheduling v1Scheduling = (V1Scheduling) o;
    return Objects.equals(this.nodeSelector, v1Scheduling.nodeSelector) &&
        Objects.equals(this.tolerations, v1Scheduling.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelector, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Scheduling {\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
    openapiFields.add("nodeSelector");
    openapiFields.add("tolerations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1Scheduling
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1Scheduling.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Scheduling is not found in the empty JSON string", V1Scheduling.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1Scheduling.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Scheduling` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("tolerations") != null && !jsonObj.get("tolerations").isJsonNull()) {
        JsonArray jsonArraytolerations = jsonObj.getAsJsonArray("tolerations");
        if (jsonArraytolerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tolerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
          }

          // validate the optional field `tolerations` (array)
          for (int i = 0; i < jsonArraytolerations.size(); i++) {
            V1Toleration.validateJsonObject(jsonArraytolerations.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Scheduling.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Scheduling' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Scheduling> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Scheduling.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Scheduling>() {
           @Override
           public void write(JsonWriter out, V1Scheduling value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Scheduling read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1Scheduling given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1Scheduling
  * @throws IOException if the JSON string is invalid with respect to V1Scheduling
  */
  public static V1Scheduling fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Scheduling.class);
  }

 /**
  * Convert an instance of V1Scheduling to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
