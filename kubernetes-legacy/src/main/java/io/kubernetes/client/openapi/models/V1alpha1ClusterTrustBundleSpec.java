/*
Copyright 2023 The Kubernetes Authors.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClusterTrustBundleSpec contains the signer and trust anchors.
 */
@ApiModel(description = "ClusterTrustBundleSpec contains the signer and trust anchors.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha1ClusterTrustBundleSpec {
  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_TRUST_BUNDLE = "trustBundle";
  @SerializedName(SERIALIZED_NAME_TRUST_BUNDLE)
  private String trustBundle;


  public V1alpha1ClusterTrustBundleSpec signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * signerName indicates the associated signer, if any.  In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group&#x3D;certificates.k8s.io resource&#x3D;signers resourceName&#x3D;&lt;the signer name&gt; verb&#x3D;attest.  If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name &#x60;example.com/foo&#x60;, valid ClusterTrustBundle object names include &#x60;example.com:foo:abc&#x60; and &#x60;example.com:foo:v1&#x60;.  If signerName is empty, then the ClusterTrustBundle object&#39;s name must not have such a prefix.  List/watch requests for ClusterTrustBundles can filter on this field using a &#x60;spec.signerName&#x3D;NAME&#x60; field selector.
   * @return signerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "signerName indicates the associated signer, if any.  In order to create or update a ClusterTrustBundle that sets signerName, you must have the following cluster-scoped permission: group=certificates.k8s.io resource=signers resourceName=<the signer name> verb=attest.  If signerName is not empty, then the ClusterTrustBundle object must be named with the signer name as a prefix (translating slashes to colons). For example, for the signer name `example.com/foo`, valid ClusterTrustBundle object names include `example.com:foo:abc` and `example.com:foo:v1`.  If signerName is empty, then the ClusterTrustBundle object's name must not have such a prefix.  List/watch requests for ClusterTrustBundles can filter on this field using a `spec.signerName=NAME` field selector.")

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
  @ApiModelProperty(required = true, value = "trustBundle contains the individual X.509 trust anchors for this bundle, as PEM bundle of PEM-wrapped, DER-formatted X.509 certificates.  The data must consist only of PEM certificate blocks that parse as valid X.509 certificates.  Each certificate must include a basic constraints extension with the CA bit set.  The API server will reject objects that contain duplicate certificates, or that use PEM block headers.  Users of ClusterTrustBundles, including Kubelet, are free to reorder and deduplicate certificate blocks in this file according to their own logic, as well as to drop PEM block headers and inter-block data.")

  public String getTrustBundle() {
    return trustBundle;
  }


  public void setTrustBundle(String trustBundle) {
    this.trustBundle = trustBundle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
