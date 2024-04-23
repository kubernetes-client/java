/*
Copyright 2024 The Kubernetes Authors.
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesIntSlice;
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesStringSlice;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * NamedResourcesAttribute is a combination of an attribute name and its value.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2NamedResourcesAttribute {
  public static final String SERIALIZED_NAME_BOOL = "bool";
  @SerializedName(SERIALIZED_NAME_BOOL)
  private Boolean bool;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  private Long _int;

  public static final String SERIALIZED_NAME_INT_SLICE = "intSlice";
  @SerializedName(SERIALIZED_NAME_INT_SLICE)
  private V1alpha2NamedResourcesIntSlice intSlice;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Quantity quantity;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public static final String SERIALIZED_NAME_STRING_SLICE = "stringSlice";
  @SerializedName(SERIALIZED_NAME_STRING_SLICE)
  private V1alpha2NamedResourcesStringSlice stringSlice;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1alpha2NamedResourcesAttribute() {
  }

  public V1alpha2NamedResourcesAttribute bool(Boolean bool) {

    this.bool = bool;
    return this;
  }

   /**
   * BoolValue is a true/false value.
   * @return bool
  **/
  @jakarta.annotation.Nullable
  public Boolean getBool() {
    return bool;
  }


  public void setBool(Boolean bool) {
    this.bool = bool;
  }


  public V1alpha2NamedResourcesAttribute _int(Long _int) {

    this._int = _int;
    return this;
  }

   /**
   * IntValue is a 64-bit integer.
   * @return _int
  **/
  @jakarta.annotation.Nullable
  public Long getInt() {
    return _int;
  }


  public void setInt(Long _int) {
    this._int = _int;
  }


  public V1alpha2NamedResourcesAttribute intSlice(V1alpha2NamedResourcesIntSlice intSlice) {

    this.intSlice = intSlice;
    return this;
  }

   /**
   * Get intSlice
   * @return intSlice
  **/
  @jakarta.annotation.Nullable
  public V1alpha2NamedResourcesIntSlice getIntSlice() {
    return intSlice;
  }


  public void setIntSlice(V1alpha2NamedResourcesIntSlice intSlice) {
    this.intSlice = intSlice;
  }


  public V1alpha2NamedResourcesAttribute name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2NamedResourcesAttribute quantity(Quantity quantity) {

    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &#x60;&#x60;&#x60; &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return quantity
  **/
  @jakarta.annotation.Nullable
  public Quantity getQuantity() {
    return quantity;
  }


  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }


  public V1alpha2NamedResourcesAttribute string(String string) {

    this.string = string;
    return this;
  }

   /**
   * StringValue is a string.
   * @return string
  **/
  @jakarta.annotation.Nullable
  public String getString() {
    return string;
  }


  public void setString(String string) {
    this.string = string;
  }


  public V1alpha2NamedResourcesAttribute stringSlice(V1alpha2NamedResourcesStringSlice stringSlice) {

    this.stringSlice = stringSlice;
    return this;
  }

   /**
   * Get stringSlice
   * @return stringSlice
  **/
  @jakarta.annotation.Nullable
  public V1alpha2NamedResourcesStringSlice getStringSlice() {
    return stringSlice;
  }


  public void setStringSlice(V1alpha2NamedResourcesStringSlice stringSlice) {
    this.stringSlice = stringSlice;
  }


  public V1alpha2NamedResourcesAttribute version(String version) {

    this.version = version;
    return this;
  }

   /**
   * VersionValue is a semantic version according to semver.org spec 2.0.0.
   * @return version
  **/
  @jakarta.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2NamedResourcesAttribute v1alpha2NamedResourcesAttribute = (V1alpha2NamedResourcesAttribute) o;
    return Objects.equals(this.bool, v1alpha2NamedResourcesAttribute.bool) &&
        Objects.equals(this._int, v1alpha2NamedResourcesAttribute._int) &&
        Objects.equals(this.intSlice, v1alpha2NamedResourcesAttribute.intSlice) &&
        Objects.equals(this.name, v1alpha2NamedResourcesAttribute.name) &&
        Objects.equals(this.quantity, v1alpha2NamedResourcesAttribute.quantity) &&
        Objects.equals(this.string, v1alpha2NamedResourcesAttribute.string) &&
        Objects.equals(this.stringSlice, v1alpha2NamedResourcesAttribute.stringSlice) &&
        Objects.equals(this.version, v1alpha2NamedResourcesAttribute.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool, _int, intSlice, name, quantity, string, stringSlice, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesAttribute {\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    intSlice: ").append(toIndentedString(intSlice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    stringSlice: ").append(toIndentedString(stringSlice)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("bool");
    openapiFields.add("int");
    openapiFields.add("intSlice");
    openapiFields.add("name");
    openapiFields.add("quantity");
    openapiFields.add("string");
    openapiFields.add("stringSlice");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2NamedResourcesAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2NamedResourcesAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2NamedResourcesAttribute is not found in the empty JSON string", V1alpha2NamedResourcesAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2NamedResourcesAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2NamedResourcesAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2NamedResourcesAttribute.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `intSlice`
      if (jsonObj.get("intSlice") != null && !jsonObj.get("intSlice").isJsonNull()) {
        V1alpha2NamedResourcesIntSlice.validateJsonObject(jsonObj.getAsJsonObject("intSlice"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("string") != null && !jsonObj.get("string").isJsonNull()) && !jsonObj.get("string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string").toString()));
      }
      // validate the optional field `stringSlice`
      if (jsonObj.get("stringSlice") != null && !jsonObj.get("stringSlice").isJsonNull()) {
        V1alpha2NamedResourcesStringSlice.validateJsonObject(jsonObj.getAsJsonObject("stringSlice"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2NamedResourcesAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2NamedResourcesAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2NamedResourcesAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2NamedResourcesAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2NamedResourcesAttribute>() {
           @Override
           public void write(JsonWriter out, V1alpha2NamedResourcesAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2NamedResourcesAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2NamedResourcesAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2NamedResourcesAttribute
  * @throws IOException if the JSON string is invalid with respect to V1alpha2NamedResourcesAttribute
  */
  public static V1alpha2NamedResourcesAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2NamedResourcesAttribute.class);
  }

 /**
  * Convert an instance of V1alpha2NamedResourcesAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
