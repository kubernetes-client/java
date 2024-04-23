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
 * SuccessPolicyRule describes rule for declaring a Job as succeeded. Each rule must have at least one of the \&quot;succeededIndexes\&quot; or \&quot;succeededCount\&quot; specified.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1SuccessPolicyRule {
  public static final String SERIALIZED_NAME_SUCCEEDED_COUNT = "succeededCount";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED_COUNT)
  private Integer succeededCount;

  public static final String SERIALIZED_NAME_SUCCEEDED_INDEXES = "succeededIndexes";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED_INDEXES)
  private String succeededIndexes;

  public V1SuccessPolicyRule() {
  }

  public V1SuccessPolicyRule succeededCount(Integer succeededCount) {

    this.succeededCount = succeededCount;
    return this;
  }

   /**
   * succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is \&quot;1-4\&quot;, succeededCount is \&quot;3\&quot;, and completed indexes are \&quot;1\&quot;, \&quot;3\&quot;, and \&quot;5\&quot;, the Job isn&#39;t declared as succeeded because only \&quot;1\&quot; and \&quot;3\&quot; indexes are considered in that rules. When this field is null, this doesn&#39;t default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
   * @return succeededCount
  **/
  @jakarta.annotation.Nullable
  public Integer getSucceededCount() {
    return succeededCount;
  }


  public void setSucceededCount(Integer succeededCount) {
    this.succeededCount = succeededCount;
  }


  public V1SuccessPolicyRule succeededIndexes(String succeededIndexes) {

    this.succeededIndexes = succeededIndexes;
    return this;
  }

   /**
   * succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to \&quot;.spec.completions-1\&quot; and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;. When this field is null, this field doesn&#39;t default to any value and is never evaluated at any time.
   * @return succeededIndexes
  **/
  @jakarta.annotation.Nullable
  public String getSucceededIndexes() {
    return succeededIndexes;
  }


  public void setSucceededIndexes(String succeededIndexes) {
    this.succeededIndexes = succeededIndexes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SuccessPolicyRule v1SuccessPolicyRule = (V1SuccessPolicyRule) o;
    return Objects.equals(this.succeededCount, v1SuccessPolicyRule.succeededCount) &&
        Objects.equals(this.succeededIndexes, v1SuccessPolicyRule.succeededIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeededCount, succeededIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SuccessPolicyRule {\n");
    sb.append("    succeededCount: ").append(toIndentedString(succeededCount)).append("\n");
    sb.append("    succeededIndexes: ").append(toIndentedString(succeededIndexes)).append("\n");
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
    openapiFields.add("succeededCount");
    openapiFields.add("succeededIndexes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1SuccessPolicyRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1SuccessPolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SuccessPolicyRule is not found in the empty JSON string", V1SuccessPolicyRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1SuccessPolicyRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SuccessPolicyRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("succeededIndexes") != null && !jsonObj.get("succeededIndexes").isJsonNull()) && !jsonObj.get("succeededIndexes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `succeededIndexes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("succeededIndexes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SuccessPolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SuccessPolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SuccessPolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SuccessPolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SuccessPolicyRule>() {
           @Override
           public void write(JsonWriter out, V1SuccessPolicyRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SuccessPolicyRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1SuccessPolicyRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1SuccessPolicyRule
  * @throws IOException if the JSON string is invalid with respect to V1SuccessPolicyRule
  */
  public static V1SuccessPolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SuccessPolicyRule.class);
  }

 /**
  * Convert an instance of V1SuccessPolicyRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
