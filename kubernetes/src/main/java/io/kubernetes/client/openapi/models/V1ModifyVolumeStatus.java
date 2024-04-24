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
 * ModifyVolumeStatus represents the status object of ControllerModifyVolume operation
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ModifyVolumeStatus {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_VOLUME_ATTRIBUTES_CLASS_NAME = "targetVolumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_TARGET_VOLUME_ATTRIBUTES_CLASS_NAME)
  private String targetVolumeAttributesClassName;

  public V1ModifyVolumeStatus() {
  }

  public V1ModifyVolumeStatus status(String status) {

    this.status = status;
    return this;
  }

   /**
   * status is the status of the ControllerModifyVolume operation. It can be in any of following states:  - Pending    Pending indicates that the PersistentVolumeClaim cannot be modified due to unmet requirements, such as    the specified VolumeAttributesClass not existing.  - InProgress    InProgress indicates that the volume is being modified.  - Infeasible   Infeasible indicates that the request has been rejected as invalid by the CSI driver. To    resolve the error, a valid VolumeAttributesClass needs to be specified. Note: New statuses can be added in the future. Consumers should check for unknown statuses and fail appropriately.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1ModifyVolumeStatus targetVolumeAttributesClassName(String targetVolumeAttributesClassName) {

    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    return this;
  }

   /**
   * targetVolumeAttributesClassName is the name of the VolumeAttributesClass the PVC currently being reconciled
   * @return targetVolumeAttributesClassName
  **/
  @jakarta.annotation.Nullable
  public String getTargetVolumeAttributesClassName() {
    return targetVolumeAttributesClassName;
  }


  public void setTargetVolumeAttributesClassName(String targetVolumeAttributesClassName) {
    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ModifyVolumeStatus v1ModifyVolumeStatus = (V1ModifyVolumeStatus) o;
    return Objects.equals(this.status, v1ModifyVolumeStatus.status) &&
        Objects.equals(this.targetVolumeAttributesClassName, v1ModifyVolumeStatus.targetVolumeAttributesClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, targetVolumeAttributesClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ModifyVolumeStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetVolumeAttributesClassName: ").append(toIndentedString(targetVolumeAttributesClassName)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("targetVolumeAttributesClassName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ModifyVolumeStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ModifyVolumeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ModifyVolumeStatus is not found in the empty JSON string", V1ModifyVolumeStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ModifyVolumeStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ModifyVolumeStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ModifyVolumeStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("targetVolumeAttributesClassName") != null && !jsonObj.get("targetVolumeAttributesClassName").isJsonNull()) && !jsonObj.get("targetVolumeAttributesClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetVolumeAttributesClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetVolumeAttributesClassName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ModifyVolumeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ModifyVolumeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ModifyVolumeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ModifyVolumeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ModifyVolumeStatus>() {
           @Override
           public void write(JsonWriter out, V1ModifyVolumeStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ModifyVolumeStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ModifyVolumeStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ModifyVolumeStatus
  * @throws IOException if the JSON string is invalid with respect to V1ModifyVolumeStatus
  */
  public static V1ModifyVolumeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ModifyVolumeStatus.class);
  }

 /**
  * Convert an instance of V1ModifyVolumeStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
