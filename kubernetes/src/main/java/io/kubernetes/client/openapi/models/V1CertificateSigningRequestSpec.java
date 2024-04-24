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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * CertificateSigningRequestSpec contains the certificate request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CertificateSigningRequestSpec {
  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Integer expirationSeconds;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = new HashMap<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private byte[] request;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<String> usages;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public V1CertificateSigningRequestSpec() {
  }

  public V1CertificateSigningRequestSpec expirationSeconds(Integer expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

   /**
   * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.  The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.  Certificate signers may not honor this field for various reasons:    1. Old signer that is unaware of the field (such as the in-tree      implementations prior to v1.22)   2. Signer whose configured maximum is shorter than the requested duration   3. Signer whose configured minimum is longer than the requested duration  The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
   * @return expirationSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getExpirationSeconds() {
    return expirationSeconds;
  }


  public void setExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }


  public V1CertificateSigningRequestSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public V1CertificateSigningRequestSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   * @return extra
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<String>> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public V1CertificateSigningRequestSpec groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public V1CertificateSigningRequestSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   * @return groups
  **/
  @jakarta.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public V1CertificateSigningRequestSpec request(byte[] request) {

    this.request = request;
    return this;
  }

   /**
   * request contains an x509 certificate signing request encoded in a \&quot;CERTIFICATE REQUEST\&quot; PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
   * @return request
  **/
  @jakarta.annotation.Nonnull
  public byte[] getRequest() {
    return request;
  }


  public void setRequest(byte[] request) {
    this.request = request;
  }


  public V1CertificateSigningRequestSpec signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * signerName indicates the requested signer, and is a qualified name.  List/watch requests for CertificateSigningRequests can filter on this field using a \&quot;spec.signerName&#x3D;NAME\&quot; fieldSelector.  Well-known Kubernetes signers are:  1. \&quot;kubernetes.io/kube-apiserver-client\&quot;: issues client certificates that can be used to authenticate to kube-apiserver.   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the \&quot;csrsigning\&quot; controller in kube-controller-manager.  2. \&quot;kubernetes.io/kube-apiserver-client-kubelet\&quot;: issues client certificates that kubelets use to authenticate to kube-apiserver.   Requests for this signer can be auto-approved by the \&quot;csrapproving\&quot; controller in kube-controller-manager, and can be issued by the \&quot;csrsigning\&quot; controller in kube-controller-manager.  3. \&quot;kubernetes.io/kubelet-serving\&quot; issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the \&quot;csrsigning\&quot; controller in kube-controller-manager.  More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers  Custom signerNames can also be specified. The signer defines:  1. Trust distribution: how trust (CA bundles) are distributed.  2. Permitted subjects: and behavior when a disallowed subject is requested.  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.  4. Required, permitted, or forbidden key usages / extended key usages.  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.  6. Whether or not requests for CA certificates are allowed.
   * @return signerName
  **/
  @jakarta.annotation.Nonnull
  public String getSignerName() {
    return signerName;
  }


  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public V1CertificateSigningRequestSpec uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public V1CertificateSigningRequestSpec usages(List<String> usages) {

    this.usages = usages;
    return this;
  }

  public V1CertificateSigningRequestSpec addUsagesItem(String usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * usages specifies a set of key usages requested in the issued certificate.  Requests for TLS client certificates typically request: \&quot;digital signature\&quot;, \&quot;key encipherment\&quot;, \&quot;client auth\&quot;.  Requests for TLS serving certificates typically request: \&quot;key encipherment\&quot;, \&quot;digital signature\&quot;, \&quot;server auth\&quot;.  Valid values are:  \&quot;signing\&quot;, \&quot;digital signature\&quot;, \&quot;content commitment\&quot;,  \&quot;key encipherment\&quot;, \&quot;key agreement\&quot;, \&quot;data encipherment\&quot;,  \&quot;cert sign\&quot;, \&quot;crl sign\&quot;, \&quot;encipher only\&quot;, \&quot;decipher only\&quot;, \&quot;any\&quot;,  \&quot;server auth\&quot;, \&quot;client auth\&quot;,  \&quot;code signing\&quot;, \&quot;email protection\&quot;, \&quot;s/mime\&quot;,  \&quot;ipsec end system\&quot;, \&quot;ipsec tunnel\&quot;, \&quot;ipsec user\&quot;,  \&quot;timestamping\&quot;, \&quot;ocsp signing\&quot;, \&quot;microsoft sgc\&quot;, \&quot;netscape sgc\&quot;
   * @return usages
  **/
  @jakarta.annotation.Nullable
  public List<String> getUsages() {
    return usages;
  }


  public void setUsages(List<String> usages) {
    this.usages = usages;
  }


  public V1CertificateSigningRequestSpec username(String username) {

    this.username = username;
    return this;
  }

   /**
   * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   * @return username
  **/
  @jakarta.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSigningRequestSpec v1CertificateSigningRequestSpec = (V1CertificateSigningRequestSpec) o;
    return Objects.equals(this.expirationSeconds, v1CertificateSigningRequestSpec.expirationSeconds) &&
        Objects.equals(this.extra, v1CertificateSigningRequestSpec.extra) &&
        Objects.equals(this.groups, v1CertificateSigningRequestSpec.groups) &&
        Arrays.equals(this.request, v1CertificateSigningRequestSpec.request) &&
        Objects.equals(this.signerName, v1CertificateSigningRequestSpec.signerName) &&
        Objects.equals(this.uid, v1CertificateSigningRequestSpec.uid) &&
        Objects.equals(this.usages, v1CertificateSigningRequestSpec.usages) &&
        Objects.equals(this.username, v1CertificateSigningRequestSpec.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationSeconds, extra, groups, Arrays.hashCode(request), signerName, uid, usages, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSigningRequestSpec {\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("expirationSeconds");
    openapiFields.add("extra");
    openapiFields.add("groups");
    openapiFields.add("request");
    openapiFields.add("signerName");
    openapiFields.add("uid");
    openapiFields.add("usages");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request");
    openapiRequiredFields.add("signerName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSigningRequestSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSigningRequestSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSigningRequestSpec is not found in the empty JSON string", V1CertificateSigningRequestSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSigningRequestSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSigningRequestSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CertificateSigningRequestSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if (!jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSigningRequestSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSigningRequestSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSigningRequestSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSigningRequestSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSigningRequestSpec>() {
           @Override
           public void write(JsonWriter out, V1CertificateSigningRequestSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSigningRequestSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSigningRequestSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSigningRequestSpec
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSigningRequestSpec
  */
  public static V1CertificateSigningRequestSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSigningRequestSpec.class);
  }

 /**
  * Convert an instance of V1CertificateSigningRequestSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
