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
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * ClusterTrustBundleProjection describes how to select a set of ClusterTrustBundle objects and project their contents into the pod filesystem.
 */
@ApiModel(description = "ClusterTrustBundleProjection describes how to select a set of ClusterTrustBundle objects and project their contents into the pod filesystem.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ClusterTrustBundleProjection {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  @jakarta.annotation.Nullable
  private Boolean optional;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nonnull
  private String path;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  @jakarta.annotation.Nullable
  private String signerName;

  public V1ClusterTrustBundleProjection() {
  }

  public V1ClusterTrustBundleProjection labelSelector(@jakarta.annotation.Nullable V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   * @return labelSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(@jakarta.annotation.Nullable V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1ClusterTrustBundleProjection name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Select a single ClusterTrustBundle by object name.  Mutually-exclusive with signerName and labelSelector.
   * @return name
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Select a single ClusterTrustBundle by object name.  Mutually-exclusive with signerName and labelSelector.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public V1ClusterTrustBundleProjection optional(@jakarta.annotation.Nullable Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * If true, don&#39;t block pod startup if the referenced ClusterTrustBundle(s) aren&#39;t available.  If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.
   * @return optional
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, don't block pod startup if the referenced ClusterTrustBundle(s) aren't available.  If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(@jakarta.annotation.Nullable Boolean optional) {
    this.optional = optional;
  }


  public V1ClusterTrustBundleProjection path(@jakarta.annotation.Nonnull String path) {
    this.path = path;
    return this;
  }

  /**
   * Relative path from the volume root to write the bundle.
   * @return path
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Relative path from the volume root to write the bundle.")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nonnull String path) {
    this.path = path;
  }


  public V1ClusterTrustBundleProjection signerName(@jakarta.annotation.Nullable String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * Select all ClusterTrustBundles that match this signer name. Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.
   * @return signerName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Select all ClusterTrustBundles that match this signer name. Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(@jakarta.annotation.Nullable String signerName) {
    this.signerName = signerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterTrustBundleProjection v1ClusterTrustBundleProjection = (V1ClusterTrustBundleProjection) o;
    return Objects.equals(this.labelSelector, v1ClusterTrustBundleProjection.labelSelector) &&
        Objects.equals(this.name, v1ClusterTrustBundleProjection.name) &&
        Objects.equals(this.optional, v1ClusterTrustBundleProjection.optional) &&
        Objects.equals(this.path, v1ClusterTrustBundleProjection.path) &&
        Objects.equals(this.signerName, v1ClusterTrustBundleProjection.signerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, name, optional, path, signerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterTrustBundleProjection {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
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
    openapiFields.add("labelSelector");
    openapiFields.add("name");
    openapiFields.add("optional");
    openapiFields.add("path");
    openapiFields.add("signerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ClusterTrustBundleProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ClusterTrustBundleProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterTrustBundleProjection is not found in the empty JSON string", V1ClusterTrustBundleProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterTrustBundleProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterTrustBundleProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClusterTrustBundleProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("labelSelector"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClusterTrustBundleProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClusterTrustBundleProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClusterTrustBundleProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClusterTrustBundleProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClusterTrustBundleProjection>() {
           @Override
           public void write(JsonWriter out, V1ClusterTrustBundleProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClusterTrustBundleProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ClusterTrustBundleProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ClusterTrustBundleProjection
   * @throws IOException if the JSON string is invalid with respect to V1ClusterTrustBundleProjection
   */
  public static V1ClusterTrustBundleProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClusterTrustBundleProjection.class);
  }

  /**
   * Convert an instance of V1ClusterTrustBundleProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
