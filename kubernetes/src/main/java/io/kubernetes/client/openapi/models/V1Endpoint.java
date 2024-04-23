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
import io.kubernetes.client.openapi.models.V1EndpointConditions;
import io.kubernetes.client.openapi.models.V1EndpointHints;
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
 * Endpoint represents a single logical \&quot;backend\&quot; implementing a service.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1Endpoint {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private V1EndpointConditions conditions;

  public static final String SERIALIZED_NAME_DEPRECATED_TOPOLOGY = "deprecatedTopology";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_TOPOLOGY)
  private Map<String, String> deprecatedTopology = new HashMap<>();

  public static final String SERIALIZED_NAME_HINTS = "hints";
  @SerializedName(SERIALIZED_NAME_HINTS)
  private V1EndpointHints hints;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_TARGET_REF = "targetRef";
  @SerializedName(SERIALIZED_NAME_TARGET_REF)
  private V1ObjectReference targetRef;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public V1Endpoint() {
  }

  public V1Endpoint addresses(List<String> addresses) {

    this.addresses = addresses;
    return this;
  }

  public V1Endpoint addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
   * @return addresses
  **/
  @jakarta.annotation.Nonnull
  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public V1Endpoint conditions(V1EndpointConditions conditions) {

    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public V1EndpointConditions getConditions() {
    return conditions;
  }


  public void setConditions(V1EndpointConditions conditions) {
    this.conditions = conditions;
  }


  public V1Endpoint deprecatedTopology(Map<String, String> deprecatedTopology) {

    this.deprecatedTopology = deprecatedTopology;
    return this;
  }

  public V1Endpoint putDeprecatedTopologyItem(String key, String deprecatedTopologyItem) {
    if (this.deprecatedTopology == null) {
      this.deprecatedTopology = new HashMap<>();
    }
    this.deprecatedTopology.put(key, deprecatedTopologyItem);
    return this;
  }

   /**
   * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
   * @return deprecatedTopology
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getDeprecatedTopology() {
    return deprecatedTopology;
  }


  public void setDeprecatedTopology(Map<String, String> deprecatedTopology) {
    this.deprecatedTopology = deprecatedTopology;
  }


  public V1Endpoint hints(V1EndpointHints hints) {

    this.hints = hints;
    return this;
  }

   /**
   * Get hints
   * @return hints
  **/
  @jakarta.annotation.Nullable
  public V1EndpointHints getHints() {
    return hints;
  }


  public void setHints(V1EndpointHints hints) {
    this.hints = hints;
  }


  public V1Endpoint hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

   /**
   * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
   * @return hostname
  **/
  @jakarta.annotation.Nullable
  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public V1Endpoint nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1Endpoint targetRef(V1ObjectReference targetRef) {

    this.targetRef = targetRef;
    return this;
  }

   /**
   * Get targetRef
   * @return targetRef
  **/
  @jakarta.annotation.Nullable
  public V1ObjectReference getTargetRef() {
    return targetRef;
  }


  public void setTargetRef(V1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }


  public V1Endpoint zone(String zone) {

    this.zone = zone;
    return this;
  }

   /**
   * zone is the name of the Zone this endpoint exists in.
   * @return zone
  **/
  @jakarta.annotation.Nullable
  public String getZone() {
    return zone;
  }


  public void setZone(String zone) {
    this.zone = zone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Endpoint v1Endpoint = (V1Endpoint) o;
    return Objects.equals(this.addresses, v1Endpoint.addresses) &&
        Objects.equals(this.conditions, v1Endpoint.conditions) &&
        Objects.equals(this.deprecatedTopology, v1Endpoint.deprecatedTopology) &&
        Objects.equals(this.hints, v1Endpoint.hints) &&
        Objects.equals(this.hostname, v1Endpoint.hostname) &&
        Objects.equals(this.nodeName, v1Endpoint.nodeName) &&
        Objects.equals(this.targetRef, v1Endpoint.targetRef) &&
        Objects.equals(this.zone, v1Endpoint.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, conditions, deprecatedTopology, hints, hostname, nodeName, targetRef, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Endpoint {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    deprecatedTopology: ").append(toIndentedString(deprecatedTopology)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("conditions");
    openapiFields.add("deprecatedTopology");
    openapiFields.add("hints");
    openapiFields.add("hostname");
    openapiFields.add("nodeName");
    openapiFields.add("targetRef");
    openapiFields.add("zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1Endpoint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1Endpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Endpoint is not found in the empty JSON string", V1Endpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1Endpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Endpoint` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Endpoint.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("addresses") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      // validate the optional field `conditions`
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        V1EndpointConditions.validateJsonObject(jsonObj.getAsJsonObject("conditions"));
      }
      // validate the optional field `hints`
      if (jsonObj.get("hints") != null && !jsonObj.get("hints").isJsonNull()) {
        V1EndpointHints.validateJsonObject(jsonObj.getAsJsonObject("hints"));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `targetRef`
      if (jsonObj.get("targetRef") != null && !jsonObj.get("targetRef").isJsonNull()) {
        V1ObjectReference.validateJsonObject(jsonObj.getAsJsonObject("targetRef"));
      }
      if ((jsonObj.get("zone") != null && !jsonObj.get("zone").isJsonNull()) && !jsonObj.get("zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Endpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Endpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Endpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Endpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Endpoint>() {
           @Override
           public void write(JsonWriter out, V1Endpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Endpoint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1Endpoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1Endpoint
  * @throws IOException if the JSON string is invalid with respect to V1Endpoint
  */
  public static V1Endpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Endpoint.class);
  }

 /**
  * Convert an instance of V1Endpoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
