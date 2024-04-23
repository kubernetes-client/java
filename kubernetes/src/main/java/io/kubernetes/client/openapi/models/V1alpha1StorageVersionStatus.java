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
import io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * API server instances report the versions they can decode and the version they encode objects to when persisting objects in the backend.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1StorageVersionStatus {
  public static final String SERIALIZED_NAME_COMMON_ENCODING_VERSION = "commonEncodingVersion";
  @SerializedName(SERIALIZED_NAME_COMMON_ENCODING_VERSION)
  private String commonEncodingVersion;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1StorageVersionCondition> conditions;

  public static final String SERIALIZED_NAME_STORAGE_VERSIONS = "storageVersions";
  @SerializedName(SERIALIZED_NAME_STORAGE_VERSIONS)
  private List<V1alpha1ServerStorageVersion> storageVersions;

  public V1alpha1StorageVersionStatus() {
  }

  public V1alpha1StorageVersionStatus commonEncodingVersion(String commonEncodingVersion) {

    this.commonEncodingVersion = commonEncodingVersion;
    return this;
  }

   /**
   * If all API server instances agree on the same encoding storage version, then this field is set to that version. Otherwise this field is left empty. API servers should finish updating its storageVersionStatus entry before serving write operations, so that this field will be in sync with the reality.
   * @return commonEncodingVersion
  **/
  @jakarta.annotation.Nullable
  public String getCommonEncodingVersion() {
    return commonEncodingVersion;
  }


  public void setCommonEncodingVersion(String commonEncodingVersion) {
    this.commonEncodingVersion = commonEncodingVersion;
  }


  public V1alpha1StorageVersionStatus conditions(List<V1alpha1StorageVersionCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1alpha1StorageVersionStatus addConditionsItem(V1alpha1StorageVersionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The latest available observations of the storageVersion&#39;s state.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1StorageVersionCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1StorageVersionCondition> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1StorageVersionStatus storageVersions(List<V1alpha1ServerStorageVersion> storageVersions) {

    this.storageVersions = storageVersions;
    return this;
  }

  public V1alpha1StorageVersionStatus addStorageVersionsItem(V1alpha1ServerStorageVersion storageVersionsItem) {
    if (this.storageVersions == null) {
      this.storageVersions = new ArrayList<>();
    }
    this.storageVersions.add(storageVersionsItem);
    return this;
  }

   /**
   * The reported versions per API server instance.
   * @return storageVersions
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1ServerStorageVersion> getStorageVersions() {
    return storageVersions;
  }


  public void setStorageVersions(List<V1alpha1ServerStorageVersion> storageVersions) {
    this.storageVersions = storageVersions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StorageVersionStatus v1alpha1StorageVersionStatus = (V1alpha1StorageVersionStatus) o;
    return Objects.equals(this.commonEncodingVersion, v1alpha1StorageVersionStatus.commonEncodingVersion) &&
        Objects.equals(this.conditions, v1alpha1StorageVersionStatus.conditions) &&
        Objects.equals(this.storageVersions, v1alpha1StorageVersionStatus.storageVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonEncodingVersion, conditions, storageVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionStatus {\n");
    sb.append("    commonEncodingVersion: ").append(toIndentedString(commonEncodingVersion)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storageVersions: ").append(toIndentedString(storageVersions)).append("\n");
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
    openapiFields.add("commonEncodingVersion");
    openapiFields.add("conditions");
    openapiFields.add("storageVersions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1StorageVersionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1StorageVersionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1StorageVersionStatus is not found in the empty JSON string", V1alpha1StorageVersionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1StorageVersionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1StorageVersionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("commonEncodingVersion") != null && !jsonObj.get("commonEncodingVersion").isJsonNull()) && !jsonObj.get("commonEncodingVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commonEncodingVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commonEncodingVersion").toString()));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1alpha1StorageVersionCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("storageVersions") != null && !jsonObj.get("storageVersions").isJsonNull()) {
        JsonArray jsonArraystorageVersions = jsonObj.getAsJsonArray("storageVersions");
        if (jsonArraystorageVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("storageVersions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `storageVersions` to be an array in the JSON string but got `%s`", jsonObj.get("storageVersions").toString()));
          }

          // validate the optional field `storageVersions` (array)
          for (int i = 0; i < jsonArraystorageVersions.size(); i++) {
            V1alpha1ServerStorageVersion.validateJsonObject(jsonArraystorageVersions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1StorageVersionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1StorageVersionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1StorageVersionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1StorageVersionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1StorageVersionStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1StorageVersionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1StorageVersionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1StorageVersionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1StorageVersionStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1StorageVersionStatus
  */
  public static V1alpha1StorageVersionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1StorageVersionStatus.class);
  }

 /**
  * Convert an instance of V1alpha1StorageVersionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
