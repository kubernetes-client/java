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
 * DeviceConstraint must have exactly one field set besides Requests.
 */
@ApiModel(description = "DeviceConstraint must have exactly one field set besides Requests.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DeviceConstraint {
  public static final String SERIALIZED_NAME_DISTINCT_ATTRIBUTE = "distinctAttribute";
  @SerializedName(SERIALIZED_NAME_DISTINCT_ATTRIBUTE)
  @jakarta.annotation.Nullable
  private String distinctAttribute;

  public static final String SERIALIZED_NAME_MATCH_ATTRIBUTE = "matchAttribute";
  @SerializedName(SERIALIZED_NAME_MATCH_ATTRIBUTE)
  @jakarta.annotation.Nullable
  private String matchAttribute;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  @jakarta.annotation.Nullable
  private List<String> requests = new ArrayList<>();

  public V1DeviceConstraint() {
  }

  public V1DeviceConstraint distinctAttribute(@jakarta.annotation.Nullable String distinctAttribute) {
    this.distinctAttribute = distinctAttribute;
    return this;
  }

  /**
   * DistinctAttribute requires that all devices in question have this attribute and that its type and value are unique across those devices.  This acts as the inverse of MatchAttribute.  This constraint is used to avoid allocating multiple requests to the same device by ensuring attribute-level differentiation.  This is useful for scenarios where resource requests must be fulfilled by separate physical devices. For example, a container requests two network interfaces that must be allocated from two different physical NICs.
   * @return distinctAttribute
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "DistinctAttribute requires that all devices in question have this attribute and that its type and value are unique across those devices.  This acts as the inverse of MatchAttribute.  This constraint is used to avoid allocating multiple requests to the same device by ensuring attribute-level differentiation.  This is useful for scenarios where resource requests must be fulfilled by separate physical devices. For example, a container requests two network interfaces that must be allocated from two different physical NICs.")
  public String getDistinctAttribute() {
    return distinctAttribute;
  }

  public void setDistinctAttribute(@jakarta.annotation.Nullable String distinctAttribute) {
    this.distinctAttribute = distinctAttribute;
  }


  public V1DeviceConstraint matchAttribute(@jakarta.annotation.Nullable String matchAttribute) {
    this.matchAttribute = matchAttribute;
    return this;
  }

  /**
   * MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.  For example, if you specified \&quot;dra.example.com/numa\&quot; (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn&#39;t, then it also will not be chosen.  Must include the domain qualifier.
   * @return matchAttribute
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.  For example, if you specified \"dra.example.com/numa\" (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn't, then it also will not be chosen.  Must include the domain qualifier.")
  public String getMatchAttribute() {
    return matchAttribute;
  }

  public void setMatchAttribute(@jakarta.annotation.Nullable String matchAttribute) {
    this.matchAttribute = matchAttribute;
  }


  public V1DeviceConstraint requests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
    return this;
  }

  public V1DeviceConstraint addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Requests is a list of the one or more requests in this claim which must co-satisfy this constraint. If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.  References to subrequests must include the name of the main request and may include the subrequest using the format &lt;main request&gt;[/&lt;subrequest&gt;]. If just the main request is given, the constraint applies to all subrequests.
   * @return requests
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Requests is a list of the one or more requests in this claim which must co-satisfy this constraint. If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.  References to subrequests must include the name of the main request and may include the subrequest using the format <main request>[/<subrequest>]. If just the main request is given, the constraint applies to all subrequests.")
  public List<String> getRequests() {
    return requests;
  }

  public void setRequests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceConstraint v1DeviceConstraint = (V1DeviceConstraint) o;
    return Objects.equals(this.distinctAttribute, v1DeviceConstraint.distinctAttribute) &&
        Objects.equals(this.matchAttribute, v1DeviceConstraint.matchAttribute) &&
        Objects.equals(this.requests, v1DeviceConstraint.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctAttribute, matchAttribute, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceConstraint {\n");
    sb.append("    distinctAttribute: ").append(toIndentedString(distinctAttribute)).append("\n");
    sb.append("    matchAttribute: ").append(toIndentedString(matchAttribute)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("distinctAttribute");
    openapiFields.add("matchAttribute");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeviceConstraint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeviceConstraint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeviceConstraint is not found in the empty JSON string", V1DeviceConstraint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeviceConstraint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeviceConstraint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("distinctAttribute") != null && !jsonObj.get("distinctAttribute").isJsonNull()) && !jsonObj.get("distinctAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distinctAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distinctAttribute").toString()));
      }
      if ((jsonObj.get("matchAttribute") != null && !jsonObj.get("matchAttribute").isJsonNull()) && !jsonObj.get("matchAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchAttribute").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull() && !jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeviceConstraint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeviceConstraint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeviceConstraint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeviceConstraint.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeviceConstraint>() {
           @Override
           public void write(JsonWriter out, V1DeviceConstraint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeviceConstraint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeviceConstraint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeviceConstraint
   * @throws IOException if the JSON string is invalid with respect to V1DeviceConstraint
   */
  public static V1DeviceConstraint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeviceConstraint.class);
  }

  /**
   * Convert an instance of V1DeviceConstraint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
