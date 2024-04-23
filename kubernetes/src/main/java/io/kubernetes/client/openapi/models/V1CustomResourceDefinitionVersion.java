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
import io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition;
import io.kubernetes.client.openapi.models.V1CustomResourceSubresources;
import io.kubernetes.client.openapi.models.V1CustomResourceValidation;
import io.kubernetes.client.openapi.models.V1SelectableField;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * CustomResourceDefinitionVersion describes a version for CRD.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CustomResourceDefinitionVersion {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS = "additionalPrinterColumns";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS)
  private List<V1CustomResourceColumnDefinition> additionalPrinterColumns;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_DEPRECATION_WARNING = "deprecationWarning";
  @SerializedName(SERIALIZED_NAME_DEPRECATION_WARNING)
  private String deprecationWarning;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private V1CustomResourceValidation schema;

  public static final String SERIALIZED_NAME_SELECTABLE_FIELDS = "selectableFields";
  @SerializedName(SERIALIZED_NAME_SELECTABLE_FIELDS)
  private List<V1SelectableField> selectableFields;

  public static final String SERIALIZED_NAME_SERVED = "served";
  @SerializedName(SERIALIZED_NAME_SERVED)
  private Boolean served;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private Boolean storage;

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  private V1CustomResourceSubresources subresources;

  public V1CustomResourceDefinitionVersion() {
  }

  public V1CustomResourceDefinitionVersion additionalPrinterColumns(List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {

    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public V1CustomResourceDefinitionVersion addAdditionalPrinterColumnsItem(V1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    if (this.additionalPrinterColumns == null) {
      this.additionalPrinterColumns = new ArrayList<>();
    }
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

   /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
   * @return additionalPrinterColumns
  **/
  @jakarta.annotation.Nullable
  public List<V1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }


  public void setAdditionalPrinterColumns(List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }


  public V1CustomResourceDefinitionVersion deprecated(Boolean deprecated) {

    this.deprecated = deprecated;
    return this;
  }

   /**
   * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
   * @return deprecated
  **/
  @jakarta.annotation.Nullable
  public Boolean getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public V1CustomResourceDefinitionVersion deprecationWarning(String deprecationWarning) {

    this.deprecationWarning = deprecationWarning;
    return this;
  }

   /**
   * deprecationWarning overrides the default warning returned to API clients. May only be set when &#x60;deprecated&#x60; is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
   * @return deprecationWarning
  **/
  @jakarta.annotation.Nullable
  public String getDeprecationWarning() {
    return deprecationWarning;
  }


  public void setDeprecationWarning(String deprecationWarning) {
    this.deprecationWarning = deprecationWarning;
  }


  public V1CustomResourceDefinitionVersion name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1CustomResourceDefinitionVersion schema(V1CustomResourceValidation schema) {

    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @jakarta.annotation.Nullable
  public V1CustomResourceValidation getSchema() {
    return schema;
  }


  public void setSchema(V1CustomResourceValidation schema) {
    this.schema = schema;
  }


  public V1CustomResourceDefinitionVersion selectableFields(List<V1SelectableField> selectableFields) {

    this.selectableFields = selectableFields;
    return this;
  }

  public V1CustomResourceDefinitionVersion addSelectableFieldsItem(V1SelectableField selectableFieldsItem) {
    if (this.selectableFields == null) {
      this.selectableFields = new ArrayList<>();
    }
    this.selectableFields.add(selectableFieldsItem);
    return this;
  }

   /**
   * selectableFields specifies paths to fields that may be used as field selectors. A maximum of 8 selectable fields are allowed. See https://kubernetes.io/docs/concepts/overview/working-with-objects/field-selectors
   * @return selectableFields
  **/
  @jakarta.annotation.Nullable
  public List<V1SelectableField> getSelectableFields() {
    return selectableFields;
  }


  public void setSelectableFields(List<V1SelectableField> selectableFields) {
    this.selectableFields = selectableFields;
  }


  public V1CustomResourceDefinitionVersion served(Boolean served) {

    this.served = served;
    return this;
  }

   /**
   * served is a flag enabling/disabling this version from being served via REST APIs
   * @return served
  **/
  @jakarta.annotation.Nonnull
  public Boolean getServed() {
    return served;
  }


  public void setServed(Boolean served) {
    this.served = served;
  }


  public V1CustomResourceDefinitionVersion storage(Boolean storage) {

    this.storage = storage;
    return this;
  }

   /**
   * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage&#x3D;true.
   * @return storage
  **/
  @jakarta.annotation.Nonnull
  public Boolean getStorage() {
    return storage;
  }


  public void setStorage(Boolean storage) {
    this.storage = storage;
  }


  public V1CustomResourceDefinitionVersion subresources(V1CustomResourceSubresources subresources) {

    this.subresources = subresources;
    return this;
  }

   /**
   * Get subresources
   * @return subresources
  **/
  @jakarta.annotation.Nullable
  public V1CustomResourceSubresources getSubresources() {
    return subresources;
  }


  public void setSubresources(V1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionVersion v1CustomResourceDefinitionVersion = (V1CustomResourceDefinitionVersion) o;
    return Objects.equals(this.additionalPrinterColumns, v1CustomResourceDefinitionVersion.additionalPrinterColumns) &&
        Objects.equals(this.deprecated, v1CustomResourceDefinitionVersion.deprecated) &&
        Objects.equals(this.deprecationWarning, v1CustomResourceDefinitionVersion.deprecationWarning) &&
        Objects.equals(this.name, v1CustomResourceDefinitionVersion.name) &&
        Objects.equals(this.schema, v1CustomResourceDefinitionVersion.schema) &&
        Objects.equals(this.selectableFields, v1CustomResourceDefinitionVersion.selectableFields) &&
        Objects.equals(this.served, v1CustomResourceDefinitionVersion.served) &&
        Objects.equals(this.storage, v1CustomResourceDefinitionVersion.storage) &&
        Objects.equals(this.subresources, v1CustomResourceDefinitionVersion.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPrinterColumns, deprecated, deprecationWarning, name, schema, selectableFields, served, storage, subresources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionVersion {\n");
    sb.append("    additionalPrinterColumns: ").append(toIndentedString(additionalPrinterColumns)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecationWarning: ").append(toIndentedString(deprecationWarning)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    selectableFields: ").append(toIndentedString(selectableFields)).append("\n");
    sb.append("    served: ").append(toIndentedString(served)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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
    openapiFields.add("additionalPrinterColumns");
    openapiFields.add("deprecated");
    openapiFields.add("deprecationWarning");
    openapiFields.add("name");
    openapiFields.add("schema");
    openapiFields.add("selectableFields");
    openapiFields.add("served");
    openapiFields.add("storage");
    openapiFields.add("subresources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("served");
    openapiRequiredFields.add("storage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CustomResourceDefinitionVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CustomResourceDefinitionVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceDefinitionVersion is not found in the empty JSON string", V1CustomResourceDefinitionVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceDefinitionVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceDefinitionVersion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceDefinitionVersion.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("additionalPrinterColumns") != null && !jsonObj.get("additionalPrinterColumns").isJsonNull()) {
        JsonArray jsonArrayadditionalPrinterColumns = jsonObj.getAsJsonArray("additionalPrinterColumns");
        if (jsonArrayadditionalPrinterColumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalPrinterColumns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalPrinterColumns` to be an array in the JSON string but got `%s`", jsonObj.get("additionalPrinterColumns").toString()));
          }

          // validate the optional field `additionalPrinterColumns` (array)
          for (int i = 0; i < jsonArrayadditionalPrinterColumns.size(); i++) {
            V1CustomResourceColumnDefinition.validateJsonObject(jsonArrayadditionalPrinterColumns.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("deprecationWarning") != null && !jsonObj.get("deprecationWarning").isJsonNull()) && !jsonObj.get("deprecationWarning").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deprecationWarning` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deprecationWarning").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `schema`
      if (jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull()) {
        V1CustomResourceValidation.validateJsonObject(jsonObj.getAsJsonObject("schema"));
      }
      if (jsonObj.get("selectableFields") != null && !jsonObj.get("selectableFields").isJsonNull()) {
        JsonArray jsonArrayselectableFields = jsonObj.getAsJsonArray("selectableFields");
        if (jsonArrayselectableFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectableFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selectableFields` to be an array in the JSON string but got `%s`", jsonObj.get("selectableFields").toString()));
          }

          // validate the optional field `selectableFields` (array)
          for (int i = 0; i < jsonArrayselectableFields.size(); i++) {
            V1SelectableField.validateJsonObject(jsonArrayselectableFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `subresources`
      if (jsonObj.get("subresources") != null && !jsonObj.get("subresources").isJsonNull()) {
        V1CustomResourceSubresources.validateJsonObject(jsonObj.getAsJsonObject("subresources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceDefinitionVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceDefinitionVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceDefinitionVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceDefinitionVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceDefinitionVersion>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceDefinitionVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceDefinitionVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CustomResourceDefinitionVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CustomResourceDefinitionVersion
  * @throws IOException if the JSON string is invalid with respect to V1CustomResourceDefinitionVersion
  */
  public static V1CustomResourceDefinitionVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceDefinitionVersion.class);
  }

 /**
  * Convert an instance of V1CustomResourceDefinitionVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
