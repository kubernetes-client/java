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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha2DriverRequests;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersReference;
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
 * ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClaimParameters implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRIVER_REQUESTS = "driverRequests";
  @SerializedName(SERIALIZED_NAME_DRIVER_REQUESTS)
  private List<V1alpha2DriverRequests> driverRequests;

  public static final String SERIALIZED_NAME_GENERATED_FROM = "generatedFrom";
  @SerializedName(SERIALIZED_NAME_GENERATED_FROM)
  private V1alpha2ResourceClaimParametersReference generatedFrom;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SHAREABLE = "shareable";
  @SerializedName(SERIALIZED_NAME_SHAREABLE)
  private Boolean shareable;

  public V1alpha2ResourceClaimParameters() {
  }

  public V1alpha2ResourceClaimParameters apiVersion(String apiVersion) {

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


  public V1alpha2ResourceClaimParameters driverRequests(List<V1alpha2DriverRequests> driverRequests) {

    this.driverRequests = driverRequests;
    return this;
  }

  public V1alpha2ResourceClaimParameters addDriverRequestsItem(V1alpha2DriverRequests driverRequestsItem) {
    if (this.driverRequests == null) {
      this.driverRequests = new ArrayList<>();
    }
    this.driverRequests.add(driverRequestsItem);
    return this;
  }

   /**
   * DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.  May be empty, in which case the claim can always be allocated.
   * @return driverRequests
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2DriverRequests> getDriverRequests() {
    return driverRequests;
  }


  public void setDriverRequests(List<V1alpha2DriverRequests> driverRequests) {
    this.driverRequests = driverRequests;
  }


  public V1alpha2ResourceClaimParameters generatedFrom(V1alpha2ResourceClaimParametersReference generatedFrom) {

    this.generatedFrom = generatedFrom;
    return this;
  }

   /**
   * Get generatedFrom
   * @return generatedFrom
  **/
  @jakarta.annotation.Nullable
  public V1alpha2ResourceClaimParametersReference getGeneratedFrom() {
    return generatedFrom;
  }


  public void setGeneratedFrom(V1alpha2ResourceClaimParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
  }


  public V1alpha2ResourceClaimParameters kind(String kind) {

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


  public V1alpha2ResourceClaimParameters metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1alpha2ResourceClaimParameters shareable(Boolean shareable) {

    this.shareable = shareable;
    return this;
  }

   /**
   * Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
   * @return shareable
  **/
  @jakarta.annotation.Nullable
  public Boolean getShareable() {
    return shareable;
  }


  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimParameters v1alpha2ResourceClaimParameters = (V1alpha2ResourceClaimParameters) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClaimParameters.apiVersion) &&
        Objects.equals(this.driverRequests, v1alpha2ResourceClaimParameters.driverRequests) &&
        Objects.equals(this.generatedFrom, v1alpha2ResourceClaimParameters.generatedFrom) &&
        Objects.equals(this.kind, v1alpha2ResourceClaimParameters.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClaimParameters.metadata) &&
        Objects.equals(this.shareable, v1alpha2ResourceClaimParameters.shareable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, driverRequests, generatedFrom, kind, metadata, shareable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimParameters {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    driverRequests: ").append(toIndentedString(driverRequests)).append("\n");
    sb.append("    generatedFrom: ").append(toIndentedString(generatedFrom)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
    openapiFields.add("driverRequests");
    openapiFields.add("generatedFrom");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("shareable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClaimParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClaimParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClaimParameters is not found in the empty JSON string", V1alpha2ResourceClaimParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClaimParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClaimParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (jsonObj.get("driverRequests") != null && !jsonObj.get("driverRequests").isJsonNull()) {
        JsonArray jsonArraydriverRequests = jsonObj.getAsJsonArray("driverRequests");
        if (jsonArraydriverRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("driverRequests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `driverRequests` to be an array in the JSON string but got `%s`", jsonObj.get("driverRequests").toString()));
          }

          // validate the optional field `driverRequests` (array)
          for (int i = 0; i < jsonArraydriverRequests.size(); i++) {
            V1alpha2DriverRequests.validateJsonObject(jsonArraydriverRequests.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `generatedFrom`
      if (jsonObj.get("generatedFrom") != null && !jsonObj.get("generatedFrom").isJsonNull()) {
        V1alpha2ResourceClaimParametersReference.validateJsonObject(jsonObj.getAsJsonObject("generatedFrom"));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceClaimParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClaimParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClaimParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClaimParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClaimParameters>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClaimParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClaimParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClaimParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClaimParameters
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClaimParameters
  */
  public static V1alpha2ResourceClaimParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClaimParameters.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClaimParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
