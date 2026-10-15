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
 * CompositeDisruptionMode defines how individual entities within a composite pod group can be disrupted. Exactly one mode must be set.
 */
@ApiModel(description = "CompositeDisruptionMode defines how individual entities within a composite pod group can be disrupted. Exactly one mode must be set.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3CompositeDisruptionMode {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  @jakarta.annotation.Nullable
  private Object all;

  public static final String SERIALIZED_NAME_SINGLE = "single";
  @SerializedName(SERIALIZED_NAME_SINGLE)
  @jakarta.annotation.Nullable
  private Object single;

  public V1alpha3CompositeDisruptionMode() {
  }

  public V1alpha3CompositeDisruptionMode all(@jakarta.annotation.Nullable Object all) {
    this.all = all;
    return this;
  }

  /**
   * all specifies that all children groups can only be disrupted together.
   * @return all
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "all specifies that all children groups can only be disrupted together.")
  public Object getAll() {
    return all;
  }

  public void setAll(@jakarta.annotation.Nullable Object all) {
    this.all = all;
  }


  public V1alpha3CompositeDisruptionMode single(@jakarta.annotation.Nullable Object single) {
    this.single = single;
    return this;
  }

  /**
   * single specifies that children groups can be disrupted independently from each other.
   * @return single
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "single specifies that children groups can be disrupted independently from each other.")
  public Object getSingle() {
    return single;
  }

  public void setSingle(@jakarta.annotation.Nullable Object single) {
    this.single = single;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3CompositeDisruptionMode v1alpha3CompositeDisruptionMode = (V1alpha3CompositeDisruptionMode) o;
    return Objects.equals(this.all, v1alpha3CompositeDisruptionMode.all) &&
        Objects.equals(this.single, v1alpha3CompositeDisruptionMode.single);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, single);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3CompositeDisruptionMode {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    single: ").append(toIndentedString(single)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("all", "single"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3CompositeDisruptionMode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3CompositeDisruptionMode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3CompositeDisruptionMode is not found in the empty JSON string", V1alpha3CompositeDisruptionMode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3CompositeDisruptionMode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3CompositeDisruptionMode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3CompositeDisruptionMode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3CompositeDisruptionMode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3CompositeDisruptionMode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3CompositeDisruptionMode.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3CompositeDisruptionMode>() {
           @Override
           public void write(JsonWriter out, V1alpha3CompositeDisruptionMode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3CompositeDisruptionMode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3CompositeDisruptionMode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3CompositeDisruptionMode
   * @throws IOException if the JSON string is invalid with respect to V1alpha3CompositeDisruptionMode
   */
  public static V1alpha3CompositeDisruptionMode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3CompositeDisruptionMode.class);
  }

  /**
   * Convert an instance of V1alpha3CompositeDisruptionMode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
