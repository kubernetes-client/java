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
 * EndpointConditions represents the current condition of an endpoint.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1EndpointConditions {
  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_SERVING = "serving";
  @SerializedName(SERIALIZED_NAME_SERVING)
  private Boolean serving;

  public static final String SERIALIZED_NAME_TERMINATING = "terminating";
  @SerializedName(SERIALIZED_NAME_TERMINATING)
  private Boolean terminating;

  public V1EndpointConditions() {
  }

  public V1EndpointConditions ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

   /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be \&quot;true\&quot; for terminating endpoints, except when the normal readiness behavior is being explicitly overridden, for example when the associated Service has set the publishNotReadyAddresses flag.
   * @return ready
  **/
  @jakarta.annotation.Nullable
  public Boolean getReady() {
    return ready;
  }


  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  public V1EndpointConditions serving(Boolean serving) {

    this.serving = serving;
    return this;
  }

   /**
   * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
   * @return serving
  **/
  @jakarta.annotation.Nullable
  public Boolean getServing() {
    return serving;
  }


  public void setServing(Boolean serving) {
    this.serving = serving;
  }


  public V1EndpointConditions terminating(Boolean terminating) {

    this.terminating = terminating;
    return this;
  }

   /**
   * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating.
   * @return terminating
  **/
  @jakarta.annotation.Nullable
  public Boolean getTerminating() {
    return terminating;
  }


  public void setTerminating(Boolean terminating) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1EndpointConditions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1EndpointConditions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EndpointConditions is not found in the empty JSON string", V1EndpointConditions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1EndpointConditions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EndpointConditions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
