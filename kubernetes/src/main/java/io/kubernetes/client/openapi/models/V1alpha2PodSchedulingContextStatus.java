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
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus;
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
 * PodSchedulingContextStatus describes where resources for the Pod can be allocated.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2PodSchedulingContextStatus {
  public static final String SERIALIZED_NAME_RESOURCE_CLAIMS = "resourceClaims";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIMS)
  private List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims;

  public V1alpha2PodSchedulingContextStatus() {
  }

  public V1alpha2PodSchedulingContextStatus resourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims) {

    this.resourceClaims = resourceClaims;
    return this;
  }

  public V1alpha2PodSchedulingContextStatus addResourceClaimsItem(V1alpha2ResourceClaimSchedulingStatus resourceClaimsItem) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    this.resourceClaims.add(resourceClaimsItem);
    return this;
  }

   /**
   * ResourceClaims describes resource availability for each pod.spec.resourceClaim entry where the corresponding ResourceClaim uses \&quot;WaitForFirstConsumer\&quot; allocation mode.
   * @return resourceClaims
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2ResourceClaimSchedulingStatus> getResourceClaims() {
    return resourceClaims;
  }


  public void setResourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims) {
    this.resourceClaims = resourceClaims;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodSchedulingContextStatus v1alpha2PodSchedulingContextStatus = (V1alpha2PodSchedulingContextStatus) o;
    return Objects.equals(this.resourceClaims, v1alpha2PodSchedulingContextStatus.resourceClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodSchedulingContextStatus {\n");
    sb.append("    resourceClaims: ").append(toIndentedString(resourceClaims)).append("\n");
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
    openapiFields.add("resourceClaims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2PodSchedulingContextStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2PodSchedulingContextStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2PodSchedulingContextStatus is not found in the empty JSON string", V1alpha2PodSchedulingContextStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2PodSchedulingContextStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2PodSchedulingContextStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("resourceClaims") != null && !jsonObj.get("resourceClaims").isJsonNull()) {
        JsonArray jsonArrayresourceClaims = jsonObj.getAsJsonArray("resourceClaims");
        if (jsonArrayresourceClaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceClaims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceClaims` to be an array in the JSON string but got `%s`", jsonObj.get("resourceClaims").toString()));
          }

          // validate the optional field `resourceClaims` (array)
          for (int i = 0; i < jsonArrayresourceClaims.size(); i++) {
            V1alpha2ResourceClaimSchedulingStatus.validateJsonObject(jsonArrayresourceClaims.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2PodSchedulingContextStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2PodSchedulingContextStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2PodSchedulingContextStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2PodSchedulingContextStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2PodSchedulingContextStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha2PodSchedulingContextStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2PodSchedulingContextStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2PodSchedulingContextStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2PodSchedulingContextStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha2PodSchedulingContextStatus
  */
  public static V1alpha2PodSchedulingContextStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2PodSchedulingContextStatus.class);
  }

 /**
  * Convert an instance of V1alpha2PodSchedulingContextStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
