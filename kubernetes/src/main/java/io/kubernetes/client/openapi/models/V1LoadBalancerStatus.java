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
import io.kubernetes.client.openapi.models.V1LoadBalancerIngress;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * LoadBalancerStatus represents the status of a load-balancer.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1LoadBalancerStatus {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<V1LoadBalancerIngress> ingress;

  public V1LoadBalancerStatus() {
  }

  public V1LoadBalancerStatus ingress(List<V1LoadBalancerIngress> ingress) {

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
  **/
  @jakarta.annotation.Nullable
  public List<V1LoadBalancerIngress> getIngress() {
    return ingress;
  }


  public void setIngress(List<V1LoadBalancerIngress> ingress) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1LoadBalancerStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1LoadBalancerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LoadBalancerStatus is not found in the empty JSON string", V1LoadBalancerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1LoadBalancerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LoadBalancerStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ingress") != null && !jsonObj.get("ingress").isJsonNull()) {
        JsonArray jsonArrayingress = jsonObj.getAsJsonArray("ingress");
        if (jsonArrayingress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ingress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ingress` to be an array in the JSON string but got `%s`", jsonObj.get("ingress").toString()));
          }

          // validate the optional field `ingress` (array)
          for (int i = 0; i < jsonArrayingress.size(); i++) {
            V1LoadBalancerIngress.validateJsonObject(jsonArrayingress.get(i).getAsJsonObject());
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
