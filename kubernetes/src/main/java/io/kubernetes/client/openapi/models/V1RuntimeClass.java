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
import io.kubernetes.client.openapi.models.V1Overhead;
import io.kubernetes.client.openapi.models.V1Scheduling;
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
 * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1RuntimeClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_HANDLER = "handler";
  @SerializedName(SERIALIZED_NAME_HANDLER)
  private String handler;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";
  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private V1Overhead overhead;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";
  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private V1Scheduling scheduling;

  public V1RuntimeClass() {
  }

  public V1RuntimeClass apiVersion(String apiVersion) {

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


  public V1RuntimeClass handler(String handler) {

    this.handler = handler;
    return this;
  }

   /**
   * handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
   * @return handler
  **/
  @jakarta.annotation.Nonnull
  public String getHandler() {
    return handler;
  }


  public void setHandler(String handler) {
    this.handler = handler;
  }


  public V1RuntimeClass kind(String kind) {

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


  public V1RuntimeClass metadata(V1ObjectMeta metadata) {

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


  public V1RuntimeClass overhead(V1Overhead overhead) {

    this.overhead = overhead;
    return this;
  }

   /**
   * Get overhead
   * @return overhead
  **/
  @jakarta.annotation.Nullable
  public V1Overhead getOverhead() {
    return overhead;
  }


  public void setOverhead(V1Overhead overhead) {
    this.overhead = overhead;
  }


  public V1RuntimeClass scheduling(V1Scheduling scheduling) {

    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @jakarta.annotation.Nullable
  public V1Scheduling getScheduling() {
    return scheduling;
  }


  public void setScheduling(V1Scheduling scheduling) {
    this.scheduling = scheduling;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RuntimeClass v1RuntimeClass = (V1RuntimeClass) o;
    return Objects.equals(this.apiVersion, v1RuntimeClass.apiVersion) &&
        Objects.equals(this.handler, v1RuntimeClass.handler) &&
        Objects.equals(this.kind, v1RuntimeClass.kind) &&
        Objects.equals(this.metadata, v1RuntimeClass.metadata) &&
        Objects.equals(this.overhead, v1RuntimeClass.overhead) &&
        Objects.equals(this.scheduling, v1RuntimeClass.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, handler, kind, metadata, overhead, scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RuntimeClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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
    openapiFields.add("handler");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("overhead");
    openapiFields.add("scheduling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("handler");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1RuntimeClass
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1RuntimeClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1RuntimeClass is not found in the empty JSON string", V1RuntimeClass.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1RuntimeClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1RuntimeClass` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1RuntimeClass.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (!jsonObj.get("handler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handler").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `overhead`
      if (jsonObj.get("overhead") != null && !jsonObj.get("overhead").isJsonNull()) {
        V1Overhead.validateJsonObject(jsonObj.getAsJsonObject("overhead"));
      }
      // validate the optional field `scheduling`
      if (jsonObj.get("scheduling") != null && !jsonObj.get("scheduling").isJsonNull()) {
        V1Scheduling.validateJsonObject(jsonObj.getAsJsonObject("scheduling"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1RuntimeClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1RuntimeClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1RuntimeClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1RuntimeClass.class));

       return (TypeAdapter<T>) new TypeAdapter<V1RuntimeClass>() {
           @Override
           public void write(JsonWriter out, V1RuntimeClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1RuntimeClass read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1RuntimeClass given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1RuntimeClass
  * @throws IOException if the JSON string is invalid with respect to V1RuntimeClass
  */
  public static V1RuntimeClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1RuntimeClass.class);
  }

 /**
  * Convert an instance of V1RuntimeClass to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
