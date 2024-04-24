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
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod&#39;s hosts file.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1HostAlias {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public V1HostAlias() {
  }

  public V1HostAlias hostnames(List<String> hostnames) {

    this.hostnames = hostnames;
    return this;
  }

  public V1HostAlias addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Hostnames for the above IP address.
   * @return hostnames
  **/
  @jakarta.annotation.Nullable
  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public V1HostAlias ip(String ip) {

    this.ip = ip;
    return this;
  }

   /**
   * IP address of the host file entry.
   * @return ip
  **/
  @jakarta.annotation.Nullable
  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostAlias v1HostAlias = (V1HostAlias) o;
    return Objects.equals(this.hostnames, v1HostAlias.hostnames) &&
        Objects.equals(this.ip, v1HostAlias.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostAlias {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
    openapiFields.add("hostnames");
    openapiFields.add("ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1HostAlias
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1HostAlias.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HostAlias is not found in the empty JSON string", V1HostAlias.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1HostAlias.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HostAlias` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hostnames") != null && !jsonObj.get("hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("hostnames").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1HostAlias.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1HostAlias' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1HostAlias> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1HostAlias.class));

       return (TypeAdapter<T>) new TypeAdapter<V1HostAlias>() {
           @Override
           public void write(JsonWriter out, V1HostAlias value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1HostAlias read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1HostAlias given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1HostAlias
  * @throws IOException if the JSON string is invalid with respect to V1HostAlias
  */
  public static V1HostAlias fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1HostAlias.class);
  }

 /**
  * Convert an instance of V1HostAlias to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
