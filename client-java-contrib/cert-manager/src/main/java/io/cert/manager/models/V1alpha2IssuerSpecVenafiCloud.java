/*
Copyright 2020 The Kubernetes Authors.
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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Cloud specifies the Venafi cloud configuration settings. Only one of TPP or Cloud may be
 * specified.
 */
@ApiModel(
    description =
        "Cloud specifies the Venafi cloud configuration settings. Only one of TPP or Cloud may be specified.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVenafiCloud {
  public static final String SERIALIZED_NAME_API_TOKEN_SECRET_REF = "apiTokenSecretRef";

  @SerializedName(SERIALIZED_NAME_API_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecVenafiCloudApiTokenSecretRef apiTokenSecretRef;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1alpha2IssuerSpecVenafiCloud apiTokenSecretRef(
      V1alpha2IssuerSpecVenafiCloudApiTokenSecretRef apiTokenSecretRef) {

    this.apiTokenSecretRef = apiTokenSecretRef;
    return this;
  }

  /**
   * Get apiTokenSecretRef
   *
   * @return apiTokenSecretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecVenafiCloudApiTokenSecretRef getApiTokenSecretRef() {
    return apiTokenSecretRef;
  }

  public void setApiTokenSecretRef(
      V1alpha2IssuerSpecVenafiCloudApiTokenSecretRef apiTokenSecretRef) {
    this.apiTokenSecretRef = apiTokenSecretRef;
  }

  public V1alpha2IssuerSpecVenafiCloud url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL is the base URL for Venafi Cloud. Defaults to \&quot;https://api.venafi.cloud/v1\&quot;.
   *
   * @return url
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "URL is the base URL for Venafi Cloud. Defaults to \"https://api.venafi.cloud/v1\".")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVenafiCloud v1alpha2IssuerSpecVenafiCloud = (V1alpha2IssuerSpecVenafiCloud) o;
    return Objects.equals(this.apiTokenSecretRef, v1alpha2IssuerSpecVenafiCloud.apiTokenSecretRef)
        && Objects.equals(this.url, v1alpha2IssuerSpecVenafiCloud.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiTokenSecretRef, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVenafiCloud {\n");
    sb.append("    apiTokenSecretRef: ").append(toIndentedString(apiTokenSecretRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
