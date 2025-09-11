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
import io.kubernetes.client.openapi.models.V1DaemonEndpoint;
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
 * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 */
@ApiModel(description = "NodeDaemonEndpoints lists ports opened by daemons running on the Node.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NodeDaemonEndpoints {
  public static final String SERIALIZED_NAME_KUBELET_ENDPOINT = "kubeletEndpoint";
  @SerializedName(SERIALIZED_NAME_KUBELET_ENDPOINT)
  @jakarta.annotation.Nullable
  private V1DaemonEndpoint kubeletEndpoint;

  public V1NodeDaemonEndpoints() {
  }

  public V1NodeDaemonEndpoints kubeletEndpoint(@jakarta.annotation.Nullable V1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
    return this;
  }

  /**
   * Get kubeletEndpoint
   * @return kubeletEndpoint
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1DaemonEndpoint getKubeletEndpoint() {
    return kubeletEndpoint;
  }

  public void setKubeletEndpoint(@jakarta.annotation.Nullable V1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeDaemonEndpoints v1NodeDaemonEndpoints = (V1NodeDaemonEndpoints) o;
    return Objects.equals(this.kubeletEndpoint, v1NodeDaemonEndpoints.kubeletEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeDaemonEndpoints {\n");
    sb.append("    kubeletEndpoint: ").append(toIndentedString(kubeletEndpoint)).append("\n");
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
    openapiFields.add("kubeletEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NodeDaemonEndpoints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeDaemonEndpoints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeDaemonEndpoints is not found in the empty JSON string", V1NodeDaemonEndpoints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeDaemonEndpoints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeDaemonEndpoints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `kubeletEndpoint`
      if (jsonObj.get("kubeletEndpoint") != null && !jsonObj.get("kubeletEndpoint").isJsonNull()) {
        V1DaemonEndpoint.validateJsonElement(jsonObj.get("kubeletEndpoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeDaemonEndpoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeDaemonEndpoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeDaemonEndpoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeDaemonEndpoints.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeDaemonEndpoints>() {
           @Override
           public void write(JsonWriter out, V1NodeDaemonEndpoints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeDaemonEndpoints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NodeDaemonEndpoints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NodeDaemonEndpoints
   * @throws IOException if the JSON string is invalid with respect to V1NodeDaemonEndpoints
   */
  public static V1NodeDaemonEndpoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeDaemonEndpoints.class);
  }

  /**
   * Convert an instance of V1NodeDaemonEndpoints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
