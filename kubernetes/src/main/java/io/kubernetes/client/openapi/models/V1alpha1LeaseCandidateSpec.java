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
import java.time.OffsetDateTime;
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
 * LeaseCandidateSpec is a specification of a Lease.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1LeaseCandidateSpec {
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

  public static final String SERIALIZED_NAME_PREFERRED_STRATEGIES = "preferredStrategies";
  @SerializedName(SERIALIZED_NAME_PREFERRED_STRATEGIES)
  private List<String> preferredStrategies = new ArrayList<>();

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  private OffsetDateTime renewTime;

  public V1alpha1LeaseCandidateSpec() {
  }

  public V1alpha1LeaseCandidateSpec binaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
    return this;
  }

   /**
   * BinaryVersion is the binary version. It must be in a semver format without leading &#x60;v&#x60;. This field is required when strategy is \&quot;OldestEmulationVersion\&quot;
   * @return binaryVersion
  **/
  @jakarta.annotation.Nullable
  public String getBinaryVersion() {
    return binaryVersion;
  }

  public void setBinaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
  }


  public V1alpha1LeaseCandidateSpec emulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
    return this;
  }

   /**
   * EmulationVersion is the emulation version. It must be in a semver format without leading &#x60;v&#x60;. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is \&quot;OldestEmulationVersion\&quot;
   * @return emulationVersion
  **/
  @jakarta.annotation.Nullable
  public String getEmulationVersion() {
    return emulationVersion;
  }

  public void setEmulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
  }


  public V1alpha1LeaseCandidateSpec leaseName(String leaseName) {
    this.leaseName = leaseName;
    return this;
  }

   /**
   * LeaseName is the name of the lease for which this candidate is contending. This field is immutable.
   * @return leaseName
  **/
  @jakarta.annotation.Nonnull
  public String getLeaseName() {
    return leaseName;
  }

  public void setLeaseName(String leaseName) {
    this.leaseName = leaseName;
  }


  public V1alpha1LeaseCandidateSpec pingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
    return this;
  }

   /**
   * PingTime is the last time that the server has requested the LeaseCandidate to renew. It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime.
   * @return pingTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getPingTime() {
    return pingTime;
  }

  public void setPingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
  }


  public V1alpha1LeaseCandidateSpec preferredStrategies(List<String> preferredStrategies) {
    this.preferredStrategies = preferredStrategies;
    return this;
  }

  public V1alpha1LeaseCandidateSpec addPreferredStrategiesItem(String preferredStrategiesItem) {
    if (this.preferredStrategies == null) {
      this.preferredStrategies = new ArrayList<>();
    }
    this.preferredStrategies.add(preferredStrategiesItem);
    return this;
  }

   /**
   * PreferredStrategies indicates the list of strategies for picking the leader for coordinated leader election. The list is ordered, and the first strategy supersedes all other strategies. The list is used by coordinated leader election to make a decision about the final election strategy. This follows as - If all clients have strategy X as the first element in this list, strategy X will be used. - If a candidate has strategy [X] and another candidate has strategy [Y, X], Y supersedes X and strategy Y   will be used. - If a candidate has strategy [X, Y] and another candidate has strategy [Y, X], this is a user error and leader   election will not operate the Lease until resolved. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   * @return preferredStrategies
  **/
  @jakarta.annotation.Nonnull
  public List<String> getPreferredStrategies() {
    return preferredStrategies;
  }

  public void setPreferredStrategies(List<String> preferredStrategies) {
    this.preferredStrategies = preferredStrategies;
  }


  public V1alpha1LeaseCandidateSpec renewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return this;
  }

   /**
   * RenewTime is the time that the LeaseCandidate was last updated. Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates.
   * @return renewTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1LeaseCandidateSpec v1alpha1LeaseCandidateSpec = (V1alpha1LeaseCandidateSpec) o;
    return Objects.equals(this.binaryVersion, v1alpha1LeaseCandidateSpec.binaryVersion) &&
        Objects.equals(this.emulationVersion, v1alpha1LeaseCandidateSpec.emulationVersion) &&
        Objects.equals(this.leaseName, v1alpha1LeaseCandidateSpec.leaseName) &&
        Objects.equals(this.pingTime, v1alpha1LeaseCandidateSpec.pingTime) &&
        Objects.equals(this.preferredStrategies, v1alpha1LeaseCandidateSpec.preferredStrategies) &&
        Objects.equals(this.renewTime, v1alpha1LeaseCandidateSpec.renewTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryVersion, emulationVersion, leaseName, pingTime, preferredStrategies, renewTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1LeaseCandidateSpec {\n");
    sb.append("    binaryVersion: ").append(toIndentedString(binaryVersion)).append("\n");
    sb.append("    emulationVersion: ").append(toIndentedString(emulationVersion)).append("\n");
    sb.append("    leaseName: ").append(toIndentedString(leaseName)).append("\n");
    sb.append("    pingTime: ").append(toIndentedString(pingTime)).append("\n");
    sb.append("    preferredStrategies: ").append(toIndentedString(preferredStrategies)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
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
    openapiFields.add("preferredStrategies");
    openapiFields.add("renewTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("leaseName");
    openapiRequiredFields.add("preferredStrategies");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1LeaseCandidateSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1LeaseCandidateSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1LeaseCandidateSpec is not found in the empty JSON string", V1alpha1LeaseCandidateSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1LeaseCandidateSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1LeaseCandidateSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1LeaseCandidateSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("binaryVersion") != null && !jsonObj.get("binaryVersion").isJsonNull()) && !jsonObj.get("binaryVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `binaryVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("binaryVersion").toString()));
      }
      if ((jsonObj.get("emulationVersion") != null && !jsonObj.get("emulationVersion").isJsonNull()) && !jsonObj.get("emulationVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emulationVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emulationVersion").toString()));
      }
      if (!jsonObj.get("leaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaseName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("preferredStrategies") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("preferredStrategies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredStrategies` to be an array in the JSON string but got `%s`", jsonObj.get("preferredStrategies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1LeaseCandidateSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1LeaseCandidateSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1LeaseCandidateSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1LeaseCandidateSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1LeaseCandidateSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1LeaseCandidateSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1LeaseCandidateSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1LeaseCandidateSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1LeaseCandidateSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1LeaseCandidateSpec
  */
  public static V1alpha1LeaseCandidateSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1LeaseCandidateSpec.class);
  }

 /**
  * Convert an instance of V1alpha1LeaseCandidateSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
