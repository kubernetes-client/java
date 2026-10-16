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
 * DeviceDerivedAttribute defines a derived attribute computed via CEL.
 */
@ApiModel(description = "DeviceDerivedAttribute defines a derived attribute computed via CEL.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta2DeviceDerivedAttribute {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  @jakarta.annotation.Nonnull
  private String expression;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public V1beta2DeviceDerivedAttribute() {
  }

  public V1beta2DeviceDerivedAttribute expression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression is a CEL expression evaluated against each candidate device. The expression must evaluate to a primitive scalar (string, integer, boolean, or semver) or a list of these scalars ([]string, []int64, []bool, []semver) to act as a virtual grouping key. Any other return type is an error and causes CEL evaluation for the device to fail.  The expression&#39;s input is an object named \&quot;device\&quot;, which carries the same properties as in a CELDeviceSelector.  When pod scheduling encounters CEL runtime errors (such as looking up an attribute that isn&#39;t defined) for some devices, it will abort allocation and fail scheduling for the Pod. Surfacing evaluation errors immediately prevents silent topology matching failures that are extremely hard to detect. A robust expression should, for example, check for the existence of attributes before referencing them to avoid runtime evaluation errors.  The expression gets evaluated after a device has passed the other selector expressions for the request in which this expression is used. This allows writing expressions that are tailored towards the specific devices being requested (for example, by assuming the device is from a certain vendor and skipping those checks).  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps; the combined cost of all derived attributes in a claim is capped by a shared CEL cost budget.
   * @return expression
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Expression is a CEL expression evaluated against each candidate device. The expression must evaluate to a primitive scalar (string, integer, boolean, or semver) or a list of these scalars ([]string, []int64, []bool, []semver) to act as a virtual grouping key. Any other return type is an error and causes CEL evaluation for the device to fail.  The expression's input is an object named \"device\", which carries the same properties as in a CELDeviceSelector.  When pod scheduling encounters CEL runtime errors (such as looking up an attribute that isn't defined) for some devices, it will abort allocation and fail scheduling for the Pod. Surfacing evaluation errors immediately prevents silent topology matching failures that are extremely hard to detect. A robust expression should, for example, check for the existence of attributes before referencing them to avoid runtime evaluation errors.  The expression gets evaluated after a device has passed the other selector expressions for the request in which this expression is used. This allows writing expressions that are tailored towards the specific devices being requested (for example, by assuming the device is from a certain vendor and skipping those checks).  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps; the combined cost of all derived attributes in a claim is capped by a shared CEL cost budget.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
  }


  public V1beta2DeviceDerivedAttribute name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the identifier for this derived attribute, used in constraints.  It must be a DNS subdomain followed by a slash (\&quot;/\&quot;) followed by a C identifier (e.g. \&quot;example.com/numaNode\&quot; or \&quot;derived/numaNode\&quot;).  If the chosen name matches an existing physical attribute from a driver, the derived attribute&#39;s expression will shadow the physical attribute, and its evaluated value will be used in constraints instead. When the goal is to define a derived attribute that is only used within the ResourceClaim and not meant to shadow an existing attribute, use a domain prefix that no DRA driver should be using (e.g. \&quot;derived/myAttribute\&quot;).  It is not valid to define a derived attribute that isn&#39;t used in at least one constraint.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name is the identifier for this derived attribute, used in constraints.  It must be a DNS subdomain followed by a slash (\"/\") followed by a C identifier (e.g. \"example.com/numaNode\" or \"derived/numaNode\").  If the chosen name matches an existing physical attribute from a driver, the derived attribute's expression will shadow the physical attribute, and its evaluated value will be used in constraints instead. When the goal is to define a derived attribute that is only used within the ResourceClaim and not meant to shadow an existing attribute, use a domain prefix that no DRA driver should be using (e.g. \"derived/myAttribute\").  It is not valid to define a derived attribute that isn't used in at least one constraint.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceDerivedAttribute v1beta2DeviceDerivedAttribute = (V1beta2DeviceDerivedAttribute) o;
    return Objects.equals(this.expression, v1beta2DeviceDerivedAttribute.expression) &&
        Objects.equals(this.name, v1beta2DeviceDerivedAttribute.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceDerivedAttribute {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("expression", "name"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("expression", "name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceDerivedAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceDerivedAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta2DeviceDerivedAttribute is not found in the empty JSON string", V1beta2DeviceDerivedAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceDerivedAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2DeviceDerivedAttribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2DeviceDerivedAttribute.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceDerivedAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceDerivedAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceDerivedAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceDerivedAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceDerivedAttribute>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceDerivedAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceDerivedAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceDerivedAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceDerivedAttribute
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceDerivedAttribute
   */
  public static V1beta2DeviceDerivedAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceDerivedAttribute.class);
  }

  /**
   * Convert an instance of V1beta2DeviceDerivedAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
