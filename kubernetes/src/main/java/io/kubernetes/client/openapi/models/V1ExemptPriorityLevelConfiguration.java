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
 * ExemptPriorityLevelConfiguration describes the configurable aspects of the handling of exempt requests. In the mandatory exempt configuration object the values in the fields here can be modified by authorized users, unlike the rest of the &#x60;spec&#x60;.
 */
@ApiModel(description = "ExemptPriorityLevelConfiguration describes the configurable aspects of the handling of exempt requests. In the mandatory exempt configuration object the values in the fields here can be modified by authorized users, unlike the rest of the `spec`.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ExemptPriorityLevelConfiguration {
  public static final String SERIALIZED_NAME_LENDABLE_PERCENT = "lendablePercent";
  @SerializedName(SERIALIZED_NAME_LENDABLE_PERCENT)
  @jakarta.annotation.Nullable
  private Integer lendablePercent;

  public static final String SERIALIZED_NAME_NOMINAL_CONCURRENCY_SHARES = "nominalConcurrencyShares";
  @SerializedName(SERIALIZED_NAME_NOMINAL_CONCURRENCY_SHARES)
  @jakarta.annotation.Nullable
  private Integer nominalConcurrencyShares;

  public V1ExemptPriorityLevelConfiguration() {
  }

  public V1ExemptPriorityLevelConfiguration lendablePercent(@jakarta.annotation.Nullable Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
    return this;
  }

  /**
   * &#x60;lendablePercent&#x60; prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) &#x3D; round( NominalCL(i) * lendablePercent(i)/100.0 )
   * @return lendablePercent
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`lendablePercent` prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )")
  public Integer getLendablePercent() {
    return lendablePercent;
  }

  public void setLendablePercent(@jakarta.annotation.Nullable Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
  }


  public V1ExemptPriorityLevelConfiguration nominalConcurrencyShares(@jakarta.annotation.Nullable Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return this;
  }

  /**
   * &#x60;nominalConcurrencyShares&#x60; (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:  NominalCL(i)  &#x3D; ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs &#x3D; sum[priority level k] NCS(k)  Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
   * @return nominalConcurrencyShares
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server's concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:  NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)  Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.")
  public Integer getNominalConcurrencyShares() {
    return nominalConcurrencyShares;
  }

  public void setNominalConcurrencyShares(@jakarta.annotation.Nullable Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ExemptPriorityLevelConfiguration v1ExemptPriorityLevelConfiguration = (V1ExemptPriorityLevelConfiguration) o;
    return Objects.equals(this.lendablePercent, v1ExemptPriorityLevelConfiguration.lendablePercent) &&
        Objects.equals(this.nominalConcurrencyShares, v1ExemptPriorityLevelConfiguration.nominalConcurrencyShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lendablePercent, nominalConcurrencyShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ExemptPriorityLevelConfiguration {\n");
    sb.append("    lendablePercent: ").append(toIndentedString(lendablePercent)).append("\n");
    sb.append("    nominalConcurrencyShares: ").append(toIndentedString(nominalConcurrencyShares)).append("\n");
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
    openapiFields.add("lendablePercent");
    openapiFields.add("nominalConcurrencyShares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ExemptPriorityLevelConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ExemptPriorityLevelConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ExemptPriorityLevelConfiguration is not found in the empty JSON string", V1ExemptPriorityLevelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ExemptPriorityLevelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ExemptPriorityLevelConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ExemptPriorityLevelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ExemptPriorityLevelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ExemptPriorityLevelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ExemptPriorityLevelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ExemptPriorityLevelConfiguration>() {
           @Override
           public void write(JsonWriter out, V1ExemptPriorityLevelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ExemptPriorityLevelConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ExemptPriorityLevelConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ExemptPriorityLevelConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1ExemptPriorityLevelConfiguration
   */
  public static V1ExemptPriorityLevelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ExemptPriorityLevelConfiguration.class);
  }

  /**
   * Convert an instance of V1ExemptPriorityLevelConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
