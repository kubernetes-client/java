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
import io.kubernetes.client.openapi.models.V1LoadBalancerIngress;
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
 * LoadBalancerStatus represents the status of a load-balancer.
 */
@ApiModel(description = "LoadBalancerStatus represents the status of a load-balancer.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LoadBalancerStatus {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  @jakarta.annotation.Nullable
  private List<V1LoadBalancerIngress> ingress = new ArrayList<>();

  public V1LoadBalancerStatus() {
  }

  public V1LoadBalancerStatus ingress(@jakarta.annotation.Nullable List<V1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public V1LoadBalancerStatus addIngressItem(V1LoadBalancerIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

  /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
   * @return ingress
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.")
  public List<V1LoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(@jakarta.annotation.Nullable List<V1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LoadBalancerStatus v1LoadBalancerStatus = (V1LoadBalancerStatus) o;
    return Objects.equals(this.ingress, v1LoadBalancerStatus.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerStatus {\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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
    openapiFields.add("ingress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LoadBalancerStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LoadBalancerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LoadBalancerStatus is not found in the empty JSON string", V1LoadBalancerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LoadBalancerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LoadBalancerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ingress") != null && !jsonObj.get("ingress").isJsonNull()) {
        JsonArray jsonArrayingress = jsonObj.getAsJsonArray("ingress");
        if (jsonArrayingress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ingress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ingress` to be an array in the JSON string but got `%s`", jsonObj.get("ingress").toString()));
          }

          // validate the optional field `ingress` (array)
          for (int i = 0; i < jsonArrayingress.size(); i++) {
            V1LoadBalancerIngress.validateJsonElement(jsonArrayingress.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LoadBalancerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LoadBalancerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LoadBalancerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LoadBalancerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LoadBalancerStatus>() {
           @Override
           public void write(JsonWriter out, V1LoadBalancerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LoadBalancerStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1LoadBalancerStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1LoadBalancerStatus
   * @throws IOException if the JSON string is invalid with respect to V1LoadBalancerStatus
   */
  public static V1LoadBalancerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LoadBalancerStatus.class);
  }

  /**
   * Convert an instance of V1LoadBalancerStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
