/*
Copyright 2025 The Kubernetes Authors.
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
import java.util.Locale;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ForNode;
import io.kubernetes.client.openapi.models.V1ForZone;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
@ApiModel(description = "EndpointHints provides hints describing how an endpoint should be consumed.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1EndpointHints {
  public static final String SERIALIZED_NAME_FOR_NODES = "forNodes";
  @SerializedName(SERIALIZED_NAME_FOR_NODES)
  @jakarta.annotation.Nullable
  private List<V1ForNode> forNodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOR_ZONES = "forZones";
  @SerializedName(SERIALIZED_NAME_FOR_ZONES)
  @jakarta.annotation.Nullable
  private List<V1ForZone> forZones = new ArrayList<>();

  public V1EndpointHints() {
  }

  public V1EndpointHints forNodes(@jakarta.annotation.Nullable List<V1ForNode> forNodes) {
    this.forNodes = forNodes;
    return this;
  }

  public V1EndpointHints addForNodesItem(V1ForNode forNodesItem) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList<>();
    }
    this.forNodes.add(forNodesItem);
    return this;
  }

  /**
   * forNodes indicates the node(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. This is an Alpha feature and is only used when the PreferSameTrafficDistribution feature gate is enabled.
   * @return forNodes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "forNodes indicates the node(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. This is an Alpha feature and is only used when the PreferSameTrafficDistribution feature gate is enabled.")
  public List<V1ForNode> getForNodes() {
    return forNodes;
  }

  public void setForNodes(@jakarta.annotation.Nullable List<V1ForNode> forNodes) {
    this.forNodes = forNodes;
  }


  public V1EndpointHints forZones(@jakarta.annotation.Nullable List<V1ForZone> forZones) {
    this.forZones = forZones;
    return this;
  }

  public V1EndpointHints addForZonesItem(V1ForZone forZonesItem) {
    if (this.forZones == null) {
      this.forZones = new ArrayList<>();
    }
    this.forZones.add(forZonesItem);
    return this;
  }

  /**
   * forZones indicates the zone(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries.
   * @return forZones
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "forZones indicates the zone(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries.")
  public List<V1ForZone> getForZones() {
    return forZones;
  }

  public void setForZones(@jakarta.annotation.Nullable List<V1ForZone> forZones) {
    this.forZones = forZones;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointHints v1EndpointHints = (V1EndpointHints) o;
    return Objects.equals(this.forNodes, v1EndpointHints.forNodes) &&
        Objects.equals(this.forZones, v1EndpointHints.forZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forNodes, forZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointHints {\n");
    sb.append("    forNodes: ").append(toIndentedString(forNodes)).append("\n");
    sb.append("    forZones: ").append(toIndentedString(forZones)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("forNodes", "forZones"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1EndpointHints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1EndpointHints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1EndpointHints is not found in the empty JSON string", V1EndpointHints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1EndpointHints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1EndpointHints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("forNodes") != null && !jsonObj.get("forNodes").isJsonNull()) {
        JsonArray jsonArrayforNodes = jsonObj.getAsJsonArray("forNodes");
        if (jsonArrayforNodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("forNodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `forNodes` to be an array in the JSON string but got `%s`", jsonObj.get("forNodes").toString()));
          }

          // validate the optional field `forNodes` (array)
          for (int i = 0; i < jsonArrayforNodes.size(); i++) {
            V1ForNode.validateJsonElement(jsonArrayforNodes.get(i));
          };
        }
      }
      if (jsonObj.get("forZones") != null && !jsonObj.get("forZones").isJsonNull()) {
        JsonArray jsonArrayforZones = jsonObj.getAsJsonArray("forZones");
        if (jsonArrayforZones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("forZones").isJsonArray()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `forZones` to be an array in the JSON string but got `%s`", jsonObj.get("forZones").toString()));
          }

          // validate the optional field `forZones` (array)
          for (int i = 0; i < jsonArrayforZones.size(); i++) {
            V1ForZone.validateJsonElement(jsonArrayforZones.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EndpointHints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EndpointHints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EndpointHints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EndpointHints.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EndpointHints>() {
           @Override
           public void write(JsonWriter out, V1EndpointHints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EndpointHints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1EndpointHints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1EndpointHints
   * @throws IOException if the JSON string is invalid with respect to V1EndpointHints
   */
  public static V1EndpointHints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EndpointHints.class);
  }

  /**
   * Convert an instance of V1EndpointHints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
