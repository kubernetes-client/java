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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1NodeAffinity;
import io.kubernetes.client.openapi.models.V1PodAffinity;
import io.kubernetes.client.openapi.models.V1PodAntiAffinity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * Affinity is a group of affinity scheduling rules.
 */
@ApiModel(description = "Affinity is a group of affinity scheduling rules.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Affinity {
  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";
  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  @jakarta.annotation.Nullable
  private V1NodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_POD_AFFINITY = "podAffinity";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY)
  @jakarta.annotation.Nullable
  private V1PodAffinity podAffinity;

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";
  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  @jakarta.annotation.Nullable
  private V1PodAntiAffinity podAntiAffinity;

  public V1Affinity() {
  }

  public V1Affinity nodeAffinity(@jakarta.annotation.Nullable V1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * Get nodeAffinity
   * @return nodeAffinity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(@jakarta.annotation.Nullable V1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }


  public V1Affinity podAffinity(@jakarta.annotation.Nullable V1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

  /**
   * Get podAffinity
   * @return podAffinity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(@jakarta.annotation.Nullable V1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }


  public V1Affinity podAntiAffinity(@jakarta.annotation.Nullable V1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

  /**
   * Get podAntiAffinity
   * @return podAntiAffinity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(@jakarta.annotation.Nullable V1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Affinity v1Affinity = (V1Affinity) o;
    return Objects.equals(this.nodeAffinity, v1Affinity.nodeAffinity) &&
        Objects.equals(this.podAffinity, v1Affinity.podAffinity) &&
        Objects.equals(this.podAntiAffinity, v1Affinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Affinity {\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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
    openapiFields.add("nodeAffinity");
    openapiFields.add("podAffinity");
    openapiFields.add("podAntiAffinity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Affinity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Affinity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Affinity is not found in the empty JSON string", V1Affinity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Affinity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Affinity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `nodeAffinity`
      if (jsonObj.get("nodeAffinity") != null && !jsonObj.get("nodeAffinity").isJsonNull()) {
        V1NodeAffinity.validateJsonElement(jsonObj.get("nodeAffinity"));
      }
      // validate the optional field `podAffinity`
      if (jsonObj.get("podAffinity") != null && !jsonObj.get("podAffinity").isJsonNull()) {
        V1PodAffinity.validateJsonElement(jsonObj.get("podAffinity"));
      }
      // validate the optional field `podAntiAffinity`
      if (jsonObj.get("podAntiAffinity") != null && !jsonObj.get("podAntiAffinity").isJsonNull()) {
        V1PodAntiAffinity.validateJsonElement(jsonObj.get("podAntiAffinity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Affinity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Affinity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Affinity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Affinity.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Affinity>() {
           @Override
           public void write(JsonWriter out, V1Affinity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Affinity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Affinity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Affinity
   * @throws IOException if the JSON string is invalid with respect to V1Affinity
   */
  public static V1Affinity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Affinity.class);
  }

  /**
   * Convert an instance of V1Affinity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
