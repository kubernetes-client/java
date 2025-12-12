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
import java.util.Locale;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1ApplyConfiguration;
import io.kubernetes.client.openapi.models.V1beta1JSONPatch;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * Mutation specifies the CEL expression which is used to apply the Mutation.
 */
@ApiModel(description = "Mutation specifies the CEL expression which is used to apply the Mutation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1beta1Mutation {
  public static final String SERIALIZED_NAME_APPLY_CONFIGURATION = "applyConfiguration";
  @SerializedName(SERIALIZED_NAME_APPLY_CONFIGURATION)
  @jakarta.annotation.Nullable
  private V1beta1ApplyConfiguration applyConfiguration;

  public static final String SERIALIZED_NAME_JSON_PATCH = "jsonPatch";
  @SerializedName(SERIALIZED_NAME_JSON_PATCH)
  @jakarta.annotation.Nullable
  private V1beta1JSONPatch jsonPatch;

  public static final String SERIALIZED_NAME_PATCH_TYPE = "patchType";
  @SerializedName(SERIALIZED_NAME_PATCH_TYPE)
  @jakarta.annotation.Nonnull
  private String patchType;

  public V1beta1Mutation() {
  }

  public V1beta1Mutation applyConfiguration(@jakarta.annotation.Nullable V1beta1ApplyConfiguration applyConfiguration) {
    this.applyConfiguration = applyConfiguration;
    return this;
  }

  /**
   * Get applyConfiguration
   * @return applyConfiguration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1ApplyConfiguration getApplyConfiguration() {
    return applyConfiguration;
  }

  public void setApplyConfiguration(@jakarta.annotation.Nullable V1beta1ApplyConfiguration applyConfiguration) {
    this.applyConfiguration = applyConfiguration;
  }


  public V1beta1Mutation jsonPatch(@jakarta.annotation.Nullable V1beta1JSONPatch jsonPatch) {
    this.jsonPatch = jsonPatch;
    return this;
  }

  /**
   * Get jsonPatch
   * @return jsonPatch
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1JSONPatch getJsonPatch() {
    return jsonPatch;
  }

  public void setJsonPatch(@jakarta.annotation.Nullable V1beta1JSONPatch jsonPatch) {
    this.jsonPatch = jsonPatch;
  }


  public V1beta1Mutation patchType(@jakarta.annotation.Nonnull String patchType) {
    this.patchType = patchType;
    return this;
  }

  /**
   * patchType indicates the patch strategy used. Allowed values are \&quot;ApplyConfiguration\&quot; and \&quot;JSONPatch\&quot;. Required.
   * @return patchType
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "patchType indicates the patch strategy used. Allowed values are \"ApplyConfiguration\" and \"JSONPatch\". Required.")
  public String getPatchType() {
    return patchType;
  }

  public void setPatchType(@jakarta.annotation.Nonnull String patchType) {
    this.patchType = patchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Mutation v1beta1Mutation = (V1beta1Mutation) o;
    return Objects.equals(this.applyConfiguration, v1beta1Mutation.applyConfiguration) &&
        Objects.equals(this.jsonPatch, v1beta1Mutation.jsonPatch) &&
        Objects.equals(this.patchType, v1beta1Mutation.patchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyConfiguration, jsonPatch, patchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Mutation {\n");
    sb.append("    applyConfiguration: ").append(toIndentedString(applyConfiguration)).append("\n");
    sb.append("    jsonPatch: ").append(toIndentedString(jsonPatch)).append("\n");
    sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("applyConfiguration", "jsonPatch", "patchType"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("patchType"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1Mutation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1Mutation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1beta1Mutation is not found in the empty JSON string", V1beta1Mutation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1Mutation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta1Mutation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1Mutation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `applyConfiguration`
      if (jsonObj.get("applyConfiguration") != null && !jsonObj.get("applyConfiguration").isJsonNull()) {
        V1beta1ApplyConfiguration.validateJsonElement(jsonObj.get("applyConfiguration"));
      }
      // validate the optional field `jsonPatch`
      if (jsonObj.get("jsonPatch") != null && !jsonObj.get("jsonPatch").isJsonNull()) {
        V1beta1JSONPatch.validateJsonElement(jsonObj.get("jsonPatch"));
      }
      if (!jsonObj.get("patchType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `patchType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patchType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1Mutation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1Mutation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1Mutation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1Mutation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1Mutation>() {
           @Override
           public void write(JsonWriter out, V1beta1Mutation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1Mutation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1Mutation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1Mutation
   * @throws IOException if the JSON string is invalid with respect to V1beta1Mutation
   */
  public static V1beta1Mutation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1Mutation.class);
  }

  /**
   * Convert an instance of V1beta1Mutation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
