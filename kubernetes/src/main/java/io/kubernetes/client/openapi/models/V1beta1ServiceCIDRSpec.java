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
 * ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1ServiceCIDRSpec {
  public static final String SERIALIZED_NAME_CIDRS = "cidrs";
  @SerializedName(SERIALIZED_NAME_CIDRS)
  private List<String> cidrs = new ArrayList<>();

  public V1beta1ServiceCIDRSpec() {
  }

  public V1beta1ServiceCIDRSpec cidrs(List<String> cidrs) {
    this.cidrs = cidrs;
    return this;
  }

  public V1beta1ServiceCIDRSpec addCidrsItem(String cidrsItem) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList<>();
    }
    this.cidrs.add(cidrsItem);
    return this;
  }

   /**
   * CIDRs defines the IP blocks in CIDR notation (e.g. \&quot;192.168.0.0/24\&quot; or \&quot;2001:db8::/64\&quot;) from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.
   * @return cidrs
  **/
  @jakarta.annotation.Nullable
  public List<String> getCidrs() {
    return cidrs;
  }

  public void setCidrs(List<String> cidrs) {
    this.cidrs = cidrs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ServiceCIDRSpec v1beta1ServiceCIDRSpec = (V1beta1ServiceCIDRSpec) o;
    return Objects.equals(this.cidrs, v1beta1ServiceCIDRSpec.cidrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ServiceCIDRSpec {\n");
    sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
    openapiFields.add("cidrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1ServiceCIDRSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1ServiceCIDRSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ServiceCIDRSpec is not found in the empty JSON string", V1beta1ServiceCIDRSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ServiceCIDRSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ServiceCIDRSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("cidrs") != null && !jsonObj.get("cidrs").isJsonNull() && !jsonObj.get("cidrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cidrs` to be an array in the JSON string but got `%s`", jsonObj.get("cidrs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ServiceCIDRSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ServiceCIDRSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ServiceCIDRSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ServiceCIDRSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ServiceCIDRSpec>() {
           @Override
           public void write(JsonWriter out, V1beta1ServiceCIDRSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ServiceCIDRSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ServiceCIDRSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ServiceCIDRSpec
  * @throws IOException if the JSON string is invalid with respect to V1beta1ServiceCIDRSpec
  */
  public static V1beta1ServiceCIDRSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ServiceCIDRSpec.class);
  }

 /**
  * Convert an instance of V1beta1ServiceCIDRSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
