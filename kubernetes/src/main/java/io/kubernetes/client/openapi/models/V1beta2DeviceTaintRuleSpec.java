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
import io.kubernetes.client.openapi.models.V1beta2DeviceTaint;
import io.kubernetes.client.openapi.models.V1beta2DeviceTaintSelector;
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
 * DeviceTaintRuleSpec specifies the selector and one taint.
 */
@ApiModel(description = "DeviceTaintRuleSpec specifies the selector and one taint.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta2DeviceTaintRuleSpec {
  public static final String SERIALIZED_NAME_DEVICE_SELECTOR = "deviceSelector";
  @SerializedName(SERIALIZED_NAME_DEVICE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1beta2DeviceTaintSelector deviceSelector;

  public static final String SERIALIZED_NAME_TAINT = "taint";
  @SerializedName(SERIALIZED_NAME_TAINT)
  @jakarta.annotation.Nonnull
  private V1beta2DeviceTaint taint;

  public V1beta2DeviceTaintRuleSpec() {
  }

  public V1beta2DeviceTaintRuleSpec deviceSelector(@jakarta.annotation.Nullable V1beta2DeviceTaintSelector deviceSelector) {
    this.deviceSelector = deviceSelector;
    return this;
  }

  /**
   * Get deviceSelector
   * @return deviceSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2DeviceTaintSelector getDeviceSelector() {
    return deviceSelector;
  }

  public void setDeviceSelector(@jakarta.annotation.Nullable V1beta2DeviceTaintSelector deviceSelector) {
    this.deviceSelector = deviceSelector;
  }


  public V1beta2DeviceTaintRuleSpec taint(@jakarta.annotation.Nonnull V1beta2DeviceTaint taint) {
    this.taint = taint;
    return this;
  }

  /**
   * Get taint
   * @return taint
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1beta2DeviceTaint getTaint() {
    return taint;
  }

  public void setTaint(@jakarta.annotation.Nonnull V1beta2DeviceTaint taint) {
    this.taint = taint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceTaintRuleSpec v1beta2DeviceTaintRuleSpec = (V1beta2DeviceTaintRuleSpec) o;
    return Objects.equals(this.deviceSelector, v1beta2DeviceTaintRuleSpec.deviceSelector) &&
        Objects.equals(this.taint, v1beta2DeviceTaintRuleSpec.taint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceSelector, taint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceTaintRuleSpec {\n");
    sb.append("    deviceSelector: ").append(toIndentedString(deviceSelector)).append("\n");
    sb.append("    taint: ").append(toIndentedString(taint)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("deviceSelector", "taint"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("taint"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceTaintRuleSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceTaintRuleSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta2DeviceTaintRuleSpec is not found in the empty JSON string", V1beta2DeviceTaintRuleSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceTaintRuleSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2DeviceTaintRuleSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2DeviceTaintRuleSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `deviceSelector`
      if (jsonObj.get("deviceSelector") != null && !jsonObj.get("deviceSelector").isJsonNull()) {
        V1beta2DeviceTaintSelector.validateJsonElement(jsonObj.get("deviceSelector"));
      }
      // validate the required field `taint`
      V1beta2DeviceTaint.validateJsonElement(jsonObj.get("taint"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceTaintRuleSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceTaintRuleSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceTaintRuleSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceTaintRuleSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceTaintRuleSpec>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceTaintRuleSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceTaintRuleSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceTaintRuleSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceTaintRuleSpec
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceTaintRuleSpec
   */
  public static V1beta2DeviceTaintRuleSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceTaintRuleSpec.class);
  }

  /**
   * Convert an instance of V1beta2DeviceTaintRuleSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
