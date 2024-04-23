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
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ListMeta {
  public static final String SERIALIZED_NAME_CONTINUE = "continue";
  @SerializedName(SERIALIZED_NAME_CONTINUE)
  private String _continue;

  public static final String SERIALIZED_NAME_REMAINING_ITEM_COUNT = "remainingItemCount";
  @SerializedName(SERIALIZED_NAME_REMAINING_ITEM_COUNT)
  private Long remainingItemCount;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";
  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public V1ListMeta() {
  }

  public V1ListMeta _continue(String _continue) {

    this._continue = _continue;
    return this;
  }

   /**
   * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
   * @return _continue
  **/
  @jakarta.annotation.Nullable
  public String getContinue() {
    return _continue;
  }


  public void setContinue(String _continue) {
    this._continue = _continue;
  }


  public V1ListMeta remainingItemCount(Long remainingItemCount) {

    this.remainingItemCount = remainingItemCount;
    return this;
  }

   /**
   * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
   * @return remainingItemCount
  **/
  @jakarta.annotation.Nullable
  public Long getRemainingItemCount() {
    return remainingItemCount;
  }


  public void setRemainingItemCount(Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
  }


  public V1ListMeta resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @jakarta.annotation.Nullable
  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1ListMeta selfLink(String selfLink) {

    this.selfLink = selfLink;
    return this;
  }

   /**
   * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
   * @return selfLink
  **/
  @jakarta.annotation.Nullable
  public String getSelfLink() {
    return selfLink;
  }


  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListMeta v1ListMeta = (V1ListMeta) o;
    return Objects.equals(this._continue, v1ListMeta._continue) &&
        Objects.equals(this.remainingItemCount, v1ListMeta.remainingItemCount) &&
        Objects.equals(this.resourceVersion, v1ListMeta.resourceVersion) &&
        Objects.equals(this.selfLink, v1ListMeta.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_continue, remainingItemCount, resourceVersion, selfLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListMeta {\n");
    sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
    sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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
    openapiFields.add("continue");
    openapiFields.add("remainingItemCount");
    openapiFields.add("resourceVersion");
    openapiFields.add("selfLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ListMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ListMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ListMeta is not found in the empty JSON string", V1ListMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ListMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ListMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("continue") != null && !jsonObj.get("continue").isJsonNull()) && !jsonObj.get("continue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `continue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("continue").toString()));
      }
      if ((jsonObj.get("resourceVersion") != null && !jsonObj.get("resourceVersion").isJsonNull()) && !jsonObj.get("resourceVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceVersion").toString()));
      }
      if ((jsonObj.get("selfLink") != null && !jsonObj.get("selfLink").isJsonNull()) && !jsonObj.get("selfLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selfLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selfLink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ListMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ListMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ListMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ListMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ListMeta>() {
           @Override
           public void write(JsonWriter out, V1ListMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ListMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             // Disable validation so delete API can tolerate non-status return object (graceful deletion)
             // validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ListMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ListMeta
  * @throws IOException if the JSON string is invalid with respect to V1ListMeta
  */
  public static V1ListMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ListMeta.class);
  }

 /**
  * Convert an instance of V1ListMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
