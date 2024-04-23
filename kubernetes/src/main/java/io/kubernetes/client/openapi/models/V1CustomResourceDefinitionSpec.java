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
import io.kubernetes.client.openapi.models.V1CustomResourceConversion;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion;
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
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CustomResourceDefinitionSpec {
  public static final String SERIALIZED_NAME_CONVERSION = "conversion";
  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private V1CustomResourceConversion conversion;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private V1CustomResourceDefinitionNames names;

  public static final String SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS = "preserveUnknownFields";
  @SerializedName(SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS)
  private Boolean preserveUnknownFields;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1CustomResourceDefinitionVersion> versions = new ArrayList<>();

  public V1CustomResourceDefinitionSpec() {
  }

  public V1CustomResourceDefinitionSpec conversion(V1CustomResourceConversion conversion) {

    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @jakarta.annotation.Nullable
  public V1CustomResourceConversion getConversion() {
    return conversion;
  }


  public void setConversion(V1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }


  public V1CustomResourceDefinitionSpec group(String group) {

    this.group = group;
    return this;
  }

   /**
   * group is the API group of the defined custom resource. The custom resources are served under &#x60;/apis/&lt;group&gt;/...&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;).
   * @return group
  **/
  @jakarta.annotation.Nonnull
  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1CustomResourceDefinitionSpec names(V1CustomResourceDefinitionNames names) {

    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @jakarta.annotation.Nonnull
  public V1CustomResourceDefinitionNames getNames() {
    return names;
  }


  public void setNames(V1CustomResourceDefinitionNames names) {
    this.names = names;
  }


  public V1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {

    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

   /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting &#x60;x-preserve-unknown-fields&#x60; to true in &#x60;spec.versions[*].schema.openAPIV3Schema&#x60;. See https://kubernetes.io/docs/tasks/extend-kubernetes/custom-resources/custom-resource-definitions/#field-pruning for details.
   * @return preserveUnknownFields
  **/
  @jakarta.annotation.Nullable
  public Boolean getPreserveUnknownFields() {
    return preserveUnknownFields;
  }


  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }


  public V1CustomResourceDefinitionSpec scope(String scope) {

    this.scope = scope;
    return this;
  }

   /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are &#x60;Cluster&#x60; and &#x60;Namespaced&#x60;.
   * @return scope
  **/
  @jakarta.annotation.Nonnull
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public V1CustomResourceDefinitionSpec versions(List<V1CustomResourceDefinitionVersion> versions) {

    this.versions = versions;
    return this;
  }

  public V1CustomResourceDefinitionSpec addVersionsItem(V1CustomResourceDefinitionVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versions
  **/
  @jakarta.annotation.Nonnull
  public List<V1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }


  public void setVersions(List<V1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionSpec v1CustomResourceDefinitionSpec = (V1CustomResourceDefinitionSpec) o;
    return Objects.equals(this.conversion, v1CustomResourceDefinitionSpec.conversion) &&
        Objects.equals(this.group, v1CustomResourceDefinitionSpec.group) &&
        Objects.equals(this.names, v1CustomResourceDefinitionSpec.names) &&
        Objects.equals(this.preserveUnknownFields, v1CustomResourceDefinitionSpec.preserveUnknownFields) &&
        Objects.equals(this.scope, v1CustomResourceDefinitionSpec.scope) &&
        Objects.equals(this.versions, v1CustomResourceDefinitionSpec.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversion, group, names, preserveUnknownFields, scope, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionSpec {\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ").append(toIndentedString(preserveUnknownFields)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("conversion");
    openapiFields.add("group");
    openapiFields.add("names");
    openapiFields.add("preserveUnknownFields");
    openapiFields.add("scope");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("names");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("versions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CustomResourceDefinitionSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CustomResourceDefinitionSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceDefinitionSpec is not found in the empty JSON string", V1CustomResourceDefinitionSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceDefinitionSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceDefinitionSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceDefinitionSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `conversion`
      if (jsonObj.get("conversion") != null && !jsonObj.get("conversion").isJsonNull()) {
        V1CustomResourceConversion.validateJsonObject(jsonObj.getAsJsonObject("conversion"));
      }
      if (!jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      // validate the required field `names`
      V1CustomResourceDefinitionNames.validateJsonObject(jsonObj.getAsJsonObject("names"));
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
      }

      JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
      // validate the required field `versions` (array)
      for (int i = 0; i < jsonArrayversions.size(); i++) {
        V1CustomResourceDefinitionVersion.validateJsonObject(jsonArrayversions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceDefinitionSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceDefinitionSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceDefinitionSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceDefinitionSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceDefinitionSpec>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceDefinitionSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceDefinitionSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CustomResourceDefinitionSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CustomResourceDefinitionSpec
  * @throws IOException if the JSON string is invalid with respect to V1CustomResourceDefinitionSpec
  */
  public static V1CustomResourceDefinitionSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceDefinitionSpec.class);
  }

 /**
  * Convert an instance of V1CustomResourceDefinitionSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
