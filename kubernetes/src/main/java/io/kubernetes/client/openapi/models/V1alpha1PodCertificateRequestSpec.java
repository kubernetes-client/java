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
 * PodCertificateRequestSpec describes the certificate request.  All fields are immutable after creation.
 */
@ApiModel(description = "PodCertificateRequestSpec describes the certificate request.  All fields are immutable after creation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha1PodCertificateRequestSpec {
  public static final String SERIALIZED_NAME_MAX_EXPIRATION_SECONDS = "maxExpirationSeconds";
  @SerializedName(SERIALIZED_NAME_MAX_EXPIRATION_SECONDS)
  @jakarta.annotation.Nullable
  private Integer maxExpirationSeconds;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nonnull
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_U_I_D = "nodeUID";
  @SerializedName(SERIALIZED_NAME_NODE_U_I_D)
  @jakarta.annotation.Nonnull
  private String nodeUID;

  public static final String SERIALIZED_NAME_PKIX_PUBLIC_KEY = "pkixPublicKey";
  @SerializedName(SERIALIZED_NAME_PKIX_PUBLIC_KEY)
  @jakarta.annotation.Nonnull
  private byte[] pkixPublicKey;

  public static final String SERIALIZED_NAME_POD_NAME = "podName";
  @SerializedName(SERIALIZED_NAME_POD_NAME)
  @jakarta.annotation.Nonnull
  private String podName;

  public static final String SERIALIZED_NAME_POD_U_I_D = "podUID";
  @SerializedName(SERIALIZED_NAME_POD_U_I_D)
  @jakarta.annotation.Nonnull
  private String podUID;

  public static final String SERIALIZED_NAME_PROOF_OF_POSSESSION = "proofOfPossession";
  @SerializedName(SERIALIZED_NAME_PROOF_OF_POSSESSION)
  @jakarta.annotation.Nonnull
  private byte[] proofOfPossession;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  @jakarta.annotation.Nonnull
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_U_I_D = "serviceAccountUID";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_U_I_D)
  @jakarta.annotation.Nonnull
  private String serviceAccountUID;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  @jakarta.annotation.Nonnull
  private String signerName;

  public V1alpha1PodCertificateRequestSpec() {
  }

  public V1alpha1PodCertificateRequestSpec maxExpirationSeconds(@jakarta.annotation.Nullable Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
    return this;
  }

  /**
   * maxExpirationSeconds is the maximum lifetime permitted for the certificate.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. &#x60;kubernetes.io&#x60; signers will never issue certificates with a lifetime longer than 24 hours.
   * @return maxExpirationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "maxExpirationSeconds is the maximum lifetime permitted for the certificate.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. `kubernetes.io` signers will never issue certificates with a lifetime longer than 24 hours.")
  public Integer getMaxExpirationSeconds() {
    return maxExpirationSeconds;
  }

  public void setMaxExpirationSeconds(@jakarta.annotation.Nullable Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
  }


  public V1alpha1PodCertificateRequestSpec nodeName(@jakarta.annotation.Nonnull String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * nodeName is the name of the node the pod is assigned to.
   * @return nodeName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "nodeName is the name of the node the pod is assigned to.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nonnull String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1PodCertificateRequestSpec nodeUID(@jakarta.annotation.Nonnull String nodeUID) {
    this.nodeUID = nodeUID;
    return this;
  }

  /**
   * nodeUID is the UID of the node the pod is assigned to.
   * @return nodeUID
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "nodeUID is the UID of the node the pod is assigned to.")
  public String getNodeUID() {
    return nodeUID;
  }

  public void setNodeUID(@jakarta.annotation.Nonnull String nodeUID) {
    this.nodeUID = nodeUID;
  }


  public V1alpha1PodCertificateRequestSpec pkixPublicKey(@jakarta.annotation.Nonnull byte[] pkixPublicKey) {
    this.pkixPublicKey = pkixPublicKey;
    return this;
  }

  /**
   * pkixPublicKey is the PKIX-serialized public key the signer will issue the certificate to.  The key must be one of RSA3072, RSA4096, ECDSAP256, ECDSAP384, ECDSAP521, or ED25519. Note that this list may be expanded in the future.  Signer implementations do not need to support all key types supported by kube-apiserver and kubelet.  If a signer does not support the key type used for a given PodCertificateRequest, it must deny the request by setting a status.conditions entry with a type of \&quot;Denied\&quot; and a reason of \&quot;UnsupportedKeyType\&quot;. It may also suggest a key type that it does support in the message field.
   * @return pkixPublicKey
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "pkixPublicKey is the PKIX-serialized public key the signer will issue the certificate to.  The key must be one of RSA3072, RSA4096, ECDSAP256, ECDSAP384, ECDSAP521, or ED25519. Note that this list may be expanded in the future.  Signer implementations do not need to support all key types supported by kube-apiserver and kubelet.  If a signer does not support the key type used for a given PodCertificateRequest, it must deny the request by setting a status.conditions entry with a type of \"Denied\" and a reason of \"UnsupportedKeyType\". It may also suggest a key type that it does support in the message field.")
  public byte[] getPkixPublicKey() {
    return pkixPublicKey;
  }

  public void setPkixPublicKey(@jakarta.annotation.Nonnull byte[] pkixPublicKey) {
    this.pkixPublicKey = pkixPublicKey;
  }


  public V1alpha1PodCertificateRequestSpec podName(@jakarta.annotation.Nonnull String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * podName is the name of the pod into which the certificate will be mounted.
   * @return podName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "podName is the name of the pod into which the certificate will be mounted.")
  public String getPodName() {
    return podName;
  }

  public void setPodName(@jakarta.annotation.Nonnull String podName) {
    this.podName = podName;
  }


  public V1alpha1PodCertificateRequestSpec podUID(@jakarta.annotation.Nonnull String podUID) {
    this.podUID = podUID;
    return this;
  }

  /**
   * podUID is the UID of the pod into which the certificate will be mounted.
   * @return podUID
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "podUID is the UID of the pod into which the certificate will be mounted.")
  public String getPodUID() {
    return podUID;
  }

  public void setPodUID(@jakarta.annotation.Nonnull String podUID) {
    this.podUID = podUID;
  }


  public V1alpha1PodCertificateRequestSpec proofOfPossession(@jakarta.annotation.Nonnull byte[] proofOfPossession) {
    this.proofOfPossession = proofOfPossession;
    return this;
  }

  /**
   * proofOfPossession proves that the requesting kubelet holds the private key corresponding to pkixPublicKey.  It is contructed by signing the ASCII bytes of the pod&#39;s UID using &#x60;pkixPublicKey&#x60;.  kube-apiserver validates the proof of possession during creation of the PodCertificateRequest.  If the key is an RSA key, then the signature is over the ASCII bytes of the pod UID, using RSASSA-PSS from RFC 8017 (as implemented by the golang function crypto/rsa.SignPSS with nil options).  If the key is an ECDSA key, then the signature is as described by [SEC 1, Version 2.0](https://www.secg.org/sec1-v2.pdf) (as implemented by the golang library function crypto/ecdsa.SignASN1)  If the key is an ED25519 key, the the signature is as described by the [ED25519 Specification](https://ed25519.cr.yp.to/) (as implemented by the golang library crypto/ed25519.Sign).
   * @return proofOfPossession
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "proofOfPossession proves that the requesting kubelet holds the private key corresponding to pkixPublicKey.  It is contructed by signing the ASCII bytes of the pod's UID using `pkixPublicKey`.  kube-apiserver validates the proof of possession during creation of the PodCertificateRequest.  If the key is an RSA key, then the signature is over the ASCII bytes of the pod UID, using RSASSA-PSS from RFC 8017 (as implemented by the golang function crypto/rsa.SignPSS with nil options).  If the key is an ECDSA key, then the signature is as described by [SEC 1, Version 2.0](https://www.secg.org/sec1-v2.pdf) (as implemented by the golang library function crypto/ecdsa.SignASN1)  If the key is an ED25519 key, the the signature is as described by the [ED25519 Specification](https://ed25519.cr.yp.to/) (as implemented by the golang library crypto/ed25519.Sign).")
  public byte[] getProofOfPossession() {
    return proofOfPossession;
  }

  public void setProofOfPossession(@jakarta.annotation.Nonnull byte[] proofOfPossession) {
    this.proofOfPossession = proofOfPossession;
  }


  public V1alpha1PodCertificateRequestSpec serviceAccountName(@jakarta.annotation.Nonnull String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * serviceAccountName is the name of the service account the pod is running as.
   * @return serviceAccountName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "serviceAccountName is the name of the service account the pod is running as.")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(@jakarta.annotation.Nonnull String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public V1alpha1PodCertificateRequestSpec serviceAccountUID(@jakarta.annotation.Nonnull String serviceAccountUID) {
    this.serviceAccountUID = serviceAccountUID;
    return this;
  }

  /**
   * serviceAccountUID is the UID of the service account the pod is running as.
   * @return serviceAccountUID
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "serviceAccountUID is the UID of the service account the pod is running as.")
  public String getServiceAccountUID() {
    return serviceAccountUID;
  }

  public void setServiceAccountUID(@jakarta.annotation.Nonnull String serviceAccountUID) {
    this.serviceAccountUID = serviceAccountUID;
  }


  public V1alpha1PodCertificateRequestSpec signerName(@jakarta.annotation.Nonnull String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * signerName indicates the requested signer.  All signer names beginning with &#x60;kubernetes.io&#x60; are reserved for use by the Kubernetes project.  There is currently one well-known signer documented by the Kubernetes project, &#x60;kubernetes.io/kube-apiserver-client-pod&#x60;, which will issue client certificates understood by kube-apiserver.  It is currently unimplemented.
   * @return signerName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "signerName indicates the requested signer.  All signer names beginning with `kubernetes.io` are reserved for use by the Kubernetes project.  There is currently one well-known signer documented by the Kubernetes project, `kubernetes.io/kube-apiserver-client-pod`, which will issue client certificates understood by kube-apiserver.  It is currently unimplemented.")
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
    V1alpha1PodCertificateRequestSpec v1alpha1PodCertificateRequestSpec = (V1alpha1PodCertificateRequestSpec) o;
    return Objects.equals(this.maxExpirationSeconds, v1alpha1PodCertificateRequestSpec.maxExpirationSeconds) &&
        Objects.equals(this.nodeName, v1alpha1PodCertificateRequestSpec.nodeName) &&
        Objects.equals(this.nodeUID, v1alpha1PodCertificateRequestSpec.nodeUID) &&
        Arrays.equals(this.pkixPublicKey, v1alpha1PodCertificateRequestSpec.pkixPublicKey) &&
        Objects.equals(this.podName, v1alpha1PodCertificateRequestSpec.podName) &&
        Objects.equals(this.podUID, v1alpha1PodCertificateRequestSpec.podUID) &&
        Arrays.equals(this.proofOfPossession, v1alpha1PodCertificateRequestSpec.proofOfPossession) &&
        Objects.equals(this.serviceAccountName, v1alpha1PodCertificateRequestSpec.serviceAccountName) &&
        Objects.equals(this.serviceAccountUID, v1alpha1PodCertificateRequestSpec.serviceAccountUID) &&
        Objects.equals(this.signerName, v1alpha1PodCertificateRequestSpec.signerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxExpirationSeconds, nodeName, nodeUID, Arrays.hashCode(pkixPublicKey), podName, podUID, Arrays.hashCode(proofOfPossession), serviceAccountName, serviceAccountUID, signerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodCertificateRequestSpec {\n");
    sb.append("    maxExpirationSeconds: ").append(toIndentedString(maxExpirationSeconds)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeUID: ").append(toIndentedString(nodeUID)).append("\n");
    sb.append("    pkixPublicKey: ").append(toIndentedString(pkixPublicKey)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    podUID: ").append(toIndentedString(podUID)).append("\n");
    sb.append("    proofOfPossession: ").append(toIndentedString(proofOfPossession)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    serviceAccountUID: ").append(toIndentedString(serviceAccountUID)).append("\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("maxExpirationSeconds");
    openapiFields.add("nodeName");
    openapiFields.add("nodeUID");
    openapiFields.add("pkixPublicKey");
    openapiFields.add("podName");
    openapiFields.add("podUID");
    openapiFields.add("proofOfPossession");
    openapiFields.add("serviceAccountName");
    openapiFields.add("serviceAccountUID");
    openapiFields.add("signerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nodeName");
    openapiRequiredFields.add("nodeUID");
    openapiRequiredFields.add("pkixPublicKey");
    openapiRequiredFields.add("podName");
    openapiRequiredFields.add("podUID");
    openapiRequiredFields.add("proofOfPossession");
    openapiRequiredFields.add("serviceAccountName");
    openapiRequiredFields.add("serviceAccountUID");
    openapiRequiredFields.add("signerName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1PodCertificateRequestSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1PodCertificateRequestSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1PodCertificateRequestSpec is not found in the empty JSON string", V1alpha1PodCertificateRequestSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1PodCertificateRequestSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1PodCertificateRequestSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1PodCertificateRequestSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      if (!jsonObj.get("nodeUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeUID").toString()));
      }
      if (!jsonObj.get("podName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podName").toString()));
      }
      if (!jsonObj.get("podUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podUID").toString()));
      }
      if (!jsonObj.get("serviceAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccountName").toString()));
      }
      if (!jsonObj.get("serviceAccountUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccountUID").toString()));
      }
      if (!jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1PodCertificateRequestSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1PodCertificateRequestSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1PodCertificateRequestSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1PodCertificateRequestSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1PodCertificateRequestSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1PodCertificateRequestSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1PodCertificateRequestSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1PodCertificateRequestSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1PodCertificateRequestSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha1PodCertificateRequestSpec
   */
  public static V1alpha1PodCertificateRequestSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1PodCertificateRequestSpec.class);
  }

  /**
   * Convert an instance of V1alpha1PodCertificateRequestSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
