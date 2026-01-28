/*
Copyright 2026 The Kubernetes Authors.
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
 * ClusterTrustBundleSpec contains the signer and trust anchors.
 */
@ApiModel(description = "ClusterTrustBundleSpec contains the signer and trust anchors.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta1ClusterTrustBundleSpec {
  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  @jakarta.annotation.Nullable
  private String signerName;

  public static final String SERIALIZED_NAME_TRUST_BUNDLE = "trustBundle";
  @SerializedName(SERIALIZED_NAME_TRUST_BUNDLE)
  @jakarta.annotation.Nonnull
  private String trustBundle;

  public V1beta1ClusterTrustBundleSpec() {
  }

  public V1beta1ClusterTrustBundleSpec signerName(@jakarta.annotation.Nullable String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * signerName indicates the associated signer, if any.  In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group&#x3D;certificates.k8s.io resource&#x3D;signers resourceName&#x3D;&lt;the signer name&gt; verb&#x3D;attest.  If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name &#x60;example.com/foo&#x60;, valid ClusterTrustBundle object names include &#x60;example.com:foo:abc&#x60; and &#x60;example.com:foo:v1&#x60;.  If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.  List/watch requests for ClusterTrustBundles can filter on this field using a &#x60;spec.signerName&#x3D;NAME&#x60; field selector.
   * @return signerName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "signerName indicates the associated signer, if any.  In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=<the signer name> verb=attest.  If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.  If signerName is empty, then the ClusterTrustBundle object's name must not have such a prefix.  List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(@jakarta.annotation.Nullable String signerName) {
    this.signerName = signerName;
  }


  public V1beta1ClusterTrustBundleSpec trustBundle(@jakarta.annotation.Nonnull String trustBundle) {
    this.trustBundle = trustBundle;
    return this;
  }

  /**
   * trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.  The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.  Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
   * @return trustBundle
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.  The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.  Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.")
  public String getTrustBundle() {
    return trustBundle;
  }

  public void setTrustBundle(@jakarta.annotation.Nonnull String trustBundle) {
    this.trustBundle = trustBundle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ClusterTrustBundleSpec v1beta1ClusterTrustBundleSpec = (V1beta1ClusterTrustBundleSpec) o;
    return Objects.equals(this.signerName, v1beta1ClusterTrustBundleSpec.signerName) &&
        Objects.equals(this.trustBundle, v1beta1ClusterTrustBundleSpec.trustBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signerName, trustBundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ClusterTrustBundleSpec {\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    trustBundle: ").append(toIndentedString(trustBundle)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("signerName", "trustBundle"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("trustBundle"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1ClusterTrustBundleSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1ClusterTrustBundleSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta1ClusterTrustBundleSpec is not found in the empty JSON string", V1beta1ClusterTrustBundleSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ClusterTrustBundleSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta1ClusterTrustBundleSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1ClusterTrustBundleSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if (!jsonObj.get("trustBundle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `trustBundle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustBundle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ClusterTrustBundleSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ClusterTrustBundleSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ClusterTrustBundleSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ClusterTrustBundleSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ClusterTrustBundleSpec>() {
           @Override
           public void write(JsonWriter out, V1beta1ClusterTrustBundleSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ClusterTrustBundleSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1ClusterTrustBundleSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1ClusterTrustBundleSpec
   * @throws IOException if the JSON string is invalid with respect to V1beta1ClusterTrustBundleSpec
   */
  public static V1beta1ClusterTrustBundleSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ClusterTrustBundleSpec.class);
  }

  /**
   * Convert an instance of V1beta1ClusterTrustBundleSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
