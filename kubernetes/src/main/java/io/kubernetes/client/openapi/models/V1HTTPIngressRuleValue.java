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
import io.kubernetes.client.openapi.models.V1HTTPIngressPath;
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

import io.kubernetes.client.openapi.JSON;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://&lt;host&gt;/&lt;path&gt;?&lt;searchpart&gt; -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 */
@ApiModel(description = "HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1HTTPIngressRuleValue {
  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  @jakarta.annotation.Nonnull
  private List<V1HTTPIngressPath> paths = new ArrayList<>();

  public V1HTTPIngressRuleValue() {
  }

  public V1HTTPIngressRuleValue paths(@jakarta.annotation.Nonnull List<V1HTTPIngressPath> paths) {
    this.paths = paths;
    return this;
  }

  public V1HTTPIngressRuleValue addPathsItem(V1HTTPIngressPath pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * paths is a collection of paths that map requests to backends.
   * @return paths
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "paths is a collection of paths that map requests to backends.")
  public List<V1HTTPIngressPath> getPaths() {
    return paths;
  }

  public void setPaths(@jakarta.annotation.Nonnull List<V1HTTPIngressPath> paths) {
    this.paths = paths;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPIngressRuleValue v1HTTPIngressRuleValue = (V1HTTPIngressRuleValue) o;
    return Objects.equals(this.paths, v1HTTPIngressRuleValue.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPIngressRuleValue {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
    openapiFields.add("paths");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("paths");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1HTTPIngressRuleValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1HTTPIngressRuleValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HTTPIngressRuleValue is not found in the empty JSON string", V1HTTPIngressRuleValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1HTTPIngressRuleValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HTTPIngressRuleValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1HTTPIngressRuleValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("paths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paths` to be an array in the JSON string but got `%s`", jsonObj.get("paths").toString()));
      }

      JsonArray jsonArraypaths = jsonObj.getAsJsonArray("paths");
      // validate the required field `paths` (array)
      for (int i = 0; i < jsonArraypaths.size(); i++) {
        V1HTTPIngressPath.validateJsonElement(jsonArraypaths.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1HTTPIngressRuleValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1HTTPIngressRuleValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1HTTPIngressRuleValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1HTTPIngressRuleValue.class));

       return (TypeAdapter<T>) new TypeAdapter<V1HTTPIngressRuleValue>() {
           @Override
           public void write(JsonWriter out, V1HTTPIngressRuleValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1HTTPIngressRuleValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1HTTPIngressRuleValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1HTTPIngressRuleValue
   * @throws IOException if the JSON string is invalid with respect to V1HTTPIngressRuleValue
   */
  public static V1HTTPIngressRuleValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1HTTPIngressRuleValue.class);
  }

  /**
   * Convert an instance of V1HTTPIngressRuleValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
