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
import io.kubernetes.client.openapi.models.V1alpha1GangSchedulingPolicy;
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
 * PodGroupPolicy defines the scheduling configuration for a PodGroup.
 */
@ApiModel(description = "PodGroupPolicy defines the scheduling configuration for a PodGroup.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha1PodGroupPolicy {
  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  @jakarta.annotation.Nullable
  private Object basic;

  public static final String SERIALIZED_NAME_GANG = "gang";
  @SerializedName(SERIALIZED_NAME_GANG)
  @jakarta.annotation.Nullable
  private V1alpha1GangSchedulingPolicy gang;

  public V1alpha1PodGroupPolicy() {
  }

  public V1alpha1PodGroupPolicy basic(@jakarta.annotation.Nullable Object basic) {
    this.basic = basic;
    return this;
  }

  /**
   * Basic specifies that the pods in this group should be scheduled using standard Kubernetes scheduling behavior.
   * @return basic
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Basic specifies that the pods in this group should be scheduled using standard Kubernetes scheduling behavior.")
  public Object getBasic() {
    return basic;
  }

  public void setBasic(@jakarta.annotation.Nullable Object basic) {
    this.basic = basic;
  }


  public V1alpha1PodGroupPolicy gang(@jakarta.annotation.Nullable V1alpha1GangSchedulingPolicy gang) {
    this.gang = gang;
    return this;
  }

  /**
   * Get gang
   * @return gang
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1GangSchedulingPolicy getGang() {
    return gang;
  }

  public void setGang(@jakarta.annotation.Nullable V1alpha1GangSchedulingPolicy gang) {
    this.gang = gang;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodGroupPolicy v1alpha1PodGroupPolicy = (V1alpha1PodGroupPolicy) o;
    return Objects.equals(this.basic, v1alpha1PodGroupPolicy.basic) &&
        Objects.equals(this.gang, v1alpha1PodGroupPolicy.gang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, gang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodGroupPolicy {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    gang: ").append(toIndentedString(gang)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("basic", "gang"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1PodGroupPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1PodGroupPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha1PodGroupPolicy is not found in the empty JSON string", V1alpha1PodGroupPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1PodGroupPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha1PodGroupPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gang`
      if (jsonObj.get("gang") != null && !jsonObj.get("gang").isJsonNull()) {
        V1alpha1GangSchedulingPolicy.validateJsonElement(jsonObj.get("gang"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1PodGroupPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1PodGroupPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1PodGroupPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1PodGroupPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1PodGroupPolicy>() {
           @Override
           public void write(JsonWriter out, V1alpha1PodGroupPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1PodGroupPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1PodGroupPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1PodGroupPolicy
   * @throws IOException if the JSON string is invalid with respect to V1alpha1PodGroupPolicy
   */
  public static V1alpha1PodGroupPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1PodGroupPolicy.class);
  }

  /**
   * Convert an instance of V1alpha1PodGroupPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
