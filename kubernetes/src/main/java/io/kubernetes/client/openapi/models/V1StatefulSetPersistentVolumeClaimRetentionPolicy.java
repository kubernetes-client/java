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
 * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
 */
@ApiModel(description = "StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1StatefulSetPersistentVolumeClaimRetentionPolicy {
  public static final String SERIALIZED_NAME_WHEN_DELETED = "whenDeleted";
  @SerializedName(SERIALIZED_NAME_WHEN_DELETED)
  @jakarta.annotation.Nullable
  private String whenDeleted;

  public static final String SERIALIZED_NAME_WHEN_SCALED = "whenScaled";
  @SerializedName(SERIALIZED_NAME_WHEN_SCALED)
  @jakarta.annotation.Nullable
  private String whenScaled;

  public V1StatefulSetPersistentVolumeClaimRetentionPolicy() {
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicy whenDeleted(@jakarta.annotation.Nullable String whenDeleted) {
    this.whenDeleted = whenDeleted;
    return this;
  }

  /**
   * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of &#x60;Retain&#x60; causes PVCs to not be affected by StatefulSet deletion. The &#x60;Delete&#x60; policy causes those PVCs to be deleted.
   * @return whenDeleted
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.")
  public String getWhenDeleted() {
    return whenDeleted;
  }

  public void setWhenDeleted(@jakarta.annotation.Nullable String whenDeleted) {
    this.whenDeleted = whenDeleted;
  }


  public V1StatefulSetPersistentVolumeClaimRetentionPolicy whenScaled(@jakarta.annotation.Nullable String whenScaled) {
    this.whenScaled = whenScaled;
    return this;
  }

  /**
   * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of &#x60;Retain&#x60; causes PVCs to not be affected by a scaledown. The &#x60;Delete&#x60; policy causes the associated PVCs for any excess pods above the replica count to be deleted.
   * @return whenScaled
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.")
  public String getWhenScaled() {
    return whenScaled;
  }

  public void setWhenScaled(@jakarta.annotation.Nullable String whenScaled) {
    this.whenScaled = whenScaled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetPersistentVolumeClaimRetentionPolicy v1StatefulSetPersistentVolumeClaimRetentionPolicy = (V1StatefulSetPersistentVolumeClaimRetentionPolicy) o;
    return Objects.equals(this.whenDeleted, v1StatefulSetPersistentVolumeClaimRetentionPolicy.whenDeleted) &&
        Objects.equals(this.whenScaled, v1StatefulSetPersistentVolumeClaimRetentionPolicy.whenScaled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whenDeleted, whenScaled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetPersistentVolumeClaimRetentionPolicy {\n");
    sb.append("    whenDeleted: ").append(toIndentedString(whenDeleted)).append("\n");
    sb.append("    whenScaled: ").append(toIndentedString(whenScaled)).append("\n");
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
    openapiFields.add("whenDeleted");
    openapiFields.add("whenScaled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1StatefulSetPersistentVolumeClaimRetentionPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1StatefulSetPersistentVolumeClaimRetentionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StatefulSetPersistentVolumeClaimRetentionPolicy is not found in the empty JSON string", V1StatefulSetPersistentVolumeClaimRetentionPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1StatefulSetPersistentVolumeClaimRetentionPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StatefulSetPersistentVolumeClaimRetentionPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("whenDeleted") != null && !jsonObj.get("whenDeleted").isJsonNull()) && !jsonObj.get("whenDeleted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whenDeleted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whenDeleted").toString()));
      }
      if ((jsonObj.get("whenScaled") != null && !jsonObj.get("whenScaled").isJsonNull()) && !jsonObj.get("whenScaled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whenScaled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whenScaled").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StatefulSetPersistentVolumeClaimRetentionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StatefulSetPersistentVolumeClaimRetentionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StatefulSetPersistentVolumeClaimRetentionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StatefulSetPersistentVolumeClaimRetentionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StatefulSetPersistentVolumeClaimRetentionPolicy>() {
           @Override
           public void write(JsonWriter out, V1StatefulSetPersistentVolumeClaimRetentionPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StatefulSetPersistentVolumeClaimRetentionPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1StatefulSetPersistentVolumeClaimRetentionPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1StatefulSetPersistentVolumeClaimRetentionPolicy
   * @throws IOException if the JSON string is invalid with respect to V1StatefulSetPersistentVolumeClaimRetentionPolicy
   */
  public static V1StatefulSetPersistentVolumeClaimRetentionPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StatefulSetPersistentVolumeClaimRetentionPolicy.class);
  }

  /**
   * Convert an instance of V1StatefulSetPersistentVolumeClaimRetentionPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
