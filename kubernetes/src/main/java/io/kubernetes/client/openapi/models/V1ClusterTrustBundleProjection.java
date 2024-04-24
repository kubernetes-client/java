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
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * ClusterTrustBundleProjection describes how to select a set of ClusterTrustBundle objects and project their contents into the pod filesystem.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ClusterTrustBundleProjection {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public V1ClusterTrustBundleProjection() {
  }

  public V1ClusterTrustBundleProjection labelSelector(V1LabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1ClusterTrustBundleProjection name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Select a single ClusterTrustBundle by object name.  Mutually-exclusive with signerName and labelSelector.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ClusterTrustBundleProjection optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

   /**
   * If true, don&#39;t block pod startup if the referenced ClusterTrustBundle(s) aren&#39;t available.  If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.
   * @return optional
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1ClusterTrustBundleProjection path(String path) {

    this.path = path;
    return this;
  }

   /**
   * Relative path from the volume root to write the bundle.
   * @return path
  **/
  @jakarta.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1ClusterTrustBundleProjection signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * Select all ClusterTrustBundles that match this signer name. Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.
   * @return signerName
  **/
  @jakarta.annotation.Nullable
  public String getSignerName() {
    return signerName;
  }


  public void setSignerName(String signerName) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ClusterTrustBundleProjection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ClusterTrustBundleProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterTrustBundleProjection is not found in the empty JSON string", V1ClusterTrustBundleProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterTrustBundleProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterTrustBundleProjection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClusterTrustBundleProjection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("labelSelector"));
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
