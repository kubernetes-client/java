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
 * EvictionResponder allows you to specify the responder reacting to an Eviction. Responders should observe and communicate through the Eviction Resource API to help with the graceful eviction of a target (e.g. termination of a pod).
 */
@ApiModel(description = "EvictionResponder allows you to specify the responder reacting to an Eviction. Responders should observe and communicate through the Eviction Resource API to help with the graceful eviction of a target (e.g. termination of a pod).")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1EvictionResponder {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @jakarta.annotation.Nonnull
  private Integer priority;

  public V1EvictionResponder() {
  }

  public V1EvictionResponder name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * name allows you to identify the responder responding to the Eviction.  It must be a valid domain-prefixed key (such as \&quot;acme.io/foo\&quot;). Domain names *.k8s.io and *.kubernetes.io are reserved. This field must be unique for each responder. This field is required.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "name allows you to identify the responder responding to the Eviction.  It must be a valid domain-prefixed key (such as \"acme.io/foo\"). Domain names *.k8s.io and *.kubernetes.io are reserved. This field must be unique for each responder. This field is required.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1EvictionResponder priority(@jakarta.annotation.Nonnull Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * priority for this responder. Higher priorities are selected first by the evictionrequest-controller. If there are responders with the same priority, the responder whose domain name comes first in the alphabetical higher domain order, will be picked. This means that the top domain labels are compared alphabetically first, followed by the lower domain labels. The key is compared last.  The responder that is the managing controller of the pod should set the value of this field to 10000 to allow both for preemption or fallback registration by other responders.  The minimum value is 0 and the maximum value is 100000. The interval 0-999 is reserved for responders with *.k8s.io suffix. This field is required.
   * @return priority
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "priority for this responder. Higher priorities are selected first by the evictionrequest-controller. If there are responders with the same priority, the responder whose domain name comes first in the alphabetical higher domain order, will be picked. This means that the top domain labels are compared alphabetically first, followed by the lower domain labels. The key is compared last.  The responder that is the managing controller of the pod should set the value of this field to 10000 to allow both for preemption or fallback registration by other responders.  The minimum value is 0 and the maximum value is 100000. The interval 0-999 is reserved for responders with *.k8s.io suffix. This field is required.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(@jakarta.annotation.Nonnull Integer priority) {
    this.priority = priority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EvictionResponder v1EvictionResponder = (V1EvictionResponder) o;
    return Objects.equals(this.name, v1EvictionResponder.name) &&
        Objects.equals(this.priority, v1EvictionResponder.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EvictionResponder {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("name", "priority"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name", "priority"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1EvictionResponder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1EvictionResponder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1EvictionResponder is not found in the empty JSON string", V1EvictionResponder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1EvictionResponder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1EvictionResponder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1EvictionResponder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EvictionResponder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EvictionResponder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EvictionResponder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EvictionResponder.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EvictionResponder>() {
           @Override
           public void write(JsonWriter out, V1EvictionResponder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EvictionResponder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1EvictionResponder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1EvictionResponder
   * @throws IOException if the JSON string is invalid with respect to V1EvictionResponder
   */
  public static V1EvictionResponder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EvictionResponder.class);
  }

  /**
   * Convert an instance of V1EvictionResponder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
