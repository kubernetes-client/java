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
 * CELDeviceSelector contains a CEL expression for selecting a device.
 */
@ApiModel(description = "CELDeviceSelector contains a CEL expression for selecting a device.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CELDeviceSelector {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  @jakarta.annotation.Nonnull
  private String expression;

  public V1CELDeviceSelector() {
  }

  public V1CELDeviceSelector expression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.  The expression&#39;s input is an object named \&quot;device\&quot;, which carries the following properties:  - driver (string): the name of the driver which defines this device.  - attributes (map[string]object): the device&#39;s attributes, grouped by prefix    (e.g. device.attributes[\&quot;dra.example.com\&quot;] evaluates to an object with all    of the attributes which were prefixed by \&quot;dra.example.com\&quot;.  - capacity (map[string]object): the device&#39;s capacities, grouped by prefix.  - allowMultipleAllocations (bool): the allowMultipleAllocations property of the device    (v1.34+ with the DRAConsumableCapacity feature enabled).  Example: Consider a device with driver&#x3D;\&quot;dra.example.com\&quot;, which exposes two attributes named \&quot;model\&quot; and \&quot;ext.example.com/family\&quot; and which exposes one capacity named \&quot;modules\&quot;. This input to this expression would have the following fields:      device.driver     device.attributes[\&quot;dra.example.com\&quot;].model     device.attributes[\&quot;ext.example.com\&quot;].family     device.capacity[\&quot;dra.example.com\&quot;].modules  The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.  The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.  If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.  A robust expression should check for the existence of attributes before referencing them.  For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:      cel.bind(dra, device.attributes[\&quot;dra.example.com\&quot;], dra.someBool &amp;&amp; dra.anotherBool)  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps.
   * @return expression
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.  The expression's input is an object named \"device\", which carries the following properties:  - driver (string): the name of the driver which defines this device.  - attributes (map[string]object): the device's attributes, grouped by prefix    (e.g. device.attributes[\"dra.example.com\"] evaluates to an object with all    of the attributes which were prefixed by \"dra.example.com\".  - capacity (map[string]object): the device's capacities, grouped by prefix.  - allowMultipleAllocations (bool): the allowMultipleAllocations property of the device    (v1.34+ with the DRAConsumableCapacity feature enabled).  Example: Consider a device with driver=\"dra.example.com\", which exposes two attributes named \"model\" and \"ext.example.com/family\" and which exposes one capacity named \"modules\". This input to this expression would have the following fields:      device.driver     device.attributes[\"dra.example.com\"].model     device.attributes[\"ext.example.com\"].family     device.capacity[\"dra.example.com\"].modules  The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.  The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.  If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.  A robust expression should check for the existence of attributes before referencing them.  For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:      cel.bind(dra, device.attributes[\"dra.example.com\"], dra.someBool && dra.anotherBool)  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CELDeviceSelector v1CELDeviceSelector = (V1CELDeviceSelector) o;
    return Objects.equals(this.expression, v1CELDeviceSelector.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CELDeviceSelector {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
    openapiFields.add("expression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expression");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CELDeviceSelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CELDeviceSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CELDeviceSelector is not found in the empty JSON string", V1CELDeviceSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CELDeviceSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CELDeviceSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CELDeviceSelector.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CELDeviceSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CELDeviceSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CELDeviceSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CELDeviceSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CELDeviceSelector>() {
           @Override
           public void write(JsonWriter out, V1CELDeviceSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CELDeviceSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CELDeviceSelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CELDeviceSelector
   * @throws IOException if the JSON string is invalid with respect to V1CELDeviceSelector
   */
  public static V1CELDeviceSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CELDeviceSelector.class);
  }

  /**
   * Convert an instance of V1CELDeviceSelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
