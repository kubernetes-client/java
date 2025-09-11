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
 * EndpointConditions represents the current condition of an endpoint.
 */
@ApiModel(description = "EndpointConditions represents the current condition of an endpoint.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1EndpointConditions {
  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  @jakarta.annotation.Nullable
  private Boolean ready;

  public static final String SERIALIZED_NAME_SERVING = "serving";
  @SerializedName(SERIALIZED_NAME_SERVING)
  @jakarta.annotation.Nullable
  private Boolean serving;

  public static final String SERIALIZED_NAME_TERMINATING = "terminating";
  @SerializedName(SERIALIZED_NAME_TERMINATING)
  @jakarta.annotation.Nullable
  private Boolean terminating;

  public V1EndpointConditions() {
  }

  public V1EndpointConditions ready(@jakarta.annotation.Nullable Boolean ready) {
    this.ready = ready;
    return this;
  }

  /**
   * ready indicates that this endpoint is ready to receive traffic, according to whatever system is managing the endpoint. A nil value should be interpreted as \&quot;true\&quot;. In general, an endpoint should be marked ready if it is serving and not terminating, though this can be overridden in some cases, such as when the associated Service has set the publishNotReadyAddresses flag.
   * @return ready
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ready indicates that this endpoint is ready to receive traffic, according to whatever system is managing the endpoint. A nil value should be interpreted as \"true\". In general, an endpoint should be marked ready if it is serving and not terminating, though this can be overridden in some cases, such as when the associated Service has set the publishNotReadyAddresses flag.")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(@jakarta.annotation.Nullable Boolean ready) {
    this.ready = ready;
  }


  public V1EndpointConditions serving(@jakarta.annotation.Nullable Boolean serving) {
    this.serving = serving;
    return this;
  }

  /**
   * serving indicates that this endpoint is able to receive traffic, according to whatever system is managing the endpoint. For endpoints backed by pods, the EndpointSlice controller will mark the endpoint as serving if the pod&#39;s Ready condition is True. A nil value should be interpreted as \&quot;true\&quot;.
   * @return serving
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "serving indicates that this endpoint is able to receive traffic, according to whatever system is managing the endpoint. For endpoints backed by pods, the EndpointSlice controller will mark the endpoint as serving if the pod's Ready condition is True. A nil value should be interpreted as \"true\".")
  public Boolean getServing() {
    return serving;
  }

  public void setServing(@jakarta.annotation.Nullable Boolean serving) {
    this.serving = serving;
  }


  public V1EndpointConditions terminating(@jakarta.annotation.Nullable Boolean terminating) {
    this.terminating = terminating;
    return this;
  }

  /**
   * terminating indicates that this endpoint is terminating. A nil value should be interpreted as \&quot;false\&quot;.
   * @return terminating
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "terminating indicates that this endpoint is terminating. A nil value should be interpreted as \"false\".")
  public Boolean getTerminating() {
    return terminating;
  }

  public void setTerminating(@jakarta.annotation.Nullable Boolean terminating) {
    this.terminating = terminating;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointConditions v1EndpointConditions = (V1EndpointConditions) o;
    return Objects.equals(this.ready, v1EndpointConditions.ready) &&
        Objects.equals(this.serving, v1EndpointConditions.serving) &&
        Objects.equals(this.terminating, v1EndpointConditions.terminating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ready, serving, terminating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointConditions {\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
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
    openapiFields.add("ready");
    openapiFields.add("serving");
    openapiFields.add("terminating");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1EndpointConditions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1EndpointConditions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EndpointConditions is not found in the empty JSON string", V1EndpointConditions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1EndpointConditions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EndpointConditions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EndpointConditions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EndpointConditions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EndpointConditions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EndpointConditions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EndpointConditions>() {
           @Override
           public void write(JsonWriter out, V1EndpointConditions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EndpointConditions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1EndpointConditions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1EndpointConditions
   * @throws IOException if the JSON string is invalid with respect to V1EndpointConditions
   */
  public static V1EndpointConditions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EndpointConditions.class);
  }

  /**
   * Convert an instance of V1EndpointConditions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
