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
import io.kubernetes.client.openapi.models.V1LimitResponse;
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
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:   - How are requests for this priority level limited?   - What should be done with requests that exceed the limit?
 */
@ApiModel(description = "LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:   - How are requests for this priority level limited?   - What should be done with requests that exceed the limit?")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LimitedPriorityLevelConfiguration {
  public static final String SERIALIZED_NAME_BORROWING_LIMIT_PERCENT = "borrowingLimitPercent";
  @SerializedName(SERIALIZED_NAME_BORROWING_LIMIT_PERCENT)
  @jakarta.annotation.Nullable
  private Integer borrowingLimitPercent;

  public static final String SERIALIZED_NAME_LENDABLE_PERCENT = "lendablePercent";
  @SerializedName(SERIALIZED_NAME_LENDABLE_PERCENT)
  @jakarta.annotation.Nullable
  private Integer lendablePercent;

  public static final String SERIALIZED_NAME_LIMIT_RESPONSE = "limitResponse";
  @SerializedName(SERIALIZED_NAME_LIMIT_RESPONSE)
  @jakarta.annotation.Nullable
  private V1LimitResponse limitResponse;

  public static final String SERIALIZED_NAME_NOMINAL_CONCURRENCY_SHARES = "nominalConcurrencyShares";
  @SerializedName(SERIALIZED_NAME_NOMINAL_CONCURRENCY_SHARES)
  @jakarta.annotation.Nullable
  private Integer nominalConcurrencyShares;

  public V1LimitedPriorityLevelConfiguration() {
  }

  public V1LimitedPriorityLevelConfiguration borrowingLimitPercent(@jakarta.annotation.Nullable Integer borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
    return this;
  }

  /**
   * &#x60;borrowingLimitPercent&#x60;, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.  BorrowingCL(i) &#x3D; round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )  The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left &#x60;nil&#x60;, the limit is effectively infinite.
   * @return borrowingLimitPercent
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level's BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level's nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.  BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )  The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.")
  public Integer getBorrowingLimitPercent() {
    return borrowingLimitPercent;
  }

  public void setBorrowingLimitPercent(@jakarta.annotation.Nullable Integer borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
  }


  public V1LimitedPriorityLevelConfiguration lendablePercent(@jakarta.annotation.Nullable Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
    return this;
  }

  /**
   * &#x60;lendablePercent&#x60; prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) &#x3D; round( NominalCL(i) * lendablePercent(i)/100.0 )
   * @return lendablePercent
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`lendablePercent` prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )")
  public Integer getLendablePercent() {
    return lendablePercent;
  }

  public void setLendablePercent(@jakarta.annotation.Nullable Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
  }


  public V1LimitedPriorityLevelConfiguration limitResponse(@jakarta.annotation.Nullable V1LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
    return this;
  }

  /**
   * Get limitResponse
   * @return limitResponse
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LimitResponse getLimitResponse() {
    return limitResponse;
  }

  public void setLimitResponse(@jakarta.annotation.Nullable V1LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
  }


  public V1LimitedPriorityLevelConfiguration nominalConcurrencyShares(@jakarta.annotation.Nullable Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return this;
  }

  /**
   * &#x60;nominalConcurrencyShares&#x60; (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats available at this priority level. This is used both for requests dispatched from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The server&#39;s concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:  NominalCL(i)  &#x3D; ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs &#x3D; sum[priority level k] NCS(k)  Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level.  If not specified, this field defaults to a value of 30.  Setting this field to zero supports the construction of a \&quot;jail\&quot; for this priority level that is used to hold some request(s)
   * @return nominalConcurrencyShares
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats available at this priority level. This is used both for requests dispatched from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The server's concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:  NominalCL(i)  = ceil( ServerCL * NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)  Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level.  If not specified, this field defaults to a value of 30.  Setting this field to zero supports the construction of a \"jail\" for this priority level that is used to hold some request(s)")
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
    V1LimitedPriorityLevelConfiguration v1LimitedPriorityLevelConfiguration = (V1LimitedPriorityLevelConfiguration) o;
    return Objects.equals(this.borrowingLimitPercent, v1LimitedPriorityLevelConfiguration.borrowingLimitPercent) &&
        Objects.equals(this.lendablePercent, v1LimitedPriorityLevelConfiguration.lendablePercent) &&
        Objects.equals(this.limitResponse, v1LimitedPriorityLevelConfiguration.limitResponse) &&
        Objects.equals(this.nominalConcurrencyShares, v1LimitedPriorityLevelConfiguration.nominalConcurrencyShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borrowingLimitPercent, lendablePercent, limitResponse, nominalConcurrencyShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitedPriorityLevelConfiguration {\n");
    sb.append("    borrowingLimitPercent: ").append(toIndentedString(borrowingLimitPercent)).append("\n");
    sb.append("    lendablePercent: ").append(toIndentedString(lendablePercent)).append("\n");
    sb.append("    limitResponse: ").append(toIndentedString(limitResponse)).append("\n");
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
    openapiFields.add("borrowingLimitPercent");
    openapiFields.add("lendablePercent");
    openapiFields.add("limitResponse");
    openapiFields.add("nominalConcurrencyShares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LimitedPriorityLevelConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LimitedPriorityLevelConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LimitedPriorityLevelConfiguration is not found in the empty JSON string", V1LimitedPriorityLevelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LimitedPriorityLevelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LimitedPriorityLevelConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `limitResponse`
      if (jsonObj.get("limitResponse") != null && !jsonObj.get("limitResponse").isJsonNull()) {
        V1LimitResponse.validateJsonElement(jsonObj.get("limitResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LimitedPriorityLevelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LimitedPriorityLevelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LimitedPriorityLevelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LimitedPriorityLevelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LimitedPriorityLevelConfiguration>() {
           @Override
           public void write(JsonWriter out, V1LimitedPriorityLevelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LimitedPriorityLevelConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1LimitedPriorityLevelConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1LimitedPriorityLevelConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1LimitedPriorityLevelConfiguration
   */
  public static V1LimitedPriorityLevelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LimitedPriorityLevelConfiguration.class);
  }

  /**
   * Convert an instance of V1LimitedPriorityLevelConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
