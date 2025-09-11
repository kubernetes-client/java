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
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import io.kubernetes.client.openapi.models.V1Taint;
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
 * NodeSpec describes the attributes that a node is created with.
 */
@ApiModel(description = "NodeSpec describes the attributes that a node is created with.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NodeSpec {
  public static final String SERIALIZED_NAME_CONFIG_SOURCE = "configSource";
  @SerializedName(SERIALIZED_NAME_CONFIG_SOURCE)
  @jakarta.annotation.Nullable
  private V1NodeConfigSource configSource;

  public static final String SERIALIZED_NAME_EXTERNAL_I_D = "externalID";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_D)
  @jakarta.annotation.Nullable
  private String externalID;

  public static final String SERIALIZED_NAME_POD_C_I_D_R = "podCIDR";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_R)
  @jakarta.annotation.Nullable
  private String podCIDR;

  public static final String SERIALIZED_NAME_POD_C_I_D_RS = "podCIDRs";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_RS)
  @jakarta.annotation.Nullable
  private List<String> podCIDRs = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROVIDER_I_D = "providerID";
  @SerializedName(SERIALIZED_NAME_PROVIDER_I_D)
  @jakarta.annotation.Nullable
  private String providerID;

  public static final String SERIALIZED_NAME_TAINTS = "taints";
  @SerializedName(SERIALIZED_NAME_TAINTS)
  @jakarta.annotation.Nullable
  private List<V1Taint> taints = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNSCHEDULABLE = "unschedulable";
  @SerializedName(SERIALIZED_NAME_UNSCHEDULABLE)
  @jakarta.annotation.Nullable
  private Boolean unschedulable;

  public V1NodeSpec() {
  }

  public V1NodeSpec configSource(@jakarta.annotation.Nullable V1NodeConfigSource configSource) {
    this.configSource = configSource;
    return this;
  }

  /**
   * Get configSource
   * @return configSource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigSource getConfigSource() {
    return configSource;
  }

  public void setConfigSource(@jakarta.annotation.Nullable V1NodeConfigSource configSource) {
    this.configSource = configSource;
  }


  public V1NodeSpec externalID(@jakarta.annotation.Nullable String externalID) {
    this.externalID = externalID;
    return this;
  }

  /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   * @return externalID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(@jakarta.annotation.Nullable String externalID) {
    this.externalID = externalID;
  }


  public V1NodeSpec podCIDR(@jakarta.annotation.Nullable String podCIDR) {
    this.podCIDR = podCIDR;
    return this;
  }

  /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PodCIDR represents the pod IP range assigned to the node.")
  public String getPodCIDR() {
    return podCIDR;
  }

  public void setPodCIDR(@jakarta.annotation.Nullable String podCIDR) {
    this.podCIDR = podCIDR;
  }


  public V1NodeSpec podCIDRs(@jakarta.annotation.Nullable List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
    return this;
  }

  public V1NodeSpec addPodCIDRsItem(String podCIDRsItem) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList<>();
    }
    this.podCIDRs.add(podCIDRsItem);
    return this;
  }

  /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
   * @return podCIDRs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.")
  public List<String> getPodCIDRs() {
    return podCIDRs;
  }

  public void setPodCIDRs(@jakarta.annotation.Nullable List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
  }


  public V1NodeSpec providerID(@jakarta.annotation.Nullable String providerID) {
    this.providerID = providerID;
    return this;
  }

  /**
   * ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   * @return providerID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")
  public String getProviderID() {
    return providerID;
  }

  public void setProviderID(@jakarta.annotation.Nullable String providerID) {
    this.providerID = providerID;
  }


  public V1NodeSpec taints(@jakarta.annotation.Nullable List<V1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public V1NodeSpec addTaintsItem(V1Taint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<>();
    }
    this.taints.add(taintsItem);
    return this;
  }

  /**
   * If specified, the node&#39;s taints.
   * @return taints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, the node's taints.")
  public List<V1Taint> getTaints() {
    return taints;
  }

  public void setTaints(@jakarta.annotation.Nullable List<V1Taint> taints) {
    this.taints = taints;
  }


  public V1NodeSpec unschedulable(@jakarta.annotation.Nullable Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return this;
  }

  /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")
  public Boolean getUnschedulable() {
    return unschedulable;
  }

  public void setUnschedulable(@jakarta.annotation.Nullable Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSpec v1NodeSpec = (V1NodeSpec) o;
    return Objects.equals(this.configSource, v1NodeSpec.configSource) &&
        Objects.equals(this.externalID, v1NodeSpec.externalID) &&
        Objects.equals(this.podCIDR, v1NodeSpec.podCIDR) &&
        Objects.equals(this.podCIDRs, v1NodeSpec.podCIDRs) &&
        Objects.equals(this.providerID, v1NodeSpec.providerID) &&
        Objects.equals(this.taints, v1NodeSpec.taints) &&
        Objects.equals(this.unschedulable, v1NodeSpec.unschedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSpec {\n");
    sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    podCIDRs: ").append(toIndentedString(podCIDRs)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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
    openapiFields.add("configSource");
    openapiFields.add("externalID");
    openapiFields.add("podCIDR");
    openapiFields.add("podCIDRs");
    openapiFields.add("providerID");
    openapiFields.add("taints");
    openapiFields.add("unschedulable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NodeSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeSpec is not found in the empty JSON string", V1NodeSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `configSource`
      if (jsonObj.get("configSource") != null && !jsonObj.get("configSource").isJsonNull()) {
        V1NodeConfigSource.validateJsonElement(jsonObj.get("configSource"));
      }
      if ((jsonObj.get("externalID") != null && !jsonObj.get("externalID").isJsonNull()) && !jsonObj.get("externalID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalID").toString()));
      }
      if ((jsonObj.get("podCIDR") != null && !jsonObj.get("podCIDR").isJsonNull()) && !jsonObj.get("podCIDR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podCIDR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podCIDR").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("podCIDRs") != null && !jsonObj.get("podCIDRs").isJsonNull() && !jsonObj.get("podCIDRs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `podCIDRs` to be an array in the JSON string but got `%s`", jsonObj.get("podCIDRs").toString()));
      }
      if ((jsonObj.get("providerID") != null && !jsonObj.get("providerID").isJsonNull()) && !jsonObj.get("providerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerID").toString()));
      }
      if (jsonObj.get("taints") != null && !jsonObj.get("taints").isJsonNull()) {
        JsonArray jsonArraytaints = jsonObj.getAsJsonArray("taints");
        if (jsonArraytaints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taints` to be an array in the JSON string but got `%s`", jsonObj.get("taints").toString()));
          }

          // validate the optional field `taints` (array)
          for (int i = 0; i < jsonArraytaints.size(); i++) {
            V1Taint.validateJsonElement(jsonArraytaints.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeSpec>() {
           @Override
           public void write(JsonWriter out, V1NodeSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NodeSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NodeSpec
   * @throws IOException if the JSON string is invalid with respect to V1NodeSpec
   */
  public static V1NodeSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeSpec.class);
  }

  /**
   * Convert an instance of V1NodeSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
