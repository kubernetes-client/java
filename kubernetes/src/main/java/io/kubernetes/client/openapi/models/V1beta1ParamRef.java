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
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * ParamRef describes how to locate the params to be used as input to expressions of rules applied by a policy binding.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1beta1ParamRef {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETER_NOT_FOUND_ACTION = "parameterNotFoundAction";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NOT_FOUND_ACTION)
  private String parameterNotFoundAction;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public V1beta1ParamRef() {
  }

  public V1beta1ParamRef name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the name of the resource being referenced.  One of &#x60;name&#x60; or &#x60;selector&#x60; must be set, but &#x60;name&#x60; and &#x60;selector&#x60; are mutually exclusive properties. If one is set, the other must be unset.  A single parameter used for all admission requests can be configured by setting the &#x60;name&#x60; field, leaving &#x60;selector&#x60; blank, and setting namespace if &#x60;paramKind&#x60; is namespace-scoped.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ParamRef namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both &#x60;name&#x60; and &#x60;selector&#x60; fields.  A per-namespace parameter may be used by specifying a namespace-scoped &#x60;paramKind&#x60; in the policy and leaving this field empty.  - If &#x60;paramKind&#x60; is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.  - If &#x60;paramKind&#x60; is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1beta1ParamRef parameterNotFoundAction(String parameterNotFoundAction) {

    this.parameterNotFoundAction = parameterNotFoundAction;
    return this;
  }

   /**
   * &#x60;parameterNotFoundAction&#x60; controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to &#x60;Allow&#x60;, then no matched parameters will be treated as successful validation by the binding. If set to &#x60;Deny&#x60;, then no matched parameters will be subject to the &#x60;failurePolicy&#x60; of the policy.  Allowed values are &#x60;Allow&#x60; or &#x60;Deny&#x60;  Required
   * @return parameterNotFoundAction
  **/
  @jakarta.annotation.Nullable
  public String getParameterNotFoundAction() {
    return parameterNotFoundAction;
  }


  public void setParameterNotFoundAction(String parameterNotFoundAction) {
    this.parameterNotFoundAction = parameterNotFoundAction;
  }


  public V1beta1ParamRef selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ParamRef v1beta1ParamRef = (V1beta1ParamRef) o;
    return Objects.equals(this.name, v1beta1ParamRef.name) &&
        Objects.equals(this.namespace, v1beta1ParamRef.namespace) &&
        Objects.equals(this.parameterNotFoundAction, v1beta1ParamRef.parameterNotFoundAction) &&
        Objects.equals(this.selector, v1beta1ParamRef.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, parameterNotFoundAction, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ParamRef {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameterNotFoundAction: ").append(toIndentedString(parameterNotFoundAction)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("parameterNotFoundAction");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1ParamRef
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1ParamRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ParamRef is not found in the empty JSON string", V1beta1ParamRef.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ParamRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ParamRef` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("parameterNotFoundAction") != null && !jsonObj.get("parameterNotFoundAction").isJsonNull()) && !jsonObj.get("parameterNotFoundAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterNotFoundAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameterNotFoundAction").toString()));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ParamRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ParamRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ParamRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ParamRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ParamRef>() {
           @Override
           public void write(JsonWriter out, V1beta1ParamRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ParamRef read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ParamRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ParamRef
  * @throws IOException if the JSON string is invalid with respect to V1beta1ParamRef
  */
  public static V1beta1ParamRef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ParamRef.class);
  }

 /**
  * Convert an instance of V1beta1ParamRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
