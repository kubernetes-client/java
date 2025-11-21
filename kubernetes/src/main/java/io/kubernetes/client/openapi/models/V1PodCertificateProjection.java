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
import java.util.Locale;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * PodCertificateProjection provides a private key and X.509 certificate in the pod filesystem.
 */
@ApiModel(description = "PodCertificateProjection provides a private key and X.509 certificate in the pod filesystem.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1PodCertificateProjection {
  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN_PATH = "certificateChainPath";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN_PATH)
  @jakarta.annotation.Nullable
  private String certificateChainPath;

  public static final String SERIALIZED_NAME_CREDENTIAL_BUNDLE_PATH = "credentialBundlePath";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_BUNDLE_PATH)
  @jakarta.annotation.Nullable
  private String credentialBundlePath;

  public static final String SERIALIZED_NAME_KEY_PATH = "keyPath";
  @SerializedName(SERIALIZED_NAME_KEY_PATH)
  @jakarta.annotation.Nullable
  private String keyPath;

  public static final String SERIALIZED_NAME_KEY_TYPE = "keyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  @jakarta.annotation.Nonnull
  private String keyType;

  public static final String SERIALIZED_NAME_MAX_EXPIRATION_SECONDS = "maxExpirationSeconds";
  @SerializedName(SERIALIZED_NAME_MAX_EXPIRATION_SECONDS)
  @jakarta.annotation.Nullable
  private Integer maxExpirationSeconds;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  @jakarta.annotation.Nonnull
  private String signerName;

  public V1PodCertificateProjection() {
  }

  public V1PodCertificateProjection certificateChainPath(@jakarta.annotation.Nullable String certificateChainPath) {
    this.certificateChainPath = certificateChainPath;
    return this;
  }

  /**
   * Write the certificate chain at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.
   * @return certificateChainPath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Write the certificate chain at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.")
  public String getCertificateChainPath() {
    return certificateChainPath;
  }

  public void setCertificateChainPath(@jakarta.annotation.Nullable String certificateChainPath) {
    this.certificateChainPath = certificateChainPath;
  }


  public V1PodCertificateProjection credentialBundlePath(@jakarta.annotation.Nullable String credentialBundlePath) {
    this.credentialBundlePath = credentialBundlePath;
    return this;
  }

  /**
   * Write the credential bundle at this path in the projected volume.  The credential bundle is a single file that contains multiple PEM blocks. The first PEM block is a PRIVATE KEY block, containing a PKCS#8 private key.  The remaining blocks are CERTIFICATE blocks, containing the issued certificate chain from the signer (leaf and any intermediates).  Using credentialBundlePath lets your Pod&#39;s application code make a single atomic read that retrieves a consistent key and certificate chain.  If you project them to separate files, your application code will need to additionally check that the leaf certificate was issued to the key.
   * @return credentialBundlePath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Write the credential bundle at this path in the projected volume.  The credential bundle is a single file that contains multiple PEM blocks. The first PEM block is a PRIVATE KEY block, containing a PKCS#8 private key.  The remaining blocks are CERTIFICATE blocks, containing the issued certificate chain from the signer (leaf and any intermediates).  Using credentialBundlePath lets your Pod's application code make a single atomic read that retrieves a consistent key and certificate chain.  If you project them to separate files, your application code will need to additionally check that the leaf certificate was issued to the key.")
  public String getCredentialBundlePath() {
    return credentialBundlePath;
  }

  public void setCredentialBundlePath(@jakarta.annotation.Nullable String credentialBundlePath) {
    this.credentialBundlePath = credentialBundlePath;
  }


  public V1PodCertificateProjection keyPath(@jakarta.annotation.Nullable String keyPath) {
    this.keyPath = keyPath;
    return this;
  }

  /**
   * Write the key at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.
   * @return keyPath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Write the key at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.")
  public String getKeyPath() {
    return keyPath;
  }

  public void setKeyPath(@jakarta.annotation.Nullable String keyPath) {
    this.keyPath = keyPath;
  }


  public V1PodCertificateProjection keyType(@jakarta.annotation.Nonnull String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * The type of keypair Kubelet will generate for the pod.  Valid values are \&quot;RSA3072\&quot;, \&quot;RSA4096\&quot;, \&quot;ECDSAP256\&quot;, \&quot;ECDSAP384\&quot;, \&quot;ECDSAP521\&quot;, and \&quot;ED25519\&quot;.
   * @return keyType
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of keypair Kubelet will generate for the pod.  Valid values are \"RSA3072\", \"RSA4096\", \"ECDSAP256\", \"ECDSAP384\", \"ECDSAP521\", and \"ED25519\".")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(@jakarta.annotation.Nonnull String keyType) {
    this.keyType = keyType;
  }


  public V1PodCertificateProjection maxExpirationSeconds(@jakarta.annotation.Nullable Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
    return this;
  }

  /**
   * maxExpirationSeconds is the maximum lifetime permitted for the certificate.  Kubelet copies this value verbatim into the PodCertificateRequests it generates for this projection.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. &#x60;kubernetes.io&#x60; signers will never issue certificates with a lifetime longer than 24 hours.
   * @return maxExpirationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "maxExpirationSeconds is the maximum lifetime permitted for the certificate.  Kubelet copies this value verbatim into the PodCertificateRequests it generates for this projection.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. `kubernetes.io` signers will never issue certificates with a lifetime longer than 24 hours.")
  public Integer getMaxExpirationSeconds() {
    return maxExpirationSeconds;
  }

  public void setMaxExpirationSeconds(@jakarta.annotation.Nullable Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
  }


  public V1PodCertificateProjection signerName(@jakarta.annotation.Nonnull String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * Kubelet&#39;s generated CSRs will be addressed to this signer.
   * @return signerName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Kubelet's generated CSRs will be addressed to this signer.")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(@jakarta.annotation.Nonnull String signerName) {
    this.signerName = signerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodCertificateProjection v1PodCertificateProjection = (V1PodCertificateProjection) o;
    return Objects.equals(this.certificateChainPath, v1PodCertificateProjection.certificateChainPath) &&
        Objects.equals(this.credentialBundlePath, v1PodCertificateProjection.credentialBundlePath) &&
        Objects.equals(this.keyPath, v1PodCertificateProjection.keyPath) &&
        Objects.equals(this.keyType, v1PodCertificateProjection.keyType) &&
        Objects.equals(this.maxExpirationSeconds, v1PodCertificateProjection.maxExpirationSeconds) &&
        Objects.equals(this.signerName, v1PodCertificateProjection.signerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateChainPath, credentialBundlePath, keyPath, keyType, maxExpirationSeconds, signerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodCertificateProjection {\n");
    sb.append("    certificateChainPath: ").append(toIndentedString(certificateChainPath)).append("\n");
    sb.append("    credentialBundlePath: ").append(toIndentedString(credentialBundlePath)).append("\n");
    sb.append("    keyPath: ").append(toIndentedString(keyPath)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    maxExpirationSeconds: ").append(toIndentedString(maxExpirationSeconds)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("certificateChainPath", "credentialBundlePath", "keyPath", "keyType", "maxExpirationSeconds", "signerName"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("keyType", "signerName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodCertificateProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodCertificateProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1PodCertificateProjection is not found in the empty JSON string", V1PodCertificateProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodCertificateProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1PodCertificateProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodCertificateProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("certificateChainPath") != null && !jsonObj.get("certificateChainPath").isJsonNull()) && !jsonObj.get("certificateChainPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `certificateChainPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateChainPath").toString()));
      }
      if ((jsonObj.get("credentialBundlePath") != null && !jsonObj.get("credentialBundlePath").isJsonNull()) && !jsonObj.get("credentialBundlePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `credentialBundlePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credentialBundlePath").toString()));
      }
      if ((jsonObj.get("keyPath") != null && !jsonObj.get("keyPath").isJsonNull()) && !jsonObj.get("keyPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `keyPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyPath").toString()));
      }
      if (!jsonObj.get("keyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `keyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyType").toString()));
      }
      if (!jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodCertificateProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodCertificateProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodCertificateProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodCertificateProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodCertificateProjection>() {
           @Override
           public void write(JsonWriter out, V1PodCertificateProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodCertificateProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodCertificateProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodCertificateProjection
   * @throws IOException if the JSON string is invalid with respect to V1PodCertificateProjection
   */
  public static V1PodCertificateProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodCertificateProjection.class);
  }

  /**
   * Convert an instance of V1PodCertificateProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
