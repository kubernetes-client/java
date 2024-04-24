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
import io.kubernetes.client.openapi.models.V1ConfigMapKeySelector;
import io.kubernetes.client.openapi.models.V1ObjectFieldSelector;
import io.kubernetes.client.openapi.models.V1ResourceFieldSelector;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
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
 * EnvVarSource represents a source for the value of an EnvVar.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1EnvVarSource {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1ConfigMapKeySelector configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1ObjectFieldSelector fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1ResourceFieldSelector resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1SecretKeySelector secretKeyRef;

  public V1EnvVarSource() {
  }

  public V1EnvVarSource configMapKeyRef(V1ConfigMapKeySelector configMapKeyRef) {

    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1EnvVarSource fieldRef(V1ObjectFieldSelector fieldRef) {

    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @jakarta.annotation.Nullable
  public V1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1EnvVarSource resourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {

    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @jakarta.annotation.Nullable
  public V1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  public V1EnvVarSource secretKeyRef(V1SecretKeySelector secretKeyRef) {

    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EnvVarSource v1EnvVarSource = (V1EnvVarSource) o;
    return Objects.equals(this.configMapKeyRef, v1EnvVarSource.configMapKeyRef) &&
        Objects.equals(this.fieldRef, v1EnvVarSource.fieldRef) &&
        Objects.equals(this.resourceFieldRef, v1EnvVarSource.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, v1EnvVarSource.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvVarSource {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
    openapiFields.add("configMapKeyRef");
    openapiFields.add("fieldRef");
    openapiFields.add("resourceFieldRef");
    openapiFields.add("secretKeyRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1EnvVarSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1EnvVarSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EnvVarSource is not found in the empty JSON string", V1EnvVarSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1EnvVarSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EnvVarSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `configMapKeyRef`
      if (jsonObj.get("configMapKeyRef") != null && !jsonObj.get("configMapKeyRef").isJsonNull()) {
        V1ConfigMapKeySelector.validateJsonObject(jsonObj.getAsJsonObject("configMapKeyRef"));
      }
      // validate the optional field `fieldRef`
      if (jsonObj.get("fieldRef") != null && !jsonObj.get("fieldRef").isJsonNull()) {
        V1ObjectFieldSelector.validateJsonObject(jsonObj.getAsJsonObject("fieldRef"));
      }
      // validate the optional field `resourceFieldRef`
      if (jsonObj.get("resourceFieldRef") != null && !jsonObj.get("resourceFieldRef").isJsonNull()) {
        V1ResourceFieldSelector.validateJsonObject(jsonObj.getAsJsonObject("resourceFieldRef"));
      }
      // validate the optional field `secretKeyRef`
      if (jsonObj.get("secretKeyRef") != null && !jsonObj.get("secretKeyRef").isJsonNull()) {
        V1SecretKeySelector.validateJsonObject(jsonObj.getAsJsonObject("secretKeyRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EnvVarSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EnvVarSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EnvVarSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EnvVarSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EnvVarSource>() {
           @Override
           public void write(JsonWriter out, V1EnvVarSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EnvVarSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1EnvVarSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1EnvVarSource
  * @throws IOException if the JSON string is invalid with respect to V1EnvVarSource
  */
  public static V1EnvVarSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EnvVarSource.class);
  }

 /**
  * Convert an instance of V1EnvVarSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
