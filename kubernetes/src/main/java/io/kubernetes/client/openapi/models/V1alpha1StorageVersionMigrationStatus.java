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
import io.kubernetes.client.openapi.models.V1alpha1MigrationCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Status of the storage version migration.
 */
@ApiModel(description = "Status of the storage version migration.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha1StorageVersionMigrationStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1alpha1MigrationCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  @jakarta.annotation.Nullable
  private String resourceVersion;

  public V1alpha1StorageVersionMigrationStatus() {
  }

  public V1alpha1StorageVersionMigrationStatus conditions(@jakarta.annotation.Nullable List<V1alpha1MigrationCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1StorageVersionMigrationStatus addConditionsItem(V1alpha1MigrationCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The latest available observations of the migration&#39;s current state.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The latest available observations of the migration's current state.")
  public List<V1alpha1MigrationCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1alpha1MigrationCondition> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1StorageVersionMigrationStatus resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * ResourceVersion to compare with the GC cache for performing the migration. This is the current resource version of given group, version and resource when kube-controller-manager first observes this StorageVersionMigration resource.
   * @return resourceVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ResourceVersion to compare with the GC cache for performing the migration. This is the current resource version of given group, version and resource when kube-controller-manager first observes this StorageVersionMigration resource.")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StorageVersionMigrationStatus v1alpha1StorageVersionMigrationStatus = (V1alpha1StorageVersionMigrationStatus) o;
    return Objects.equals(this.conditions, v1alpha1StorageVersionMigrationStatus.conditions) &&
        Objects.equals(this.resourceVersion, v1alpha1StorageVersionMigrationStatus.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionMigrationStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("resourceVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1StorageVersionMigrationStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1StorageVersionMigrationStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1StorageVersionMigrationStatus is not found in the empty JSON string", V1alpha1StorageVersionMigrationStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1StorageVersionMigrationStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1StorageVersionMigrationStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1alpha1MigrationCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if ((jsonObj.get("resourceVersion") != null && !jsonObj.get("resourceVersion").isJsonNull()) && !jsonObj.get("resourceVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1StorageVersionMigrationStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1StorageVersionMigrationStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1StorageVersionMigrationStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1StorageVersionMigrationStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1StorageVersionMigrationStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1StorageVersionMigrationStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1StorageVersionMigrationStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1StorageVersionMigrationStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1StorageVersionMigrationStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha1StorageVersionMigrationStatus
   */
  public static V1alpha1StorageVersionMigrationStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1StorageVersionMigrationStatus.class);
  }

  /**
   * Convert an instance of V1alpha1StorageVersionMigrationStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
