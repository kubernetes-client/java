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
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 */
@ApiModel(description = "ResourceFieldSelector represents container resources (cpu, memory) and their output format")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ResourceFieldSelector {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  @jakarta.annotation.Nullable
  private String containerName;

  public static final String SERIALIZED_NAME_DIVISOR = "divisor";
  @SerializedName(SERIALIZED_NAME_DIVISOR)
  @jakarta.annotation.Nullable
  private Quantity divisor;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nonnull
  private String resource;

  public V1ResourceFieldSelector() {
  }

  public V1ResourceFieldSelector containerName(@jakarta.annotation.Nullable String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Container name: required for volumes, optional for env vars
   * @return containerName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(@jakarta.annotation.Nullable String containerName) {
    this.containerName = containerName;
  }


  public V1ResourceFieldSelector divisor(@jakarta.annotation.Nullable Quantity divisor) {
    this.divisor = divisor;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &#x60;&#x60;&#x60; &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return divisor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  ``` <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)  <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)  <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getDivisor() {
    return divisor;
  }

  public void setDivisor(@jakarta.annotation.Nullable Quantity divisor) {
    this.divisor = divisor;
  }


  public V1ResourceFieldSelector resource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Required: resource to select
   * @return resource
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required: resource to select")
  public String getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceFieldSelector v1ResourceFieldSelector = (V1ResourceFieldSelector) o;
    return Objects.equals(this.containerName, v1ResourceFieldSelector.containerName) &&
        Objects.equals(this.divisor, v1ResourceFieldSelector.divisor) &&
        Objects.equals(this.resource, v1ResourceFieldSelector.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceFieldSelector {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("containerName");
    openapiFields.add("divisor");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resource");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ResourceFieldSelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourceFieldSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceFieldSelector is not found in the empty JSON string", V1ResourceFieldSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceFieldSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceFieldSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ResourceFieldSelector.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      if ((jsonObj.get("divisor") != null && !jsonObj.get("divisor").isJsonNull()) && !jsonObj.get("divisor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divisor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divisor").toString()));
      }
      if (!jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceFieldSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceFieldSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceFieldSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceFieldSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceFieldSelector>() {
           @Override
           public void write(JsonWriter out, V1ResourceFieldSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceFieldSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ResourceFieldSelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ResourceFieldSelector
   * @throws IOException if the JSON string is invalid with respect to V1ResourceFieldSelector
   */
  public static V1ResourceFieldSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceFieldSelector.class);
  }

  /**
   * Convert an instance of V1ResourceFieldSelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
