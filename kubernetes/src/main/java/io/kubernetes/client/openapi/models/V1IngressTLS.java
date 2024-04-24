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
 * IngressTLS describes the transport layer security associated with an ingress.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1IngressTLS {
  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public V1IngressTLS() {
  }

  public V1IngressTLS hosts(List<String> hosts) {

    this.hosts = hosts;
    return this;
  }

  public V1IngressTLS addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * hosts is a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
   * @return hosts
  **/
  @jakarta.annotation.Nullable
  public List<String> getHosts() {
    return hosts;
  }


  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


  public V1IngressTLS secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

   /**
   * secretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \&quot;Host\&quot; header field used by an IngressRule, the SNI host is used for termination and value of the \&quot;Host\&quot; header is used for routing.
   * @return secretName
  **/
  @jakarta.annotation.Nullable
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressTLS v1IngressTLS = (V1IngressTLS) o;
    return Objects.equals(this.hosts, v1IngressTLS.hosts) &&
        Objects.equals(this.secretName, v1IngressTLS.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressTLS {\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
    openapiFields.add("hosts");
    openapiFields.add("secretName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1IngressTLS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1IngressTLS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressTLS is not found in the empty JSON string", V1IngressTLS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1IngressTLS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressTLS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hosts") != null && !jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      if ((jsonObj.get("secretName") != null && !jsonObj.get("secretName").isJsonNull()) && !jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressTLS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressTLS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressTLS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressTLS.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressTLS>() {
           @Override
           public void write(JsonWriter out, V1IngressTLS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressTLS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1IngressTLS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1IngressTLS
  * @throws IOException if the JSON string is invalid with respect to V1IngressTLS
  */
  public static V1IngressTLS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressTLS.class);
  }

 /**
  * Convert an instance of V1IngressTLS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
