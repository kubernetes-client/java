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
import io.kubernetes.client.openapi.models.V1beta2LimitResponse;
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
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:   - How are requests for this priority level limited?   - What should be done with requests that exceed the limit?
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-10T18:43:25.181149Z[Etc/UTC]")
public class V1beta2LimitedPriorityLevelConfiguration {
  public static final String SERIALIZED_NAME_ASSURED_CONCURRENCY_SHARES = "assuredConcurrencyShares";
  @SerializedName(SERIALIZED_NAME_ASSURED_CONCURRENCY_SHARES)
  private Integer assuredConcurrencyShares;

  public static final String SERIALIZED_NAME_BORROWING_LIMIT_PERCENT = "borrowingLimitPercent";
  @SerializedName(SERIALIZED_NAME_BORROWING_LIMIT_PERCENT)
  private Integer borrowingLimitPercent;

  public static final String SERIALIZED_NAME_LENDABLE_PERCENT = "lendablePercent";
  @SerializedName(SERIALIZED_NAME_LENDABLE_PERCENT)
  private Integer lendablePercent;

  public static final String SERIALIZED_NAME_LIMIT_RESPONSE = "limitResponse";
  @SerializedName(SERIALIZED_NAME_LIMIT_RESPONSE)
  private V1beta2LimitResponse limitResponse;

  public V1beta2LimitedPriorityLevelConfiguration() {
  }

  public V1beta2LimitedPriorityLevelConfiguration assuredConcurrencyShares(Integer assuredConcurrencyShares) {

    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return this;
  }

   /**
   * &#x60;assuredConcurrencyShares&#x60; (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) &#x3D; ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
   * @return assuredConcurrencyShares
  **/
  @jakarta.annotation.Nullable
  public Integer getAssuredConcurrencyShares() {
    return assuredConcurrencyShares;
  }


  public void setAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
  }


  public V1beta2LimitedPriorityLevelConfiguration borrowingLimitPercent(Integer borrowingLimitPercent) {

    this.borrowingLimitPercent = borrowingLimitPercent;
    return this;
  }

   /**
   * &#x60;borrowingLimitPercent&#x60;, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.  BorrowingCL(i) &#x3D; round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )  The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left &#x60;nil&#x60;, the limit is effectively infinite.
   * @return borrowingLimitPercent
  **/
  @jakarta.annotation.Nullable
  public Integer getBorrowingLimitPercent() {
    return borrowingLimitPercent;
  }


  public void setBorrowingLimitPercent(Integer borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
  }


  public V1beta2LimitedPriorityLevelConfiguration lendablePercent(Integer lendablePercent) {

    this.lendablePercent = lendablePercent;
    return this;
  }

   /**
   * &#x60;lendablePercent&#x60; prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) &#x3D; round( NominalCL(i) * lendablePercent(i)/100.0 )
   * @return lendablePercent
  **/
  @jakarta.annotation.Nullable
  public Integer getLendablePercent() {
    return lendablePercent;
  }


  public void setLendablePercent(Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
  }


  public V1beta2LimitedPriorityLevelConfiguration limitResponse(V1beta2LimitResponse limitResponse) {

    this.limitResponse = limitResponse;
    return this;
  }

   /**
   * Get limitResponse
   * @return limitResponse
  **/
  @jakarta.annotation.Nullable
  public V1beta2LimitResponse getLimitResponse() {
    return limitResponse;
  }


  public void setLimitResponse(V1beta2LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2LimitedPriorityLevelConfiguration v1beta2LimitedPriorityLevelConfiguration = (V1beta2LimitedPriorityLevelConfiguration) o;
    return Objects.equals(this.assuredConcurrencyShares, v1beta2LimitedPriorityLevelConfiguration.assuredConcurrencyShares) &&
        Objects.equals(this.borrowingLimitPercent, v1beta2LimitedPriorityLevelConfiguration.borrowingLimitPercent) &&
        Objects.equals(this.lendablePercent, v1beta2LimitedPriorityLevelConfiguration.lendablePercent) &&
        Objects.equals(this.limitResponse, v1beta2LimitedPriorityLevelConfiguration.limitResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assuredConcurrencyShares, borrowingLimitPercent, lendablePercent, limitResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2LimitedPriorityLevelConfiguration {\n");
    sb.append("    assuredConcurrencyShares: ").append(toIndentedString(assuredConcurrencyShares)).append("\n");
    sb.append("    borrowingLimitPercent: ").append(toIndentedString(borrowingLimitPercent)).append("\n");
    sb.append("    lendablePercent: ").append(toIndentedString(lendablePercent)).append("\n");
    sb.append("    limitResponse: ").append(toIndentedString(limitResponse)).append("\n");
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
    openapiFields.add("assuredConcurrencyShares");
    openapiFields.add("borrowingLimitPercent");
    openapiFields.add("lendablePercent");
    openapiFields.add("limitResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta2LimitedPriorityLevelConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta2LimitedPriorityLevelConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2LimitedPriorityLevelConfiguration is not found in the empty JSON string", V1beta2LimitedPriorityLevelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta2LimitedPriorityLevelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2LimitedPriorityLevelConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `limitResponse`
      if (jsonObj.get("limitResponse") != null && !jsonObj.get("limitResponse").isJsonNull()) {
        V1beta2LimitResponse.validateJsonObject(jsonObj.getAsJsonObject("limitResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2LimitedPriorityLevelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2LimitedPriorityLevelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2LimitedPriorityLevelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2LimitedPriorityLevelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2LimitedPriorityLevelConfiguration>() {
           @Override
           public void write(JsonWriter out, V1beta2LimitedPriorityLevelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2LimitedPriorityLevelConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta2LimitedPriorityLevelConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta2LimitedPriorityLevelConfiguration
  * @throws IOException if the JSON string is invalid with respect to V1beta2LimitedPriorityLevelConfiguration
  */
  public static V1beta2LimitedPriorityLevelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2LimitedPriorityLevelConfiguration.class);
  }

 /**
  * Convert an instance of V1beta2LimitedPriorityLevelConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
