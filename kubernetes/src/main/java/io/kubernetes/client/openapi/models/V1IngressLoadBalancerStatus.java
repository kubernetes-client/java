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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * IngressLoadBalancerStatus represents the status of a load-balancer.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1IngressLoadBalancerStatus {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<V1IngressLoadBalancerIngress> ingress = new ArrayList<>();

  public V1IngressLoadBalancerStatus() {
  }

  public V1IngressLoadBalancerStatus ingress(List<V1IngressLoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public V1IngressLoadBalancerStatus addIngressItem(V1IngressLoadBalancerIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * ingress is a list containing ingress points for the load-balancer.
   * @return ingress
  **/
  @jakarta.annotation.Nullable
  public List<V1IngressLoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<V1IngressLoadBalancerIngress> ingress) {
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
    V1IngressLoadBalancerStatus v1IngressLoadBalancerStatus = (V1IngressLoadBalancerStatus) o;
    return Objects.equals(this.ingress, v1IngressLoadBalancerStatus.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressLoadBalancerStatus {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to V1IngressLoadBalancerStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1IngressLoadBalancerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressLoadBalancerStatus is not found in the empty JSON string", V1IngressLoadBalancerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1IngressLoadBalancerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressLoadBalancerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            V1IngressLoadBalancerIngress.validateJsonElement(jsonArrayingress.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressLoadBalancerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressLoadBalancerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressLoadBalancerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressLoadBalancerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressLoadBalancerStatus>() {
           @Override
           public void write(JsonWriter out, V1IngressLoadBalancerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressLoadBalancerStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1IngressLoadBalancerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1IngressLoadBalancerStatus
  * @throws IOException if the JSON string is invalid with respect to V1IngressLoadBalancerStatus
  */
  public static V1IngressLoadBalancerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressLoadBalancerStatus.class);
  }

 /**
  * Convert an instance of V1IngressLoadBalancerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
