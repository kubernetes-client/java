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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 */
@ApiModel(description = "PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PriorityClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT = "globalDefault";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT)
  @jakarta.annotation.Nullable
  private Boolean globalDefault;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @jakarta.annotation.Nullable
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PREEMPTION_POLICY = "preemptionPolicy";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_POLICY)
  @jakarta.annotation.Nullable
  private String preemptionPolicy;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @jakarta.annotation.Nonnull
  private Integer value;

  public V1PriorityClass() {
  }

  public V1PriorityClass apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1PriorityClass description(@jakarta.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
   * @return description
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "description is an arbitrary string that usually provides guidelines on when this priority class should be used.")
  public String getDescription() {
    return description;
  }

  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }


  public V1PriorityClass globalDefault(@jakarta.annotation.Nullable Boolean globalDefault) {
    this.globalDefault = globalDefault;
    return this;
  }

  /**
   * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as &#x60;globalDefault&#x60;. However, if more than one PriorityClasses exists with their &#x60;globalDefault&#x60; field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
   * @return globalDefault
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.")
  public Boolean getGlobalDefault() {
    return globalDefault;
  }

  public void setGlobalDefault(@jakarta.annotation.Nullable Boolean globalDefault) {
    this.globalDefault = globalDefault;
  }


  public V1PriorityClass kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public V1PriorityClass metadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1PriorityClass preemptionPolicy(@jakarta.annotation.Nullable String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

  /**
   * preemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
   * @return preemptionPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "preemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.")
  public String getPreemptionPolicy() {
    return preemptionPolicy;
  }

  public void setPreemptionPolicy(@jakarta.annotation.Nullable String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
  }


  public V1PriorityClass value(@jakarta.annotation.Nonnull Integer value) {
    this.value = value;
    return this;
  }

  /**
   * value represents the integer value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
   * @return value
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "value represents the integer value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.")
  public Integer getValue() {
    return value;
  }

  public void setValue(@jakarta.annotation.Nonnull Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PriorityClass v1PriorityClass = (V1PriorityClass) o;
    return Objects.equals(this.apiVersion, v1PriorityClass.apiVersion) &&
        Objects.equals(this.description, v1PriorityClass.description) &&
        Objects.equals(this.globalDefault, v1PriorityClass.globalDefault) &&
        Objects.equals(this.kind, v1PriorityClass.kind) &&
        Objects.equals(this.metadata, v1PriorityClass.metadata) &&
        Objects.equals(this.preemptionPolicy, v1PriorityClass.preemptionPolicy) &&
        Objects.equals(this.value, v1PriorityClass.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, description, globalDefault, kind, metadata, preemptionPolicy, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PriorityClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalDefault: ").append(toIndentedString(globalDefault)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("globalDefault");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("preemptionPolicy");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PriorityClass
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PriorityClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PriorityClass is not found in the empty JSON string", V1PriorityClass.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PriorityClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PriorityClass` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PriorityClass.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      if ((jsonObj.get("preemptionPolicy") != null && !jsonObj.get("preemptionPolicy").isJsonNull()) && !jsonObj.get("preemptionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preemptionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preemptionPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PriorityClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PriorityClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PriorityClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PriorityClass.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PriorityClass>() {
           @Override
           public void write(JsonWriter out, V1PriorityClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PriorityClass read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PriorityClass given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PriorityClass
   * @throws IOException if the JSON string is invalid with respect to V1PriorityClass
   */
  public static V1PriorityClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PriorityClass.class);
  }

  /**
   * Convert an instance of V1PriorityClass to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
