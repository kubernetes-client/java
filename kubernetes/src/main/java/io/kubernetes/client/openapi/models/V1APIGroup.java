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
import io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery;
import io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR;
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
 * APIGroup contains the name, the supported versions, and the preferred version of a group.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1APIGroup {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PREFERRED_VERSION = "preferredVersion";
  @SerializedName(SERIALIZED_NAME_PREFERRED_VERSION)
  private V1GroupVersionForDiscovery preferredVersion;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS_BY_CLIENT_C_I_D_RS = "serverAddressByClientCIDRs";
  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS_BY_CLIENT_C_I_D_RS)
  private List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1GroupVersionForDiscovery> versions = new ArrayList<>();

  public V1APIGroup() {
  }

  public V1APIGroup apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1APIGroup kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1APIGroup name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the name of the group.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1APIGroup preferredVersion(V1GroupVersionForDiscovery preferredVersion) {

    this.preferredVersion = preferredVersion;
    return this;
  }

   /**
   * Get preferredVersion
   * @return preferredVersion
  **/
  @jakarta.annotation.Nullable
  public V1GroupVersionForDiscovery getPreferredVersion() {
    return preferredVersion;
  }


  public void setPreferredVersion(V1GroupVersionForDiscovery preferredVersion) {
    this.preferredVersion = preferredVersion;
  }


  public V1APIGroup serverAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {

    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    return this;
  }

  public V1APIGroup addServerAddressByClientCIDRsItem(V1ServerAddressByClientCIDR serverAddressByClientCIDRsItem) {
    if (this.serverAddressByClientCIDRs == null) {
      this.serverAddressByClientCIDRs = new ArrayList<>();
    }
    this.serverAddressByClientCIDRs.add(serverAddressByClientCIDRsItem);
    return this;
  }

   /**
   * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
   * @return serverAddressByClientCIDRs
  **/
  @jakarta.annotation.Nullable
  public List<V1ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs;
  }


  public void setServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
  }


  public V1APIGroup versions(List<V1GroupVersionForDiscovery> versions) {

    this.versions = versions;
    return this;
  }

  public V1APIGroup addVersionsItem(V1GroupVersionForDiscovery versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * versions are the versions supported in this group.
   * @return versions
  **/
  @jakarta.annotation.Nonnull
  public List<V1GroupVersionForDiscovery> getVersions() {
    return versions;
  }


  public void setVersions(List<V1GroupVersionForDiscovery> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIGroup v1APIGroup = (V1APIGroup) o;
    return Objects.equals(this.apiVersion, v1APIGroup.apiVersion) &&
        Objects.equals(this.kind, v1APIGroup.kind) &&
        Objects.equals(this.name, v1APIGroup.name) &&
        Objects.equals(this.preferredVersion, v1APIGroup.preferredVersion) &&
        Objects.equals(this.serverAddressByClientCIDRs, v1APIGroup.serverAddressByClientCIDRs) &&
        Objects.equals(this.versions, v1APIGroup.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, preferredVersion, serverAddressByClientCIDRs, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIGroup {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredVersion: ").append(toIndentedString(preferredVersion)).append("\n");
    sb.append("    serverAddressByClientCIDRs: ").append(toIndentedString(serverAddressByClientCIDRs)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("preferredVersion");
    openapiFields.add("serverAddressByClientCIDRs");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("versions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1APIGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1APIGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1APIGroup is not found in the empty JSON string", V1APIGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1APIGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1APIGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1APIGroup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `preferredVersion`
      if (jsonObj.get("preferredVersion") != null && !jsonObj.get("preferredVersion").isJsonNull()) {
        V1GroupVersionForDiscovery.validateJsonObject(jsonObj.getAsJsonObject("preferredVersion"));
      }
      if (jsonObj.get("serverAddressByClientCIDRs") != null && !jsonObj.get("serverAddressByClientCIDRs").isJsonNull()) {
        JsonArray jsonArrayserverAddressByClientCIDRs = jsonObj.getAsJsonArray("serverAddressByClientCIDRs");
        if (jsonArrayserverAddressByClientCIDRs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serverAddressByClientCIDRs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serverAddressByClientCIDRs` to be an array in the JSON string but got `%s`", jsonObj.get("serverAddressByClientCIDRs").toString()));
          }

          // validate the optional field `serverAddressByClientCIDRs` (array)
          for (int i = 0; i < jsonArrayserverAddressByClientCIDRs.size(); i++) {
            V1ServerAddressByClientCIDR.validateJsonObject(jsonArrayserverAddressByClientCIDRs.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
      }

      JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
      // validate the required field `versions` (array)
      for (int i = 0; i < jsonArrayversions.size(); i++) {
        V1GroupVersionForDiscovery.validateJsonObject(jsonArrayversions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1APIGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1APIGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1APIGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1APIGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<V1APIGroup>() {
           @Override
           public void write(JsonWriter out, V1APIGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1APIGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1APIGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1APIGroup
  * @throws IOException if the JSON string is invalid with respect to V1APIGroup
  */
  public static V1APIGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1APIGroup.class);
  }

 /**
  * Convert an instance of V1APIGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
