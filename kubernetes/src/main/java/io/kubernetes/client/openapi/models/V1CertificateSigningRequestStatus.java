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
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition;
import java.io.IOException;
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CertificateSigningRequestStatus {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1CertificateSigningRequestCondition> conditions;

  public V1CertificateSigningRequestStatus() {
  }

  public V1CertificateSigningRequestStatus certificate(byte[] certificate) {

    this.certificate = certificate;
    return this;
  }

   /**
   * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \&quot;Denied\&quot; is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \&quot;Failed\&quot; is added and this field remains empty.  Validation requirements:  1. certificate must contain one or more PEM blocks.  2. All PEM blocks must have the \&quot;CERTIFICATE\&quot; label, contain no headers, and the encoded data   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.  3. Non-PEM content may appear before or after the \&quot;CERTIFICATE\&quot; PEM blocks and is unvalidated,   to allow for explanatory text as described in section 5.2 of RFC7468.  If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  The certificate is encoded in PEM format.  When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:      base64(     -----BEGIN CERTIFICATE-----     ...     -----END CERTIFICATE-----     )
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  public byte[] getCertificate() {
    return certificate;
  }


  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }


  public V1CertificateSigningRequestStatus conditions(List<V1CertificateSigningRequestCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1CertificateSigningRequestStatus addConditionsItem(V1CertificateSigningRequestCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions applied to the request. Known conditions are \&quot;Approved\&quot;, \&quot;Denied\&quot;, and \&quot;Failed\&quot;.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSigningRequestStatus v1CertificateSigningRequestStatus = (V1CertificateSigningRequestStatus) o;
    return Arrays.equals(this.certificate, v1CertificateSigningRequestStatus.certificate) &&
        Objects.equals(this.conditions, v1CertificateSigningRequestStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(certificate), conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSigningRequestStatus {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
    openapiFields.add("certificate");
    openapiFields.add("conditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSigningRequestStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSigningRequestStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSigningRequestStatus is not found in the empty JSON string", V1CertificateSigningRequestStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSigningRequestStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSigningRequestStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
            V1CertificateSigningRequestCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSigningRequestStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSigningRequestStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSigningRequestStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSigningRequestStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSigningRequestStatus>() {
           @Override
           public void write(JsonWriter out, V1CertificateSigningRequestStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSigningRequestStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSigningRequestStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSigningRequestStatus
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSigningRequestStatus
  */
  public static V1CertificateSigningRequestStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSigningRequestStatus.class);
  }

 /**
  * Convert an instance of V1CertificateSigningRequestStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
