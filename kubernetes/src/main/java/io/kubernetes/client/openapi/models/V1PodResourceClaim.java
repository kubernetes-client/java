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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * PodResourceClaim references exactly one ResourceClaim, either directly or by naming a ResourceClaimTemplate which is then turned into a ResourceClaim for the pod.  It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PodResourceClaim {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_NAME = "resourceClaimName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_NAME)
  private String resourceClaimName;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_TEMPLATE_NAME = "resourceClaimTemplateName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_TEMPLATE_NAME)
  private String resourceClaimTemplateName;

  public V1PodResourceClaim() {
  }

  public V1PodResourceClaim name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1PodResourceClaim resourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return this;
  }

   /**
   * ResourceClaimName is the name of a ResourceClaim object in the same namespace as this pod.  Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
   * @return resourceClaimName
  **/
  @jakarta.annotation.Nullable
  public String getResourceClaimName() {
    return resourceClaimName;
  }

  public void setResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
  }


  public V1PodResourceClaim resourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return this;
  }

   /**
   * ResourceClaimTemplateName is the name of a ResourceClaimTemplate object in the same namespace as this pod.  The template will be used to create a new ResourceClaim, which will be bound to this pod. When this pod is deleted, the ResourceClaim will also be deleted. The pod name and resource name, along with a generated component, will be used to form a unique name for the ResourceClaim, which will be recorded in pod.status.resourceClaimStatuses.  This field is immutable and no changes will be made to the corresponding ResourceClaim by the control plane after creating the ResourceClaim.  Exactly one of ResourceClaimName and ResourceClaimTemplateName must be set.
   * @return resourceClaimTemplateName
  **/
  @jakarta.annotation.Nullable
  public String getResourceClaimTemplateName() {
    return resourceClaimTemplateName;
  }

  public void setResourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodResourceClaim v1PodResourceClaim = (V1PodResourceClaim) o;
    return Objects.equals(this.name, v1PodResourceClaim.name) &&
        Objects.equals(this.resourceClaimName, v1PodResourceClaim.resourceClaimName) &&
        Objects.equals(this.resourceClaimTemplateName, v1PodResourceClaim.resourceClaimTemplateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceClaimName, resourceClaimTemplateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodResourceClaim {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceClaimName: ").append(toIndentedString(resourceClaimName)).append("\n");
    sb.append("    resourceClaimTemplateName: ").append(toIndentedString(resourceClaimTemplateName)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("resourceClaimName");
    openapiFields.add("resourceClaimTemplateName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1PodResourceClaim
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodResourceClaim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodResourceClaim is not found in the empty JSON string", V1PodResourceClaim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodResourceClaim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodResourceClaim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodResourceClaim.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("resourceClaimName") != null && !jsonObj.get("resourceClaimName").isJsonNull()) && !jsonObj.get("resourceClaimName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceClaimName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimName").toString()));
      }
      if ((jsonObj.get("resourceClaimTemplateName") != null && !jsonObj.get("resourceClaimTemplateName").isJsonNull()) && !jsonObj.get("resourceClaimTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceClaimTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceClaimTemplateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodResourceClaim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodResourceClaim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodResourceClaim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodResourceClaim.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodResourceClaim>() {
           @Override
           public void write(JsonWriter out, V1PodResourceClaim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodResourceClaim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodResourceClaim given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodResourceClaim
  * @throws IOException if the JSON string is invalid with respect to V1PodResourceClaim
  */
  public static V1PodResourceClaim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodResourceClaim.class);
  }

 /**
  * Convert an instance of V1PodResourceClaim to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
