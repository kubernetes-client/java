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
 * The ResourceClaim this DeviceToleration is attached to tolerates any taint that matches the triple &lt;key,value,effect&gt; using the matching operator &lt;operator&gt;.
 */
@ApiModel(description = "The ResourceClaim this DeviceToleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta2DeviceToleration {
  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  @jakarta.annotation.Nullable
  private String effect;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @jakarta.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  @jakarta.annotation.Nullable
  private String operator;

  public static final String SERIALIZED_NAME_TOLERATION_SECONDS = "tolerationSeconds";
  @SerializedName(SERIALIZED_NAME_TOLERATION_SECONDS)
  @jakarta.annotation.Nullable
  private Long tolerationSeconds;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @jakarta.annotation.Nullable
  private String value;

  public V1beta2DeviceToleration() {
  }

  public V1beta2DeviceToleration effect(@jakarta.annotation.Nullable String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule and NoExecute.
   * @return effect
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule and NoExecute.")
  public String getEffect() {
    return effect;
  }

  public void setEffect(@jakarta.annotation.Nullable String effect) {
    this.effect = effect;
  }


  public V1beta2DeviceToleration key(@jakarta.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys. Must be a label name.
   * @return key
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys. Must be a label name.")
  public String getKey() {
    return key;
  }

  public void setKey(@jakarta.annotation.Nullable String key) {
    this.key = key;
  }


  public V1beta2DeviceToleration operator(@jakarta.annotation.Nullable String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a ResourceClaim can tolerate all taints of a particular category.
   * @return operator
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a ResourceClaim can tolerate all taints of a particular category.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(@jakarta.annotation.Nullable String operator) {
    this.operator = operator;
  }


  public V1beta2DeviceToleration tolerationSeconds(@jakarta.annotation.Nullable Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return this;
  }

  /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system. If larger than zero, the time when the pod needs to be evicted is calculated as &lt;time when taint was adedd&gt; + &lt;toleration seconds&gt;.
   * @return tolerationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system. If larger than zero, the time when the pod needs to be evicted is calculated as <time when taint was adedd> + <toleration seconds>.")
  public Long getTolerationSeconds() {
    return tolerationSeconds;
  }

  public void setTolerationSeconds(@jakarta.annotation.Nullable Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }


  public V1beta2DeviceToleration value(@jakarta.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value must be empty, otherwise just a regular string. Must be a label value.
   * @return value
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Value is the taint value the toleration matches to. If the operator is Exists, the value must be empty, otherwise just a regular string. Must be a label value.")
  public String getValue() {
    return value;
  }

  public void setValue(@jakarta.annotation.Nullable String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceToleration v1beta2DeviceToleration = (V1beta2DeviceToleration) o;
    return Objects.equals(this.effect, v1beta2DeviceToleration.effect) &&
        Objects.equals(this.key, v1beta2DeviceToleration.key) &&
        Objects.equals(this.operator, v1beta2DeviceToleration.operator) &&
        Objects.equals(this.tolerationSeconds, v1beta2DeviceToleration.tolerationSeconds) &&
        Objects.equals(this.value, v1beta2DeviceToleration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, operator, tolerationSeconds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceToleration {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("effect");
    openapiFields.add("key");
    openapiFields.add("operator");
    openapiFields.add("tolerationSeconds");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceToleration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceToleration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2DeviceToleration is not found in the empty JSON string", V1beta2DeviceToleration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceToleration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2DeviceToleration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("effect") != null && !jsonObj.get("effect").isJsonNull()) && !jsonObj.get("effect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceToleration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceToleration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceToleration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceToleration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceToleration>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceToleration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceToleration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceToleration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceToleration
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceToleration
   */
  public static V1beta2DeviceToleration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceToleration.class);
  }

  /**
   * Convert an instance of V1beta2DeviceToleration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
