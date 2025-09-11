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
import io.kubernetes.client.openapi.models.V1IPBlock;
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
 */
@ApiModel(description = "NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NetworkPolicyPeer {
  public static final String SERIALIZED_NAME_IP_BLOCK = "ipBlock";
  @SerializedName(SERIALIZED_NAME_IP_BLOCK)
  @jakarta.annotation.Nullable
  private V1IPBlock ipBlock;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_POD_SELECTOR = "podSelector";
  @SerializedName(SERIALIZED_NAME_POD_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector podSelector;

  public V1NetworkPolicyPeer() {
  }

  public V1NetworkPolicyPeer ipBlock(@jakarta.annotation.Nullable V1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
    return this;
  }

  /**
   * Get ipBlock
   * @return ipBlock
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1IPBlock getIpBlock() {
    return ipBlock;
  }

  public void setIpBlock(@jakarta.annotation.Nullable V1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
  }


  public V1NetworkPolicyPeer namespaceSelector(@jakarta.annotation.Nullable V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  /**
   * Get namespaceSelector
   * @return namespaceSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(@jakarta.annotation.Nullable V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1NetworkPolicyPeer podSelector(@jakarta.annotation.Nullable V1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

  /**
   * Get podSelector
   * @return podSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(@jakarta.annotation.Nullable V1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicyPeer v1NetworkPolicyPeer = (V1NetworkPolicyPeer) o;
    return Objects.equals(this.ipBlock, v1NetworkPolicyPeer.ipBlock) &&
        Objects.equals(this.namespaceSelector, v1NetworkPolicyPeer.namespaceSelector) &&
        Objects.equals(this.podSelector, v1NetworkPolicyPeer.podSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipBlock, namespaceSelector, podSelector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyPeer {\n");
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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
    openapiFields.add("ipBlock");
    openapiFields.add("namespaceSelector");
    openapiFields.add("podSelector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NetworkPolicyPeer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NetworkPolicyPeer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NetworkPolicyPeer is not found in the empty JSON string", V1NetworkPolicyPeer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NetworkPolicyPeer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NetworkPolicyPeer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ipBlock`
      if (jsonObj.get("ipBlock") != null && !jsonObj.get("ipBlock").isJsonNull()) {
        V1IPBlock.validateJsonElement(jsonObj.get("ipBlock"));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("namespaceSelector"));
      }
      // validate the optional field `podSelector`
      if (jsonObj.get("podSelector") != null && !jsonObj.get("podSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("podSelector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NetworkPolicyPeer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NetworkPolicyPeer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NetworkPolicyPeer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NetworkPolicyPeer.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NetworkPolicyPeer>() {
           @Override
           public void write(JsonWriter out, V1NetworkPolicyPeer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NetworkPolicyPeer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NetworkPolicyPeer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NetworkPolicyPeer
   * @throws IOException if the JSON string is invalid with respect to V1NetworkPolicyPeer
   */
  public static V1NetworkPolicyPeer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NetworkPolicyPeer.class);
  }

  /**
   * Convert an instance of V1NetworkPolicyPeer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
