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
 * ClusterTrustBundleSpec contains the signer and trust anchors.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1ClusterTrustBundleSpec {
  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_TRUST_BUNDLE = "trustBundle";
  @SerializedName(SERIALIZED_NAME_TRUST_BUNDLE)
  private String trustBundle;

  public V1alpha1ClusterTrustBundleSpec() {
  }

  public V1alpha1ClusterTrustBundleSpec signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * signerName indicates the associated signer, if any.  In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group&#x3D;certificates.k8s.io resource&#x3D;signers resourceName&#x3D;&lt;the signer name&gt; verb&#x3D;attest.  If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name &#x60;example.com/foo&#x60;, valid ClusterTrustBundle object names include &#x60;example.com:foo:abc&#x60; and &#x60;example.com:foo:v1&#x60;.  If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.  List/watch requests for ClusterTrustBundles can filter on this field using a &#x60;spec.signerName&#x3D;NAME&#x60; field selector.
   * @return signerName
  **/
  @jakarta.annotation.Nullable
  public String getSignerName() {
    return signerName;
  }


  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public V1alpha1ClusterTrustBundleSpec trustBundle(String trustBundle) {

    this.trustBundle = trustBundle;
    return this;
  }

   /**
   * trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.  The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.  Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.
   * @return trustBundle
  **/
  @jakarta.annotation.Nonnull
  public String getTrustBundle() {
    return trustBundle;
  }


  public void setTrustBundle(String trustBundle) {
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
    V1alpha1ClusterTrustBundleSpec v1alpha1ClusterTrustBundleSpec = (V1alpha1ClusterTrustBundleSpec) o;
    return Objects.equals(this.signerName, v1alpha1ClusterTrustBundleSpec.signerName) &&
        Objects.equals(this.trustBundle, v1alpha1ClusterTrustBundleSpec.trustBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signerName, trustBundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterTrustBundleSpec {\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("signerName");
    openapiFields.add("trustBundle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("trustBundle");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterTrustBundleSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterTrustBundleSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterTrustBundleSpec is not found in the empty JSON string", V1alpha1ClusterTrustBundleSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterTrustBundleSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterTrustBundleSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterTrustBundleSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if (!jsonObj.get("trustBundle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustBundle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustBundle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterTrustBundleSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterTrustBundleSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterTrustBundleSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterTrustBundleSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterTrustBundleSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterTrustBundleSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterTrustBundleSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterTrustBundleSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterTrustBundleSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterTrustBundleSpec
  */
  public static V1alpha1ClusterTrustBundleSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ClusterTrustBundleSpec.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterTrustBundleSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
