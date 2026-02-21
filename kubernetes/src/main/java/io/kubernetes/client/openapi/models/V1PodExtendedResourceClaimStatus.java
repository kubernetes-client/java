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
import io.kubernetes.client.openapi.models.V1ContainerExtendedResourceRequest;
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
 * PodExtendedResourceClaimStatus is stored in the PodStatus for the extended resource requests backed by DRA. It stores the generated name for the corresponding special ResourceClaim created by the scheduler.
 */
@ApiModel(description = "PodExtendedResourceClaimStatus is stored in the PodStatus for the extended resource requests backed by DRA. It stores the generated name for the corresponding special ResourceClaim created by the scheduler.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1PodExtendedResourceClaimStatus {
  public static final String SERIALIZED_NAME_REQUEST_MAPPINGS = "requestMappings";
  @SerializedName(SERIALIZED_NAME_REQUEST_MAPPINGS)
  @jakarta.annotation.Nonnull
  private List<V1ContainerExtendedResourceRequest> requestMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_NAME = "resourceClaimName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_NAME)
  @jakarta.annotation.Nonnull
  private String resourceClaimName;

  public V1PodExtendedResourceClaimStatus() {
  }

  public V1PodExtendedResourceClaimStatus requestMappings(@jakarta.annotation.Nonnull List<V1ContainerExtendedResourceRequest> requestMappings) {
    this.requestMappings = requestMappings;
    return this;
  }

  public V1PodExtendedResourceClaimStatus addRequestMappingsItem(V1ContainerExtendedResourceRequest requestMappingsItem) {
    if (this.requestMappings == null) {
      this.requestMappings = new ArrayList<>();
    }
    this.requestMappings.add(requestMappingsItem);
    return this;
  }

  /**
   * RequestMappings identifies the mapping of &lt;container, extended resource backed by DRA&gt; to  device request in the generated ResourceClaim.
   * @return requestMappings
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RequestMappings identifies the mapping of <container, extended resource backed by DRA> to  device request in the generated ResourceClaim.")
  public List<V1ContainerExtendedResourceRequest> getRequestMappings() {
    return requestMappings;
  }

  public void setRequestMappings(@jakarta.annotation.Nonnull List<V1ContainerExtendedResourceRequest> requestMappings) {
    this.requestMappings = requestMappings;
  }


  public V1PodExtendedResourceClaimStatus resourceClaimName(@jakarta.annotation.Nonnull String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

  /**
   * ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod.
   * @return resourceClaimName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod.")
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
    V1PodExtendedResourceClaimStatus v1PodExtendedResourceClaimStatus = (V1PodExtendedResourceClaimStatus) o;
    return Objects.equals(this.requestMappings, v1PodExtendedResourceClaimStatus.requestMappings) &&
        Objects.equals(this.resourceClaimName, v1PodExtendedResourceClaimStatus.resourceClaimName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestMappings, resourceClaimName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodExtendedResourceClaimStatus {\n");
    sb.append("    requestMappings: ").append(toIndentedString(requestMappings)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("requestMappings", "resourceClaimName"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("requestMappings", "resourceClaimName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodExtendedResourceClaimStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodExtendedResourceClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1PodExtendedResourceClaimStatus is not found in the empty JSON string", V1PodExtendedResourceClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodExtendedResourceClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1PodExtendedResourceClaimStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodExtendedResourceClaimStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("requestMappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `requestMappings` to be an array in the JSON string but got `%s`", jsonObj.get("requestMappings").toString()));
      }

      JsonArray jsonArrayrequestMappings = jsonObj.getAsJsonArray("requestMappings");
      // validate the required field `requestMappings` (array)
      for (int i = 0; i < jsonArrayrequestMappings.size(); i++) {
        V1ContainerExtendedResourceRequest.validateJsonElement(jsonArrayrequestMappings.get(i));
      };
      if (!jsonObj.get("resourceClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `resourceClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodExtendedResourceClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodExtendedResourceClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodExtendedResourceClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodExtendedResourceClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodExtendedResourceClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1PodExtendedResourceClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodExtendedResourceClaimStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodExtendedResourceClaimStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodExtendedResourceClaimStatus
   * @throws IOException if the JSON string is invalid with respect to V1PodExtendedResourceClaimStatus
   */
  public static V1PodExtendedResourceClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodExtendedResourceClaimStatus.class);
  }

  /**
   * Convert an instance of V1PodExtendedResourceClaimStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
