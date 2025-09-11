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
import io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale;
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
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 */
@ApiModel(description = "CustomResourceSubresources defines the status and scale subresources for CustomResources.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CustomResourceSubresources {
  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @jakarta.annotation.Nullable
  private V1CustomResourceSubresourceScale scale;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nullable
  private Object status;

  public V1CustomResourceSubresources() {
  }

  public V1CustomResourceSubresources scale(@jakarta.annotation.Nullable V1CustomResourceSubresourceScale scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CustomResourceSubresourceScale getScale() {
    return scale;
  }

  public void setScale(@jakarta.annotation.Nullable V1CustomResourceSubresourceScale scale) {
    this.scale = scale;
  }


  public V1CustomResourceSubresources status(@jakarta.annotation.Nullable Object status) {
    this.status = status;
    return this;
  }

  /**
   * status indicates the custom resource should serve a &#x60;/status&#x60; subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the &#x60;status&#x60; stanza of the object. 2. requests to the custom resource &#x60;/status&#x60; subresource ignore changes to anything other than the &#x60;status&#x60; stanza of the object.
   * @return status
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.")
  public Object getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nullable Object status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceSubresources v1CustomResourceSubresources = (V1CustomResourceSubresources) o;
    return Objects.equals(this.scale, v1CustomResourceSubresources.scale) &&
        Objects.equals(this.status, v1CustomResourceSubresources.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceSubresources {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CustomResourceSubresources
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CustomResourceSubresources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceSubresources is not found in the empty JSON string", V1CustomResourceSubresources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceSubresources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceSubresources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        V1CustomResourceSubresourceScale.validateJsonElement(jsonObj.get("scale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceSubresources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceSubresources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceSubresources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceSubresources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceSubresources>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceSubresources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceSubresources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CustomResourceSubresources given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CustomResourceSubresources
   * @throws IOException if the JSON string is invalid with respect to V1CustomResourceSubresources
   */
  public static V1CustomResourceSubresources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceSubresources.class);
  }

  /**
   * Convert an instance of V1CustomResourceSubresources to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
