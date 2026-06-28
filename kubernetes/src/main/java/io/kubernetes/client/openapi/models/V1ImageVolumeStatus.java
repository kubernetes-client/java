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
 * ImageVolumeStatus represents the image-based volume status.
 */
@ApiModel(description = "ImageVolumeStatus represents the image-based volume status.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1ImageVolumeStatus {
  public static final String SERIALIZED_NAME_IMAGE_REF = "imageRef";
  @SerializedName(SERIALIZED_NAME_IMAGE_REF)
  @jakarta.annotation.Nonnull
  private String imageRef;

  public V1ImageVolumeStatus() {
  }

  public V1ImageVolumeStatus imageRef(@jakarta.annotation.Nonnull String imageRef) {
    this.imageRef = imageRef;
    return this;
  }

  /**
   * ImageRef is the digest of the image used for this volume. It should have a value that&#39;s similar to the pod&#39;s status.containerStatuses[i].imageID. The ImageRef length should not exceed 256 characters.
   * @return imageRef
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ImageRef is the digest of the image used for this volume. It should have a value that's similar to the pod's status.containerStatuses[i].imageID. The ImageRef length should not exceed 256 characters.")
  public String getImageRef() {
    return imageRef;
  }

  public void setImageRef(@jakarta.annotation.Nonnull String imageRef) {
    this.imageRef = imageRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ImageVolumeStatus v1ImageVolumeStatus = (V1ImageVolumeStatus) o;
    return Objects.equals(this.imageRef, v1ImageVolumeStatus.imageRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ImageVolumeStatus {\n");
    sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("imageRef"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("imageRef"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ImageVolumeStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ImageVolumeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1ImageVolumeStatus is not found in the empty JSON string", V1ImageVolumeStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ImageVolumeStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1ImageVolumeStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ImageVolumeStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("imageRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `imageRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ImageVolumeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ImageVolumeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ImageVolumeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ImageVolumeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ImageVolumeStatus>() {
           @Override
           public void write(JsonWriter out, V1ImageVolumeStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ImageVolumeStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ImageVolumeStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ImageVolumeStatus
   * @throws IOException if the JSON string is invalid with respect to V1ImageVolumeStatus
   */
  public static V1ImageVolumeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ImageVolumeStatus.class);
  }

  /**
   * Convert an instance of V1ImageVolumeStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
