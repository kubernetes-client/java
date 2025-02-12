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
import java.time.OffsetDateTime;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * LeaseCandidateSpec is a specification of a Lease.
 */
@ApiModel(description = "LeaseCandidateSpec is a specification of a Lease.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha2LeaseCandidateSpec {
  public static final String SERIALIZED_NAME_BINARY_VERSION = "binaryVersion";
  @SerializedName(SERIALIZED_NAME_BINARY_VERSION)
  private String binaryVersion;

  public static final String SERIALIZED_NAME_EMULATION_VERSION = "emulationVersion";
  @SerializedName(SERIALIZED_NAME_EMULATION_VERSION)
  private String emulationVersion;

  public static final String SERIALIZED_NAME_LEASE_NAME = "leaseName";
  @SerializedName(SERIALIZED_NAME_LEASE_NAME)
  private String leaseName;

  public static final String SERIALIZED_NAME_PING_TIME = "pingTime";
  @SerializedName(SERIALIZED_NAME_PING_TIME)
  private OffsetDateTime pingTime;

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  private OffsetDateTime renewTime;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public V1alpha2LeaseCandidateSpec() {
  }

  public V1alpha2LeaseCandidateSpec binaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
    return this;
  }

   /**
   * BinaryVersion is the binary version. It must be in a semver format without leading &#x60;v&#x60;. This field is required.
   * @return binaryVersion
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BinaryVersion is the binary version. It must be in a semver format without leading `v`. This field is required.")
  public String getBinaryVersion() {
    return binaryVersion;
  }

  public void setBinaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
  }


  public V1alpha2LeaseCandidateSpec emulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
    return this;
  }

   /**
   * EmulationVersion is the emulation version. It must be in a semver format without leading &#x60;v&#x60;. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is \&quot;OldestEmulationVersion\&quot;
   * @return emulationVersion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "EmulationVersion is the emulation version. It must be in a semver format without leading `v`. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is \"OldestEmulationVersion\"")
  public String getEmulationVersion() {
    return emulationVersion;
  }

  public void setEmulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
  }


  public V1alpha2LeaseCandidateSpec leaseName(String leaseName) {
    this.leaseName = leaseName;
    return this;
  }

   /**
   * LeaseName is the name of the lease for which this candidate is contending. This field is immutable.
   * @return leaseName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "LeaseName is the name of the lease for which this candidate is contending. This field is immutable.")
  public String getLeaseName() {
    return leaseName;
  }

  public void setLeaseName(String leaseName) {
    this.leaseName = leaseName;
  }


  public V1alpha2LeaseCandidateSpec pingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
    return this;
  }

   /**
   * PingTime is the last time that the server has requested the LeaseCandidate to renew. It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime.
   * @return pingTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PingTime is the last time that the server has requested the LeaseCandidate to renew. It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime.")
  public OffsetDateTime getPingTime() {
    return pingTime;
  }

  public void setPingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
  }


  public V1alpha2LeaseCandidateSpec renewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return this;
  }

   /**
   * RenewTime is the time that the LeaseCandidate was last updated. Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates.
   * @return renewTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "RenewTime is the time that the LeaseCandidate was last updated. Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates.")
  public OffsetDateTime getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
  }


  public V1alpha2LeaseCandidateSpec strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Strategy is the strategy that coordinated leader election will use for picking the leader. If multiple candidates for the same Lease return different strategies, the strategy provided by the candidate with the latest BinaryVersion will be used. If there is still conflict, this is a user error and coordinated leader election will not operate the Lease until resolved. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   * @return strategy
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Strategy is the strategy that coordinated leader election will use for picking the leader. If multiple candidates for the same Lease return different strategies, the strategy provided by the candidate with the latest BinaryVersion will be used. If there is still conflict, this is a user error and coordinated leader election will not operate the Lease until resolved. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2LeaseCandidateSpec v1alpha2LeaseCandidateSpec = (V1alpha2LeaseCandidateSpec) o;
    return Objects.equals(this.binaryVersion, v1alpha2LeaseCandidateSpec.binaryVersion) &&
        Objects.equals(this.emulationVersion, v1alpha2LeaseCandidateSpec.emulationVersion) &&
        Objects.equals(this.leaseName, v1alpha2LeaseCandidateSpec.leaseName) &&
        Objects.equals(this.pingTime, v1alpha2LeaseCandidateSpec.pingTime) &&
        Objects.equals(this.renewTime, v1alpha2LeaseCandidateSpec.renewTime) &&
        Objects.equals(this.strategy, v1alpha2LeaseCandidateSpec.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryVersion, emulationVersion, leaseName, pingTime, renewTime, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2LeaseCandidateSpec {\n");
    sb.append("    binaryVersion: ").append(toIndentedString(binaryVersion)).append("\n");
    sb.append("    emulationVersion: ").append(toIndentedString(emulationVersion)).append("\n");
    sb.append("    leaseName: ").append(toIndentedString(leaseName)).append("\n");
    sb.append("    pingTime: ").append(toIndentedString(pingTime)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
    openapiFields.add("binaryVersion");
    openapiFields.add("emulationVersion");
    openapiFields.add("leaseName");
    openapiFields.add("pingTime");
    openapiFields.add("renewTime");
    openapiFields.add("strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("binaryVersion");
    openapiRequiredFields.add("leaseName");
    openapiRequiredFields.add("strategy");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2LeaseCandidateSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2LeaseCandidateSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2LeaseCandidateSpec is not found in the empty JSON string", V1alpha2LeaseCandidateSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2LeaseCandidateSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2LeaseCandidateSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2LeaseCandidateSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("binaryVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `binaryVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("binaryVersion").toString()));
      }
      if ((jsonObj.get("emulationVersion") != null && !jsonObj.get("emulationVersion").isJsonNull()) && !jsonObj.get("emulationVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emulationVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emulationVersion").toString()));
      }
      if (!jsonObj.get("leaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaseName").toString()));
      }
      if (!jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2LeaseCandidateSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2LeaseCandidateSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2LeaseCandidateSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2LeaseCandidateSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2LeaseCandidateSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2LeaseCandidateSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2LeaseCandidateSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2LeaseCandidateSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2LeaseCandidateSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha2LeaseCandidateSpec
  */
  public static V1alpha2LeaseCandidateSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2LeaseCandidateSpec.class);
  }

 /**
  * Convert an instance of V1alpha2LeaseCandidateSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
