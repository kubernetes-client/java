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
import io.kubernetes.client.openapi.models.V1NetworkPolicyPeer;
import io.kubernetes.client.openapi.models.V1NetworkPolicyPort;
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
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and from.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NetworkPolicyIngressRule {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private List<V1NetworkPolicyPeer> from;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1NetworkPolicyPort> ports;

  public V1NetworkPolicyIngressRule() {
  }

  public V1NetworkPolicyIngressRule from(List<V1NetworkPolicyPeer> from) {

    this.from = from;
    return this;
  }

  public V1NetworkPolicyIngressRule addFromItem(V1NetworkPolicyPeer fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * from is a list of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
   * @return from
  **/
  @jakarta.annotation.Nullable
  public List<V1NetworkPolicyPeer> getFrom() {
    return from;
  }


  public void setFrom(List<V1NetworkPolicyPeer> from) {
    this.from = from;
  }


  public V1NetworkPolicyIngressRule ports(List<V1NetworkPolicyPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1NetworkPolicyIngressRule addPortsItem(V1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * ports is a list of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @jakarta.annotation.Nullable
  public List<V1NetworkPolicyPort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1NetworkPolicyPort> ports) {
    this.ports = ports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicyIngressRule v1NetworkPolicyIngressRule = (V1NetworkPolicyIngressRule) o;
    return Objects.equals(this.from, v1NetworkPolicyIngressRule.from) &&
        Objects.equals(this.ports, v1NetworkPolicyIngressRule.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyIngressRule {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("ports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NetworkPolicyIngressRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NetworkPolicyIngressRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NetworkPolicyIngressRule is not found in the empty JSON string", V1NetworkPolicyIngressRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NetworkPolicyIngressRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NetworkPolicyIngressRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) {
        JsonArray jsonArrayfrom = jsonObj.getAsJsonArray("from");
        if (jsonArrayfrom != null) {
          // ensure the json data is an array
          if (!jsonObj.get("from").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `from` to be an array in the JSON string but got `%s`", jsonObj.get("from").toString()));
          }

          // validate the optional field `from` (array)
          for (int i = 0; i < jsonArrayfrom.size(); i++) {
            V1NetworkPolicyPeer.validateJsonObject(jsonArrayfrom.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            V1NetworkPolicyPort.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NetworkPolicyIngressRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NetworkPolicyIngressRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NetworkPolicyIngressRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NetworkPolicyIngressRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NetworkPolicyIngressRule>() {
           @Override
           public void write(JsonWriter out, V1NetworkPolicyIngressRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NetworkPolicyIngressRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NetworkPolicyIngressRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NetworkPolicyIngressRule
  * @throws IOException if the JSON string is invalid with respect to V1NetworkPolicyIngressRule
  */
  public static V1NetworkPolicyIngressRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NetworkPolicyIngressRule.class);
  }

 /**
  * Convert an instance of V1NetworkPolicyIngressRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
