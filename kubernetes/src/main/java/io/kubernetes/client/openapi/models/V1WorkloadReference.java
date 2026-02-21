/*
Copyright 2026 The Kubernetes Authors.
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
 * WorkloadReference identifies the Workload object and PodGroup membership that a Pod belongs to. The scheduler uses this information to apply workload-aware scheduling semantics.
 */
@ApiModel(description = "WorkloadReference identifies the Workload object and PodGroup membership that a Pod belongs to. The scheduler uses this information to apply workload-aware scheduling semantics.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1WorkloadReference {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_POD_GROUP = "podGroup";
  @SerializedName(SERIALIZED_NAME_POD_GROUP)
  @jakarta.annotation.Nonnull
  private String podGroup;

  public static final String SERIALIZED_NAME_POD_GROUP_REPLICA_KEY = "podGroupReplicaKey";
  @SerializedName(SERIALIZED_NAME_POD_GROUP_REPLICA_KEY)
  @jakarta.annotation.Nullable
  private String podGroupReplicaKey;

  public V1WorkloadReference() {
  }

  public V1WorkloadReference name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name defines the name of the Workload object this Pod belongs to. Workload must be in the same namespace as the Pod. If it doesn&#39;t match any existing Workload, the Pod will remain unschedulable until a Workload object is created and observed by the kube-scheduler. It must be a DNS subdomain.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name defines the name of the Workload object this Pod belongs to. Workload must be in the same namespace as the Pod. If it doesn't match any existing Workload, the Pod will remain unschedulable until a Workload object is created and observed by the kube-scheduler. It must be a DNS subdomain.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1WorkloadReference podGroup(@jakarta.annotation.Nonnull String podGroup) {
    this.podGroup = podGroup;
    return this;
  }

  /**
   * PodGroup is the name of the PodGroup within the Workload that this Pod belongs to. If it doesn&#39;t match any existing PodGroup within the Workload, the Pod will remain unschedulable until the Workload object is recreated and observed by the kube-scheduler. It must be a DNS label.
   * @return podGroup
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PodGroup is the name of the PodGroup within the Workload that this Pod belongs to. If it doesn't match any existing PodGroup within the Workload, the Pod will remain unschedulable until the Workload object is recreated and observed by the kube-scheduler. It must be a DNS label.")
  public String getPodGroup() {
    return podGroup;
  }

  public void setPodGroup(@jakarta.annotation.Nonnull String podGroup) {
    this.podGroup = podGroup;
  }


  public V1WorkloadReference podGroupReplicaKey(@jakarta.annotation.Nullable String podGroupReplicaKey) {
    this.podGroupReplicaKey = podGroupReplicaKey;
    return this;
  }

  /**
   * PodGroupReplicaKey specifies the replica key of the PodGroup to which this Pod belongs. It is used to distinguish pods belonging to different replicas of the same pod group. The pod group policy is applied separately to each replica. When set, it must be a DNS label.
   * @return podGroupReplicaKey
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PodGroupReplicaKey specifies the replica key of the PodGroup to which this Pod belongs. It is used to distinguish pods belonging to different replicas of the same pod group. The pod group policy is applied separately to each replica. When set, it must be a DNS label.")
  public String getPodGroupReplicaKey() {
    return podGroupReplicaKey;
  }

  public void setPodGroupReplicaKey(@jakarta.annotation.Nullable String podGroupReplicaKey) {
    this.podGroupReplicaKey = podGroupReplicaKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkloadReference v1WorkloadReference = (V1WorkloadReference) o;
    return Objects.equals(this.name, v1WorkloadReference.name) &&
        Objects.equals(this.podGroup, v1WorkloadReference.podGroup) &&
        Objects.equals(this.podGroupReplicaKey, v1WorkloadReference.podGroupReplicaKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, podGroup, podGroupReplicaKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkloadReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podGroup: ").append(toIndentedString(podGroup)).append("\n");
    sb.append("    podGroupReplicaKey: ").append(toIndentedString(podGroupReplicaKey)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("name", "podGroup", "podGroupReplicaKey"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name", "podGroup"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1WorkloadReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1WorkloadReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1WorkloadReference is not found in the empty JSON string", V1WorkloadReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1WorkloadReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1WorkloadReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1WorkloadReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("podGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `podGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podGroup").toString()));
      }
      if ((jsonObj.get("podGroupReplicaKey") != null && !jsonObj.get("podGroupReplicaKey").isJsonNull()) && !jsonObj.get("podGroupReplicaKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `podGroupReplicaKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podGroupReplicaKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1WorkloadReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1WorkloadReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1WorkloadReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1WorkloadReference.class));

       return (TypeAdapter<T>) new TypeAdapter<V1WorkloadReference>() {
           @Override
           public void write(JsonWriter out, V1WorkloadReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1WorkloadReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1WorkloadReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1WorkloadReference
   * @throws IOException if the JSON string is invalid with respect to V1WorkloadReference
   */
  public static V1WorkloadReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1WorkloadReference.class);
  }

  /**
   * Convert an instance of V1WorkloadReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
