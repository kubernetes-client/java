/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2TopologyConstraint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodGroupSchedulingConstraints defines scheduling constraints (e.g. topology) for a PodGroup.
 */
@ApiModel(description = "PodGroupSchedulingConstraints defines scheduling constraints (e.g. topology) for a PodGroup.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha2PodGroupSchedulingConstraints {
  public static final String SERIALIZED_NAME_TOPOLOGY = "topology";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY)
  @jakarta.annotation.Nullable
  private List<V1alpha2TopologyConstraint> topology = new ArrayList<>();

  public V1alpha2PodGroupSchedulingConstraints() {
  }

  public V1alpha2PodGroupSchedulingConstraints topology(@jakarta.annotation.Nullable List<V1alpha2TopologyConstraint> topology) {
    this.topology = topology;
    return this;
  }

  public V1alpha2PodGroupSchedulingConstraints addTopologyItem(V1alpha2TopologyConstraint topologyItem) {
    if (this.topology == null) {
      this.topology = new ArrayList<>();
    }
    this.topology.add(topologyItem);
    return this;
  }

  /**
   * Topology defines the topology constraints for the pod group. Currently only a single topology constraint can be specified. This may change in the future.
   * @return topology
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Topology defines the topology constraints for the pod group. Currently only a single topology constraint can be specified. This may change in the future.")
  public List<V1alpha2TopologyConstraint> getTopology() {
    return topology;
  }

  public void setTopology(@jakarta.annotation.Nullable List<V1alpha2TopologyConstraint> topology) {
    this.topology = topology;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodGroupSchedulingConstraints v1alpha2PodGroupSchedulingConstraints = (V1alpha2PodGroupSchedulingConstraints) o;
    return Objects.equals(this.topology, v1alpha2PodGroupSchedulingConstraints.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodGroupSchedulingConstraints {\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("topology"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha2PodGroupSchedulingConstraints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2PodGroupSchedulingConstraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha2PodGroupSchedulingConstraints is not found in the empty JSON string", V1alpha2PodGroupSchedulingConstraints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2PodGroupSchedulingConstraints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha2PodGroupSchedulingConstraints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("topology") != null && !jsonObj.get("topology").isJsonNull()) {
        JsonArray jsonArraytopology = jsonObj.getAsJsonArray("topology");
        if (jsonArraytopology != null) {
          // ensure the json data is an array
          if (!jsonObj.get("topology").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `topology` to be an array in the JSON string but got `%s`", jsonObj.get("topology").toString()));
          }

          // validate the optional field `topology` (array)
          for (int i = 0; i < jsonArraytopology.size(); i++) {
            V1alpha2TopologyConstraint.validateJsonElement(jsonArraytopology.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2PodGroupSchedulingConstraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2PodGroupSchedulingConstraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2PodGroupSchedulingConstraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2PodGroupSchedulingConstraints.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2PodGroupSchedulingConstraints>() {
           @Override
           public void write(JsonWriter out, V1alpha2PodGroupSchedulingConstraints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2PodGroupSchedulingConstraints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha2PodGroupSchedulingConstraints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha2PodGroupSchedulingConstraints
   * @throws IOException if the JSON string is invalid with respect to V1alpha2PodGroupSchedulingConstraints
   */
  public static V1alpha2PodGroupSchedulingConstraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2PodGroupSchedulingConstraints.class);
  }

  /**
   * Convert an instance of V1alpha2PodGroupSchedulingConstraints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
