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
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1FlockerVolumeSource {
  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  @jakarta.annotation.Nullable
  private String datasetName;

  public static final String SERIALIZED_NAME_DATASET_U_U_I_D = "datasetUUID";
  @SerializedName(SERIALIZED_NAME_DATASET_U_U_I_D)
  @jakarta.annotation.Nullable
  private String datasetUUID;

  public V1FlockerVolumeSource() {
  }

  public V1FlockerVolumeSource datasetName(@jakarta.annotation.Nullable String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  /**
   * datasetName is Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
   * @return datasetName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(@jakarta.annotation.Nullable String datasetName) {
    this.datasetName = datasetName;
  }


  public V1FlockerVolumeSource datasetUUID(@jakarta.annotation.Nullable String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }

  /**
   * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
   * @return datasetUUID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset")
  public String getDatasetUUID() {
    return datasetUUID;
  }

  public void setDatasetUUID(@jakarta.annotation.Nullable String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlockerVolumeSource v1FlockerVolumeSource = (V1FlockerVolumeSource) o;
    return Objects.equals(this.datasetName, v1FlockerVolumeSource.datasetName) &&
        Objects.equals(this.datasetUUID, v1FlockerVolumeSource.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlockerVolumeSource {\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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
    openapiFields.add("datasetName");
    openapiFields.add("datasetUUID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1FlockerVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1FlockerVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FlockerVolumeSource is not found in the empty JSON string", V1FlockerVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1FlockerVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FlockerVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datasetName") != null && !jsonObj.get("datasetName").isJsonNull()) && !jsonObj.get("datasetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetName").toString()));
      }
      if ((jsonObj.get("datasetUUID") != null && !jsonObj.get("datasetUUID").isJsonNull()) && !jsonObj.get("datasetUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetUUID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FlockerVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FlockerVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FlockerVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FlockerVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FlockerVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1FlockerVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FlockerVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1FlockerVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1FlockerVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1FlockerVolumeSource
   */
  public static V1FlockerVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FlockerVolumeSource.class);
  }

  /**
   * Convert an instance of V1FlockerVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
