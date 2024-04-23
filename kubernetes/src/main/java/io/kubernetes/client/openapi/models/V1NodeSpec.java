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
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import io.kubernetes.client.openapi.models.V1Taint;
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
 * NodeSpec describes the attributes that a node is created with.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeSpec {
  public static final String SERIALIZED_NAME_CONFIG_SOURCE = "configSource";
  @SerializedName(SERIALIZED_NAME_CONFIG_SOURCE)
  private V1NodeConfigSource configSource;

  public static final String SERIALIZED_NAME_EXTERNAL_I_D = "externalID";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_D)
  private String externalID;

  public static final String SERIALIZED_NAME_POD_C_I_D_R = "podCIDR";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_R)
  private String podCIDR;

  public static final String SERIALIZED_NAME_POD_C_I_D_RS = "podCIDRs";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_RS)
  private List<String> podCIDRs;

  public static final String SERIALIZED_NAME_PROVIDER_I_D = "providerID";
  @SerializedName(SERIALIZED_NAME_PROVIDER_I_D)
  private String providerID;

  public static final String SERIALIZED_NAME_TAINTS = "taints";
  @SerializedName(SERIALIZED_NAME_TAINTS)
  private List<V1Taint> taints;

  public static final String SERIALIZED_NAME_UNSCHEDULABLE = "unschedulable";
  @SerializedName(SERIALIZED_NAME_UNSCHEDULABLE)
  private Boolean unschedulable;

  public V1NodeSpec() {
  }

  public V1NodeSpec configSource(V1NodeConfigSource configSource) {

    this.configSource = configSource;
    return this;
  }

   /**
   * Get configSource
   * @return configSource
  **/
  @jakarta.annotation.Nullable
  public V1NodeConfigSource getConfigSource() {
    return configSource;
  }


  public void setConfigSource(V1NodeConfigSource configSource) {
    this.configSource = configSource;
  }


  public V1NodeSpec externalID(String externalID) {

    this.externalID = externalID;
    return this;
  }

   /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   * @return externalID
  **/
  @jakarta.annotation.Nullable
  public String getExternalID() {
    return externalID;
  }


  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }


  public V1NodeSpec podCIDR(String podCIDR) {

    this.podCIDR = podCIDR;
    return this;
  }

   /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
  **/
  @jakarta.annotation.Nullable
  public String getPodCIDR() {
    return podCIDR;
  }


  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }


  public V1NodeSpec podCIDRs(List<String> podCIDRs) {

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
  **/
  @jakarta.annotation.Nullable
  public List<String> getPodCIDRs() {
    return podCIDRs;
  }


  public void setPodCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
  }


  public V1NodeSpec providerID(String providerID) {

    this.providerID = providerID;
    return this;
  }

   /**
   * ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   * @return providerID
  **/
  @jakarta.annotation.Nullable
  public String getProviderID() {
    return providerID;
  }


  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }


  public V1NodeSpec taints(List<V1Taint> taints) {

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
  **/
  @jakarta.annotation.Nullable
  public List<V1Taint> getTaints() {
    return taints;
  }


  public void setTaints(List<V1Taint> taints) {
    this.taints = taints;
  }


  public V1NodeSpec unschedulable(Boolean unschedulable) {

    this.unschedulable = unschedulable;
    return this;
  }

   /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
  **/
  @jakarta.annotation.Nullable
  public Boolean getUnschedulable() {
    return unschedulable;
  }


  public void setUnschedulable(Boolean unschedulable) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeSpec is not found in the empty JSON string", V1NodeSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configSource`
      if (jsonObj.get("configSource") != null && !jsonObj.get("configSource").isJsonNull()) {
        V1NodeConfigSource.validateJsonObject(jsonObj.getAsJsonObject("configSource"));
      }
      if ((jsonObj.get("externalID") != null && !jsonObj.get("externalID").isJsonNull()) && !jsonObj.get("externalID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalID").toString()));
      }
      if ((jsonObj.get("podCIDR") != null && !jsonObj.get("podCIDR").isJsonNull()) && !jsonObj.get("podCIDR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podCIDR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podCIDR").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("podCIDRs") != null && !jsonObj.get("podCIDRs").isJsonArray()) {
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
            V1Taint.validateJsonObject(jsonArraytaints.get(i).getAsJsonObject());
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
