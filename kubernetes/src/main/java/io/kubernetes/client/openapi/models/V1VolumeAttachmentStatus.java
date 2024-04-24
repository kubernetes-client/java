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
import io.kubernetes.client.openapi.models.V1VolumeError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1VolumeAttachmentStatus {
  public static final String SERIALIZED_NAME_ATTACH_ERROR = "attachError";
  @SerializedName(SERIALIZED_NAME_ATTACH_ERROR)
  private V1VolumeError attachError;

  public static final String SERIALIZED_NAME_ATTACHED = "attached";
  @SerializedName(SERIALIZED_NAME_ATTACHED)
  private Boolean attached;

  public static final String SERIALIZED_NAME_ATTACHMENT_METADATA = "attachmentMetadata";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_METADATA)
  private Map<String, String> attachmentMetadata = new HashMap<>();

  public static final String SERIALIZED_NAME_DETACH_ERROR = "detachError";
  @SerializedName(SERIALIZED_NAME_DETACH_ERROR)
  private V1VolumeError detachError;

  public V1VolumeAttachmentStatus() {
  }

  public V1VolumeAttachmentStatus attachError(V1VolumeError attachError) {

    this.attachError = attachError;
    return this;
  }

   /**
   * Get attachError
   * @return attachError
  **/
  @jakarta.annotation.Nullable
  public V1VolumeError getAttachError() {
    return attachError;
  }


  public void setAttachError(V1VolumeError attachError) {
    this.attachError = attachError;
  }


  public V1VolumeAttachmentStatus attached(Boolean attached) {

    this.attached = attached;
    return this;
  }

   /**
   * attached indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attached
  **/
  @jakarta.annotation.Nonnull
  public Boolean getAttached() {
    return attached;
  }


  public void setAttached(Boolean attached) {
    this.attached = attached;
  }


  public V1VolumeAttachmentStatus attachmentMetadata(Map<String, String> attachmentMetadata) {

    this.attachmentMetadata = attachmentMetadata;
    return this;
  }

  public V1VolumeAttachmentStatus putAttachmentMetadataItem(String key, String attachmentMetadataItem) {
    if (this.attachmentMetadata == null) {
      this.attachmentMetadata = new HashMap<>();
    }
    this.attachmentMetadata.put(key, attachmentMetadataItem);
    return this;
  }

   /**
   * attachmentMetadata is populated with any information returned by the attach operation, upon successful attach, that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attachmentMetadata
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getAttachmentMetadata() {
    return attachmentMetadata;
  }


  public void setAttachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
  }


  public V1VolumeAttachmentStatus detachError(V1VolumeError detachError) {

    this.detachError = detachError;
    return this;
  }

   /**
   * Get detachError
   * @return detachError
  **/
  @jakarta.annotation.Nullable
  public V1VolumeError getDetachError() {
    return detachError;
  }


  public void setDetachError(V1VolumeError detachError) {
    this.detachError = detachError;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentStatus v1VolumeAttachmentStatus = (V1VolumeAttachmentStatus) o;
    return Objects.equals(this.attachError, v1VolumeAttachmentStatus.attachError) &&
        Objects.equals(this.attached, v1VolumeAttachmentStatus.attached) &&
        Objects.equals(this.attachmentMetadata, v1VolumeAttachmentStatus.attachmentMetadata) &&
        Objects.equals(this.detachError, v1VolumeAttachmentStatus.detachError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachError, attached, attachmentMetadata, detachError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentStatus {\n");
    sb.append("    attachError: ").append(toIndentedString(attachError)).append("\n");
    sb.append("    attached: ").append(toIndentedString(attached)).append("\n");
    sb.append("    attachmentMetadata: ").append(toIndentedString(attachmentMetadata)).append("\n");
    sb.append("    detachError: ").append(toIndentedString(detachError)).append("\n");
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
    openapiFields.add("attachError");
    openapiFields.add("attached");
    openapiFields.add("attachmentMetadata");
    openapiFields.add("detachError");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attached");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1VolumeAttachmentStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1VolumeAttachmentStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeAttachmentStatus is not found in the empty JSON string", V1VolumeAttachmentStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeAttachmentStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeAttachmentStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VolumeAttachmentStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `attachError`
      if (jsonObj.get("attachError") != null && !jsonObj.get("attachError").isJsonNull()) {
        V1VolumeError.validateJsonObject(jsonObj.getAsJsonObject("attachError"));
      }
      // validate the optional field `detachError`
      if (jsonObj.get("detachError") != null && !jsonObj.get("detachError").isJsonNull()) {
        V1VolumeError.validateJsonObject(jsonObj.getAsJsonObject("detachError"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeAttachmentStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeAttachmentStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeAttachmentStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeAttachmentStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeAttachmentStatus>() {
           @Override
           public void write(JsonWriter out, V1VolumeAttachmentStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeAttachmentStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1VolumeAttachmentStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1VolumeAttachmentStatus
  * @throws IOException if the JSON string is invalid with respect to V1VolumeAttachmentStatus
  */
  public static V1VolumeAttachmentStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeAttachmentStatus.class);
  }

 /**
  * Convert an instance of V1VolumeAttachmentStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
