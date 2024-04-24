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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersReference;
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
 * ResourceClass is used by administrators to influence how resources are allocated.  This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PARAMETERS_REF = "parametersRef";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_REF)
  private V1alpha2ResourceClassParametersReference parametersRef;

  public static final String SERIALIZED_NAME_STRUCTURED_PARAMETERS = "structuredParameters";
  @SerializedName(SERIALIZED_NAME_STRUCTURED_PARAMETERS)
  private Boolean structuredParameters;

  public static final String SERIALIZED_NAME_SUITABLE_NODES = "suitableNodes";
  @SerializedName(SERIALIZED_NAME_SUITABLE_NODES)
  private V1NodeSelector suitableNodes;

  public V1alpha2ResourceClass() {
  }

  public V1alpha2ResourceClass apiVersion(String apiVersion) {

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


  public V1alpha2ResourceClass driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.  Resource drivers have a unique name in forward domain order (acme.example.com).
   * @return driverName
  **/
  @jakarta.annotation.Nonnull
  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceClass kind(String kind) {

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


  public V1alpha2ResourceClass metadata(V1ObjectMeta metadata) {

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


  public V1alpha2ResourceClass parametersRef(V1alpha2ResourceClassParametersReference parametersRef) {

    this.parametersRef = parametersRef;
    return this;
  }

   /**
   * Get parametersRef
   * @return parametersRef
  **/
  @jakarta.annotation.Nullable
  public V1alpha2ResourceClassParametersReference getParametersRef() {
    return parametersRef;
  }


  public void setParametersRef(V1alpha2ResourceClassParametersReference parametersRef) {
    this.parametersRef = parametersRef;
  }


  public V1alpha2ResourceClass structuredParameters(Boolean structuredParameters) {

    this.structuredParameters = structuredParameters;
    return this;
  }

   /**
   * If and only if allocation of claims using this class is handled via structured parameters, then StructuredParameters must be set to true.
   * @return structuredParameters
  **/
  @jakarta.annotation.Nullable
  public Boolean getStructuredParameters() {
    return structuredParameters;
  }


  public void setStructuredParameters(Boolean structuredParameters) {
    this.structuredParameters = structuredParameters;
  }


  public V1alpha2ResourceClass suitableNodes(V1NodeSelector suitableNodes) {

    this.suitableNodes = suitableNodes;
    return this;
  }

   /**
   * Get suitableNodes
   * @return suitableNodes
  **/
  @jakarta.annotation.Nullable
  public V1NodeSelector getSuitableNodes() {
    return suitableNodes;
  }


  public void setSuitableNodes(V1NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClass v1alpha2ResourceClass = (V1alpha2ResourceClass) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClass.apiVersion) &&
        Objects.equals(this.driverName, v1alpha2ResourceClass.driverName) &&
        Objects.equals(this.kind, v1alpha2ResourceClass.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClass.metadata) &&
        Objects.equals(this.parametersRef, v1alpha2ResourceClass.parametersRef) &&
        Objects.equals(this.structuredParameters, v1alpha2ResourceClass.structuredParameters) &&
        Objects.equals(this.suitableNodes, v1alpha2ResourceClass.suitableNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, driverName, kind, metadata, parametersRef, structuredParameters, suitableNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    parametersRef: ").append(toIndentedString(parametersRef)).append("\n");
    sb.append("    structuredParameters: ").append(toIndentedString(structuredParameters)).append("\n");
    sb.append("    suitableNodes: ").append(toIndentedString(suitableNodes)).append("\n");
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
    openapiFields.add("driverName");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("parametersRef");
    openapiFields.add("structuredParameters");
    openapiFields.add("suitableNodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driverName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClass
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClass is not found in the empty JSON string", V1alpha2ResourceClass.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClass` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2ResourceClass.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (!jsonObj.get("driverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverName").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `parametersRef`
      if (jsonObj.get("parametersRef") != null && !jsonObj.get("parametersRef").isJsonNull()) {
        V1alpha2ResourceClassParametersReference.validateJsonObject(jsonObj.getAsJsonObject("parametersRef"));
      }
      // validate the optional field `suitableNodes`
      if (jsonObj.get("suitableNodes") != null && !jsonObj.get("suitableNodes").isJsonNull()) {
        V1NodeSelector.validateJsonObject(jsonObj.getAsJsonObject("suitableNodes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClass.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClass>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClass read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClass given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClass
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClass
  */
  public static V1alpha2ResourceClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClass.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClass to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
