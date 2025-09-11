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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 */
@ApiModel(description = "LimitRangeItem defines a min/max usage limit for any resource that matches on kind.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LimitRangeItem {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> _default = new HashMap<>();

  public static final String SERIALIZED_NAME_DEFAULT_REQUEST = "defaultRequest";
  @SerializedName(SERIALIZED_NAME_DEFAULT_REQUEST)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> defaultRequest = new HashMap<>();

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> max = new HashMap<>();

  public static final String SERIALIZED_NAME_MAX_LIMIT_REQUEST_RATIO = "maxLimitRequestRatio";
  @SerializedName(SERIALIZED_NAME_MAX_LIMIT_REQUEST_RATIO)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> maxLimitRequestRatio = new HashMap<>();

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> min = new HashMap<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public V1LimitRangeItem() {
  }

  public V1LimitRangeItem _default(@jakarta.annotation.Nullable Map<String, Quantity> _default) {
    this._default = _default;
    return this;
  }

  public V1LimitRangeItem putDefaultItem(String key, Quantity _defaultItem) {
    if (this._default == null) {
      this._default = new HashMap<>();
    }
    this._default.put(key, _defaultItem);
    return this;
  }

  /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   * @return _default
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Default resource requirement limit value by resource name if resource limit is omitted.")
  public Map<String, Quantity> getDefault() {
    return _default;
  }

  public void setDefault(@jakarta.annotation.Nullable Map<String, Quantity> _default) {
    this._default = _default;
  }


  public V1LimitRangeItem defaultRequest(@jakarta.annotation.Nullable Map<String, Quantity> defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

  public V1LimitRangeItem putDefaultRequestItem(String key, Quantity defaultRequestItem) {
    if (this.defaultRequest == null) {
      this.defaultRequest = new HashMap<>();
    }
    this.defaultRequest.put(key, defaultRequestItem);
    return this;
  }

  /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
   * @return defaultRequest
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.")
  public Map<String, Quantity> getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(@jakarta.annotation.Nullable Map<String, Quantity> defaultRequest) {
    this.defaultRequest = defaultRequest;
  }


  public V1LimitRangeItem max(@jakarta.annotation.Nullable Map<String, Quantity> max) {
    this.max = max;
    return this;
  }

  public V1LimitRangeItem putMaxItem(String key, Quantity maxItem) {
    if (this.max == null) {
      this.max = new HashMap<>();
    }
    this.max.put(key, maxItem);
    return this;
  }

  /**
   * Max usage constraints on this kind by resource name.
   * @return max
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Max usage constraints on this kind by resource name.")
  public Map<String, Quantity> getMax() {
    return max;
  }

  public void setMax(@jakarta.annotation.Nullable Map<String, Quantity> max) {
    this.max = max;
  }


  public V1LimitRangeItem maxLimitRequestRatio(@jakarta.annotation.Nullable Map<String, Quantity> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

  public V1LimitRangeItem putMaxLimitRequestRatioItem(String key, Quantity maxLimitRequestRatioItem) {
    if (this.maxLimitRequestRatio == null) {
      this.maxLimitRequestRatio = new HashMap<>();
    }
    this.maxLimitRequestRatio.put(key, maxLimitRequestRatioItem);
    return this;
  }

  /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
   * @return maxLimitRequestRatio
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.")
  public Map<String, Quantity> getMaxLimitRequestRatio() {
    return maxLimitRequestRatio;
  }

  public void setMaxLimitRequestRatio(@jakarta.annotation.Nullable Map<String, Quantity> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
  }


  public V1LimitRangeItem min(@jakarta.annotation.Nullable Map<String, Quantity> min) {
    this.min = min;
    return this;
  }

  public V1LimitRangeItem putMinItem(String key, Quantity minItem) {
    if (this.min == null) {
      this.min = new HashMap<>();
    }
    this.min.put(key, minItem);
    return this;
  }

  /**
   * Min usage constraints on this kind by resource name.
   * @return min
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Min usage constraints on this kind by resource name.")
  public Map<String, Quantity> getMin() {
    return min;
  }

  public void setMin(@jakarta.annotation.Nullable Map<String, Quantity> min) {
    this.min = min;
  }


  public V1LimitRangeItem type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of resource that this limit applies to.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of resource that this limit applies to.")
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
    V1LimitRangeItem v1LimitRangeItem = (V1LimitRangeItem) o;
    return Objects.equals(this._default, v1LimitRangeItem._default) &&
        Objects.equals(this.defaultRequest, v1LimitRangeItem.defaultRequest) &&
        Objects.equals(this.max, v1LimitRangeItem.max) &&
        Objects.equals(this.maxLimitRequestRatio, v1LimitRangeItem.maxLimitRequestRatio) &&
        Objects.equals(this.min, v1LimitRangeItem.min) &&
        Objects.equals(this.type, v1LimitRangeItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultRequest, max, maxLimitRequestRatio, min, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeItem {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLimitRequestRatio: ").append(toIndentedString(maxLimitRequestRatio)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("defaultRequest");
    openapiFields.add("max");
    openapiFields.add("maxLimitRequestRatio");
    openapiFields.add("min");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LimitRangeItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LimitRangeItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LimitRangeItem is not found in the empty JSON string", V1LimitRangeItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LimitRangeItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LimitRangeItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1LimitRangeItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LimitRangeItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LimitRangeItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LimitRangeItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LimitRangeItem.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LimitRangeItem>() {
           @Override
           public void write(JsonWriter out, V1LimitRangeItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LimitRangeItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1LimitRangeItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1LimitRangeItem
   * @throws IOException if the JSON string is invalid with respect to V1LimitRangeItem
   */
  public static V1LimitRangeItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LimitRangeItem.class);
  }

  /**
   * Convert an instance of V1LimitRangeItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
