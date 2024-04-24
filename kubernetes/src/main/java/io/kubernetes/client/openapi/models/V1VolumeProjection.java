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
import io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjection;
import io.kubernetes.client.openapi.models.V1ConfigMapProjection;
import io.kubernetes.client.openapi.models.V1DownwardAPIProjection;
import io.kubernetes.client.openapi.models.V1SecretProjection;
import io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection;
import java.io.IOException;

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
 * Projection that may be projected along with other supported volume types
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1VolumeProjection {
  public static final String SERIALIZED_NAME_CLUSTER_TRUST_BUNDLE = "clusterTrustBundle";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TRUST_BUNDLE)
  private V1ClusterTrustBundleProjection clusterTrustBundle;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ConfigMapProjection configMap;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1DownwardAPIProjection downwardAPI;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1SecretProjection secret;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN = "serviceAccountToken";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN)
  private V1ServiceAccountTokenProjection serviceAccountToken;

  public V1VolumeProjection() {
  }

  public V1VolumeProjection clusterTrustBundle(V1ClusterTrustBundleProjection clusterTrustBundle) {

    this.clusterTrustBundle = clusterTrustBundle;
    return this;
  }

   /**
   * Get clusterTrustBundle
   * @return clusterTrustBundle
  **/
  @jakarta.annotation.Nullable
  public V1ClusterTrustBundleProjection getClusterTrustBundle() {
    return clusterTrustBundle;
  }


  public void setClusterTrustBundle(V1ClusterTrustBundleProjection clusterTrustBundle) {
    this.clusterTrustBundle = clusterTrustBundle;
  }


  public V1VolumeProjection configMap(V1ConfigMapProjection configMap) {

    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @jakarta.annotation.Nullable
  public V1ConfigMapProjection getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1ConfigMapProjection configMap) {
    this.configMap = configMap;
  }


  public V1VolumeProjection downwardAPI(V1DownwardAPIProjection downwardAPI) {

    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @jakarta.annotation.Nullable
  public V1DownwardAPIProjection getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(V1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1VolumeProjection secret(V1SecretProjection secret) {

    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nullable
  public V1SecretProjection getSecret() {
    return secret;
  }


  public void setSecret(V1SecretProjection secret) {
    this.secret = secret;
  }


  public V1VolumeProjection serviceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {

    this.serviceAccountToken = serviceAccountToken;
    return this;
  }

   /**
   * Get serviceAccountToken
   * @return serviceAccountToken
  **/
  @jakarta.annotation.Nullable
  public V1ServiceAccountTokenProjection getServiceAccountToken() {
    return serviceAccountToken;
  }


  public void setServiceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeProjection v1VolumeProjection = (V1VolumeProjection) o;
    return Objects.equals(this.clusterTrustBundle, v1VolumeProjection.clusterTrustBundle) &&
        Objects.equals(this.configMap, v1VolumeProjection.configMap) &&
        Objects.equals(this.downwardAPI, v1VolumeProjection.downwardAPI) &&
        Objects.equals(this.secret, v1VolumeProjection.secret) &&
        Objects.equals(this.serviceAccountToken, v1VolumeProjection.serviceAccountToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTrustBundle, configMap, downwardAPI, secret, serviceAccountToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeProjection {\n");
    sb.append("    clusterTrustBundle: ").append(toIndentedString(clusterTrustBundle)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
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
    openapiFields.add("clusterTrustBundle");
    openapiFields.add("configMap");
    openapiFields.add("downwardAPI");
    openapiFields.add("secret");
    openapiFields.add("serviceAccountToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1VolumeProjection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1VolumeProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeProjection is not found in the empty JSON string", V1VolumeProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeProjection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `clusterTrustBundle`
      if (jsonObj.get("clusterTrustBundle") != null && !jsonObj.get("clusterTrustBundle").isJsonNull()) {
        V1ClusterTrustBundleProjection.validateJsonObject(jsonObj.getAsJsonObject("clusterTrustBundle"));
      }
      // validate the optional field `configMap`
      if (jsonObj.get("configMap") != null && !jsonObj.get("configMap").isJsonNull()) {
        V1ConfigMapProjection.validateJsonObject(jsonObj.getAsJsonObject("configMap"));
      }
      // validate the optional field `downwardAPI`
      if (jsonObj.get("downwardAPI") != null && !jsonObj.get("downwardAPI").isJsonNull()) {
        V1DownwardAPIProjection.validateJsonObject(jsonObj.getAsJsonObject("downwardAPI"));
      }
      // validate the optional field `secret`
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) {
        V1SecretProjection.validateJsonObject(jsonObj.getAsJsonObject("secret"));
      }
      // validate the optional field `serviceAccountToken`
      if (jsonObj.get("serviceAccountToken") != null && !jsonObj.get("serviceAccountToken").isJsonNull()) {
        V1ServiceAccountTokenProjection.validateJsonObject(jsonObj.getAsJsonObject("serviceAccountToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeProjection>() {
           @Override
           public void write(JsonWriter out, V1VolumeProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeProjection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1VolumeProjection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1VolumeProjection
  * @throws IOException if the JSON string is invalid with respect to V1VolumeProjection
  */
  public static V1VolumeProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeProjection.class);
  }

 /**
  * Convert an instance of V1VolumeProjection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
