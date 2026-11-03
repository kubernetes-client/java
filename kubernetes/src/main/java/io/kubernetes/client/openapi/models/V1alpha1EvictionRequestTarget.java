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
import io.kubernetes.client.openapi.models.V1alpha1EvictionRequestPodReference;
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
 * EvictionRequestTarget contains a reference to an object that should be evicted.
 */
@ApiModel(description = "EvictionRequestTarget contains a reference to an object that should be evicted.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha1EvictionRequestTarget {
  public static final String SERIALIZED_NAME_POD = "pod";
  @SerializedName(SERIALIZED_NAME_POD)
  @jakarta.annotation.Nullable
  private V1alpha1EvictionRequestPodReference pod;

  public V1alpha1EvictionRequestTarget() {
  }

  public V1alpha1EvictionRequestTarget pod(@jakarta.annotation.Nullable V1alpha1EvictionRequestPodReference pod) {
    this.pod = pod;
    return this;
  }

  /**
   * Get pod
   * @return pod
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1EvictionRequestPodReference getPod() {
    return pod;
  }

  public void setPod(@jakarta.annotation.Nullable V1alpha1EvictionRequestPodReference pod) {
    this.pod = pod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1EvictionRequestTarget v1alpha1EvictionRequestTarget = (V1alpha1EvictionRequestTarget) o;
    return Objects.equals(this.pod, v1alpha1EvictionRequestTarget.pod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1EvictionRequestTarget {\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("pod"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1EvictionRequestTarget
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1EvictionRequestTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha1EvictionRequestTarget is not found in the empty JSON string", V1alpha1EvictionRequestTarget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1EvictionRequestTarget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha1EvictionRequestTarget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pod`
      if (jsonObj.get("pod") != null && !jsonObj.get("pod").isJsonNull()) {
        V1alpha1EvictionRequestPodReference.validateJsonElement(jsonObj.get("pod"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1EvictionRequestTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1EvictionRequestTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1EvictionRequestTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1EvictionRequestTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1EvictionRequestTarget>() {
           @Override
           public void write(JsonWriter out, V1alpha1EvictionRequestTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1EvictionRequestTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1EvictionRequestTarget given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1EvictionRequestTarget
   * @throws IOException if the JSON string is invalid with respect to V1alpha1EvictionRequestTarget
   */
  public static V1alpha1EvictionRequestTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1EvictionRequestTarget.class);
  }

  /**
   * Convert an instance of V1alpha1EvictionRequestTarget to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
