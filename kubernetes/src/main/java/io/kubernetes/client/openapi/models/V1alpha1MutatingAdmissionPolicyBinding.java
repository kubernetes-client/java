/*
Copyright 2025 The Kubernetes Authors.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha1MutatingAdmissionPolicyBindingSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * MutatingAdmissionPolicyBinding binds the MutatingAdmissionPolicy with parametrized resources. MutatingAdmissionPolicyBinding and the optional parameter resource together define how cluster administrators configure policies for clusters.  For a given admission request, each binding will cause its policy to be evaluated N times, where N is 1 for policies/bindings that don&#39;t use params, otherwise N is the number of parameters selected by the binding. Each evaluation is constrained by a [runtime cost budget](https://kubernetes.io/docs/reference/using-api/cel/#runtime-cost-budget).  Adding/removing policies, bindings, or params can not affect whether a given (policy, binding, param) combination is within its own CEL budget.
 */
@ApiModel(description = "MutatingAdmissionPolicyBinding binds the MutatingAdmissionPolicy with parametrized resources. MutatingAdmissionPolicyBinding and the optional parameter resource together define how cluster administrators configure policies for clusters.  For a given admission request, each binding will cause its policy to be evaluated N times, where N is 1 for policies/bindings that don't use params, otherwise N is the number of parameters selected by the binding. Each evaluation is constrained by a [runtime cost budget](https://kubernetes.io/docs/reference/using-api/cel/#runtime-cost-budget).  Adding/removing policies, bindings, or params can not affect whether a given (policy, binding, param) combination is within its own CEL budget.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1MutatingAdmissionPolicyBinding implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1MutatingAdmissionPolicyBindingSpec spec;

  public V1alpha1MutatingAdmissionPolicyBinding() {
  }

  public V1alpha1MutatingAdmissionPolicyBinding apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha1MutatingAdmissionPolicyBinding kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha1MutatingAdmissionPolicyBinding metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1alpha1MutatingAdmissionPolicyBinding spec(V1alpha1MutatingAdmissionPolicyBindingSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1MutatingAdmissionPolicyBindingSpec getSpec() {
    return spec;
  }

  public void setSpec(V1alpha1MutatingAdmissionPolicyBindingSpec spec) {
    this.spec = spec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MutatingAdmissionPolicyBinding v1alpha1MutatingAdmissionPolicyBinding = (V1alpha1MutatingAdmissionPolicyBinding) o;
    return Objects.equals(this.apiVersion, v1alpha1MutatingAdmissionPolicyBinding.apiVersion) &&
        Objects.equals(this.kind, v1alpha1MutatingAdmissionPolicyBinding.kind) &&
        Objects.equals(this.metadata, v1alpha1MutatingAdmissionPolicyBinding.metadata) &&
        Objects.equals(this.spec, v1alpha1MutatingAdmissionPolicyBinding.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MutatingAdmissionPolicyBinding {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1MutatingAdmissionPolicyBinding
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1MutatingAdmissionPolicyBinding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1MutatingAdmissionPolicyBinding is not found in the empty JSON string", V1alpha1MutatingAdmissionPolicyBinding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1MutatingAdmissionPolicyBinding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1MutatingAdmissionPolicyBinding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        V1alpha1MutatingAdmissionPolicyBindingSpec.validateJsonElement(jsonObj.get("spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1MutatingAdmissionPolicyBinding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1MutatingAdmissionPolicyBinding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1MutatingAdmissionPolicyBinding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1MutatingAdmissionPolicyBinding.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1MutatingAdmissionPolicyBinding>() {
           @Override
           public void write(JsonWriter out, V1alpha1MutatingAdmissionPolicyBinding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1MutatingAdmissionPolicyBinding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1MutatingAdmissionPolicyBinding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1MutatingAdmissionPolicyBinding
  * @throws IOException if the JSON string is invalid with respect to V1alpha1MutatingAdmissionPolicyBinding
  */
  public static V1alpha1MutatingAdmissionPolicyBinding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1MutatingAdmissionPolicyBinding.class);
  }

 /**
  * Convert an instance of V1alpha1MutatingAdmissionPolicyBinding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
