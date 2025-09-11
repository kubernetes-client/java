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
import io.kubernetes.client.openapi.models.V1beta2DeviceSubRequest;
import io.kubernetes.client.openapi.models.V1beta2ExactDeviceRequest;
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
 * DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices. With FirstAvailable it is also possible to provide a prioritized list of requests.
 */
@ApiModel(description = "DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices. With FirstAvailable it is also possible to provide a prioritized list of requests.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta2DeviceRequest {
  public static final String SERIALIZED_NAME_EXACTLY = "exactly";
  @SerializedName(SERIALIZED_NAME_EXACTLY)
  @jakarta.annotation.Nullable
  private V1beta2ExactDeviceRequest exactly;

  public static final String SERIALIZED_NAME_FIRST_AVAILABLE = "firstAvailable";
  @SerializedName(SERIALIZED_NAME_FIRST_AVAILABLE)
  @jakarta.annotation.Nullable
  private List<V1beta2DeviceSubRequest> firstAvailable = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public V1beta2DeviceRequest() {
  }

  public V1beta2DeviceRequest exactly(@jakarta.annotation.Nullable V1beta2ExactDeviceRequest exactly) {
    this.exactly = exactly;
    return this;
  }

  /**
   * Get exactly
   * @return exactly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2ExactDeviceRequest getExactly() {
    return exactly;
  }

  public void setExactly(@jakarta.annotation.Nullable V1beta2ExactDeviceRequest exactly) {
    this.exactly = exactly;
  }


  public V1beta2DeviceRequest firstAvailable(@jakarta.annotation.Nullable List<V1beta2DeviceSubRequest> firstAvailable) {
    this.firstAvailable = firstAvailable;
    return this;
  }

  public V1beta2DeviceRequest addFirstAvailableItem(V1beta2DeviceSubRequest firstAvailableItem) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList<>();
    }
    this.firstAvailable.add(firstAvailableItem);
    return this;
  }

  /**
   * FirstAvailable contains subrequests, of which exactly one will be selected by the scheduler. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one can not be used.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.
   * @return firstAvailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FirstAvailable contains subrequests, of which exactly one will be selected by the scheduler. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one can not be used.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.")
  public List<V1beta2DeviceSubRequest> getFirstAvailable() {
    return firstAvailable;
  }

  public void setFirstAvailable(@jakarta.annotation.Nullable List<V1beta2DeviceSubRequest> firstAvailable) {
    this.firstAvailable = firstAvailable;
  }


  public V1beta2DeviceRequest name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  References using the name in the DeviceRequest will uniquely identify a request when the Exactly field is set. When the FirstAvailable field is set, a reference to the name of the DeviceRequest will match whatever subrequest is chosen by the scheduler.  Must be a DNS label.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  References using the name in the DeviceRequest will uniquely identify a request when the Exactly field is set. When the FirstAvailable field is set, a reference to the name of the DeviceRequest will match whatever subrequest is chosen by the scheduler.  Must be a DNS label.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceRequest v1beta2DeviceRequest = (V1beta2DeviceRequest) o;
    return Objects.equals(this.exactly, v1beta2DeviceRequest.exactly) &&
        Objects.equals(this.firstAvailable, v1beta2DeviceRequest.firstAvailable) &&
        Objects.equals(this.name, v1beta2DeviceRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exactly, firstAvailable, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceRequest {\n");
    sb.append("    exactly: ").append(toIndentedString(exactly)).append("\n");
    sb.append("    firstAvailable: ").append(toIndentedString(firstAvailable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("exactly");
    openapiFields.add("firstAvailable");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2DeviceRequest is not found in the empty JSON string", V1beta2DeviceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2DeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2DeviceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exactly`
      if (jsonObj.get("exactly") != null && !jsonObj.get("exactly").isJsonNull()) {
        V1beta2ExactDeviceRequest.validateJsonElement(jsonObj.get("exactly"));
      }
      if (jsonObj.get("firstAvailable") != null && !jsonObj.get("firstAvailable").isJsonNull()) {
        JsonArray jsonArrayfirstAvailable = jsonObj.getAsJsonArray("firstAvailable");
        if (jsonArrayfirstAvailable != null) {
          // ensure the json data is an array
          if (!jsonObj.get("firstAvailable").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `firstAvailable` to be an array in the JSON string but got `%s`", jsonObj.get("firstAvailable").toString()));
          }

          // validate the optional field `firstAvailable` (array)
          for (int i = 0; i < jsonArrayfirstAvailable.size(); i++) {
            V1beta2DeviceSubRequest.validateJsonElement(jsonArrayfirstAvailable.get(i));
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceRequest>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceRequest
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceRequest
   */
  public static V1beta2DeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceRequest.class);
  }

  /**
   * Convert an instance of V1beta2DeviceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
