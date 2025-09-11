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
import io.kubernetes.client.openapi.models.V1ExemptPriorityLevelConfiguration;
import io.kubernetes.client.openapi.models.V1LimitedPriorityLevelConfiguration;
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
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 */
@ApiModel(description = "PriorityLevelConfigurationSpec specifies the configuration of a priority level.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PriorityLevelConfigurationSpec {
  public static final String SERIALIZED_NAME_EXEMPT = "exempt";
  @SerializedName(SERIALIZED_NAME_EXEMPT)
  @jakarta.annotation.Nullable
  private V1ExemptPriorityLevelConfiguration exempt;

  public static final String SERIALIZED_NAME_LIMITED = "limited";
  @SerializedName(SERIALIZED_NAME_LIMITED)
  @jakarta.annotation.Nullable
  private V1LimitedPriorityLevelConfiguration limited;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V1PriorityLevelConfigurationSpec() {
  }

  public V1PriorityLevelConfigurationSpec exempt(@jakarta.annotation.Nullable V1ExemptPriorityLevelConfiguration exempt) {
    this.exempt = exempt;
    return this;
  }

  /**
   * Get exempt
   * @return exempt
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExemptPriorityLevelConfiguration getExempt() {
    return exempt;
  }

  public void setExempt(@jakarta.annotation.Nullable V1ExemptPriorityLevelConfiguration exempt) {
    this.exempt = exempt;
  }


  public V1PriorityLevelConfigurationSpec limited(@jakarta.annotation.Nullable V1LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
    return this;
  }

  /**
   * Get limited
   * @return limited
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LimitedPriorityLevelConfiguration getLimited() {
    return limited;
  }

  public void setLimited(@jakarta.annotation.Nullable V1LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
  }


  public V1PriorityLevelConfigurationSpec type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * &#x60;type&#x60; indicates whether this priority level is subject to limitation on request execution.  A value of &#x60;\&quot;Exempt\&quot;&#x60; means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of &#x60;\&quot;Limited\&quot;&#x60; means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`type` indicates whether this priority level is subject to limitation on request execution.  A value of `\"Exempt\"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `\"Limited\"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PriorityLevelConfigurationSpec v1PriorityLevelConfigurationSpec = (V1PriorityLevelConfigurationSpec) o;
    return Objects.equals(this.exempt, v1PriorityLevelConfigurationSpec.exempt) &&
        Objects.equals(this.limited, v1PriorityLevelConfigurationSpec.limited) &&
        Objects.equals(this.type, v1PriorityLevelConfigurationSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exempt, limited, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PriorityLevelConfigurationSpec {\n");
    sb.append("    exempt: ").append(toIndentedString(exempt)).append("\n");
    sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("exempt");
    openapiFields.add("limited");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PriorityLevelConfigurationSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PriorityLevelConfigurationSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PriorityLevelConfigurationSpec is not found in the empty JSON string", V1PriorityLevelConfigurationSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PriorityLevelConfigurationSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PriorityLevelConfigurationSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PriorityLevelConfigurationSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exempt`
      if (jsonObj.get("exempt") != null && !jsonObj.get("exempt").isJsonNull()) {
        V1ExemptPriorityLevelConfiguration.validateJsonElement(jsonObj.get("exempt"));
      }
      // validate the optional field `limited`
      if (jsonObj.get("limited") != null && !jsonObj.get("limited").isJsonNull()) {
        V1LimitedPriorityLevelConfiguration.validateJsonElement(jsonObj.get("limited"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PriorityLevelConfigurationSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PriorityLevelConfigurationSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PriorityLevelConfigurationSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PriorityLevelConfigurationSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PriorityLevelConfigurationSpec>() {
           @Override
           public void write(JsonWriter out, V1PriorityLevelConfigurationSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PriorityLevelConfigurationSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PriorityLevelConfigurationSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PriorityLevelConfigurationSpec
   * @throws IOException if the JSON string is invalid with respect to V1PriorityLevelConfigurationSpec
   */
  public static V1PriorityLevelConfigurationSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PriorityLevelConfigurationSpec.class);
  }

  /**
   * Convert an instance of V1PriorityLevelConfigurationSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
