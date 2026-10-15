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
import io.kubernetes.client.openapi.models.V1NodeAllocatableMappedResources;
import io.kubernetes.client.openapi.models.V1NodeAllocatableOverheadResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * NodeAllocatableResourceClaimStatus describes the status of node allocatable resources allocated via DRA.
 */
@ApiModel(description = "NodeAllocatableResourceClaimStatus describes the status of node allocatable resources allocated via DRA.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1NodeAllocatableResourceClaimStatus {
  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  @jakarta.annotation.Nullable
  private List<String> containers = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAPPING = "mapping";
  @SerializedName(SERIALIZED_NAME_MAPPING)
  @jakarta.annotation.Nullable
  private List<V1NodeAllocatableMappedResources> mapping = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";
  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  @jakarta.annotation.Nullable
  private List<V1NodeAllocatableOverheadResources> overhead = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_NAME = "resourceClaimName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_NAME)
  @jakarta.annotation.Nonnull
  private String resourceClaimName;

  public V1NodeAllocatableResourceClaimStatus() {
  }

  public V1NodeAllocatableResourceClaimStatus containers(@jakarta.annotation.Nullable List<String> containers) {
    this.containers = containers;
    return this;
  }

  public V1NodeAllocatableResourceClaimStatus addContainersItem(String containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Containers lists the names of all containers in this pod that reference the claim.
   * @return containers
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Containers lists the names of all containers in this pod that reference the claim.")
  public List<String> getContainers() {
    return containers;
  }

  public void setContainers(@jakarta.annotation.Nullable List<String> containers) {
    this.containers = containers;
  }


  public V1NodeAllocatableResourceClaimStatus mapping(@jakarta.annotation.Nullable List<V1NodeAllocatableMappedResources> mapping) {
    this.mapping = mapping;
    return this;
  }

  public V1NodeAllocatableResourceClaimStatus addMappingItem(V1NodeAllocatableMappedResources mappingItem) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    this.mapping.add(mappingItem);
    return this;
  }

  /**
   * Mapping contains allocations through devices mapped in the device spec&#39;s &#x60;nodeAllocatableResources[...].mapping&#x60; field. This is used by kubelet for pod level and container-level cgroup enforcement.
   * @return mapping
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Mapping contains allocations through devices mapped in the device spec's `nodeAllocatableResources[...].mapping` field. This is used by kubelet for pod level and container-level cgroup enforcement.")
  public List<V1NodeAllocatableMappedResources> getMapping() {
    return mapping;
  }

  public void setMapping(@jakarta.annotation.Nullable List<V1NodeAllocatableMappedResources> mapping) {
    this.mapping = mapping;
  }


  public V1NodeAllocatableResourceClaimStatus overhead(@jakarta.annotation.Nullable List<V1NodeAllocatableOverheadResources> overhead) {
    this.overhead = overhead;
    return this;
  }

  public V1NodeAllocatableResourceClaimStatus addOverheadItem(V1NodeAllocatableOverheadResources overheadItem) {
    if (this.overhead == null) {
      this.overhead = new ArrayList<>();
    }
    this.overhead.add(overheadItem);
    return this;
  }

  /**
   * Overhead contains allocations through devices mapped in the device spec&#39;s &#x60;nodeAllocatableResources[...].overhead&#x60; field. This is used by kubelet for pod level and container-level cgroup enforcement.
   * @return overhead
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Overhead contains allocations through devices mapped in the device spec's `nodeAllocatableResources[...].overhead` field. This is used by kubelet for pod level and container-level cgroup enforcement.")
  public List<V1NodeAllocatableOverheadResources> getOverhead() {
    return overhead;
  }

  public void setOverhead(@jakarta.annotation.Nullable List<V1NodeAllocatableOverheadResources> overhead) {
    this.overhead = overhead;
  }


  public V1NodeAllocatableResourceClaimStatus resourceClaimName(@jakarta.annotation.Nonnull String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

  /**
   * ResourceClaimName is the resource claim referenced by the pod that resulted in this node allocatable resource allocation.
   * @return resourceClaimName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ResourceClaimName is the resource claim referenced by the pod that resulted in this node allocatable resource allocation.")
  public String getResourceClaimName() {
    return resourceClaimName;
  }

  public void setResourceClaimName(@jakarta.annotation.Nonnull String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeAllocatableResourceClaimStatus v1NodeAllocatableResourceClaimStatus = (V1NodeAllocatableResourceClaimStatus) o;
    return Objects.equals(this.containers, v1NodeAllocatableResourceClaimStatus.containers) &&
        Objects.equals(this.mapping, v1NodeAllocatableResourceClaimStatus.mapping) &&
        Objects.equals(this.overhead, v1NodeAllocatableResourceClaimStatus.overhead) &&
        Objects.equals(this.resourceClaimName, v1NodeAllocatableResourceClaimStatus.resourceClaimName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, mapping, overhead, resourceClaimName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeAllocatableResourceClaimStatus {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    resourceClaimName: ").append(toIndentedString(resourceClaimName)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("containers", "mapping", "overhead", "resourceClaimName"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("resourceClaimName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NodeAllocatableResourceClaimStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeAllocatableResourceClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1NodeAllocatableResourceClaimStatus is not found in the empty JSON string", V1NodeAllocatableResourceClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeAllocatableResourceClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1NodeAllocatableResourceClaimStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NodeAllocatableResourceClaimStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("containers") != null && !jsonObj.get("containers").isJsonNull() && !jsonObj.get("containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `containers` to be an array in the JSON string but got `%s`", jsonObj.get("containers").toString()));
      }
      if (jsonObj.get("mapping") != null && !jsonObj.get("mapping").isJsonNull()) {
        JsonArray jsonArraymapping = jsonObj.getAsJsonArray("mapping");
        if (jsonArraymapping != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mapping").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `mapping` to be an array in the JSON string but got `%s`", jsonObj.get("mapping").toString()));
          }

          // validate the optional field `mapping` (array)
          for (int i = 0; i < jsonArraymapping.size(); i++) {
            V1NodeAllocatableMappedResources.validateJsonElement(jsonArraymapping.get(i));
          };
        }
      }
      if (jsonObj.get("overhead") != null && !jsonObj.get("overhead").isJsonNull()) {
        JsonArray jsonArrayoverhead = jsonObj.getAsJsonArray("overhead");
        if (jsonArrayoverhead != null) {
          // ensure the json data is an array
          if (!jsonObj.get("overhead").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `overhead` to be an array in the JSON string but got `%s`", jsonObj.get("overhead").toString()));
          }

          // validate the optional field `overhead` (array)
          for (int i = 0; i < jsonArrayoverhead.size(); i++) {
            V1NodeAllocatableOverheadResources.validateJsonElement(jsonArrayoverhead.get(i));
          };
        }
      }
      if (!jsonObj.get("resourceClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `resourceClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeAllocatableResourceClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeAllocatableResourceClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeAllocatableResourceClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeAllocatableResourceClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeAllocatableResourceClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1NodeAllocatableResourceClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeAllocatableResourceClaimStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NodeAllocatableResourceClaimStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NodeAllocatableResourceClaimStatus
   * @throws IOException if the JSON string is invalid with respect to V1NodeAllocatableResourceClaimStatus
   */
  public static V1NodeAllocatableResourceClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeAllocatableResourceClaimStatus.class);
  }

  /**
   * Convert an instance of V1NodeAllocatableResourceClaimStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
