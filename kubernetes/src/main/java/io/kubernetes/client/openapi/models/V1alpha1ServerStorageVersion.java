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
 * An API server instance reports the version it can decode and the version it encodes objects to when persisting objects in the backend.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1ServerStorageVersion {
  public static final String SERIALIZED_NAME_API_SERVER_I_D = "apiServerID";
  @SerializedName(SERIALIZED_NAME_API_SERVER_I_D)
  private String apiServerID;

  public static final String SERIALIZED_NAME_DECODABLE_VERSIONS = "decodableVersions";
  @SerializedName(SERIALIZED_NAME_DECODABLE_VERSIONS)
  private List<String> decodableVersions;

  public static final String SERIALIZED_NAME_ENCODING_VERSION = "encodingVersion";
  @SerializedName(SERIALIZED_NAME_ENCODING_VERSION)
  private String encodingVersion;

  public static final String SERIALIZED_NAME_SERVED_VERSIONS = "servedVersions";
  @SerializedName(SERIALIZED_NAME_SERVED_VERSIONS)
  private List<String> servedVersions;

  public V1alpha1ServerStorageVersion() {
  }

  public V1alpha1ServerStorageVersion apiServerID(String apiServerID) {

    this.apiServerID = apiServerID;
    return this;
  }

   /**
   * The ID of the reporting API server.
   * @return apiServerID
  **/
  @jakarta.annotation.Nullable
  public String getApiServerID() {
    return apiServerID;
  }


  public void setApiServerID(String apiServerID) {
    this.apiServerID = apiServerID;
  }


  public V1alpha1ServerStorageVersion decodableVersions(List<String> decodableVersions) {

    this.decodableVersions = decodableVersions;
    return this;
  }

  public V1alpha1ServerStorageVersion addDecodableVersionsItem(String decodableVersionsItem) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList<>();
    }
    this.decodableVersions.add(decodableVersionsItem);
    return this;
  }

   /**
   * The API server can decode objects encoded in these versions. The encodingVersion must be included in the decodableVersions.
   * @return decodableVersions
  **/
  @jakarta.annotation.Nullable
  public List<String> getDecodableVersions() {
    return decodableVersions;
  }


  public void setDecodableVersions(List<String> decodableVersions) {
    this.decodableVersions = decodableVersions;
  }


  public V1alpha1ServerStorageVersion encodingVersion(String encodingVersion) {

    this.encodingVersion = encodingVersion;
    return this;
  }

   /**
   * The API server encodes the object to this version when persisting it in the backend (e.g., etcd).
   * @return encodingVersion
  **/
  @jakarta.annotation.Nullable
  public String getEncodingVersion() {
    return encodingVersion;
  }


  public void setEncodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
  }


  public V1alpha1ServerStorageVersion servedVersions(List<String> servedVersions) {

    this.servedVersions = servedVersions;
    return this;
  }

  public V1alpha1ServerStorageVersion addServedVersionsItem(String servedVersionsItem) {
    if (this.servedVersions == null) {
      this.servedVersions = new ArrayList<>();
    }
    this.servedVersions.add(servedVersionsItem);
    return this;
  }

   /**
   * The API server can serve these versions. DecodableVersions must include all ServedVersions.
   * @return servedVersions
  **/
  @jakarta.annotation.Nullable
  public List<String> getServedVersions() {
    return servedVersions;
  }


  public void setServedVersions(List<String> servedVersions) {
    this.servedVersions = servedVersions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ServerStorageVersion v1alpha1ServerStorageVersion = (V1alpha1ServerStorageVersion) o;
    return Objects.equals(this.apiServerID, v1alpha1ServerStorageVersion.apiServerID) &&
        Objects.equals(this.decodableVersions, v1alpha1ServerStorageVersion.decodableVersions) &&
        Objects.equals(this.encodingVersion, v1alpha1ServerStorageVersion.encodingVersion) &&
        Objects.equals(this.servedVersions, v1alpha1ServerStorageVersion.servedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServerID, decodableVersions, encodingVersion, servedVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ServerStorageVersion {\n");
    sb.append("    apiServerID: ").append(toIndentedString(apiServerID)).append("\n");
    sb.append("    decodableVersions: ").append(toIndentedString(decodableVersions)).append("\n");
    sb.append("    encodingVersion: ").append(toIndentedString(encodingVersion)).append("\n");
    sb.append("    servedVersions: ").append(toIndentedString(servedVersions)).append("\n");
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
    openapiFields.add("apiServerID");
    openapiFields.add("decodableVersions");
    openapiFields.add("encodingVersion");
    openapiFields.add("servedVersions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ServerStorageVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ServerStorageVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ServerStorageVersion is not found in the empty JSON string", V1alpha1ServerStorageVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ServerStorageVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ServerStorageVersion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiServerID") != null && !jsonObj.get("apiServerID").isJsonNull()) && !jsonObj.get("apiServerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiServerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiServerID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("decodableVersions") != null && !jsonObj.get("decodableVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `decodableVersions` to be an array in the JSON string but got `%s`", jsonObj.get("decodableVersions").toString()));
      }
      if ((jsonObj.get("encodingVersion") != null && !jsonObj.get("encodingVersion").isJsonNull()) && !jsonObj.get("encodingVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodingVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodingVersion").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("servedVersions") != null && !jsonObj.get("servedVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `servedVersions` to be an array in the JSON string but got `%s`", jsonObj.get("servedVersions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ServerStorageVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ServerStorageVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ServerStorageVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ServerStorageVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ServerStorageVersion>() {
           @Override
           public void write(JsonWriter out, V1alpha1ServerStorageVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ServerStorageVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ServerStorageVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ServerStorageVersion
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ServerStorageVersion
  */
  public static V1alpha1ServerStorageVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ServerStorageVersion.class);
  }

 /**
  * Convert an instance of V1alpha1ServerStorageVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
