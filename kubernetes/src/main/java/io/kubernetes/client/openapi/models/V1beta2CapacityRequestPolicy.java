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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1beta2CapacityRequestPolicyRange;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * CapacityRequestPolicy defines how requests consume device capacity.  Must not set more than one ValidRequestValues.
 */
@ApiModel(description = "CapacityRequestPolicy defines how requests consume device capacity.  Must not set more than one ValidRequestValues.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1beta2CapacityRequestPolicy {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @jakarta.annotation.Nullable
  private Quantity _default;

  public static final String SERIALIZED_NAME_VALID_RANGE = "validRange";
  @SerializedName(SERIALIZED_NAME_VALID_RANGE)
  @jakarta.annotation.Nullable
  private V1beta2CapacityRequestPolicyRange validRange;

  public static final String SERIALIZED_NAME_VALID_VALUES = "validValues";
  @SerializedName(SERIALIZED_NAME_VALID_VALUES)
  @jakarta.annotation.Nullable
  private List<Quantity> validValues = new ArrayList<>();

  public V1beta2CapacityRequestPolicy() {
  }

  public V1beta2CapacityRequestPolicy _default(@jakarta.annotation.Nullable Quantity _default) {
    this._default = _default;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &#x60;&#x60;&#x60; &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return _default
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  ``` <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)  <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)  <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getDefault() {
    return _default;
  }

  public void setDefault(@jakarta.annotation.Nullable Quantity _default) {
    this._default = _default;
  }


  public V1beta2CapacityRequestPolicy validRange(@jakarta.annotation.Nullable V1beta2CapacityRequestPolicyRange validRange) {
    this.validRange = validRange;
    return this;
  }

  /**
   * Get validRange
   * @return validRange
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2CapacityRequestPolicyRange getValidRange() {
    return validRange;
  }

  public void setValidRange(@jakarta.annotation.Nullable V1beta2CapacityRequestPolicyRange validRange) {
    this.validRange = validRange;
  }


  public V1beta2CapacityRequestPolicy validValues(@jakarta.annotation.Nullable List<Quantity> validValues) {
    this.validValues = validValues;
    return this;
  }

  public V1beta2CapacityRequestPolicy addValidValuesItem(Quantity validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

  /**
   * ValidValues defines a set of acceptable quantity values in consuming requests.  Must not contain more than 10 entries. Must be sorted in ascending order.  If this field is set, Default must be defined and it must be included in ValidValues list.  If the requested amount does not match any valid value but smaller than some valid values, the scheduler calculates the smallest valid value that is greater than or equal to the request. That is: min(ceil(requestedValue) ∈ validValues), where requestedValue ≤ max(validValues).  If the requested amount exceeds all valid values, the request violates the policy, and this device cannot be allocated.
   * @return validValues
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ValidValues defines a set of acceptable quantity values in consuming requests.  Must not contain more than 10 entries. Must be sorted in ascending order.  If this field is set, Default must be defined and it must be included in ValidValues list.  If the requested amount does not match any valid value but smaller than some valid values, the scheduler calculates the smallest valid value that is greater than or equal to the request. That is: min(ceil(requestedValue) ∈ validValues), where requestedValue ≤ max(validValues).  If the requested amount exceeds all valid values, the request violates the policy, and this device cannot be allocated.")
  public List<Quantity> getValidValues() {
    return validValues;
  }

  public void setValidValues(@jakarta.annotation.Nullable List<Quantity> validValues) {
    this.validValues = validValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2CapacityRequestPolicy v1beta2CapacityRequestPolicy = (V1beta2CapacityRequestPolicy) o;
    return Objects.equals(this._default, v1beta2CapacityRequestPolicy._default) &&
        Objects.equals(this.validRange, v1beta2CapacityRequestPolicy.validRange) &&
        Objects.equals(this.validValues, v1beta2CapacityRequestPolicy.validValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, validRange, validValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2CapacityRequestPolicy {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    validRange: ").append(toIndentedString(validRange)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("default", "validRange", "validValues"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2CapacityRequestPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2CapacityRequestPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1beta2CapacityRequestPolicy is not found in the empty JSON string", V1beta2CapacityRequestPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2CapacityRequestPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2CapacityRequestPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default") != null && !jsonObj.get("default").isJsonNull()) && !jsonObj.get("default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default").toString()));
      }
      // validate the optional field `validRange`
      if (jsonObj.get("validRange") != null && !jsonObj.get("validRange").isJsonNull()) {
        V1beta2CapacityRequestPolicyRange.validateJsonElement(jsonObj.get("validRange"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validValues") != null && !jsonObj.get("validValues").isJsonNull() && !jsonObj.get("validValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `validValues` to be an array in the JSON string but got `%s`", jsonObj.get("validValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2CapacityRequestPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2CapacityRequestPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2CapacityRequestPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2CapacityRequestPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2CapacityRequestPolicy>() {
           @Override
           public void write(JsonWriter out, V1beta2CapacityRequestPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2CapacityRequestPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2CapacityRequestPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2CapacityRequestPolicy
   * @throws IOException if the JSON string is invalid with respect to V1beta2CapacityRequestPolicy
   */
  public static V1beta2CapacityRequestPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2CapacityRequestPolicy.class);
  }

  /**
   * Convert an instance of V1beta2CapacityRequestPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
