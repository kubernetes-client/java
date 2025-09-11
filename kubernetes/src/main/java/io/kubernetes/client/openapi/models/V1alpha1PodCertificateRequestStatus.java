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
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodCertificateRequestStatus describes the status of the request, and holds the certificate data if the request is issued.
 */
@ApiModel(description = "PodCertificateRequestStatus describes the status of the request, and holds the certificate data if the request is issued.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha1PodCertificateRequestStatus {
  public static final String SERIALIZED_NAME_BEGIN_REFRESH_AT = "beginRefreshAt";
  @SerializedName(SERIALIZED_NAME_BEGIN_REFRESH_AT)
  @jakarta.annotation.Nullable
  private OffsetDateTime beginRefreshAt;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  @jakarta.annotation.Nullable
  private String certificateChain;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1Condition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  @jakarta.annotation.Nullable
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  @jakarta.annotation.Nullable
  private OffsetDateTime notBefore;

  public V1alpha1PodCertificateRequestStatus() {
  }

  public V1alpha1PodCertificateRequestStatus beginRefreshAt(@jakarta.annotation.Nullable OffsetDateTime beginRefreshAt) {
    this.beginRefreshAt = beginRefreshAt;
    return this;
  }

  /**
   * beginRefreshAt is the time at which the kubelet should begin trying to refresh the certificate.  This field is set via the /status subresource, and must be set at the same time as certificateChain.  Once populated, this field is immutable.  This field is only a hint.  Kubelet may start refreshing before or after this time if necessary.
   * @return beginRefreshAt
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "beginRefreshAt is the time at which the kubelet should begin trying to refresh the certificate.  This field is set via the /status subresource, and must be set at the same time as certificateChain.  Once populated, this field is immutable.  This field is only a hint.  Kubelet may start refreshing before or after this time if necessary.")
  public OffsetDateTime getBeginRefreshAt() {
    return beginRefreshAt;
  }

  public void setBeginRefreshAt(@jakarta.annotation.Nullable OffsetDateTime beginRefreshAt) {
    this.beginRefreshAt = beginRefreshAt;
  }


  public V1alpha1PodCertificateRequestStatus certificateChain(@jakarta.annotation.Nullable String certificateChain) {
    this.certificateChain = certificateChain;
    return this;
  }

  /**
   * certificateChain is populated with an issued certificate by the signer. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \&quot;Denied\&quot; is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \&quot;Failed\&quot; is added and this field remains empty.  Validation requirements:  1. certificateChain must consist of one or more PEM-formatted certificates.  2. Each entry must be a valid PEM-wrapped, DER-encoded ASN.1 Certificate as     described in section 4 of RFC5280.  If more than one block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  When projecting the chain into a pod volume, kubelet will drop any data in-between the PEM blocks, as well as any PEM block headers.
   * @return certificateChain
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "certificateChain is populated with an issued certificate by the signer. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \"Denied\" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \"Failed\" is added and this field remains empty.  Validation requirements:  1. certificateChain must consist of one or more PEM-formatted certificates.  2. Each entry must be a valid PEM-wrapped, DER-encoded ASN.1 Certificate as     described in section 4 of RFC5280.  If more than one block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  When projecting the chain into a pod volume, kubelet will drop any data in-between the PEM blocks, as well as any PEM block headers.")
  public String getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(@jakarta.annotation.Nullable String certificateChain) {
    this.certificateChain = certificateChain;
  }


  public V1alpha1PodCertificateRequestStatus conditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1PodCertificateRequestStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions applied to the request.  The types \&quot;Issued\&quot;, \&quot;Denied\&quot;, and \&quot;Failed\&quot; have special handling.  At most one of these conditions may be present, and they must have status \&quot;True\&quot;.  If the request is denied with &#x60;Reason&#x3D;UnsupportedKeyType&#x60;, the signer may suggest a key type that will work in the message field.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "conditions applied to the request.  The types \"Issued\", \"Denied\", and \"Failed\" have special handling.  At most one of these conditions may be present, and they must have status \"True\".  If the request is denied with `Reason=UnsupportedKeyType`, the signer may suggest a key type that will work in the message field.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1PodCertificateRequestStatus notAfter(@jakarta.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * notAfter is the time at which the certificate expires.  The value must be the same as the notAfter value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable.  The signer must set this field at the same time it sets certificateChain.
   * @return notAfter
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "notAfter is the time at which the certificate expires.  The value must be the same as the notAfter value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable.  The signer must set this field at the same time it sets certificateChain.")
  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(@jakarta.annotation.Nullable OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public V1alpha1PodCertificateRequestStatus notBefore(@jakarta.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * notBefore is the time at which the certificate becomes valid.  The value must be the same as the notBefore value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable. The signer must set this field at the same time it sets certificateChain.
   * @return notBefore
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "notBefore is the time at which the certificate becomes valid.  The value must be the same as the notBefore value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable. The signer must set this field at the same time it sets certificateChain.")
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(@jakarta.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodCertificateRequestStatus v1alpha1PodCertificateRequestStatus = (V1alpha1PodCertificateRequestStatus) o;
    return Objects.equals(this.beginRefreshAt, v1alpha1PodCertificateRequestStatus.beginRefreshAt) &&
        Objects.equals(this.certificateChain, v1alpha1PodCertificateRequestStatus.certificateChain) &&
        Objects.equals(this.conditions, v1alpha1PodCertificateRequestStatus.conditions) &&
        Objects.equals(this.notAfter, v1alpha1PodCertificateRequestStatus.notAfter) &&
        Objects.equals(this.notBefore, v1alpha1PodCertificateRequestStatus.notBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginRefreshAt, certificateChain, conditions, notAfter, notBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodCertificateRequestStatus {\n");
    sb.append("    beginRefreshAt: ").append(toIndentedString(beginRefreshAt)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
    openapiFields.add("beginRefreshAt");
    openapiFields.add("certificateChain");
    openapiFields.add("conditions");
    openapiFields.add("notAfter");
    openapiFields.add("notBefore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1PodCertificateRequestStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1PodCertificateRequestStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1PodCertificateRequestStatus is not found in the empty JSON string", V1alpha1PodCertificateRequestStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1PodCertificateRequestStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1PodCertificateRequestStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("certificateChain") != null && !jsonObj.get("certificateChain").isJsonNull()) && !jsonObj.get("certificateChain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateChain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateChain").toString()));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1Condition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1PodCertificateRequestStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1PodCertificateRequestStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1PodCertificateRequestStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1PodCertificateRequestStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1PodCertificateRequestStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1PodCertificateRequestStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1PodCertificateRequestStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1PodCertificateRequestStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1PodCertificateRequestStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha1PodCertificateRequestStatus
   */
  public static V1alpha1PodCertificateRequestStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1PodCertificateRequestStatus.class);
  }

  /**
   * Convert an instance of V1alpha1PodCertificateRequestStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
