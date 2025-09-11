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
import io.kubernetes.client.openapi.models.V1FieldSelectorAttributes;
import io.kubernetes.client.openapi.models.V1LabelSelectorAttributes;
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
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 */
@ApiModel(description = "ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ResourceAttributes {
  public static final String SERIALIZED_NAME_FIELD_SELECTOR = "fieldSelector";
  @SerializedName(SERIALIZED_NAME_FIELD_SELECTOR)
  @jakarta.annotation.Nullable
  private V1FieldSelectorAttributes fieldSelector;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @jakarta.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelectorAttributes labelSelector;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @jakarta.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nullable
  private String resource;

  public static final String SERIALIZED_NAME_SUBRESOURCE = "subresource";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE)
  @jakarta.annotation.Nullable
  private String subresource;

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  @jakarta.annotation.Nullable
  private String verb;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @jakarta.annotation.Nullable
  private String version;

  public V1ResourceAttributes() {
  }

  public V1ResourceAttributes fieldSelector(@jakarta.annotation.Nullable V1FieldSelectorAttributes fieldSelector) {
    this.fieldSelector = fieldSelector;
    return this;
  }

  /**
   * Get fieldSelector
   * @return fieldSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FieldSelectorAttributes getFieldSelector() {
    return fieldSelector;
  }

  public void setFieldSelector(@jakarta.annotation.Nullable V1FieldSelectorAttributes fieldSelector) {
    this.fieldSelector = fieldSelector;
  }


  public V1ResourceAttributes group(@jakarta.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Group is the API Group of the Resource.  \&quot;*\&quot; means all.
   * @return group
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Group is the API Group of the Resource.  \"*\" means all.")
  public String getGroup() {
    return group;
  }

  public void setGroup(@jakarta.annotation.Nullable String group) {
    this.group = group;
  }


  public V1ResourceAttributes labelSelector(@jakarta.annotation.Nullable V1LabelSelectorAttributes labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   * @return labelSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelectorAttributes getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(@jakarta.annotation.Nullable V1LabelSelectorAttributes labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1ResourceAttributes name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the resource being requested for a \&quot;get\&quot; or deleted for a \&quot;delete\&quot;. \&quot;\&quot; (empty) means all.
   * @return name
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public V1ResourceAttributes namespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \&quot;\&quot; (empty) is defaulted for LocalSubjectAccessReviews \&quot;\&quot; (empty) is empty for cluster-scoped resources \&quot;\&quot; (empty) means \&quot;all\&quot; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public V1ResourceAttributes resource(@jakarta.annotation.Nullable String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Resource is one of the existing resource types.  \&quot;*\&quot; means all.
   * @return resource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Resource is one of the existing resource types.  \"*\" means all.")
  public String getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nullable String resource) {
    this.resource = resource;
  }


  public V1ResourceAttributes subresource(@jakarta.annotation.Nullable String subresource) {
    this.subresource = subresource;
    return this;
  }

  /**
   * Subresource is one of the existing resource types.  \&quot;\&quot; means none.
   * @return subresource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Subresource is one of the existing resource types.  \"\" means none.")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(@jakarta.annotation.Nullable String subresource) {
    this.subresource = subresource;
  }


  public V1ResourceAttributes verb(@jakarta.annotation.Nullable String verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \&quot;*\&quot; means all.
   * @return verb
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
  public String getVerb() {
    return verb;
  }

  public void setVerb(@jakarta.annotation.Nullable String verb) {
    this.verb = verb;
  }


  public V1ResourceAttributes version(@jakarta.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Version is the API Version of the Resource.  \&quot;*\&quot; means all.
   * @return version
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Version is the API Version of the Resource.  \"*\" means all.")
  public String getVersion() {
    return version;
  }

  public void setVersion(@jakarta.annotation.Nullable String version) {
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
    V1ResourceAttributes v1ResourceAttributes = (V1ResourceAttributes) o;
    return Objects.equals(this.fieldSelector, v1ResourceAttributes.fieldSelector) &&
        Objects.equals(this.group, v1ResourceAttributes.group) &&
        Objects.equals(this.labelSelector, v1ResourceAttributes.labelSelector) &&
        Objects.equals(this.name, v1ResourceAttributes.name) &&
        Objects.equals(this.namespace, v1ResourceAttributes.namespace) &&
        Objects.equals(this.resource, v1ResourceAttributes.resource) &&
        Objects.equals(this.subresource, v1ResourceAttributes.subresource) &&
        Objects.equals(this.verb, v1ResourceAttributes.verb) &&
        Objects.equals(this.version, v1ResourceAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldSelector, group, labelSelector, name, namespace, resource, subresource, verb, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceAttributes {\n");
    sb.append("    fieldSelector: ").append(toIndentedString(fieldSelector)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
    openapiFields.add("fieldSelector");
    openapiFields.add("group");
    openapiFields.add("labelSelector");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("resource");
    openapiFields.add("subresource");
    openapiFields.add("verb");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ResourceAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceAttributes is not found in the empty JSON string", V1ResourceAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fieldSelector`
      if (jsonObj.get("fieldSelector") != null && !jsonObj.get("fieldSelector").isJsonNull()) {
        V1FieldSelectorAttributes.validateJsonElement(jsonObj.get("fieldSelector"));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1LabelSelectorAttributes.validateJsonElement(jsonObj.get("labelSelector"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) && !jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      if ((jsonObj.get("subresource") != null && !jsonObj.get("subresource").isJsonNull()) && !jsonObj.get("subresource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subresource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subresource").toString()));
      }
      if ((jsonObj.get("verb") != null && !jsonObj.get("verb").isJsonNull()) && !jsonObj.get("verb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verb").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceAttributes>() {
           @Override
           public void write(JsonWriter out, V1ResourceAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ResourceAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ResourceAttributes
   * @throws IOException if the JSON string is invalid with respect to V1ResourceAttributes
   */
  public static V1ResourceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceAttributes.class);
  }

  /**
   * Convert an instance of V1ResourceAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
