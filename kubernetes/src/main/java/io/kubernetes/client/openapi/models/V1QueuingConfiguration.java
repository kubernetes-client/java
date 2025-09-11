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
 * QueuingConfiguration holds the configuration parameters for queuing
 */
@ApiModel(description = "QueuingConfiguration holds the configuration parameters for queuing")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1QueuingConfiguration {
  public static final String SERIALIZED_NAME_HAND_SIZE = "handSize";
  @SerializedName(SERIALIZED_NAME_HAND_SIZE)
  @jakarta.annotation.Nullable
  private Integer handSize;

  public static final String SERIALIZED_NAME_QUEUE_LENGTH_LIMIT = "queueLengthLimit";
  @SerializedName(SERIALIZED_NAME_QUEUE_LENGTH_LIMIT)
  @jakarta.annotation.Nullable
  private Integer queueLengthLimit;

  public static final String SERIALIZED_NAME_QUEUES = "queues";
  @SerializedName(SERIALIZED_NAME_QUEUES)
  @jakarta.annotation.Nullable
  private Integer queues;

  public V1QueuingConfiguration() {
  }

  public V1QueuingConfiguration handSize(@jakarta.annotation.Nullable Integer handSize) {
    this.handSize = handSize;
    return this;
  }

  /**
   * &#x60;handSize&#x60; is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. &#x60;handSize&#x60; must be no larger than &#x60;queues&#x60;, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
   * @return handSize
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.")
  public Integer getHandSize() {
    return handSize;
  }

  public void setHandSize(@jakarta.annotation.Nullable Integer handSize) {
    this.handSize = handSize;
  }


  public V1QueuingConfiguration queueLengthLimit(@jakarta.annotation.Nullable Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
    return this;
  }

  /**
   * &#x60;queueLengthLimit&#x60; is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
   * @return queueLengthLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.")
  public Integer getQueueLengthLimit() {
    return queueLengthLimit;
  }

  public void setQueueLengthLimit(@jakarta.annotation.Nullable Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
  }


  public V1QueuingConfiguration queues(@jakarta.annotation.Nullable Integer queues) {
    this.queues = queues;
    return this;
  }

  /**
   * &#x60;queues&#x60; is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
   * @return queues
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.")
  public Integer getQueues() {
    return queues;
  }

  public void setQueues(@jakarta.annotation.Nullable Integer queues) {
    this.queues = queues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1QueuingConfiguration v1QueuingConfiguration = (V1QueuingConfiguration) o;
    return Objects.equals(this.handSize, v1QueuingConfiguration.handSize) &&
        Objects.equals(this.queueLengthLimit, v1QueuingConfiguration.queueLengthLimit) &&
        Objects.equals(this.queues, v1QueuingConfiguration.queues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handSize, queueLengthLimit, queues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QueuingConfiguration {\n");
    sb.append("    handSize: ").append(toIndentedString(handSize)).append("\n");
    sb.append("    queueLengthLimit: ").append(toIndentedString(queueLengthLimit)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
    openapiFields.add("handSize");
    openapiFields.add("queueLengthLimit");
    openapiFields.add("queues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1QueuingConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1QueuingConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1QueuingConfiguration is not found in the empty JSON string", V1QueuingConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1QueuingConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1QueuingConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1QueuingConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1QueuingConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1QueuingConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1QueuingConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1QueuingConfiguration>() {
           @Override
           public void write(JsonWriter out, V1QueuingConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1QueuingConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1QueuingConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1QueuingConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1QueuingConfiguration
   */
  public static V1QueuingConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1QueuingConfiguration.class);
  }

  /**
   * Convert an instance of V1QueuingConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
