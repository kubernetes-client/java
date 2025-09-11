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
 * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 */
@ApiModel(description = "CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CustomResourceSubresourceScale {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR_PATH = "labelSelectorPath";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR_PATH)
  @jakarta.annotation.Nullable
  private String labelSelectorPath;

  public static final String SERIALIZED_NAME_SPEC_REPLICAS_PATH = "specReplicasPath";
  @SerializedName(SERIALIZED_NAME_SPEC_REPLICAS_PATH)
  @jakarta.annotation.Nonnull
  private String specReplicasPath;

  public static final String SERIALIZED_NAME_STATUS_REPLICAS_PATH = "statusReplicasPath";
  @SerializedName(SERIALIZED_NAME_STATUS_REPLICAS_PATH)
  @jakarta.annotation.Nonnull
  private String statusReplicasPath;

  public V1CustomResourceSubresourceScale() {
  }

  public V1CustomResourceSubresourceScale labelSelectorPath(@jakarta.annotation.Nullable String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
    return this;
  }

  /**
   * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.selector&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60; or &#x60;.spec&#x60;. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the &#x60;status.selector&#x60; value in the &#x60;/scale&#x60; subresource will default to the empty string.
   * @return labelSelectorPath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.")
  public String getLabelSelectorPath() {
    return labelSelectorPath;
  }

  public void setLabelSelectorPath(@jakarta.annotation.Nullable String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
  }


  public V1CustomResourceSubresourceScale specReplicasPath(@jakarta.annotation.Nonnull String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
    return this;
  }

  /**
   * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;spec.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.spec&#x60;. If there is no value under the given path in the custom resource, the &#x60;/scale&#x60; subresource will return an error on GET.
   * @return specReplicasPath
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.")
  public String getSpecReplicasPath() {
    return specReplicasPath;
  }

  public void setSpecReplicasPath(@jakarta.annotation.Nonnull String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
  }


  public V1CustomResourceSubresourceScale statusReplicasPath(@jakarta.annotation.Nonnull String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
    return this;
  }

  /**
   * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60;. If there is no value under the given path in the custom resource, the &#x60;status.replicas&#x60; value in the &#x60;/scale&#x60; subresource will default to 0.
   * @return statusReplicasPath
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.")
  public String getStatusReplicasPath() {
    return statusReplicasPath;
  }

  public void setStatusReplicasPath(@jakarta.annotation.Nonnull String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceSubresourceScale v1CustomResourceSubresourceScale = (V1CustomResourceSubresourceScale) o;
    return Objects.equals(this.labelSelectorPath, v1CustomResourceSubresourceScale.labelSelectorPath) &&
        Objects.equals(this.specReplicasPath, v1CustomResourceSubresourceScale.specReplicasPath) &&
        Objects.equals(this.statusReplicasPath, v1CustomResourceSubresourceScale.statusReplicasPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelectorPath, specReplicasPath, statusReplicasPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceSubresourceScale {\n");
    sb.append("    labelSelectorPath: ").append(toIndentedString(labelSelectorPath)).append("\n");
    sb.append("    specReplicasPath: ").append(toIndentedString(specReplicasPath)).append("\n");
    sb.append("    statusReplicasPath: ").append(toIndentedString(statusReplicasPath)).append("\n");
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
    openapiFields.add("labelSelectorPath");
    openapiFields.add("specReplicasPath");
    openapiFields.add("statusReplicasPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("specReplicasPath");
    openapiRequiredFields.add("statusReplicasPath");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CustomResourceSubresourceScale
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CustomResourceSubresourceScale.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceSubresourceScale is not found in the empty JSON string", V1CustomResourceSubresourceScale.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceSubresourceScale.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceSubresourceScale` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceSubresourceScale.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("labelSelectorPath") != null && !jsonObj.get("labelSelectorPath").isJsonNull()) && !jsonObj.get("labelSelectorPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelSelectorPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelSelectorPath").toString()));
      }
      if (!jsonObj.get("specReplicasPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specReplicasPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specReplicasPath").toString()));
      }
      if (!jsonObj.get("statusReplicasPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusReplicasPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReplicasPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceSubresourceScale.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceSubresourceScale' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceSubresourceScale> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceSubresourceScale.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceSubresourceScale>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceSubresourceScale value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceSubresourceScale read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CustomResourceSubresourceScale given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CustomResourceSubresourceScale
   * @throws IOException if the JSON string is invalid with respect to V1CustomResourceSubresourceScale
   */
  public static V1CustomResourceSubresourceScale fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceSubresourceScale.class);
  }

  /**
   * Convert an instance of V1CustomResourceSubresourceScale to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
